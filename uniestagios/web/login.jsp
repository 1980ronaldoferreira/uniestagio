<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%@include file="header.jsp" %>
<div class="section">       ${ msg }   </div>
<div class="container">
    <div class="row">
        <div class="col s12 m8 offset-m2">

            <div class="card">
                <div class="card-image">
                    <img src="img/login-image.jpg"> 
                    <span class="card-title">
                        <h2> <i class="material-icons left medium">work</i>UNIESTÁGIOS</h2>
                        <div class="section"></div>
                        <div class="section"></div>
                        <h6 class="black-text"> <i class="fa fa-sign-in" aria-hidden="true"></i>  Área de Login. </h6>
                        <h6 class="black-text"> Sistema desenvolvido para ajudar a divulgação de vagas de estágios.</h6>
                    </span>
                </div>
                <form action="AuthController" method="POST" name="logar" class="login-form">
                    <input  type="hidden" name="flag" value="logar">

                    <div class="card-content">
                        <div class="row"> 
                            <h6 class="grey-text">Qual tipo de usuário ?</h6>
                            <div class="col s1">
                                <input class="with-gap" name="perfil" type="radio" id="company" value="empresa"/>
                                <label for="company">Empresa</label>
                            </div>
                            <div class="col s1 offset-m1">
                                <input class="with-gap" name="perfil" type="radio" id="student" value="estudante"/>
                                <label for="student">Estudante</label>
                            </div>
                        </div>

                        <div class="input-field">
                            <input class="validate" id="username" type="text" name="username_cpf_cnpj">
                            <label for="username">Nome de Usuario ou CPF / CNPJ</label>
                        </div>

                        <div class="row">
                            <div class="col s12 m8 l9">
                                <div class="input-field">
                                    <input id="password" type="password" name="pass">
                                    <label for="password">Senha</label>
                                    <a href="register_user.jsp">Esqueceu a senha ?</a>
                                </div>
                            </div>
                            <div class="col s12 m4 l3">
                                <div class="input-field">
                                    <input type="checkbox" id="remember-me" />
                                    <label for="remember-me">Lembrar</label>

                                </div>
                            </div>
                        </div>
                        <div>
                            <button type="submit" class="btn blue-grey darken-1">Acessar <i class="fa fa-sign-in" aria-hidden="true"></i></button>
                            <button onclick="history.go(-1);" class="btn grey ">Voltar <i class="fa fa-undo" aria-hidden="true"></i></button>
                        </div>
                    </div>
                </form>

                <div class="card-action blue-grey darken-1">
                    <div class="row">
                        <div class="col s6">
                            <span class="white-text"> Não possue cadastro, Clique</span>
                            <a href="register_user.jsp">AQUI</a>.
                        </div>
                    </div>
                </div>
            </div>


        </div>
    </div>
</div>
<div class="section"></div>
<div class="section"></div>
<%@include file="footer.jsp" %>
<script>
    $(document).ready(function () {
        $('select').material_select();
    });
</script>