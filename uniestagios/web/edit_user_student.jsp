<%@taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<%@include file="header.jsp" %>
<div class="container">
    <div class="section">
        <div class="row">
            <div class="section">   </div>
            <div class="row border-orange">
                <form action="UserController" method="POST" name="cadastrar">

                    <div class="section">
                        <div class="row  orange-text">
                            <h4 class="header center">ATUALIZAÇAO DE ESTUDANTE</h4> 
                            <div class="col s8 offset-s2">
                                <input  type="hidden" name="perfil" value="Estudante">
                                <input  type="hidden" name="flag" value="save">
                                <c:forEach var="u" items="${listUser}">

                                    <input  type="hidden" name="id" value="${u.user_id}">
                                    <div class="input-field col s6">
                                        <input id="name" type="text" name="username" value="${u.username}" focus >
                                        <label for="name">Nome de Usuário</label>
                                    </div>
                                    <div class="input-field col s6  ">
                                        <input id="password" type="password"  name="pass" value="${u.senha}">
                                        <label for="password">Password</label>
                                    </div>
                                    <div class="input-field col s12">

                                        <input  id="first_name" type="text"  name="name" value="${u.nome}">
                                        <label for="first_name">Nome</label>
                                    </div>
                                    <div class="input-field col s12">
                                        <input id="last_name" type="text" name="last_name" value="${u.sobrenome}">
                                        <label for="last_name">Sobrenome</label>
                                    </div>

                                    <div class="input-field col s12">
                                        <input id="cpf" type="text" name="cpf" data-error="Invalido" data-success="ok!" value="${u.cpf}">
                                        <label for="cpf">E-mail</label>
                                    </div>

                                    <div class="input-field col s12">
                                        <input placeholder="exemplo@exemplo.com" value="${u.email}" id="emailEstudant" type="email" name="email" class="validate" data-error="Invalido" data-success="ok!" >
                                        <label for="emailEstudant">E-mail</label>
                                    </div>

                                    <div class="input-field col s12">
                                        <input placeholder="(DD) + Telefone" id="cellPhoneEstudant" type="text"  name="cellPhone" class="validate" value="${u.telefone}">
                                        <label for="cellPhoneEstudant">Telefone</label>
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