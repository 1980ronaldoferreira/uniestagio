<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%@include file="header.jsp" %>
<div class="container">
    <div class="row">
        <div class="col s12">
            <div class="col s4  menu-banner">
                <a href="register_user.jsp" class="link-menu-banner flow-text menu-banner-text">EMPRESA<br>Contrate aqui seu estagiário!</a>
            </div>
            <div class="col s4  menu-banner-center">
                <a href="register_user.jsp" class="link-menu-banner flow-text menu-banner-text">ESTUDANTE OU EMPRESA <br>Cadastrar-se aqui!</a>
            </div>
            <div class="col s4  menu-banner">
                <a href="list_jobs.jsp" class="link-menu-banner  flow-text menu-banner-text">VAGAS<br>Encontre aqui!</a>
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
                        Você Poderá saber sobre nós ! <a href="">aqui</a>.
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
        </div>
    </div>
</div>

<div class="container">
    <h3 class="center  orange-text header ">Vagas Recentes</h3>
    <div class="section">
        <div class="row">
            <div class="row">
                <div class="col s4 m4">
                    <div class="card grey darken-3">
                        <div class="card-content white-text">
                            <span class="card-title">Desenvolvedor PHP JR</span>
                            <ul>
                                <li><b>Área:</b> Desenvolvimento de Software</li>
                                <li><b>Jornada:</b> 4 horas Diarias</li>
                                <li><b>Local:</b> SP / Barueri</li>
                        </div>
                        <div class="card-action">
                            <a class="orange-text" href="#modal1">Leia mais</a>
                        </div>
                    </div>
                </div>

                <div id="modal1" class="modal">
                    <div class="modal-content">
                        <h4>Desenvolvedor PHP JR</h4>
                        <ul>
                            <li><b>Área:</b> Desenvolvimento de Software</li>
                            <li><b>Salário:</b> R$ 900,00</li>
                            <li><b>Tipo de contrato:</b> Estagío</li>
                            <li><b>Jornada:</b> 4 horas Diarias</li>
                            <li><b>Local:</b> SP / Barueri</li>
                            <li><b>Atividades/ Requisitos:</b> 
                                Conhecimentos Técnicos:
                                Experiência em apoiar área de negócios 
                                <%--adicionar id de cada vaga como referencia de link do modal" --%>
                                no estudo das oportunidades
                                Técnicas de Levantamento de Requisitos
                                Experiência em escrever especificações funcionais
                                Apoiar à área de negócios homologação das soluções desenvolvidas por TI
                                Arquitetura de Software
                                Conhecimentos nos processos de ciclo de desenvolvimento de TI
                                Experiência em Projetos Digitais, Web, E-Commerce

                                <br>
                                Experiência:
                                Experiência em projetos de Tecnologia Digital
                                Experiência como Analista de Negócios

                            </li>
                            <li>
                                <b>Envie seu Curriculo</b>

                                <i class="material-icons">email</i><p class="orange-text">                                       
                                    kronamil@rh.com.br</p>

                            </li>
                        </ul>
                    </div>
                    <div class="modal-footer">
                        <a href="#!" class="modal-action modal-close waves-effect waves-green  blue white-text btn-flat">Fechar</a>
                    </div>
                </div>

                <div class="col s4 m4">
                    <div class="card grey darken-3">
                        <div class="card-content white-text">
                            <span class="card-title">Desenvolvedor PHP JR</span>
                            <ul>
                                <li><b>Área:</b> Desenvolvimento de Software</li>
                                <li><b>Jornada:</b> 4 horas Diarias</li>
                                <li><b>Local:</b> SP / Barueri</li>
                        </div>
                        <div class="card-action">
                            <a class="orange-text" href="#modal2">Leia mais</a>
                        </div>
                    </div>
                </div>

                <div id="modal2" class="modal">
                    <div class="modal-content">
                        <h4>Desenvolvedor PHP JR</h4>
                        <ul>
                            <li><b>Área:</b> Desenvolvimento de Software</li>
                            <li><b>Salário:</b> R$ 900,00</li>
                            <li><b>Tipo de contrato:</b> Estagío</li>
                            <li><b>Jornada:</b> 4 horas Diarias</li>
                            <li><b>Local:</b> SP / Barueri</li>
                            <li><b>Atividades/ Requisitos:</b> 
                                Conhecimentos Técnicos:
                                Experiência em apoiar área de negócios 
                                <%--adicionar id de cada vaga como referencia de link do modal" --%>
                                no estudo das oportunidades
                                Técnicas de Levantamento de Requisitos
                                Experiência em escrever especificações funcionais
                                Apoiar à área de negócios homologação das soluções desenvolvidas por TI
                                Arquitetura de Software
                                Conhecimentos nos processos de ciclo de desenvolvimento de TI
                                Experiência em Projetos Digitais, Web, E-Commerce

                                <br>
                                Experiência:
                                Experiência em projetos de Tecnologia Digital
                                Experiência como Analista de Negócios

                            </li>
                            <li>
                                <b>Envie seu Curriculo</b>

                                <i class="material-icons">email</i><p class="orange-text">                                       
                                    kronamil@rh.com.br</p>

                            </li>
                        </ul>
                    </div>
                    <div class="modal-footer">
                        <a href="#!" class="modal-action modal-close waves-effect waves-green  blue white-text btn-flat">Fechar</a>
                    </div>
                </div>
                <div class="col s4 m4">
                    <div class="card grey darken-3">
                        <div class="card-content white-text">
                            <span class="card-title">Desenvolvedor PHP JR</span>
                            <ul>
                                <li><b>Área:</b> Desenvolvimento de Software</li>
                                <li><b>Jornada:</b> 4 horas Diarias</li>
                                <li><b>Local:</b> SP / Barueri</li>
                        </div>
                        <div class="card-action">
                            <a class="orange-text" href="#modal3">Leia mais</a>
                        </div>
                    </div>
                </div>

                <div id="modal3" class="modal">
                    <div class="modal-content">
                        <h4>Desenvolvedor PHP JR</h4>
                        <ul>
                            <li><b>Área:</b> Desenvolvimento de Software</li>
                            <li><b>Salário:</b> R$ 900,00</li>
                            <li><b>Tipo de contrato:</b> Estagío</li>
                            <li><b>Jornada:</b> 4 horas Diarias</li>
                            <li><b>Local:</b> SP / Barueri</li>
                            <li><b>Atividades/ Requisitos:</b> 
                                Conhecimentos Técnicos:
                                Experiência em apoiar área de negócios 
                                <%--adicionar id de cada vaga como referencia de link do modal" --%>
                                no estudo das oportunidades
                                Técnicas de Levantamento de Requisitos
                                Experiência em escrever especificações funcionais
                                Apoiar à área de negócios homologação das soluções desenvolvidas por TI
                                Arquitetura de Software
                                Conhecimentos nos processos de ciclo de desenvolvimento de TI
                                Experiência em Projetos Digitais, Web, E-Commerce

                                <br>
                                Experiência:
                                Experiência em projetos de Tecnologia Digital
                                Experiência como Analista de Negócios

                            </li>
                            <li>
                                <b>Envie seu Curriculo</b>

                                <i class="material-icons">email</i><p class="orange-text">                                       
                                    kronamil@rh.com.br</p>

                            </li>
                        </ul>
                    </div>
                    <div class="modal-footer">
                        <a href="#!" class="modal-action modal-close waves-effect waves-green  blue white-text btn-flat">Fechar</a>
                    </div>
                </div>
            </div>
            <%--Adicionar as ultimas 3 vagas cadastrada --%>

        </div>
    </div>
</div>
<%@include file="footer.jsp" %>
<script>
    $(document).ready(function () {
        // the "href" attribute of .modal-trigger must specify the modal ID that wants to be triggered
        $('.modal').modal();

        $('select').material_select();



    });



</script>