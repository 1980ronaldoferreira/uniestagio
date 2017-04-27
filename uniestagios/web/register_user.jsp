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
                    <li class="tab col s3"><a href="#clear" >Quem é você ?</a></li>
                    <li class="tab col s3"><a href="#tab1" >Estudante ?</a></li>
                    <li class="tab col s3"><a href="#tab2">Empresa ?</a></li>
                </ul>
            </div>
            <div id="clear" class="col s12">
                <h4 class="header center orange-text">ESCOLHA SEU PERFIL DE CADASTRO NOS LINKS ACIMA.</h4>                
            </div>
            <div id="tab1" class="col s12">
                <div class="row">
                    <div class="section">
                        <form action="#" method="">
                            <div class="section">
                                <div class="row">
                                    <div class="col s12 offset-s3">
                                        <ul class="tabs">
                                            <li class="tab col s3"><a href="#acessEstudant">Dados de Acesso</a></li>
                                            <li class="tab col s3"><a href="#pessalEstudant">Dados Pessoais</a></li>
                                        </ul>
                                    </div>

                                    <div id="acessEstudant" class="col s12">
                                        <div class="row">
                                            <div class="section">

                                            </div>

                                            <div class="input-field col s6">
                                                <input id="username" type="text" class="validate" name="nickname" required>
                                                <label for="username">Nome de Usuário</label>
                                            </div>
                                            <div class="input-field col s6">
                                                <input id="password" type="password" class="validate" name="password" required>
                                                <label for="password">Password</label>
                                            </div>
                                        </div>
                                    </div>
                                    <div id="pessalEstudant" class="col s12">
                                        <div class="section">

                                        </div>
                                        <div class="row">
                                            <div class="input-field col s6">

                                                <input  id="first_name" type="text" class="validate" name="name" required>
                                                <label for="first_name">Nome</label>
                                            </div>
                                            <div class="input-field col s6">
                                                <input id="last_name" type="text" class="validate" name="last_name" required>
                                                <label for="last_name">Sobrenome</label>
                                            </div>

                                            <div class="input-field col s6">
                                                <input placeholder="exemplo@exemplo.com" id="emailEstudant" type="email" name="email" class="validate" data-error="Invalido" data-success="ok!" required>
                                                <label for="emailEstudant">E-mail</label>
                                            </div>

                                            <div class="input-field col s6">
                                                <input placeholder="(DD) + Telefone" id="cellPhoneEstudant" type="text"  name="cellPhone" class="validate" required>
                                                <label for="cellPhoneEstudant">Telefone</label>
                                            </div>

                                        </div>
                                    </div>
                                </div>
                            </div>

                            <button class="btn waves-effect waves-light light-blue lighten-1" type="submit" name="action">Cadastrar
                                <i class="material-icons right">send</i>
                            </button>

                        </form>
                    </div>
                </div>

            </div>
            <div id="tab2" class="col s12">
                <form action="" method="">
                    <div class="row">

                        <div class="row">
                            <div class="section">

                            </div>

                            <div class="input-field col s6">
                                <input placeholder="kronamix" id="username" type="text" class="validate" name="nickname" required>
                                <label for="username">Nome de usuário</label>
                            </div>
                            <div class="input-field col s6">
                                <input id="password" type="password" class="validate" name="password" required>
                                <label for="password">Password</label>
                            </div>
                        </div>

                        <div class="input-field col s3">
                            <input  id="cnpj" type="text" class="validate" name="cnpj" required>
                            <label for="cnpj">CNPJ</label>
                        </div>
                        <div class="input-field col s3">
                            <input id="razaoSocial" type="text" class="validate" name="razaoSocial" required>
                            <label for="razaoSocial">Razão Social</label>
                        </div>

                        <div class="input-field col s5">
                            <input id="nameCompany" type="text" class="validate" name="nameCompany" required>
                            <label for="nameCompany">Nome Fantasia</label>
                        </div>

                        <div class="input-field col s3">
                            <input placeholder="exemplo@exemplo.com" id="emailCompany" type="email" name="email" class="validate" data-error="Invalido" data-success="ok!" required>
                            <label for="emailCompany">E-mail</label>
                        </div>

                        <div class="input-field col s2">
                            <input placeholder="(DD) + Telefone" id="phoneCompany" type="text"  name="phoneCompany" class="validate" required>
                            <label for="phoneCompany">Telefone</label>
                        </div>

                        <div class="input-field col s6">
                            <input  id="name" type="text" class="validate" name="name" required>
                            <label for="name">Nome do Responsavel</label>
                        </div>



                        <div class="input-field col s6">
                            <input  id="companyBranch" type="text" class="validate" name="companyBranch" required>
                            <label for="companyBranch">Ramo de Atividades</label>
                        </div>
                    </div>
                    <button class="btn waves-effect waves-light light-green lighten-1" type="submit" name="action">Cadastrar
                        <i class="material-icons right">send</i>
                    </button>
                </form>
            </div>
        </div>
    </div>
</div>
<br><br>
<%@include file="footer.jsp" %>