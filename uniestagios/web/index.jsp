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
            <div class="nav-wrapper container"><a id="logo-container" href="#" class="brand-logo">Logo</a>
                <ul class="right hide-on-med-and-down">
                    <li><a href="#!">Vagas</a></li>
                    <li><a class="dropdown-button" href="#!" data-activates="dropdown1">Logar-se<i class="material-icons right">arrow_drop_down</i></a></li>
                </ul>
                <ul id="dropdown1" class="dropdown-content">
                    <li><a href="#!">Login</a></li>
                    <li><a href="cadastro_user.jsp">Criar Conta</a></li>
                    <li class="divider"></li>
                    <li><a href="#!">three</a></li>
                </ul>
                <ul id="nav-mobile" class="side-nav">
                    <li><a href="#!">Vagas</a></li>
                    <li><a href="#!">Login</a></li>
                    <li><a href="cadastro_user.jsp">Criar Conta</a></li>
                    <li class="divider"></li>
                    <li><a href="#!">three</a></li>
                </ul>
                <a href="#" data-activates="nav-mobile" class="button-collapse"><i class="material-icons">menu</i></a>
            </div>
        </nav>
        <div class="section no-pad-bot" id="index-banner">
            <div class="gallery autoplay items-3">
                    <div id="item-1" class="control-operator"></div>
                    <div id="item-2" class="control-operator"></div>
                    <div id="item-3" class="control-operator"></div>

                    <figure class="item">
                        <img class="img-size" src="http://www.fundospaisagens.com/Imagens/estrada-rural-no-campo.jpg">
                    </figure>
                    
                    <figure class="item">
                        <img class="img-size"src="http://www.fundospaisagens.com/Imagens/estrada-rural-no-campo.jpg">
                    </figure>

                    <figure class="item">
                        <img class="img-size" src="http://www.fundospaisagens.com/Imagens/estrada-rural-no-campo.jpg">
                    </figure>

                    <div class="controls">
                        <a href="#item-1" class="control-button">◉</a>
                        <a href="#item-2" class="control-button">◉</a>
                        <a href="#item-3" class="control-button">◉</a>
                    </div>
                </div>
        </div>

        <div class="container">
            <div class="section">

                <!--   Icon Section   -->
                <div class="row">
                    <div class="col s12 m4">
                        <div class="icon-block">
                            <div class="col s12">
                                <h2 class="center light-blue-text"><a href="#"><img src="img/contact.png" class="rede"></img></a></h2>
                            </div>
                            <h5 class="center">Contatos</h5>
                            <p class="light">We did most of the heavy lifting for you to provide a default stylings that incorporate our custom components. Additionally, we refined animations and transitions to provide a smoother experience for developers.</p>
                        </div>
                    </div>

                    <div class="row">
                        <div class="col s12 m4">
                            <div class="icon-block">
                                <div class="col s12">
                                    <h2 class="center light-blue-text"><a href="lista_vaga.jsp"><img src="img/vagas.png" class="rede"></img></a></h2>
                                </div>
                                <h5 class="center">Vagas</h5>
                                <p class="light">We did most of the heavy lifting for you to provide a default stylings that incorporate our custom components. Additionally, we refined animations and transitions to provide a smoother experience for developers.</p>
                            </div>
                        </div>


                        <div class="row">
                            <div class="col s12 m4">
                                <div class="icon-block">
                                    <div class="col s12">
                                        <h2 class="center light-blue-text"><a href="#"><img src="img/cadastro.png" class="rede"></img></a></h2>
                                    </div>
                                    <h5 class="center">Cadastre-se</h5>
                                    <p class="light">We did most of the heavy lifting for you to provide a default stylings that incorporate our custom components. Additionally, we refined animations and transitions to provide a smoother experience for developers.</p>
                                </div>
                            </div>

                        </div>

                    </div>
                    <div class="section">

                    </div>
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
    </div>

    <!--  Scripts-->
    <script src="https://code.jquery.com/jquery-2.1.1.min.js"></script>
    <script src="assets/js/materialize.js"></script>
    <script src="assets/js/init.js"></script>

</body>
</html>