/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.oj.linglian.factoryImpl;

import com.alibaba.fastjson.JSON;
import util.ServletUtil;
import com.oj.linglian.OJ.XYOJQueue;
import com.oj.linglian.entity.Coder;
import com.oj.linglian.entity.Comment;
import com.oj.linglian.entity.Question;
import com.oj.linglian.entity.Status;
import com.oj.linglian.entity.User;
import com.oj.linglian.factory.IServletFactory;
import com.oj.linglian.service.ICoderService;
import com.oj.linglian.service.ICommentService;
import com.oj.linglian.service.IQuestionService;
import com.oj.linglian.service.IStatusService;
import com.oj.linglian.service.IUserService;
import com.oj.linglian.serviceImpl.ICoderServiceImpl;
import com.oj.linglian.serviceImpl.ICommentServiceImpl;
import com.oj.linglian.serviceImpl.IQuestionServiceImpl;
import com.oj.linglian.serviceImpl.IStatusServiceImpl;
import com.oj.linglian.serviceImpl.IUserServiceImpl;
import db.DBUtil;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import java.util.Map;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import util.CusAccessObjectUtil;
import util.ServletCheckBuilder;
import util.StringUtil;

/**
 *
 * @author lol
 */
public class ICoderFactoryImpl implements IServletFactory {

    IQuestionService qis = null;
    ICoderService ics = null;
    IUserService ius = null;
    ICommentService icms = null;

    private static long time = new Date().getTime();
    private static int size = 0;
    private static long speedTime = 1000;

    public ICoderFactoryImpl() {
        qis = new IQuestionServiceImpl();
        ics = new ICoderServiceImpl();
        ius = new IUserServiceImpl();
        icms = new ICommentServiceImpl();
    }

    public static long getTime() {
        return time;
    }

    public static void setTime(long time) {
        ICoderFactoryImpl.time = time;
    }

    public static long getSpeedTime() {
        return speedTime;
    }

    public static void setSpeedTime(long speedTime) {
        ICoderFactoryImpl.speedTime = speedTime;
    }

    @Override
    public void doThing(HttpServletRequest request, HttpServletResponse response, HttpServlet servlet, String factoryName) throws ServletException, IOException {
        if ("getAllList".equals(factoryName)) {
            this.doGetList(request, response, servlet);
        } else if ("get".equals(factoryName)) {
            this.doGet(request, response, servlet);
        } else if ("push".equals(factoryName)) {
            this.doPush(request, response, servlet);
        } else if ("pushComment".equals(factoryName)) {
            this.doPushComment(request, response, servlet);
        } else if ("getCoders".equals(factoryName)) {
            this.doGetCoders(request, response, servlet);
        }
    }

    
    public void doGetCoders(HttpServletRequest request, HttpServletResponse response,
            HttpServlet servlet) throws ServletException, IOException {
        Map<String, Object> tMap = new ServletCheckBuilder(request, response, servlet, "pushComment_from")
                .addNp("userId", "用户编号不能为空")
                .addNp("questionId", "题目编号不能为空")
                .addNs("identity", "请重新登录", "login_from")
                .build();
        if (tMap != null) {
            User user = (User) tMap.get("ses_identity");
            Question q = qis.getQuestionOfQuestionId(tMap.get("par_questionId").toString());
            if (user.getUserId().equals(q.getUserId())) {
                Coder c = new Coder();
                c.setUserId(tMap.get("par_userId").toString());
                c.setQuestionId(tMap.get("par_questionId").toString());
                c.setStatus("1");
                List<Coder> list = ics.getCoders(c);
                PrintWriter out = response.getWriter();
                out.println(JSON.toJSON(list));
                out.close();
            }
        }
    }
    public void doPushComment(HttpServletRequest request, HttpServletResponse response,
            HttpServlet servlet) throws ServletException, IOException {
        Map<String, Object> tMap = new ServletCheckBuilder(request, response, servlet, "pushComment_from")
                .addNp("coderId", "代码编号不能为空")
                .addNp("body", "评论不能为空")
                .addNs("identity", "请重新登录", "login_from")
                .build();
        if (tMap != null) {
            User user = (User) tMap.get("ses_identity");
            Comment c = new Comment();
            c.setBody(tMap.get("par_body").toString());
            c.setCoderId(tMap.get("par_coderId").toString());
            c.setUserId(user.getUserId());
            c.setTime(new Date().toLocaleString());
            icms.insert(c);
            request.getSession().setAttribute("info", "评论成功!");
            ServletUtil.redirect(request, response, "CoderAction?method=get&coderId=" + tMap.get("par_coderId").toString());
        }
    }

