<%-- 
    Document   : index
    Created on : 25/04/2017, 15:00:28
    Author     : alefsilva
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>

<!DOCTYPE html>
<html lang="en">
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8"/>
        <meta name="viewport" content="width=device-width, initial-scale=1, maximum-scale=1.0"/>
        <title>Uniestagios</title>

        <!-- CSS  -->
        <link href="https://fonts.googleapis.com/icon?family=Material+Icons" rel="stylesheet">
        <link href="assets/css/materialize.css" type="text/css" rel="stylesheet" media="screen,projection"/>
        <link href="assets/css/style.css" type="text/css" rel="stylesheet" media="screen,projection"/>
        <link href="assets/css/main.css" type="text/css" rel="stylesheet" media="screen,projection"/>
        <link rel="stylesheet" href="./css/vendor/normalize.css">
        <link rel="stylesheet" href="assets/css/gallery.prefixed.css">
        <link rel="stylesheet" href="assets/css/gallery.theme.css">
    </head>
    <body>
        <nav class="light-blue lighten-1" role="navigation">
            <div class="nav-wrapper container"><a id="logo-container" href="index.jsp" class="brand-logo">Logo</a>
                <ul class="right hide-on-med-and-down">
                    <li><a href="list_jobs.jsp">Vagas</a></li>
                    <li><a class="dropdown-button" href="#!" data-activates="dropdown1">Logar-se<i class="material-icons right">arrow_drop_down</i></a></li>
                </ul>
                <ul id="dropdown1" class="dropdown-content">
                    <li><a href="login.jsp">Login</a></li>
                    <li><a href="register_user.jsp">Criar Conta</a></li>
                    <li class="divider"></li>
                    <li><a href="#!">three</a></li>
                </ul>
                <ul id="nav-mobile" class="side-nav">
                    <li><a href="list_jobs.jsp">Vagas</a></li>
                    <li><a href="login.jsp">Login</a></li>
                    <li><a href="register_user.jsp">Criar Conta</a></li>
                    <li class="divider"></li>
                    <li><a href="#!">three</a></li>
                </ul>
                <a href="#" data-activates="nav-mobile" class="button-collapse"><i class="material-icons">menu</i></a>
            </div>
        </nav>
