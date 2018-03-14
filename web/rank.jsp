<%-- 
    Document   : contest
    Created on : 2018-1-22, 15:00:26
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
                <link rel="stylesheet" href="${pageContext.request.contextPath}/res/layui/css/layui.css">
                <link rel="stylesheet" href="${pageContext.request.contextPath}/res/css/global.css">
                <script src="${pageContext.request.contextPath}/comm/layui/layui.js" charset="utf-8"></script>
                <script src="${pageContext.request.contextPath}/comm/jquery/jquery-2.1.4.js"></script>
                <script src="${pageContext.request.contextPath}/comm/layer/layer.js"></script>
        </head>
        <body>
                <c:import url="top.jsp" />
                <c:if test="${empty rankLimit}">
                    <c:redirect url="UserAction?method=getRank&rankPage=1&rankLimit=10" />
                </c:if>
                <div class="layui-container">
                        <div class="layui-row layui-col-space15">
                                <div class="fly-panel">
                                        <ul class="jie-row">
                                                <c:if test="${not empty applicationScope.userList}">
                                                    <table class="layui-table" lay-even lay-skin="nob">
                                                            <colgroup>
                                                                    <col width="100">
                                                                    <col width="350">
                                                                    <col width="">
                                                                    <col width="100">
                                                                    <col width="50">
                                                            </colgroup>
                                                            <thead>
                                                                    <tr>
                                                                            <th>排名</th>
                                                                            <th>用户</th>
                                                                            <th>简介</th>
                                                                            <th>分值</th>
                                                                            <th>操作</th>
                                                                    </tr> 
                                                            </thead>
                                                            <tbody>
                                                                    <c:forEach items="${applicationScope.userList}" var="c" varStatus="status" begin="${(rankPage - 1) * rankLimit}" end="${rankPage* rankLimit}">
                                                                        <tr>
                                                                                <td>
                                                                                        ${status.index + (rankPage-1) * rankLimit + 1}
                                                                                </td>
                                                                                <td>
                                                                                        <a href="${pageContext.request.contextPath}/UserAction?method=get&userId=${c.userId}"  style="color: #01AAED;">
                                                                                                ${c.userId}(${c.name})
                                                                                        </a>
                                                                                </td>
                                                                                <td>
                                                                                        <c:if test="${empty c.signs}">
                                                                                            你是风儿，我是沙~
                                                                                        </c:if>
                                                                                        <c:if test="${not empty c.signs}">
                                                                                            ${c.signs}
                                                                                        </c:if>
                                                                                </td>
                                                                                <td>
                                                                                        ${c.score}
                                                                                </td>
                                                                                <td>
                                                                                        <a class="layui-btn" href="${pageContext.request.contextPath}/UserAction?method=get&userId=${c.userId}"  style="color: #01AAED;">
                                                                                                查看
                                                                                        </a>
                                                                                </td>
                                                                        </tr>
                                                                    </c:forEach>
                                                            </tbody>
                                                    </table>
                                                    <div id="pageDiv" align="center"></div>
                                                </c:if>
                                                <c:if test="${empty applicationScope.userList}">
                                                    <div class="fly-none" style="min-height: 50px; padding:30px 0; height:auto;"><i style="font-size:14px;">没有任何排名</i></div>
                                                </c:if>
                                </div>
                        </div>
                </div>
                <script>
                    layui.use(['laypage', 'layer'], function () {
                        var laypage = layui.laypage
                                , layer = layui.layer;
                        laypage.render({
                            elem: 'pageDiv'
                            , count: ${fn:length(applicationScope.userMap)}
                            , theme: '#1E9FFF'
                            , layout: ['count', 'prev', 'page', 'next', 'limit', 'skip']
                            , limit: ${rankLimit}
                            , curr: ${rankPage}
                            , jump: function (obj) {
                                if (obj.curr != ${rankPage} || obj.limit != ${rankLimit}) {
                                    location.href = "UserAction?method=getRank&rankPage=" + obj.curr + "&rankLimit=" + obj.limit;
                                }
                            }
                        });
                    });
                    //注意：导航 依赖 element 模块，否则无法进行功能性操作
                    layui.use('element', function () {
                        var element = layui.element;

                        //…
                    });
                </script>
        </body>
</html>
