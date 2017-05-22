<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%@taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>

<!DOCTYPE html>
<html lang="pt-BR">
    <%@include file="validations/validadeSessionLogin.jsp" %>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8"/>
        <meta name="viewport" content="width=device-width, initial-scale=1, maximum-scale=1.0"/>
        <link rel="shortcut icon" href="img/favicon.ico" type="image/x-icon">
        <link rel="icon" href="../img/favicon.ico" type="image/x-icon">
        <title>Uniestágios</title>

        <!-- CSS  -->
        <link href="https://fonts.googleapis.com/icon?family=Material+Icons" rel="stylesheet">

        <link href="assets/css/materialize.css" type="text/css" rel="stylesheet" media="screen,projection"/>
        <link href="assets/css/style.css" type="text/css" rel="stylesheet" media="screen,projection"/>
        <link href="assets/css/main.css" type="text/css" rel="stylesheet" media="screen,projection"/>

        <link href="../assets/css/materialize.css" type="text/css" rel="stylesheet" media="screen,projection"/>
        <link href="../assets/css/style.css" type="text/css" rel="stylesheet" media="screen,projection"/>
        <link href="../assets/css/main.css" type="text/css" rel="stylesheet" media="screen,projection"/>

        <link rel="stylesheet" href="./css/vendor/normalize.css">
        <link rel="stylesheet" href="assets/css/gallery.prefixed.css">
        <link rel="stylesheet" href="assets/css/gallery.theme.css">
        <link rel="stylesheet" href="https://cdnjs.cloudflare.com/ajax/libs/font-awesome/4.4.0/css/font-awesome.min.css">

    </head>
    <body>
        <%-- <%@include file="validations/validadeSessionLogin.jsp" %> --%>
        <nav class="light-blue lighten-1" role="navigation">
            <div class="nav-wrapper container "><a id="logo-container" href="index.jsp" class="brand-logo"><img src="img/logo.png" class="logo-nav"></a> 
                <ul class="right hide-on-med-and-down">
                    <li><a href="index.jsp">SITE</a></li>
                    <li><a href="list_jobs.jsp">Vagas</a></li>
                        <% if (request.getSession().getAttribute("usuario") == null) {%> 
                    <li><a href="../register_user.jsp">Cadastrar-se</a></li>
                    <li><a href="login.jsp">Login <i class="fa fa-sign-in" aria-hidden="true"></i></a></li>
                            <% } else {%> 
                    <li><a class="dropdown-button" href="#!" data-activates="dropdown1">${usuario.username} <i class="fa fa-user" aria-hidden="true"></i><i class="material-icons right">arrow_drop_down</i></a></li>
                                <% }%>
                </ul>
                <ul id="dropdown1" class="dropdown-content">
                    <li><a href="panel_user.jsp">Perfil</a></li>
                    <li class="divider"></li>
                    <li><a href="AuthController?flag=logout">Logout</a></li>
                </ul>
                <ul id="nav-mobile" class="side-nav" style="transform: translateX(-50px);">
                    <% if (request.getSession().getAttribute("usuario") == null) {%> 
                    <li><a href="login.jsp">-..:: Login ::..</a></li>
                    <li><a href="register_user.jsp">...:::: Criar Conta :::...</a></li>
                    <li class="divider"></li>
                        <% } else {%> 
                    <li><a href="my_perfil.jsp">...:::: Perfil ::::...</a></li>
                    <li><a href="AuthController?flag=logout">...:::: Logout :::...</a></li>
                        <% }%> 
                </ul> 
                <a href="#" data-activates="nav-mobile" class="button-collapse"><i class="material-icons">menu</i></a>
        </nav>


        <div class="section">
            <div class="row">
                <div class="col s3 offset-m1 center ">
                    <div class="col s12">
                        <div class="card grey lighten-4">
                            <div class="card-content white-text">
                                <span class="card-title black-text"><a href="panel_user.jsp"><b>PAINEL DE USUÁRIO</b></a></span>
                                <div class="card-action">
                                </div>
                                <%   if (request.getSession().getAttribute("perfil").equals("estudante")) { %>
                                <ul>
                                    <li class="grey lighten-1">
                                        <span  class="black-text"> <b>ATUALIZAR DADOS</b></span>
                                    </li>
                                    <li>
                                        <a  class="orange-text" href="UserController?flag=list">PESSOAIS</a>
                                    </li>
                                    <li>
                                        <a  class="orange-text" href="UserController?flag=list">ENDEREÇO</a>
                                    </li>
                                    <br>
                                    <li class="grey lighten-1">
                                        <span  class="black-text"> <b>VAGAS</b></span>
                                    </li>
                                    <li>
                                        <a  class="orange-text" href="UserController?flag=list">MINHAS VAGAS</a>
                                    </li>

                                </ul>


                                <% } else {%>
                                <ul>
                                    <li class="grey lighten-1">
                                        <span  class="black-text"> <b>ATUALIZAR DADOS</b></span>
                                    </li>
                                    <li>
                                        <a  class="orange-text" href="UserController?flag=list">EMPRESARIAS</a>
                                    </li>
                                    <li>
                                        <a  class="orange-text" href="UserController?flag=list">ENDEREÇO</a>
                                    </li>
                                    <br>
                                    <li class="grey lighten-1">
                                        <span  class="black-text"> <b>VAGAS</b></span>
                                    </li>
                                    <li>
                                        <a  class="orange-text" href="UserController?flag=list">MINHAS VAGAS</a>
                                    </li>

                                </ul>

                                
                                
                                <% }%>
                            </div>
                        </div>
                    </div>
                </div>
