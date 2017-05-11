<%@include file="header.jsp" %>
<div class="section no-pad-bot" id="index-banner">
    <div class="container">
        <br><br>
        <h4 class="header orange-text">CADASTRO</h4>
        <br><br>

    </div>
</div>

<div class="container">
    <div class="section">
        <div class="row">
            <div class="col s12 offset-s1">
                <ul class="tabs">
                    <li class="tab col s3"><a href="#clear" >Quem é você ? <i class="fa fa-arrow-right" aria-hidden="true"></i></a></li>
                    <li class="tab col s3"><a href="#tab1" >Estudante ?</a></li>
                    <li class="tab col s3"><a href="#tab2">Empresa ?</a></li>
                </ul>
            </div>
            <div id="clear" class="col s12">
                <h4 class="header center orange-text">ESCOLHA SEU PERFIL DE CADASTRO NOS LINKS ACIMA.</h4>                
            </div>
            <div id="tab1" class="col s12">
                <div class="section">   </div>
                <div class="row border-orange">
                    <form action="UserController" method="POST" name="cadastrar">
                        <div class="section">
                            <div class="row  orange-text">
                                <h4 class="header center">CADASTRO DE ESTUDANTE</h4> 
                                <div class="col s8 offset-s2">
                                    <div class="section"></div>

                                    <div class="input-field col s12">
                                        <input  type="hidden" name="perfil" value="Estudante">
                                    </div>

                                    <div class="input-field col s12">
                                        <input  type="hidden" name="flag" value="cadastrar">
                                    </div>

                                    <%@include file="forms/form_students.jsp" %>

                                    <div class="input-field col s12">
                                        <button class="btn waves-effect waves-light light-blue lighten-1" type="submit" name="action">CADASTRAR
                                            <i class="fa fa-floppy-o" aria-hidden="true"></i>
                                        </button>
                                        <div class="section">   </div>
                                    </div>
                                </div>
                            </div>
                        </div>
                    </form>
                </div>
            </div>

        </div>
        <div id="tab2" class="col s12">
            <form action="UserController" method="POST" name="cadastrar">
                <div class="section">
                    <div class="row border-orange">
                        <h4 class="header center orange-text">CADASTRO DE EMPRESA</h4> 
                        <div class="col s9 offset-s2 ">
                            <div class="section">   </div>

                            <div class="input-field col s12">
                                <input  type="hidden" name="type" value="company">
                            </div>

                            <div class="input-field col s12">
                                <input  type="hidden" name="flag" value="cadastrar">
                            </div>
                            <%@include file="forms/form_company.jsp" %>
                            <div class="input-field col s12">
                                <button class="btn waves-effect waves-light light-blue lighten-1" type="submit" name="action">Cadastrar
                                    <i class="fa fa-floppy-o" aria-hidden="true"></i>
                                </button>
                                <div class="section">   </div>
                            </div>
                        </div>
                    </div>

                </div>
            </form>
        </div>
    </div>
</div>
<br><br>
<%@include file="footer.jsp" %>