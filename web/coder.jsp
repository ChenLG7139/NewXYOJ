<%-- 
    Document   : coder
    Created on : 2018-1-9, 22:00:34
    Author     : lol
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ taglib prefix="fmt" uri="http://java.sun.com/jsp/jstl/fmt" %>
<%@taglib uri="http://java.sun.com/jsp/jstl/functions" prefix="fn"%>
<!DOCTYPE html>
<html>
        <head>
                <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
                <title>向阳小队专版OJ</title>
                <link rel="stylesheet" type="text/css" href="${pageContext.request.contextPath}/comm/layui/css/layui.css" />
                <link rel="stylesheet" type="text/css" href="${pageContext.request.contextPath}/comm/layui/css/modules/layer/default/layer.css" />
                <script src="${pageContext.request.contextPath}/comm/layui/layui.js" charset="utf-8"></script>
                <script src="${pageContext.request.contextPath}/comm/jquery/jquery-2.1.4.js"></script>
                <script src="${pageContext.request.contextPath}/comm/layer/layer.js"></script>
                <c:if test="${empty sessionScope.identity}">
                    <c:set var="info" value="尚未登录，请登录!" scope="session" />
                    <c:redirect url="login.jsp" />
                </c:if>
                <c:if test="${empty sessionScope.coder}">
                    <c:set var="info" value="未选择提交记录，请选择提交记录!" scope="session" />
                    <c:redirect url="CoderAction?method=getAllList&coderPage=1&coderLimit=10" />
                </c:if>
        </head>
        <body>
                <c:import url="top.jsp" />
                <fieldset class="layui-elem-field layui-field-title">
                        <legend>
                                <a href="QuestionAction?method=get&questionId=${sessionScope.coder.questionId}" style="font-size: 24px; color: #01AAED;">No.${sessionScope.coder.questionId} <c:if test="${isCanShow}">${sessionScope.showQuestion.title}</c:if></a>
                                <font style="color:#FF5722; font-size: 12px;">By. ${sessionScope.coder.userId}</font>
                                <c:if test="${identity.lvl == '-99'}">
                                    <span>提交ip: ${coder.ip}</span>
                                </c:if>
                        </legend>
                        <div class="layui-tab layui-tab-card">
                                <ul class="layui-tab-title">
                                        <li class="layui-this">代码详情</li>
                                        <li>题目详情</li>
                                        <c:if test="${isCanShow}"><li>交流专区</li></c:if>
                                        </ul>
                                        <div class="layui-tab-content fly-panel detail-box">
                                                <div class="layui-tab-item layui-show">
                                                        <legend><b>代码</b></legend>
                                                        <div class="layui-field-box">
                                                                <pre><c:if test="${isCanShow}"><c:out value="${sessionScope.coder.code}"  escapeXml="true" /></c:if><c:if test="${!isCanShow}">考试模式，无法查看</c:if></pre>
                                                        </div>
                                                        <legend><b>代码输出结果</b></legend>
                                                        <div class="layui-field-box">
                                                                    <pre><c:out value="${coder.result}"  escapeXml="true" /></pre>
                                                </div>
                                        </div>
                                        <div class="layui-tab-item">
                                                <fieldset class="layui-elem-field">
                                                        <legend><b>题目要求</b></legend>
                                                        <div class="detail-body jieda-body photos">
                                                                <c:out value="${sessionScope.showQuestion.body}"  escapeXml="true" />
                                                        </div>
                                                </fieldset>
                                                <fieldset class="layui-elem-field">
                                                        <legend><b>输入格式</b></legend>
                                                        <div class="detail-body jieda-body photos">
                                                                <c:out value="${sessionScope.showQuestion.inputFormat}"  escapeXml="true" />
                                                        </div>
                                                </fieldset>
                                                <fieldset class="layui-elem-field">
                                                        <legend><b>输出格式</b></legend>
                                                        <div class="detail-body jieda-body photos">
                                                                <c:out value="${sessionScope.showQuestion.outputFormat}"  escapeXml="true" />
                                                        </div>
                                                </fieldset>
                                                <fieldset class="layui-elem-field">
                                                        <legend><b>输入样例</b></legend>
                                                        <div class="layui-field-box">
                                                                <pre><c:out value="${sessionScope.showQuestion.inputTest}"  escapeXml="true" /></pre>
                                                        </div>
                                                </fieldset>
                                                <fieldset class="layui-elem-field">
                                                        <legend><b>输出样例</b></legend>
                                                        <div class="layui-field-box">
                                                                <pre><c:out value="${sessionScope.showQuestion.outputTest}"  escapeXml="true" /></pre>
                                                        </div>
                                                </fieldset>
                                        </div>
                                        <c:if test="${isCanShow}">
                                            <div class="layui-tab-item">
                                                    <div class="fly-panel detail-box" id="flyReply">
                                                            <fieldset class="layui-elem-field layui-field-title" style="text-align: center;">
                                                                    <legend>评论</legend>
                                                            </fieldset>

                                                            <ul class="jieda" id="jieda">
                                                                    <c:if test="${not empty commentList}">
                                                                        <c:forEach items="${commentList}" var="c">
                                                                            <li data-id="111" class="jieda-daan">
                                                                                    <a name="item-1111111111"></a>
                                                                                    <div class="detail-about detail-about-reply">
                                                                                            <a class="fly-avatar" href="${pageContext.request.contextPath}/UserAction?method=get&userId=${c.userId}">
                                                                                                    <img src="https://timgsa.baidu.com/timg?image&quality=80&size=b9999_10000&sec=1516606181057&di=47fa0f209e644726c3c68e3a832c8254&imgtype=0&src=http%3A%2F%2Fimg1.3lian.com%2F2015%2Fa2%2F226%2Fd%2F311.jpg"></a>
                                                                                            <div class="fly-detail-user">
                                                                                                    <a href="${pageContext.request.contextPath}/UserAction?method=get&userId=${c.userId}" class="fly-link">
                                                                                                            <cite>${c.userId}(${userMap[c.userId].name})</cite>      
                                                                                                    </a>
                                                                                            </div>
                                                                                            <div class="detail-hits">
                                                                                                    <span>${c.time}</span>
                                                                                            </div>
                                                                                    </div>
                                                                                    <div class="detail-body jieda-body photos">
                                                                                            ${c.body}
                                                                                    </div>
                                                                            </li>
                                                                        </c:forEach>
                                                                    </c:if>
                                                                    <c:if test="${empty commentList}">
                                                                        <!-- 无数据时 -->
                                                                        <li class="fly-none">消灭零回复</li>
                                                                        </c:if>
                                                            </ul>

                                                            <div class="layui-form layui-form-pane">
                                                                    <form action="${pageContext.request.contextPath}/CoderAction?method=pushComment&coderId=${coder.coderId}" method="post">
                                                                            <div class="layui-form-item layui-form-text">
                                                                                    <a name="comment"></a>
                                                                                    <div class="layui-input-block">
                                                                                            <textarea id="L_content" name="body" required lay-verify="required" placeholder="请输入内容"  class="layui-textarea fly-editor" style="height: 150px;"></textarea>
                                                                                    </div>
                                                                            </div>
                                                                            <div class="layui-form-item">
                                                                                    <input type="hidden" name="jid" value="123">
                                                                                    <button class="layui-btn" lay-submit>提交回复</button>
                                                                            </div>
                                                                    </form>
                                                            </div>
                                                    </div>
                                            </div>
                                        </c:if>
                                </div>
                        </div>
                </fieldset>
                <script>
                    layui.cache.page = '';
                    layui.cache.user = {
                        username: '游客'
                        , uid: -1
                        , avatar: '${pageContext.request.contextPath}/img/logo.jpg'
                        , experience: 83
                        , sex: '男'
                    };
                    layui.config({
                        version: "3.0.0"
                        , base: '${pageContext.request.contextPath}/comm/mods/'
                    }).extend({
                        fly: 'index'
                    }).use(['fly', 'face'], function () {
                        var $ = layui.$
                                , fly = layui.fly;
                        //如果你是采用模版自带的编辑器，你需要开启以下语句来解析。
                        $('.detail-body').each(function () {
                            var othis = $(this), html = othis.html();
                            othis.html(fly.content(html));
                        });
                    });
                    //注意：导航 依赖 element 模块，否则无法进行功能性操作
                    layui.use('element', function () {
                        var element = layui.element;

                        //…
                    });
                    layui.use('code', function () {
                        layui.code(); //实际使用时，执行该方法即可。而此处注释是因为修饰器在别的js中已经执行过了
                    });
                </script>
        </body>
</html>
