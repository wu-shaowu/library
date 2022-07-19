<%--
  Created by IntelliJ IDEA.
  User: 1
  Date: 2021/12/9
  Time: 20:10
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>欢迎</title>
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
    <link href="/bootstrap-5.1.3-examples/cover.css" rel="stylesheet">
</head>
<body class="d-flex h-100 text-center text-white bg-dark">

<div class="cover-container d-flex w-100 h-100 p-3 mx-auto flex-column">
    <header class="mb-auto">
        <div>
            <h3 class="float-md-start mb-0">欢迎图书馆</h3>
            <nav class="nav nav-masthead justify-content-center float-md-end">

                <a class="nav-link" href="/user/zhuce">注册</a>
                <a class="nav-link" href="/user/login">登录</a>
            </nav>
        </div>
    </header>
<img src="/img/tsg.png" width="650px" height="350px">
    <main class="px-3">
        <h1>图书馆介绍</h1>
        <p class="lead">图书馆，是搜集、整理、收藏图书资料以供人阅览、参考的机构，早在公元前3000年就出现了图书馆，图书馆有保存人类文化遗产、开发信息资源、参与社会教育等职能。
            </p>
        <p class="lead">
            <a href="https://baike.baidu.com/item/%E5%9B%BE%E4%B9%A6%E9%A6%86/345742?fr=aladdin" class="btn btn-lg btn-secondary fw-bold border-white bg-white">更多</a>
        </p>
    </main>


</div>



</body>
</html>
