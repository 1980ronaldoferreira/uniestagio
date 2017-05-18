<%@include file="header.jsp" %>
<div class="section"> 
<% if(request.getSession().getAttribute("usuario") != null ){%> 
    
    ${ msg }
    
 <% }%>

</div>
<div class="section">
    <div class="row">
        <h1 class="header center orange-text ">Vagas Dispon�veis</h1>
        <hr>
        <div class="col s12">
            <br>
            <div class="col s2">
                <div class="section">
                    <form action="#" method="POST">
                        <div class="input-field col s12">
                            <span for="filter">Palavras Chaves</span>

                            <input placeholder="Ex: 'TI Saude' ..." id="filter" type="text" class="validate">
                        </div>
                        <button type="submit" id="keys" class="btn waves-effect  blue waves-blue">FILTRAR
                            <i class="fa fa-filter" aria-hidden="true"></i>

                        </button>
                        <br>
                        <br>
                    </form>

                    <hr class="divider">

                    <div class="section">
                        <div class="row">
                            <form action="#" method="POST">
                                <div class="input-field col s12">
                                    <b>ESTADOS</b>
                                    <select name="state">
                                        <option value="" disabled selected>Selecione o Estado</option>
                                        <option value="SP">S�o Paulo</option>
                                        <option value="MG">Minas Gerais</option>
                                        <option value="RJ">Rio de Janeiro</option>
                                    </select>
                                </div>
                                <button type="submit" id="keys" class="btn waves-effect  blue waves-blue">FILTRAR
                                    <i class="fa fa-filter" aria-hidden="true"></i>
                                </button>
                            </form>
                        </div>

                        <hr class="divider">

                        <div class="row">
                            <form action="#" method="POST">
                                <div class="input-field col s12">
                                    <b>CIDADES</b>
                                    <select name="city">
                                        <option value="" disabled selected>Selecione o Estado</option>
                                        <option value="SP">S�o Paulo</option>
                                        <option value="MG">Minas Gerais</option>
                                        <option value="RJ">Rio de Janeiro</option>
                                    </select>
                                </div>
                                <button type="submit" id="keys" class="btn waves-effect  blue waves-blue">FILTRAR
                                    <i class="fa fa-filter" aria-hidden="true"></i>
                                </button>
                            </form>
                        </div>
                    </div>

                    <hr class="divider">

                    <div class="row">
                        <form action="#" method="POST">
                            <div class="input-field col s12">
                                <b>AREA PROFISSIONAL</b>
                                <select name="profissionalArea">
                                    <option value="" disabled selected>Selecione o Estado</option>
                                    <option value="SP">S�o Paulo</option>
                                    <option value="MG">Minas Gerais</option>
                                    <option value="RJ">Rio de Janeiro</option>
                                </select>
                            </div>
                            <div class="col s12">
                                <button type="submit" id="keys" class="btn waves-effect  blue waves-blue">FILTRAR
                                    <i class="fa fa-filter" aria-hidden="true"></i>
                                </button>
                                <br><br>
                            </div>
                        </form>
                    </div>
                </div>
            </div>


            <div class="col s8 ">
                <div class="row">
                    <div class="col s12 ">
                        <div class="card blue-grey darken-1">
                            <div class="card-content white-text">
                                <span class="card-title">Desenvolvedor PHP JR</span>
                                <ul>
                                    <li><b>�rea:</b> Desenvolvimento de Software</li>
                                    <li><b>Sal�rio:</b> R$ 900,00</li>
                                    <li><b>Tipo de contrato:</b> Estag�o</li>
                                    <li><b>Jornada:</b> 4 horas Diarias</li>
                                    <li><b>Local:</b> SP / Barueri</li>
                                    <li><b>Atividades/ Requisitos:</b> 
                                        Conhecimentos T�cnicos:
                                        Experi�ncia em apoiar �rea de neg�cios ... 
                                        <a class="blue-text" href="#modal1">Leia mais</a>
                                        </div>
                                        </div>
                                        </div>

                                        <div id="modal1" class="modal">
                                            <div class="modal-content">
                                                <h4>Desenvolvedor PHP JR</h4>
                                                <ul>
                                                    <li><b>�rea:</b> Desenvolvimento de Software</li>
                                                    <li><b>Sal�rio:</b> R$ 900,00</li>
                                                    <li><b>Tipo de contrato:</b> Estag�o</li>
                                                    <li><b>Jornada:</b> 4 horas Diarias</li>
                                                    <li><b>Local:</b> SP / Barueri</li>
                                                    <li><b>Atividades/ Requisitos:</b> 
                                                        Conhecimentos T�cnicos:
                                                        Experi�ncia em apoiar �rea de neg�cios 
                                                        <%--adicionar id de cada vaga como referencia de link do modal" --%>
                                                        no estudo das oportunidades
                                                        T�cnicas de Levantamento de Requisitos
                                                        Experi�ncia em escrever especifica��es funcionais
                                                        Apoiar � �rea de neg�cios homologa��o das solu��es desenvolvidas por TI
                                                        Arquitetura de Software
                                                        Conhecimentos nos processos de ciclo de desenvolvimento de TI
                                                        Experi�ncia em Projetos Digitais, Web, E-Commerce

                                                        <br>
                                                        Experi�ncia:
                                                        Experi�ncia em projetos de Tecnologia Digital
                                                        Experi�ncia como Analista de Neg�cios

                                                    </li>
                                                    <li>
                                                        <b>Envie seu Curriculo</b>

                                                        <i class="material-icons">email</i><p class="orange-text">                                       
                                                            kronamil@rh.com.br</p>

                                                    </li>
                                                </ul>
                                            </div>
                                            <div class="modal-footer">
                                                <a href="#!" class="modal-action modal-close waves-effect waves-green  blue white-text btn-flat">FECHAR</a>
                                            </div>
                                        </div>

                                        </div>



                                        <div class="col s12 ">
                                            <div class="card blue-grey darken-1">
                                                <div class="card-content white-text">
                                                    <span class="card-title">Desenvolvedor PHP JR</span>
                                                    <ul>
                                                        <li><b>�rea:</b> Desenvolvimento de Software</li>
                                                        <li><b>Sal�rio:</b> R$ 900,00</li>
                                                        <li><b>Tipo de contrato:</b> Estag�o</li>
                                                        <li><b>Jornada:</b> 4 horas Diarias</li>
                                                        <li><b>Local:</b> SP / Barueri</li>
                                                        <li><b>Atividades/ Requisitos:</b> 
                                                            Conhecimentos T�cnicos:
                                                            Experi�ncia em apoiar �rea de neg�cios ... 
                                                            <a class="blue-text" href="#modal2">Leia mais</a>
                                                            </div>
                                                            </div>
                                                            </div>

                                                            <div id="modal2" class="modal">
                                                                <div class="modal-content">
                                                                    <h4>Desenvolvedor PHP JR</h4>
                                                                    <ul>
                                                                        <li><b>�rea:</b> Desenvolvimento de Software</li>
                                                                        <li><b>Sal�rio:</b> R$ 900,00</li>
                                                                        <li><b>Tipo de contrato:</b> Estag�o</li>
                                                                        <li><b>Jornada:</b> 4 horas Diarias</li>
                                                                        <li><b>Local:</b> SP / Barueri</li>
                                                                        <li><b>Atividades/ Requisitos:</b> 
                                                                            Conhecimentos T�cnicos:
                                                                            Experi�ncia em apoiar �rea de neg�cios 
                                                                            <%--adicionar id de cada vaga como referencia de link do modal" --%>
                                                                            no estudo das oportunidades
                                                                            T�cnicas de Levantamento de Requisitos
                                                                            Experi�ncia em escrever especifica��es funcionais
                                                                            Apoiar � �rea de neg�cios homologa��o das solu��es desenvolvidas por TI
                                                                            Arquitetura de Software
                                                                            Conhecimentos nos processos de ciclo de desenvolvimento de TI
                                                                            Experi�ncia em Projetos Digitais, Web, E-Commerce

                                                                            <br>
                                                                            Experi�ncia:
                                                                            Experi�ncia em projetos de Tecnologia Digital
                                                                            Experi�ncia como Analista de Neg�cios

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


                                                            <div class="col s12 ">
                                                                <div class="card blue-grey darken-1">
                                                                    <div class="card-content white-text">
                                                                        <span class="card-title">Desenvolvedor PHP JR</span>
                                                                        <ul>
                                                                            <li><b>�rea:</b> Desenvolvimento de Software</li>
                                                                            <li><b>Sal�rio:</b> R$ 900,00</li>
                                                                            <li><b>Tipo de contrato:</b> Estag�o</li>
                                                                            <li><b>Jornada:</b> 4 horas Diarias</li>
                                                                            <li><b>Local:</b> SP / Barueri</li>
                                                                            <li><b>Atividades/ Requisitos:</b> 
                                                                                Conhecimentos T�cnicos:
                                                                                Experi�ncia em apoiar �rea de neg�cios ... 
                                                                                <a class="blue-text" href="#modal3">Leia mais</a>
                                                                                </div>
                                                                                </div>
                                                                                </div>

                                                                                <div id="modal3" class="modal">
                                                                                    <div class="modal-content">
                                                                                        <h4>Desenvolvedor PHP JR</h4>
                                                                                        <ul>
                                                                                            <li><b>�rea:</b> Desenvolvimento de Software</li>
                                                                                            <li><b>Sal�rio:</b> R$ 900,00</li>
                                                                                            <li><b>Tipo de contrato:</b> Estag�o</li>
                                                                                            <li><b>Jornada:</b> 4 horas Diarias</li>
                                                                                            <li><b>Local:</b> SP / Barueri</li>
                                                                                            <li><b>Atividades/ Requisitos:</b> 
                                                                                                Conhecimentos T�cnicos:
                                                                                                Experi�ncia em apoiar �rea de neg�cios 
                                                                                                <%--adicionar id de cada vaga como referencia de link do modal" --%>
                                                                                                no estudo das oportunidades
                                                                                                T�cnicas de Levantamento de Requisitos
                                                                                                Experi�ncia em escrever especifica��es funcionais
                                                                                                Apoiar � �rea de neg�cios homologa��o das solu��es desenvolvidas por TI
                                                                                                Arquitetura de Software
                                                                                                Conhecimentos nos processos de ciclo de desenvolvimento de TI
                                                                                                Experi�ncia em Projetos Digitais, Web, E-Commerce

                                                                                                <br>
                                                                                                Experi�ncia:
                                                                                                Experi�ncia em projetos de Tecnologia Digital
                                                                                                Experi�ncia como Analista de Neg�cios

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
                                                                                <div class="row">

                                                                                    <div class="col s12 ">
                                                                                        <div class="card blue-grey darken-1">
                                                                                            <div class="card-content white-text">
                                                                                                <span class="card-title">Desenvolvedor PHP JR</span>
                                                                                                <ul>
                                                                                                    <li><b>�rea:</b> Desenvolvimento de Software</li>
                                                                                                    <li><b>Sal�rio:</b> R$ 900,00</li>
                                                                                                    <li><b>Tipo de contrato:</b> Estag�o</li>
                                                                                                    <li><b>Jornada:</b> 4 horas Diarias</li>
                                                                                                    <li><b>Local:</b> SP / Barueri</li>
                                                                                                    <li><b>Atividades/ Requisitos:</b> 
                                                                                                        Conhecimentos T�cnicos:
                                                                                                        Experi�ncia em apoiar �rea de neg�cios ... 
                                                                                                        <a class="blue-text" href="#modal4">Leia mais</a>
                                                                                                        </div>
                                                                                                        </div>
                                                                                                        </div>

                                                                                                        <div id="modal4" class="modal">
                                                                                                            <div class="modal-content">
                                                                                                                <h4>Desenvolvedor PHP JR</h4>
                                                                                                                <ul>
                                                                                                                    <li><b>�rea:</b> Desenvolvimento de Software</li>
                                                                                                                    <li><b>Sal�rio:</b> R$ 900,00</li>
                                                                                                                    <li><b>Tipo de contrato:</b> Estag�o</li>
                                                                                                                    <li><b>Jornada:</b> 4 horas Diarias</li>
                                                                                                                    <li><b>Local:</b> SP / Barueri</li>
                                                                                                                    <li><b>Atividades/ Requisitos:</b> 
                                                                                                                        Conhecimentos T�cnicos:
                                                                                                                        Experi�ncia em apoiar �rea de neg�cios 
                                                                                                                        <%--adicionar id de cada vaga como referencia de link do modal" --%>
                                                                                                                        no estudo das oportunidades
                                                                                                                        T�cnicas de Levantamento de Requisitos
                                                                                                                        Experi�ncia em escrever especifica��es funcionais
                                                                                                                        Apoiar � �rea de neg�cios homologa��o das solu��es desenvolvidas por TI
                                                                                                                        Arquitetura de Software
                                                                                                                        Conhecimentos nos processos de ciclo de desenvolvimento de TI
                                                                                                                        Experi�ncia em Projetos Digitais, Web, E-Commerce

                                                                                                                        <br>
                                                                                                                        Experi�ncia:
                                                                                                                        Experi�ncia em projetos de Tecnologia Digital
                                                                                                                        Experi�ncia como Analista de Neg�cios

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
                                                                                                        </div>
                                                                                                        <div class="col s2" >
                                                                                                            <div class="row" >
                                                                                                                <img src="img/propaganda1.jpg" width="250px" height="950px">
                                                                                                            </div>
                                                                                                        </div>
                                                                                                        </div>
                                                                                                        </div>
                                                                                                        </div>
                                                                                                        <div class="section">

                                                                                                        </div>
                                                                                                        <br><br>
                                                                                                        <%@include file="footer.jsp" %>
                                                                                                        <script>
                                                                                                            $(document).ready(function () {
                                                                                                                // the "href" attribute of .modal-trigger must specify the modal ID that wants to be triggered
                                                                                                                $('.modal').modal();

                                                                                                                $('select').material_select();



                                                                                                            });



                                                                                                        </script>