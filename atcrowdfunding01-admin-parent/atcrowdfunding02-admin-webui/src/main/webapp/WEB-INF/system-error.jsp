<%--
  Created by IntelliJ IDEA.
  User: jiaxiaohui
  Date: 2022/3/19
  Time: 16:40
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<!DOCTYPE html>
<html lang="zh-CN">
<head>
    <%-- 前面与登录页面相同 --%>
        <meta charset="UTF-8">
        <meta http-equiv="X-UA-Compatible" content="IE=edge">
        <meta name="viewport" content="width=device-width, initial-scale=1">
        <meta name="description" content="">
        <meta name="keys" content="">
        <meta name="author" content="">
    <base href="http://${pageContext.request.serverName}:${pageContext.request.serverPort}${pageContext.request.contextPath}/">
    <script src="jquery/jquery.js" type="text/javascript"></script>
    <script type="text/javascript">
        $(function () {
            $("button").click(function () {
                //用js的方法，完成回退的目的
                window.history.back();
            });
        });
    </script>
</head>
<body>
<nav class="navbar navbar-inverse navbar-fixed-top" role="navigation">
    <%-- 与登录页面同 --%>
</nav>

<div class="container">
    <h1 style="text-align: center;">请求出现了错误QAQ</h1>
    <h2 style="text-align: center;">错误消息：${requestScope.exception.message}</h2>
    <br/><br/>
    <button style="width:150px;margin: 0 auto;" class="btn btn-lg btn-success btn-block">返回上一步</button>
</div>

<script src="bootstrap/js/bootstrap.min.js"></script>
</body>
</html>
