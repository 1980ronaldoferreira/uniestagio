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
    </head>
    <body>
        <nav class="light-blue lighten-1" role="navigation">
            <div class="nav-wrapper container"><a id="logo-container" href="#" class="brand-logo">Logo</a>
                <ul class="right hide-on-med-and-down">
                    <li><a href="#!">Vagas</a></li>
                    <li><a class="dropdown-button" href="#!" data-activates="dropdown1">Logar-se<i class="material-icons right">arrow_drop_down</i></a></li>
                </ul>
                <ul id="dropdown1" class="dropdown-content">
                    <li><a href="#!">Login</a></li>
                    <li><a href="#!">Criar Conta</a></li>
                    <li class="divider"></li>
                    <li><a href="#!">three</a></li>
                </ul>
                <ul id="nav-mobile" class="side-nav">
                    <li><a href="#!">Vagas</a></li>
                    <li><a href="#!">Login</a></li>
                    <li><a href="#!">Criar Conta</a></li>
                    <li class="divider"></li>
                    <li><a href="#!">three</a></li>
                </ul>
                <a href="#" data-activates="nav-mobile" class="button-collapse"><i class="material-icons">menu</i></a>
            </div>
        </nav>
        <div class="section no-pad-bot" id="index-banner">
            <div class="container">
                <br><br>
                <h1 class="header center orange-text">Cadastro de Usuários</h1>
                <br><br>

            </div>
        </div>

        <div class="container">
            <div class="section">

                <div class="row">
                    <form class="col s6 offset-s3">
                        <div class="row">
                            <div class="input-field col s12">
                                <input placeholder="nickname" id="first_name" type="text" class="validate">
                                <label for="first_name">Nome de Usuario</label>
                            </div>
                        </div>

                        <div class="row">
                            <div class="input-field col s12">
                                <input id="password" type="password" class="validate">
                                <label for="password">Senha</label>
                            </div>
                        </div>
                        <button class="btn waves-effect waves-light light-blue lighten-1" type="submit" name="action">Cadastrar
                            <i class="material-icons right">send</i>
                        </button>
                    </form>
                </div>
            </div>
        </div>
        <br><br>


        <footer class="page-footer footer-full orange">
            <div class="container">
                <div class="row">
                    <div class="col l6 s12">
                        <h5 class="white-text">Company Bio</h5>
                        <p class="grey-text text-lighten-4">We are a team of college students working on this project like it's our full time job. Any amount would help support and continue development on this project and is greatly appreciated.</p>


                    </div>
                    <div class="col l3 s12">
                        <h5 class="white-text">Settings</h5>
                        <ul>
                            <li><a class="white-text" href="#!">Link 1</a></li>
                            <li><a class="white-text" href="#!">Link 2</a></li>
                            <li><a class="white-text" href="#!">Link 3</a></li>
                            <li><a class="white-text" href="#!">Link 4</a></li>
                        </ul>
                    </div>
                    <div class="col l3 s12">
                        <h5 class="white-text">Connect</h5>
                        <ul>
                            <li><a class="white-text" href="#!">Link 1</a></li>
                            <li><a class="white-text" href="#!">Link 2</a></li>
                            <li><a class="white-text" href="#!">Link 3</a></li>
                            <li><a class="white-text" href="#!">Link 4</a></li>
                        </ul>
                    </div>
                </div>
            </div>
            <div class="footer-copyright">
                <div class="container">
                    Made by <a class="orange-text text-lighten-3" href="http://materializecss.com">Materialize</a>
                </div>
            </div>
        </footer>

    <!--  Scripts-->
    <script src="https://code.jquery.com/jquery-2.1.1.min.js"></script>
    <script src="assets/js/materialize.js"></script>
    <script src="assets/js/init.js"></script>

</body>
</html>
