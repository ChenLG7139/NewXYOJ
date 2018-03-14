<%-- 
    Document   : cUser
    Created on : 2018-1-27, 18:53:20
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
        </head>
        <body>
                <c:import url="top.jsp" />
                <div class="layui-container">
                        <div class="layui-row layui-col-space15">
                                <div class="layui-tab layui-tab-brief" lay-filter="user">
                                        <ul class="layui-tab-title" id="LAY_mine">
                                                <li class="layui-this" lay-id="info">我的资料</li>
                                        </ul>
                                        <div class="layui-tab-content" style="padding: 20px 0;">
                                                <div class="layui-form layui-form-pane layui-tab-item layui-show">
                                                        <form method="post" action="${pageContext.request.contextPath}/UserAction?method=update">
                                                                <div class="layui-form-item">
                                                                        <label for="L_username" class="layui-form-label">昵称</label>
                                                                        <div class="layui-input-inline">
                                                                                <input type="text" id="L_username" name="username" required lay-verify="required" autocomplete="off" value="${identity.name}" class="layui-input">
                                                                        </div>
                                                                        <div class="layui-inline">
                                                                                <div class="layui-input-inline">
                                                                                        <input type="radio" name="sex" value="0" checked title="男">
                                                                                        <input type="radio" name="sex" value="1" title="女">
                                                                                </div>
                                                                        </div>
                                                                </div>
                                                                <div class="layui-form-item layui-form-text">
                                                                        <label for="L_sign" class="layui-form-label">签名</label>
                                                                        <div class="layui-input-block">
                                                                                <textarea placeholder="随便写些什么刷下存在感" id="L_sign"  name="signs" autocomplete="off" class="layui-textarea" style="height: 80px;">${identity.signs}</textarea>
                                                                        </div>
                                                                </div>
                                                                <div class="layui-form-item">
                                                                        <button class="layui-btn" key="set-mine" lay-submit>确认修改</button>
                                                                </div>
                                                </div>


                                        </div>

                                </div>
                        </div>
                </div>

                <script>
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
