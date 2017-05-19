<%@include file="header.jsp" %>
<%@include file="validations/validadeSessionLogin.jsp" %>
<div class="container">
    <div class="section">
        <div class="row">
            <div class="section">   </div>
            <div class="row border-orange">
                <form action="UserController" method="POST" name="save">
                    <div class="section">
                        <div class="row  orange-text">
                            <h4 class="header center">ATUALIZAÇAO DE EMPRESA</h4> 
                            <div class="col s8 offset-s2">
                                <c:forEach var="u" items="${listUser}">
                                    <input  type="hidden" name="perfil" value="empresa">
                                    <input  type="hidden" name="flag" value="save">
                                    <input  type="hidden" name="id" value="${u.id}">
                                    <div class="input-field col s6">
                                        <input placeholder="kronamix" id="username" type="text" class="validate" name="username"  value="${u.username}" focus>
                                        <label for="username">Nome de usuário</label>
                                    </div>
                                    <div class="input-field col s6">
                                        <input id="password" type="password" class="validate" name="pass"value="${u.senha}" >
                                        <label for="password">Password</label>
                                    </div>

                                    <div class="input-field col s12">
                                        <input  id="cnpj" type="text" class="validate" name="cnpj" value="${u.cnpj}">
                                        <label for="cnpj">CNPJ</label>
                                    </div>
                                    <div class="input-field col s12">
                                        <input id="razaoSocial" type="text" class="validate" name="socialReason" value="${u.razao_social}">
                                        <label for="razaoSocial">Razão Social</label>
                                    </div>

                                    <div class="input-field col s12">
                                        <input id="nameCompany" type="text" class="validate" name="nameCompany" value="${u.nome_fantasia}" >
                                        <label for="nameCompany">Nome Fantasia</label>
                                    </div>

                                    <div class="input-field col s12">
                                        <input placeholder="exemplo@exemplo.com" id="emailCompany" type="email" name="email" class="validate" data-error="Invalido" data-success="ok!" value="${u.email}">
                                        <label for="emailCompany">E-mail</label>
                                    </div>

                                    <div class="input-field col s12">
                                        <input placeholder="(DD) + Telefone" id="phoneCompany" type="text"  name="phoneCompany" class="validate" value="${u.telefone}">
                                        <label for="phoneCompany">Telefone</label>
                                    </div>

                                    <div class="input-field col s12">
                                        <input  id="responsible" type="text" class="validate" name="responsible" value="${u.responsavel}">
                                        <label for="responsible">Nome do Responsavel</label>
                                    </div>



                                    <div class="input-field col s12">
                                        <input  id="companyBranch" type="text" class="validate" name="companyBranch" value="${u.ramo_atividades}">
                                        <label for="companyBranch">Ramo de Atividades</label>
                                    </div>
                                </c:forEach>
                                <div class="input-field col s12">
                                    <button class="btn waves-effect waves-light light-blue lighten-1" type="submit" name="action">ATUALIZAR
                                        <i class="fa fa-floppy-o" aria-hidden="true"></i>
                                    </button>
                                    <button  onclick="history.go(-1);"  class="btn waves-effect waves-light red"  name="action">CANCELAR
                                        <i class="fa fa-ban" aria-hidden="true"></i>
                                    </button>

                                </div>
                            </div>
                        </div>
                    </div>
                </form>
            </div>
        </div>
    </div>
</div>
<%@include file="footer.jsp" %>