/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.oj.linglian.factoryImpl;

import com.alibaba.fastjson.JSON;
import com.oj.linglian.OJ.XYOJQueue;
import com.oj.linglian.entity.Checker;
import com.oj.linglian.entity.Comment;
import util.ServletUtil;
import com.oj.linglian.entity.Question;
import com.oj.linglian.entity.User;
import com.oj.linglian.factory.IServletFactory;
import com.oj.linglian.service.ICheckerService;
import com.oj.linglian.service.ICoderService;
import com.oj.linglian.service.ICommentService;
import com.oj.linglian.service.IQuestionService;
import com.oj.linglian.serviceImpl.ICheckerServiceImpl;
import com.oj.linglian.serviceImpl.ICoderServiceImpl;
import com.oj.linglian.serviceImpl.ICommentServiceImpl;
import com.oj.linglian.serviceImpl.IQuestionServiceImpl;
import db.DBMan;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.Date;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import util.ClassUtil;
import util.MapUtil;
import util.ServletCheckBuilder;
import util.SqlUtil;
import util.StringUtil;

/**
 *
 * @author lol
 */
public class IQuestionFactoryImpl implements IServletFactory {

    IQuestionService qis = null;
    ICheckerService ics = null;
    ICoderService icrs = null;
    ICommentService icms = null;
    private static long time = new Date().getTime();
    private static int size = 0;
    private static long speedTime = 1000;

    public IQuestionFactoryImpl() {
        qis = new IQuestionServiceImpl();
        ics = new ICheckerServiceImpl();
        icms = new ICommentServiceImpl();
        icrs = new ICoderServiceImpl();
    }

    public static long getTime() {
        return time;
    }

    public static void setTime(long time) {
        IQuestionFactoryImpl.time = time;
    }

    public static long getSpeedTime() {
        return speedTime;
    }

    public static void setSpeedTime(long speedTime) {
        IQuestionFactoryImpl.speedTime = speedTime;
    }

    @Override
    public void doThing(HttpServletRequest request, HttpServletResponse response, HttpServlet servlet, String factoryName) throws ServletException, IOException {
        if ("getAll".equals(factoryName)) {
            this.doGetAll(request, response, servlet);
        } else if ("getList".equals(factoryName)) {
            this.doGetList(request, response, servlet);
        } else if ("get".equals(factoryName)) {
            this.doGet(request, response, servlet);
        } else if ("chose".equals(factoryName)) {
            this.doChose(request, response, servlet);
        } else if ("push".equals(factoryName)) {
            this.doPush(request, response, servlet);
        } else if ("getQuestion".equals(factoryName)) {
            this.doGetQuestion(request, response, servlet);
        } else if ("updateReady".equals(factoryName)) {
            this.doUpdateReady(request, response, servlet);
        } else if ("update".equals(factoryName)) {
            this.doUpdate(request, response, servlet);
        } else if ("pushComment".equals(factoryName)) {
            this.doPushComment(request, response, servlet);
        } else if ("pushDemo".equals(factoryName)) {
            this.doPushDemo(request, response, servlet);
        } else if ("ksms".equals(factoryName)) {
            this.doKSMS(request, response, servlet);
        }
    }

    public void doKSMS(HttpServletRequest request, HttpServletResponse response,
            HttpServlet servlet) throws ServletException, IOException {
        Map<String, Object> tMap = new ServletCheckBuilder(request, response, servlet, "pushComment_from")
                .addNs("identity", "请重新登录", "login_from")
                .build();
        if (tMap != null) {
            User user = (User) tMap.get("ses_identity");
            if (user.getLvl().equals("-99")) {
                System.out.println(XYOJQueue.isCanShow);
                XYOJQueue.isCanShow = !XYOJQueue.isCanShow;
                System.out.println(XYOJQueue.isCanShow);
                request.getSession().setAttribute("info", "修改成功!");
                ServletUtil.redirect(request, response, "UserAction?method=get&userId=" + user.getUserId());
            }
        }
    }

