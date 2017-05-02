<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%@include file="header.jsp" %>
<div class="section">
    <div class="container">
        <div class="row">
            <div class="col s12">
                <div class="col s4  menu-banner">
                    <a href="register_user.jsp" class="link-menu-banner"><p class="flow-text menu-banner-text"><span>EMPRESA</span><br>Contrate aqui seu estagiário!</p></a>
                </div>
                <div class="col s4  menu-banner-center">
                    <a href="register_user.jsp" class="link-menu-banner"> <p class="flow-text menu-banner-text"><span>ESTUDANTE</span><br>Cadastrar-se aqui!</p></a>
                </div>
                <div class="col s4  menu-banner">
                    <a href="list_jobs.jsp" class="link-menu-banner"><p class="flow-text menu-banner-text"><span>VAGAS</span><br>Encontre aqui!</p></a>
                </div>
            </div>
        </div>
    </div>
</div>

<div class="gallery autoplay items-3">
    <div id="item-1" class="control-operator"></div>
    <div id="item-2" class="control-operator"></div>
    <div id="item-3" class="control-operator"></div>

    <figure class="item">
        <img class="img-size" src="img/slide1.jpg">
    </figure>

    <figure class="item">
        <img class="img-size" src="img/slide2.jpg">
    </figure>

    <figure class="item">
        <img class="img-size" src="img/slide3.jpg">
    </figure>

    <div class="controls">
        <a href="#item-1" class="control-button">◉</a>
        <a href="#item-2" class="control-button">◉</a>
        <a href="#item-3" class="control-button">◉</a>
    </div>
</div>

<div class="container">
    <div class="section">

        <!--   Icon Section   -->
        <div class="row">
            <div class="col s12 m4">
                <div class="icon-block">
                    <div class="col s12">
                        <h2 class="center light-blue-text"><img src="img/contact.png" class="rede"></h2>
                    </div>
                    <h5 class="center">Contatos</h5>
                    <p class="light">
                        Telefones: (11) 4642-8799
                        <br>
                        E-mail: contato@uniestagios.com.br
                        <br>
                        Você Poderá também acessar nosso chat! <a href="">aqui</a>.
                        <br>
                    </p>
                </div>
            </div>

            <div class="row">
                <div class="col s12 m4">
                    <div class="icon-block">
                        <div class="col s12">
                            <h2 class="center light-blue-text"><a href="list_jobs.jsp"><img src="img/vagas.png" class="rede"></img></a></h2>
                        </div>
                        <h5 class="center">Vagas</h5>
                        <p class="light">
                            Vagas de estágio Diversas áreas você encontra aqui, com as melhores empresas de mercado naciomal para se estagiar com ótimo aprendizado, bolsa-auxilio e beneficios.
                        </p>
                    </div>
                </div>


                <div class="row">
                    <div class="col s12 m4">
                        <div class="icon-block">
                            <div class="col s12">
                                <h2 class="center light-blue-text"><a href="register_user.jsp"><img src="img/cadastro.png" class="rede"></img></a></h2>
                            </div>
                            <h5 class="center">Cadastre-se</h5>
                            <p class="light">
                                Cadastre-se já na nova plataforma de vagas de estagios, não perca tempo totalmente gratuito para você estudante e empresas que administram seus propios estagiários.
                                <span class="orange-text lighten-2">Essa plataforma é somente de divulgação de vagas de estágios</span>.
                            </p>
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
<%@include file="footer.jsp" %>
