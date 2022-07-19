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

    <title>登录</title>
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
    <form:form modelAttribute="yh">
        <img class="mb-4" src="/bootstrap-5.1.3-examples/bootstrap-logo.svg" alt="" width="72" height="57">
        <h1 class="h3 mb-3 fw-normal">登录</h1>
        <div class="form-floating">
            <form:input class="form-control" path="sjh" placeholder="手机号" />
             <label >手机号</label>
        </div>
        <div class="form-floating"><form:input path="password" class="form-control" placeholder="密码"/>
        <label >密码</label></div>
        <div class="checkbox mb-3">
            <label>
                <input type="checkbox" value="remember-me"> Remember me
            </label>
        </div>
    <form:button class="w-100 btn btn-lg btn-primary">登录</form:button>

</form:form>

<p> ${errorMsg}</p>
</body>
</html>

<%--
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@taglib prefix="form" uri="http://www.springframework.org/tags/form" %>
<html>
<head>

    <title>登录</title>

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
    <form>
        <img class="mb-4" src="/bootstrap-5.1.3-examples/bootstrap-logo.svg" alt="" width="72" height="57">
        <h1 class="h3 mb-3 fw-normal">Please sign in</h1>

        <div class="form-floating">
            <input type="email" class="form-control" placeholder="ssssssss">

        </div>
        <div class="form-floating">
            <input type="password" class="form-control" id="floatingPassword" placeholder="Password">
            <label for="floatingPassword">Password</label>
        </div>

        <div class="checkbox mb-3">
            <label>
                <input type="checkbox" value="remember-me"> Remember me
            </label>
        </div>
        <button class="w-100 btn btn-lg btn-primary" type="submit">Sign in</button>
        <p class="mt-5 mb-3 text-muted">&copy; 2017–2021</p>
    </form>
</main>



</body>
</html>
--%>