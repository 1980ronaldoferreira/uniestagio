<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%@include file="header.jsp" %>
<div class="section"></div>
<div class="container">
    <div class="row">
        <div class="col s12 m8 offset-m2">
            <form action="" method="" class="login-form">
                <div class="card">
                    <div class="card-image">
                        <img src="img/login-image.jpg"> 
                        <span class="card-title">
                            <h2> <i class="material-icons left medium">work</i>UNIESTÁGIOS</h2>
                            <br>
                            <br>
                            <h6 class="black-text"> <i class="fa fa-sign-in" aria-hidden="true"></i>  Área de Login. </h6>
                            <h6 class="black-text"> Sistema desenvolvido para ajudar a divulgação de vagas de estágios.</h6>
                        </span>
                    </div>

                    <div class="card-content">
                        <div class="row"> 
                            <h6 class="grey-text">Qual tipo de Login ?</h6>
                            <div class="col s1">
                                <input class="with-gap" name="type" type="radio" id="company" value="typcompany"/>
                                <label for="company">Empresa</label>
                            </div>
                            <div class="col s1 offset-m1">
                                <input class="with-gap" name="type" type="radio" id="student" value="student"/>
                                <label for="student">Estudante</label>
                            </div>
                        </div>

                        <div class="input-field">
                            <input class="validate" id="username" type="text">
                            <label for="username">Username</label>
                        </div>

                        <div class="row">
                            <div class="col s12 m8 l9">
                                <div class="input-field">
                                    <input id="password" type="password">
                                    <label for="password">Senha</label>
                                </div>
                            </div>
                            <div class="col s12 m4 l3">
                                <div class="input-field">
                                    <input type="checkbox" id="remember-me" />
                                    <label for="remember-me">Lembrar</label>
                                </div>
                            </div>
                        </div>



                    </div>
                    <div class="card-action blue-grey lighten-3">
                        <div class="center-align">
                            <button type="submit" class="btn blue-grey darken-1"><i class="material-icons left">vpn_key</i>Login</button>
                        </div>
                    </div>
                </div>
            </form>
            <div class="row">
                <div class="col s4">
                    <a href="register_user.jsp">Registrar</a>
                </div>
            </div>
        </div>
    </div>
</div>
<%@include file="footer.jsp" %>
<script>

    $(document).ready(function () {
        $('select').material_select();
    });
</script>