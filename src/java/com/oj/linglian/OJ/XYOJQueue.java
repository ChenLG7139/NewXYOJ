/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.oj.linglian.OJ;

import com.oj.linglian.entity.Coder;
import com.oj.linglian.entity.Checker;
import com.oj.linglian.entity.CoderBuilder;
import com.oj.linglian.entity.Contest;
import com.oj.linglian.entity.Question;
import com.oj.linglian.entity.Rank;
import com.oj.linglian.entity.User;
import com.oj.linglian.service.ICoderService;
import com.oj.linglian.service.ICheckerService;
import com.oj.linglian.service.IContestService;
import com.oj.linglian.service.IQuestionService;
import com.oj.linglian.service.IRankService;
import com.oj.linglian.service.IUserService;
import com.oj.linglian.serviceImpl.ICoderServiceImpl;
import com.oj.linglian.serviceImpl.ICheckerServiceImpl;
import com.oj.linglian.serviceImpl.IContestServiceImpl;
import com.oj.linglian.serviceImpl.IQuestionServiceImpl;
import com.oj.linglian.serviceImpl.IRankServiceImpl;
import com.oj.linglian.serviceImpl.IUserServiceImpl;
import db.DBUtil;
import java.io.File;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.Date;
import java.util.HashMap;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;
import java.util.Random;
import java.util.logging.Level;
import java.util.logging.Logger;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.concurrent.atomic.AtomicInteger;
import util.FileUtil;
import util.StringUtil;

/**
 *
 * @author lol
 */
public final class XYOJQueue extends Thread {

    private List<Coder> list;
    private AtomicInteger now;
    ICoderService ics = null;
    public static boolean isCanShow = true;
    private static XYOJQueue ins = null;

    public static XYOJQueue getInstance() {
        if (ins == null) {
            ins = new XYOJQueue();
        }
        ins.interrupt();
        return ins;
    }

    private XYOJQueue() {
        list = new LinkedList();
        now = new AtomicInteger(0);
        ics = new ICoderServiceImpl();
        this.start();
    }

    public Object[] getCoders() {
        return list.toArray();
    }

    public synchronized void push(Coder coder) {
        list.add(coder);
    }

    public void clear() {
        this.list.clear();
    }

