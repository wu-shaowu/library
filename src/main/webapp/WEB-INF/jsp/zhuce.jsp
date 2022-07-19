<%--
  Created by IntelliJ IDEA.
  User: 1
  Date: 2021/12/13
  Time: 16:55
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@taglib prefix="form" uri="http://www.springframework.org/tags/form" %>
<html>
<head>

    <title>注册</title>
    <link rel="canonical" href="https://getbootstrap.com/docs/5.1/examples/sign-in/">
    <!-- Bootstrap core CSS -->
    <link href="/bootstrap-5.1.3-examples/bootstrap.min.css" rel="stylesheet">
    <style>

        .bd-placeholder-img {
            font-size: 1.125rem;
            text-anchor: middle;
            -webkit-user-select: none;
            -moz-user-select: none;
            user-select: none;
        }

        @media (min-width: 768px) {
            .bd-placeholder-img-lg {
                font-size: 3.5rem;
            }
        }
    </style>


    <!-- Custom styles for this template -->
    <link href="/bootstrap-5.1.3-examples/sign-in/signin.css" rel="stylesheet">
</head>
<body class="text-center">
<main class="form-signin">
    <form:form modelAttribute="yhzhuce">
    <img class="mb-4" src="/bootstrap-5.1.3-examples/bootstrap-logo.svg" alt="" width="72" height="57">
    <h1 class="h3 mb-3 fw-normal">注册</h1>
    <div class="form-floating">
        <form:input class="form-control" path="sjh" placeholder="手机号" />
        <label >手机号</label></div>
    </div>
    <div class="form-floating"><form:input path="password" class="form-control" placeholder="密码"/><label >密码</label></div></div>
        <div class="form-floating"><form:input path="username" class="form-control" placeholder="姓名"/><label >姓名</label></div></div>

        <div class="checkbox mb-3">
        <label>
            <input type="checkbox" value="remember-me"> Remember me
        </label>
    </div>
    <form:button class="w-100 btn btn-lg btn-primary">注册</form:button>
        <input class="layui-btn" type="button" value="返回" onclick="z()">

    </form:form>

</body>
<script>
    function z() {

        window.location="/index";
    }
</script>
</html>

<%--
  Created by IntelliJ IDEA.
  User: 1
  Date: 2021/12/15
  Time: 11:15
  To change this template use File | Settings | File Templates.

<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@taglib prefix="form" uri="http://www.springframework.org/tags/form" %>
<html>
<head>
    <title>注册</title>
    <link rel="stylesheet" href="layui/css/layui.css">

    <!-- 引入 layui.js -->
    <script src="layui/layui.js"></script>
</head>
<body>
<form:form modelAttribute="yhzhuce">
    <div class="form-group">
        <form:input path="sjh" placeholder="手机号" />
    </div>
    <div class="form-group"><form:input path="password" placeholder="密码"/></div>
    <div class="form-group"><form:input path="username" placeholder="姓名"/></div>

    <form:button class="layui-btn">注册</form:button>
    <input class="layui-btn" type="button" value="返回" onclick="z()">
    <p> ${errorM}</p>
</form:form>
</body>
<script>
    function z() {

        window.location="/index";
    }
</script>
</html>
--%>