    /**
     * 提交代码
     *
     * @param request
     * @param response
     * @param servlet
     * @throws ServletException
     * @throws IOException
     */
    public void doPush(HttpServletRequest request, HttpServletResponse response,
            HttpServlet servlet) throws ServletException, IOException {
        Map<String, Object> tMap = new ServletCheckBuilder(request, response, servlet, "push_from")
                .addNp("codes", "代码不能为空")
                .addNs("question", "问题不能为空")
                .addNs("identity", "请重新登录", "login_from")
                .build();
        if (tMap != null) {
            Long time2;
            if (request.getSession().getAttribute("lastCoderPushTime") == null) {
                request.getSession().setAttribute("lastCoderPushTime", new Date().getTime());
                time2 = new Date().getTime() - 10000;
            } else {
                time2 = (Long) request.getSession().getAttribute("lastCoderPushTime");
            }
            User user = (User) request.getSession().getAttribute("identity");
            String codes = tMap.get("par_codes").toString();
            Question q = (Question) request.getSession().getAttribute("question");
            if (new Date().getTime() - time2 >= 5000) {
                request.getSession().setAttribute("lastCoderPushTime", new Date().getTime());
                if (q != null) {
                    q = qis.getQuestionOfQuestionId(q.getQuestionId());
                    Coder coder = new Coder();
                    coder.setUserId(user.getUserId());
                    coder.setQuestionId(q.getQuestionId());
                    coder.setCode(codes);
                    coder.setTime(String.valueOf(new Date().getTime()));
                    coder.setStatus("0");
                    coder.setIp(request.getRemoteAddr() + "&" + CusAccessObjectUtil.getIpAddress(request));
                    if (ics.insert(coder) == 0) {
                        System.out.println("Insert---Coder-更新失败");
                    }
                    if (!XYOJQueue.getInstance().isAlive()) {
                        try{
                            XYOJQueue.getInstance().start();
                        } catch (Exception ex) {
                            System.out.println(ex.getMessage());
                        }
                    }
                    user.setLastCode(codes);
                    user.setLastQuestionId(q.getQuestionId());
                    if (ius.updateOfUserId(user, user.getUserId()) == 0) {
                        System.out.println("Push---User-更新失败");
                    }
                    q.setMainPeople(StringUtil.addInt(q.getMainPeople(), "1"));
                    if (qis.updateOfQuestionId(q, q.getQuestionId()) == 0) {
                        System.out.println("Push---Question-更新失败");
                    }
                    ServletUtil.redirect(request, response, "CoderAction?method=getAllList");
                }
            } else {
                user.setLastCode(codes);
                user.setLastQuestionId(q.getQuestionId());
                request.getSession().setAttribute("info", "五秒内只能提交一次");
                ServletUtil.redirect(request, response, "index.jsp");
            }
        }
    }

    /**
     * 根据编号获取代码
     *
     * @param request
     * @param response
     * @param servlet
     * @throws ServletException
     * @throws IOException
     */
    public void doGet(HttpServletRequest request, HttpServletResponse response, HttpServlet servlet) throws ServletException, IOException {
        Map<String, Object> tMap = new ServletCheckBuilder(request, response, servlet, "get_from")
                .addNp("coderId", "代码编号不能为空")
                .addNs("identity", "请重新登录", "login_from")
                .build();
        if (tMap != null) {
            String cid = request.getParameter("coderId");
            Coder c = ics.getCoderOfCoderId(cid);
            User user = (User) tMap.get("ses_identity");
            Question q = qis.getQuestionOfQuestionId(c.getQuestionId());
            if ("-99".equals(user.getLvl()) || user.getUserId().equals(c.getUserId()) || StringUtil.isSmallLong(q.getEndTime(), String.valueOf(new Date().getTime()))) {
                request.getSession().setAttribute("coder", c);
                request.getSession().setAttribute("showQuestion", q);
                request.getSession().setAttribute("commentList", icms.getCommentsOfCoderId(c.getCoderId()));
                ServletUtil.forward(request, response, servlet, "get_to");
            } else {
                request.getSession().setAttribute("info", "现在还不能查看别人代码");
                ServletUtil.forward(request, response, servlet, "get_from");
            }
        }
    }

    /**
     * 获取全部代码
     *
     * @param request
     * @param response
     * @param servlet
     * @throws ServletException
     * @throws IOException
     */
    public void doGetAll(HttpServletRequest request, HttpServletResponse response, HttpServlet servlet) throws ServletException, IOException {
        if (new Date().getTime() - time >= speedTime || request.getServletContext().getAttribute("coderList") == null) {
            List<Coder> list = DBUtil.getObjectLimit("coder", "coderId", "desc", new Coder(), 0, 100);
            request.getServletContext().setAttribute("coderList", list);
            List t = (List) request.getServletContext().getAttribute("coderList");
            size = t.size();
            time = new Date().getTime();
            IStatusService iss = new IStatusServiceImpl();
            List<Status> tList = new ArrayList();
            for (int i = -6; i < 3; i++) {
                tList.add(iss.getStatusOfStatusId(String.valueOf(i)));
            }
            request.getServletContext().setAttribute("coderStatus", tList);
        }
    }

    /**
     * 获取分页代码
     *
     * @param request
     * @param response
     * @param servlet
     * @throws ServletException
     * @throws IOException
     */
    public void doGetList(HttpServletRequest request, HttpServletResponse response, HttpServlet servlet) throws ServletException, IOException {
        this.doGetAll(request, response, servlet);
        int limit = 10;
        int page = 1;
        if ("".equals(request.getParameter("coderLimit"))) {
            request.setAttribute("coderLimit", "10");
        } else {
            try {
                limit = Integer.parseInt(request.getParameter("coderLimit"));
            } catch (Exception e) {

            }
            request.getSession().setAttribute("coderLimit", limit);
        }
        if ("".equals(request.getParameter("coderPage"))) {
            request.setAttribute("coderPage", "1");
        } else {
            try {
                page = Integer.parseInt(request.getParameter("coderPage"));
                page = Math.min(page, size / limit + 1);
            } catch (Exception e) {

            }
            request.getSession().setAttribute("coderPage", page);
        }
        ServletUtil.forward(request, response, servlet, "getList_to");
    }
}
