<%-- 
    Document   : question
    Created on : 2018-1-9, 13:42:53
    Author     : lol
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ taglib prefix="fmt" uri="http://java.sun.com/jsp/jstl/fmt" %>
<!DOCTYPE html>
<html>
        <head>
                <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
                <title>向阳小队专版OJ</title>
                <link rel="stylesheet" type="text/css" href="${pageContext.request.contextPath}/css/index.css" />
                <link rel="stylesheet" type="text/css" href="${pageContext.request.contextPath}/comm/layui/css/layui.css" />
                <link rel="stylesheet" type="text/css" href="${pageContext.request.contextPath}/comm/layui/css/modules/layer/default/layer.css" />
                <script src="${pageContext.request.contextPath}/comm/layui/layui.js" charset="utf-8"></script>
                <script src="${pageContext.request.contextPath}/comm/jquery/jquery-2.1.4.js"></script>
                <script src="${pageContext.request.contextPath}/comm/layer/layer.js"></script>
                <c:if test="${empty sessionScope.identity}">
                    <c:set var="info" value="尚未登录，请登录!" scope="session" />
                    <c:redirect url="login.jsp" />
                </c:if>
                <c:if test="${empty sessionScope.showQuestion}">
                    <c:set var="info" value="尚未选择题目，请重新选择题目!" scope="session" />
                    <c:redirect url="QuestionAction?method=getList&questionPage=1&questionLimit=10" />
                </c:if>
                <script>
                        <c:if test="${showQuestion.userId == identity.userId}">
                    var list;
                    function xuanze(index, coderId) {
                        $("#daimakuang").css("display", "block");
                        var str = list[index].code;
                        str = str.replace('<', '&lt;');
                        str = str.replace('>', '&gt;');
                        $("#daimakuang").html("<pre>" + str + "</pre>");
                        $("#coderId222").val(coderId);
                    }
                    $(document).ready(function () {
                        $.get("${pageContext.request.contextPath}/CoderAction?method=getCoders&questionId=${showQuestion.questionId}&userId=${identity.userId}").done(function (data) {
                                    list = JSON.parse(data);
                                    console.log(list);
                                    $("#coderListBody").html("");
                                    for (var i = 0; i < list.length; i++) {
                                        $("#coderListBody").append("<tr><td>"
                                                + list[i].coderId
                                                + "</td><td>"
                                                + list[i].time
                                                + "</td><td>"
                                                + (list[i].endTime - list[i].startTime)
                                                + "</td><td>"
                                                + "<a class='layui-btn' onclick='xuanze("
                                                + i + ", "
                                                + list[i].coderId
                                                + ")'>选择</a>"
                                                + "</td></td>");
                                    }
                                })
                            }
                            )
                                    ;
                        </c:if>
                            $(document).ready(function () {
                                function updateTime()
                                {
                                    var time = parseInt($("#time").html());
                                    if (time) {
                                        $("#time").html(time - 1);
                                        time = $("#time").html();
                                        time = parseInt(time);
                                        var hour = parseInt(time / 3600);
                                        var minute = parseInt((time - hour * 3600) / 60);
                                        var second = parseInt(time % 60);
                                        $("#date").html(hour + "小时" + minute + "分" + second + "秒");
                                    }
                                }
                                updateTime();
                                window.setInterval(updateTime, 1000);
                            });</script>
        </head>
        <body class="layui-bg-gray">
                <c:import url="top.jsp" />
                <fieldset class="layui-elem-field layui-field-title">
                        <legend><font style="font-size: 36px;">No.${sessionScope.showQuestion.questionId} <c:if test="${isCanShow}">${sessionScope.showQuestion.title}</c:if> <i class="layui-icon" style="font-size: 20px; color: #FFB800;">${sessionScope.showQuestion.score}&#xe65e;</i></font>
                                <c:choose>  
                                    <c:when test="${date >= sessionScope.showQuestion.startTime && sessionScope.showQuestion.endTime - date > 0 && sessionScope.showQuestion.endTime - date < 1000 * 60 * 60 * 24 *365}">
                                        <span id="date" style='color: #FF5722;'></span>
                                        <span  id="time" hidden="true">${(sessionScope.showQuestion.endTime - date) / 1000}</span>
                                        <a href="QuestionAction?method=chose&questionId=${sessionScope.showQuestion.questionId}">
                                                <button class="layui-btn layui-btn-danger"><i class="layui-icon">&#xe600;</i> 挑战</button>
                                        </a>
                                    </c:when>  
                                    <c:otherwise>
                                        <c:choose>  
                                            <c:when test="${sessionScope.showQuestion.endTime - date >= 1000 * 60 * 60 * 24 *365}">
                                                （永久开启）
                                                <a href="QuestionAction?method=chose&questionId=${sessionScope.showQuestion.questionId}">
                                                        <button class="layui-btn layui-btn-danger"><i class="layui-icon">&#xe600;</i> 挑战</button>
                                                </a>
                                            </c:when>  
                                            <c:otherwise>
                                                （已经结束，或者还没有开始）
                                                <button class="layui-btn layui-btn-disabled"><i class="layui-icon">&#xe600;</i> 挑战</button>
                                            </c:otherwise>  
                                        </c:choose>
                                    </c:otherwise>  
                                </c:choose>
                                <c:if test="${identity.lvl == '-99'}">
                                    <a href="${pageContext.request.contextPath}/QuestionAction?method=updateReady&questionId=${showQuestion.questionId}" class="layui-btn layui-btn-warm">修改</a>
                                </c:if>
                        </legend>
                        <div class="layui-tab layui-tab-card">
                                <ul class="layui-tab-title">
                                        <li class="layui-this">题目详情</li>
                                                <c:if test="${showQuestion.userId == identity.userId || (not empty sessionScope.showQuestion.demoCode && sessionScope.showQuestion.endTime - date <= 0)}">
                                                    <c:if test="${isCanShow}"><li>推荐代码</li></c:if>
                                                </c:if>
                                                <c:if test="${isCanShow}"><li>交流专区</li></c:if>
                                        </ul>
                                        <div class="layui-tab-content fly-panel detail-box">
                                                <div class="layui-tab-item layui-show">
                                                        <fieldset class="layui-elem-field">
                                                                <legend><b>题目要求</b></legend>
                                                                <div class="detail-body jieda-body photos">
                                                                <c:out value="${sessionScope.showQuestion.body}"  escapeXml="true" />
                                                        </div>
                                                </fieldset>
                                                <fieldset class="layui-elem-field">
                                                        <legend><b>输入格式</b></legend>
                                                        <div class="detail-body jieda-body photos">
                                                                <c:out value=" ${sessionScope.showQuestion.inputFormat}"  escapeXml="true" />
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
                                                                <pre>${sessionScope.showQuestion.inputTest}</pre>
                                                        </div>
                                                </fieldset>
                                                <fieldset class="layui-elem-field">
                                                        <legend><b>输出样例</b></legend>
                                                        <div class="layui-field-box">
                                                                <pre>${sessionScope.showQuestion.outputTest}</pre>
                                                        </div>
                                                </fieldset>
                                        </div>
                                        <c:if test="${(showQuestion.userId == identity.userId) || (not empty sessionScope.showQuestion.demoCode && sessionScope.showQuestion.endTime - date <= 0)}">
                                            <c:if test="${isCanShow}">
                                                <div class="layui-tab-item">
                                                        <c:if test="${showQuestion.userId != identity.userId}">
                                                            <fieldset class="layui-elem-field">
                                                                    <legend><b>正确代码</b></legend>
                                                                    <div class="layui-field-box">
                                                                            <pre><c:out value="${sessionScope.showQuestion.demoCode}"  escapeXml="true" /></pre>
                                                                    </div>
                                                            </fieldset>
                                                            <fieldset class="layui-elem-field">
                                                                    <legend><b>解题分析</b></legend>
                                                                    <div class="detail-body jieda-body photos">
                                                                            ${sessionScope.showQuestion.demoBody}
                                                                    </div>
                                                            </fieldset>
                                                        </c:if>
                                                        <c:if test="${showQuestion.userId == identity.userId}">
                                                            <div class="layui-form layui-form-pane">
                                                                    <form action="${pageContext.request.contextPath}/QuestionAction?method=pushDemo&questionId=${showQuestion.questionId}" method="post">
                                                                            <div class="layui-form-item">
                                                                                    <fieldset class="layui-elem-field">
                                                                                            <legend><b>请选择要显示的代码</b></legend>
                                                                                            <div class="layui-anim layui-anim-fadein">
                                                                                                    <table class="layui-table" lay-even lay-skin="nob">
                                                                                                            <colgroup>
                                                                                                                    <col width="50">
                                                                                                                    <col width="150">
                                                                                                                    <col width="50">
                                                                                                                    <col width="50">
                                                                                                                    <col width="50">
                                                                                                                    <col width="50">
                                                                                                                    <col width="50">
                                                                                                            </colgroup>
                                                                                                            <thead>
                                                                                                                    <tr>
                                                                                                                            <th>提交编号</th>
                                                                                                                            <th>提交时间</th>
                                                                                                                            <th>运行时间</th>
                                                                                                                            <th>操作</th>
                                                                                                                    </tr> 
                                                                                                            </thead>
                                                                                                            <tbody id="coderListBody">
                                                                                                            </tbody>
                                                                                                    </table>
                                                                                            </div>
                                                                                    </fieldset>
                                                                            </div>
                                                                            <input type="hidden" id="coderId222" name="coderId" />
                                                                            <fieldset class="layui-elem-field" id="daimakuang" style="display: none;">
                                                                                    <legend><b>选择代码</b></legend>
                                                                                    <div class="layui-field-box">
                                                                                            <pre id="daima"></pre>
                                                                                    </div>
                                                                            </fieldset>
                                                                            <div class="layui-form-item layui-form-text">
                                                                                    <a name="comment"></a>
                                                                                    <fieldset class="layui-elem-field">
                                                                                            <legend><b>解题分析</b></legend>
                                                                                            <div class="layui-input-block">
                                                                                                    <textarea id="L_content" name="bodys" required lay-verify="required" placeholder="请输入内容"  class="layui-textarea fly-editor" style="height: 550px;">${sessionScope.showQuestion.demoBody}</textarea>
                                                                                            </div>
                                                                                    </fieldset>
                                                                            </div>
                                                                            <div class="layui-form-item">
                                                                                    <input type="hidden" name="jid" value="123">
                                                                                    <button class="layui-btn" lay-submit>确认提交</button>
                                                                            </div>
                                                                    </form>
                                                            </div>
                                                        </c:if>
                                                </div>
                                            </c:if>
                                        </c:if>
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
                                                                    <form action="${pageContext.request.contextPath}/QuestionAction?method=pushComment&questionId=${showQuestion.questionId}" method="post">
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