    public void doPushDemo(HttpServletRequest request, HttpServletResponse response,
            HttpServlet servlet) throws ServletException, IOException {
        Map<String, Object> tMap = new ServletCheckBuilder(request, response, servlet, "pushComment_from")
                .addNp("questionId", "题目编号不能为空")
                .addNp("bodys", "分析不能为空")
                .addNp("coderId", "代码编号不能为空")
                .addNs("identity", "请重新登录", "login_from")
                .build();
        if (tMap != null) {
            User user = (User) tMap.get("ses_identity");
            Question q = qis.getQuestionOfQuestionId(tMap.get("par_questionId").toString());
            if (user.getUserId().equals(q.getUserId())) {
                q.setDemoCode(icrs.getCoderOfCoderId(tMap.get("par_coderId").toString()).getCode());
                q.setDemoBody(tMap.get("par_bodys").toString());
                qis.updateOfQuestionId(q, q.getQuestionId());
                request.getSession().setAttribute("info", "提交成功!");
                ServletUtil.redirect(request, response, "QuestionAction?method=get&questionId=" + tMap.get("par_questionId").toString());
            }
        }
    }

    public void doPushComment(HttpServletRequest request, HttpServletResponse response,
            HttpServlet servlet) throws ServletException, IOException {
        Map<String, Object> tMap = new ServletCheckBuilder(request, response, servlet, "pushComment_from")
                .addNp("questionId", "题目编号不能为空")
                .addNp("body", "评论不能为空")
                .addNs("identity", "请重新登录", "login_from")
                .build();
        if (tMap != null) {
            User user = (User) tMap.get("ses_identity");
            Comment c = new Comment();
            c.setBody(tMap.get("par_body").toString());
            c.setQuestionId(tMap.get("par_questionId").toString());
            c.setUserId(user.getUserId());
            c.setTime(new Date().toLocaleString());
            icms.insert(c);
            request.getSession().setAttribute("info", "评论成功!");
            ServletUtil.redirect(request, response, "QuestionAction?method=get&questionId=" + tMap.get("par_questionId").toString());
        }
    }

    public void doUpdateReady(HttpServletRequest request, HttpServletResponse response,
            HttpServlet servlet) throws ServletException, IOException {
        Map<String, Object> tMap = new ServletCheckBuilder(request, response, servlet, "push_from")
                .addNp("questionId", "题目编号不能为空")
                .addNs("identity", "请重新登录", "login_from")
                .build();
        if (tMap != null) {
            User user = (User) tMap.get("ses_identity");
            if ("-99".equals(user.getLvl())) {
                Question q = qis.getQuestionOfQuestionId(tMap.get("par_questionId").toString());
                request.getSession().setAttribute("question", q);
                List<Checker> tList = ics.getCheckersOfQuestionId(q.getQuestionId());
                request.getSession().setAttribute("questionCheckers", tList);
                request.getSession().setAttribute("questionCheckersSize", tList.size());
                request.getSession().setAttribute("info", "获取成功!");
                ServletUtil.forward(request, response, "updateQuestion.jsp");
            }
        }
    }

    public void doUpdate(HttpServletRequest request, HttpServletResponse response,
            HttpServlet servlet) throws ServletException, IOException {
        Map<String, Object> tMap = new ServletCheckBuilder(request, response, servlet, "push_from")
                .addNp("body", "题目要求不能为空")
                .addNp("title", "标题不能为空")
                .addNp("score", "分值不能为空")
                .addNp("inputFormat", "输入格式不能为空")
                .addNp("outputFormat", "输出格式不能为空")
                .addNp("inputTest", "输入样例不能为空")
                .addNp("outputTest", "输出样例不能为空")
                .addNp("number", "测试数据不能为空")
                .addNp("questionId", "请输入题目编号")
                .addNs("identity", "请重新登录", "login_from")
                .build();
        if (tMap != null) {
            User user = (User) tMap.get("ses_identity");
            if ("-99".equals(user.getLvl())) {
                Map<String, String> m = MapUtil.soss(tMap);
                Question q = qis.getQuestionOfQuestionId(m.get("par_questionId"));
                q.setBody(m.get("par_body"));
                q.setTitle(m.get("par_title"));
                q.setScore(m.get("par_score"));
                if (request.getParameter("isSetTime") != null) {
                    q.setStartTime(request.getParameter("startTime"));
                    q.setEndTime(request.getParameter("endTime"));
                } else {
                    q.setStartTime("0");
                    q.setEndTime(String.valueOf(Long.MAX_VALUE));
                }
                q.setInputFormat(m.get("par_inputFormat"));
                q.setOutputFormat(m.get("par_outputFormat"));
                q.setInputTest(m.get("par_inputTest"));
                q.setOutputTest(m.get("par_outputTest"));
                qis.updateOfQuestionId(q, q.getQuestionId());
                q = qis.getQuestion(q);
                int number = Integer.parseInt(m.get("par_number"));
                List<Checker> tList = (List<Checker>) request.getSession().getAttribute("questionCheckers");
                int i = 0;
                for (; i < tList.size(); i++) {
                    Checker c = tList.get(i);
                    c.setInput(request.getParameter("input_" + String.valueOf(i)));
                    c.setOutput(request.getParameter("output_" + String.valueOf(i)));
                    c.setQuestionId(q.getQuestionId());
                    ics.updateOfCheckerId(c, c.getCheckerId());
                }
                for (; i < number; i++) {
                    Checker c = new Checker();
                    c.setInput(request.getParameter("input_" + String.valueOf(i)));
                    c.setOutput(request.getParameter("output_" + String.valueOf(i)));
                    c.setQuestionId(q.getQuestionId());
                    ics.insert(c);
                }
                request.getSession().setAttribute("info", "修改成功!");
                ServletUtil.redirect(request, response, "pushQuestion.jsp");
            }
        }
    }

