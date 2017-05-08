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
                    <form action="UsersController" method="POST" name="cadastrar">
                        <div class="section">
                            <div class="row  orange-text">
                                <h4 class="header center">CADASTRO DE ESTUDANTE</h4> 
                                <div class="col s9 offset-s2">
                                    <div class="section"></div>

                                    <div class="input-field col s12">
                                        <input  type="hidden" name="type" value="student">
                                    </div>

                                    <div class="input-field col s12">
                                        <input  type="hidden" name="flag" value="cadastrar">
                                    </div>

                                    <div class="input-field col s6">
                                        <input id="username" type="text" class="validate" name="username" >
                                        <label for="username">Nome de Usuário</label>
                                    </div>
                                    <div class="input-field col s6  ">
                                        <input id="password" type="password" class="validate" name="password" >
                                        <label for="password">Password</label>
                                    </div>
                                    <div class="input-field col s12">

                                        <input  id="first_name" type="text" class="validate" name="name" >
                                        <label for="first_name">Nome</label>
                                    </div>
                                    <div class="input-field col s12">
                                        <input id="last_name" type="text" class="validate" name="last_name" >
                                        <label for="last_name">Sobrenome</label>
                                    </div>

                                    <div class="input-field col s12">
                                        <input id="cpf" type="text" name="cpf" class="validate" data-error="Invalido" data-success="ok!" >
                                        <label for="cpf">E-mail</label>
                                    </div>

                                    <div class="input-field col s12">
                                        <input placeholder="exemplo@exemplo.com" id="emailEstudant" type="email" name="email" class="validate" data-error="Invalido" data-success="ok!" >
                                        <label for="emailEstudant">E-mail</label>
                                    </div>

                                    <div class="input-field col s12">
                                        <input placeholder="(DD) + Telefone" id="cellPhoneEstudant" type="text"  name="cellPhone" class="validate" >
                                        <label for="cellPhoneEstudant">Telefone</label>
                                    </div>
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
            <form action="" method="">
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

                            <div class="input-field col s6">
                                <input placeholder="kronamix" id="username" type="text" class="validate" name="nickname" required>
                                <label for="username">Nome de usuário</label>
                            </div>
                            <div class="input-field col s6">
                                <input id="password" type="password" class="validate" name="password" required>
                                <label for="password">Password</label>
                            </div>

                            <div class="input-field col s12">
                                <input  id="cnpj" type="text" class="validate" name="cnpj" required>
                                <label for="cnpj">CNPJ</label>
                            </div>
                            <div class="input-field col s12">
                                <input id="razaoSocial" type="text" class="validate" name="razaoSocial" required>
                                <label for="razaoSocial">Razão Social</label>
                            </div>

                            <div class="input-field col s12">
                                <input id="nameCompany" type="text" class="validate" name="nameCompany" required>
                                <label for="nameCompany">Nome Fantasia</label>
                            </div>

                            <div class="input-field col s12">
                                <input placeholder="exemplo@exemplo.com" id="emailCompany" type="email" name="email" class="validate" data-error="Invalido" data-success="ok!" required>
                                <label for="emailCompany">E-mail</label>
                            </div>

                            <div class="input-field col s12">
                                <input placeholder="(DD) + Telefone" id="phoneCompany" type="text"  name="phoneCompany" class="validate" required>
                                <label for="phoneCompany">Telefone</label>
                            </div>

                            <div class="input-field col s12">
                                <input  id="responsible" type="text" class="validate" name="responsible" required>
                                <label for="responsible">Nome do Responsavel</label>
                            </div>



                            <div class="input-field col s12">
                                <input  id="companyBranch" type="text" class="validate" name="companyBranch" required>
                                <label for="companyBranch">Ramo de Atividades</label>
                            </div>
                            <div class="input-field col s12">
                                <button class="btn waves-effect waves-light light-blue lighten-1" type="submit" name="action">Cadastrar
                                    <i class="fa fa-floppy-o" aria-hidden="true"></i>
                                </button>
                                <div class="section">   </div>
                            </div>
                        </div>
                    </div>
            </form>
        </div>
    </div>
</div>
</div>
<br><br>
<%@include file="footer.jsp" %>