    @Override
    public void run() {
        while (true) {
            try {
                Thread.sleep(1000);
            } catch (InterruptedException ex) {

            }
            try {
                System.out.println("开始遍历题库" + list);
                while (list != null && list.size() != 0 && now.get() < list.size()) {
                    List<Coder> tempList = this.list;
                    Coder coder = tempList.get(now.get());
                    System.out.print("编号为:" + coder.getCoderId() + "...");
                    if (coder.getCoderId() == null || (coder.getStatus() != null && !"0".equals(coder.getStatus()))) {
                        break;
                    }
                    ICheckerService iiaus = new ICheckerServiceImpl();
                    System.out.print("正在获取检测列表...");
                    List<Checker> qList = iiaus.getCheckersOfQuestionId(coder.getQuestionId());
                    if (!ics.getCoderOfCoderId(coder.getCoderId()).getStatus().equals("0")) {
                        continue;
                    }
                    System.out.print("结束获取检测列表....");
                    System.out.print("开始判题...");
                    coder = XYOJ.getIns().getResult(new CoderBuilder(coder), qList, new Date().getTime()).build();
                    System.out.println("结束判题...");
                    if (!ics.getCoderOfCoderId(coder.getCoderId()).getStatus().equals("0")) {
                        continue;
                    }
                    // 如果代码结果正确，则执行
                    if ("1".equals(coder.getStatus())) {
                        // 更新代码状态，防止重复处理
                        ics.updateOfCoderId(coder, coder.getCoderId());
                        // 初始化Service
                        IUserService ius = new IUserServiceImpl();
                        IQuestionService iqs = new IQuestionServiceImpl();
                        IRankService irs = new IRankServiceImpl();
                        IContestService ics = new IContestServiceImpl();
                        // 获得用户、题
                        User user = ius.getUserOfUserId(coder.getUserId());
                        Question q = iqs.getQuestionOfQuestionId(coder.getQuestionId());
                        Map<String, String> passQMap = new HashMap();
                        // 判断是否为空
                        if (user.getPassQuestions() == null || "".equals(user.getPassQuestions())) {
                            user.setPassQuestions(coder.getQuestionId());
                            user.setScore(StringUtil.addInt(user.getScore(), q.getScore()));
                        } else {
                            // 将用户通过的题目id提取出来
                            String[] passQ = user.getPassQuestions().split(",");
                            for (String str : passQ) {
                                passQMap.put(str, str);
                            }
                            // 判断是否做过
                            if (!passQMap.containsKey(q.getQuestionId())) {
                                user.setPassQuestions(user.getPassQuestions() + "," + coder.getQuestionId());
                                user.setScore(StringUtil.addInt(user.getScore(), q.getScore()));
                            }
                        }
                        // 判断第一个通过的
                        if (q.getUserId() == null || "".equals(q.getUserId())) {
                            q.setUserId(user.getUserId());
                        }
                        // 判断是否是比赛题
                        if (q.getContestId() != null && !"".equals(q.getContestId())) {
                            Contest contest = ics.getContestOfContestId(q.getContestId());
                            Rank r = irs.getRankOfContestIdAndUserId(q.getContestId(), user.getUserId());
                            // 判断该用户是否第一次参加该比赛并成功作对一道题
                            if (r == null) {
                                r = new Rank();
                                r.setContestId(q.getContestId());
                                r.setUserId(user.getUserId());
                                r.setTime("0");
                                r.setScore("0");
                                // 计算分值
                                r.setTime(StringUtil.addLong(r.getTime(), StringUtil.subLong(coder.getStartTime(), contest.getStartTime())));
                                r.setScore(StringUtil.addInt(r.getScore(), q.getScore()));
                                r.setPass(q.getQuestionId());
                                irs.insert(r);
                            } else {
                                Map<String, String> passQMap2 = new HashMap();
                                String[] passQ = r.getPass().split(",");
                                for (String str : passQ) {
                                    passQMap2.put(str, str);
                                }
                                if (!passQMap2.containsKey(q.getQuestionId())) {
                                    // 计算分值
                                    r.setTime(StringUtil.addLong(r.getTime(), StringUtil.subLong(coder.getStartTime(), contest.getStartTime())));
                                    r.setScore(StringUtil.addInt(r.getScore(), q.getScore()));
                                    r.setPass(r.getPass() + "," + q.getQuestionId());
                                    irs.updateOfRankId(r, r.getRankId());
                                }
                            }
                        }
                        // 加分和更新
                        ius.updateOfUserId(user, user.getUserId());
                        q.setRightPeople(StringUtil.addInt(q.getRightPeople(), "1"));
                        if (iqs.updateOfQuestionId(q, q.getQuestionId()) == 0) {
                            System.out.println(q.getQuestionId() + "\n更新失败");
                        }
                    }
                    if (ics.updateOfCoderId(coder, coder.getCoderId()) == 0) {
                        System.out.println(coder.getCoderId() + "\n更新失败");
                    }
                    now.addAndGet(1);
                }
                System.out.println("获取题库");
                Coder coder = new Coder();
                coder.setStatus("0");
                now.set(0);
                list = DBUtil.getObjectLimit("coder", "coderId", coder, 0, 100);
            } catch (Exception ex) {
                
            }
        }
    }

    public static void main(String[] args) throws IOException, InterruptedException {
        System.out.println("获取题库");
        Coder coder = new Coder();
        List<Coder> tlist = DBUtil.getObjectLimit("coder", "coderId", coder, 6, 10);
        for (Coder t : tlist) {
            File f = new File("c:/code_test2/" + t.getCoderId() + ".cpp");
            PrintWriter out = FileUtil.getPrintWriter(f);
            out.print(t.getCode());
            out.close();
        }
    }

}