    public void doGetQuestion(HttpServletRequest request, HttpServletResponse response,
            HttpServlet servlet) throws ServletException, IOException {
        Question q = new Question();
        String sql = new SqlUtil().setStatus(SqlUtil.SQL_SELECT)
                .addDataName("question")
                .addBeforeWheres(ClassUtil.getName(q.getClass()))
                .addLast("WHERE contestId IS NULL")
                .build();
        List<Question> list = DBMan.getInstance()
                .queryWithoutThrow((Class<Question>) q.getClass(),
                        sql, ClassUtil.getValueNotNull(q));
        PrintWriter out = response.getWriter();
        out.println(JSON.toJSON(list));
    }

    /**
     * 选择题目
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
                .addNp("body", "题目要求不能为空")
                .addNp("title", "标题不能为空")
                .addNp("score", "分值不能为空")
                .addNp("inputFormat", "输入格式不能为空")
                .addNp("outputFormat", "输出格式不能为空")
                .addNp("inputTest", "输入样例不能为空")
                .addNp("outputTest", "输出样例不能为空")
                .addNp("number", "测试数据不能为空")
                .addNs("identity", "请重新登录", "login_from")
                .build();
        if (tMap != null) {
            User user = (User) tMap.get("ses_identity");
            if ("-99".equals(user.getLvl())) {
                Map<String, String> m = MapUtil.soss(tMap);
                Question q = new Question();
                q.setBody(m.get("par_body"));
                q.setTitle(m.get("par_title"));
                q.setScore(m.get("par_score"));
                if (request.getParameter("isSetTime") != null) {
                    q.setStartTime(request.getParameter("startTime"));
                    q.setEndTime(request.getParameter("endTime"));
                } else {
                    q.setStartTime("0");
                    q.setEndTime(String.valueOf(Long.MAX_VALUE));
                }
                q.setInputFormat(m.get("par_inputFormat"));
                q.setOutputFormat(m.get("par_outputFormat"));
                q.setInputTest(m.get("par_inputTest"));
                q.setOutputTest(m.get("par_outputTest"));
                qis.insert(q);
                q = qis.getQuestion(q);
                int number = Integer.parseInt(m.get("par_number"));
                for (int i = 0; i < number; i++) {
                    Checker c = new Checker();
                    c.setInput(request.getParameter("input_" + String.valueOf(i)));
                    c.setOutput(request.getParameter("output_" + String.valueOf(i)));
                    c.setQuestionId(q.getQuestionId());
                    ics.insert(c);
                }
                request.getSession().setAttribute("info", "插入成功!");
                ServletUtil.redirect(request, response, "pushQuestion.jsp");
            }
        }
    }

    /**
     * 选择题目
     *
     * @param request
     * @param response
     * @param servlet
     * @throws ServletException
     * @throws IOException
     */
    public void doChose(HttpServletRequest request, HttpServletResponse response, HttpServlet servlet) throws ServletException, IOException {
        Map<String, Object> tMap = new ServletCheckBuilder(request, response, servlet, "get_from")
                .addNp("questionId", "问题编号不能为空")
                .addNs("identity", "请重新登录", "login_from")
                .build();
        if (tMap != null) {
            String qid = request.getParameter("questionId");
            Question q = qis.getQuestionOfQuestionId(qid);
            if (q == null || Long.parseLong(q.getEndTime()) - new Date().getTime() <= 0 || new Date().getTime() < Long.parseLong(q.getStartTime())) {
                request.getSession().removeAttribute("question");
                request.getSession().setAttribute("info", "No. " + q.getQuestionId() + " " + q.getTitle() + "已经不能挑战了(或者还没有开始)");
                ServletUtil.redirect(request, response, "QuestionAction?method=getList");
            } else {
                User user = (User) request.getSession().getAttribute("identity");
                user.setLastQuestionId(qid);
                request.getSession().setAttribute("question", q);
                ServletUtil.redirect(request, response, "index.jsp");
            }
        }
    }

    /**
     * 获取题目详情
     *
     * @param request
     * @param response
     * @param servlet
     * @throws ServletException
     * @throws IOException
     */
    public void doGet(HttpServletRequest request, HttpServletResponse response, HttpServlet servlet) throws ServletException, IOException {
        Map<String, Object> tMap = new ServletCheckBuilder(request, response, servlet, "get_from")
                .addNp("questionId", "问题编号不能为空")
                .addNs("identity", "请重新登录", "login_from")
                .build();
        if (tMap != null) {
            String qid = request.getParameter("questionId");
            Question q = qis.getQuestionOfQuestionId(qid);
            if (!XYOJQueue.isCanShow && (StringUtil.isBigLong(String.valueOf(new Date().getTime()), q.getEndTime()) || StringUtil.isBigLong(q.getStartTime(), String.valueOf(new Date().getTime())))) {
                request.getSession().setAttribute("info", "考试模式下，该题暂时无法查看");
                ServletUtil.redirect(request, response, "QuestionAction?method=getList");
            } else {
                request.getSession().setAttribute("showQuestion", qis.getQuestionOfQuestionId(qid));
                request.getSession().setAttribute("commentList", icms.getCommentsOfQuestionId(qid));
                ServletUtil.forward(request, response, servlet, "get_to");
            }
        }
    }

    /**
     * 获取全部题目
     *
     * @param request
     * @param response
     * @param servlet
     * @throws ServletException
     * @throws IOException
     */
    public void doGetAll(HttpServletRequest request, HttpServletResponse response, HttpServlet servlet) throws ServletException, IOException {
        if (new Date().getTime() - time >= speedTime || request.getServletContext().getAttribute("questionList") == null) {
            List<Question> t = qis.getQuestions(new Question());
            List<Question> tList = new LinkedList(); // 列表
            List<Question> aList = new LinkedList(); // 正在进行的题
            List<Question> bList = new LinkedList(); // 已经结束的题
            Date d = new Date();
            for (Question q : t) {
                if (StringUtil.isBigLong(q.getEndTime(), String.valueOf(d.getTime())) && StringUtil.isBigLong(String.valueOf(d.getTime()), q.getStartTime())) {
                    aList.add(q);
                } else {
                    bList.add(q);
                }
            }
            tList.addAll(aList);
            tList.addAll(bList);
            //request.getServletContext().setAttribute("questionList", tList);
            request.getServletContext().setAttribute("questionList", aList);
            size = t.size();
            time = new Date().getTime();
        }
    }

    /**
     * 获取分页题目
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
        // 设置每页显示数量
        if ("".equals(request.getParameter("questionLimit"))) {
            request.setAttribute("questionLimit", "10");
        } else {
            try {
                limit = Integer.parseInt(request.getParameter("questionLimit"));
            } catch (Exception e) {

            }
            request.getSession().setAttribute("questionLimit", limit);
        }
        // 设置当前页面
        if ("".equals(request.getParameter("questionPage"))) {
            request.setAttribute("questionPage", "1");
        } else {
            try {
                page = Integer.parseInt(request.getParameter("questionPage"));
                page = Math.min(page, size / limit + 1);
            } catch (Exception e) {

            }
            request.getSession().setAttribute("questionPage", page);
        }
        ServletUtil.forward(request, response, servlet, "getList_to");
    }
}
