<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%@include file="header.jsp" %>
<div class="col s9 offset-4">
    <nav class="col s12 offset-2 blue-grey">
        <div class="nav-wrapper">
            <form action="" method="" name="search">
                <div class="input-field">
                    <input  type="hidden" name="flag" value="pesquisar">
                    <input class="blue-grey white-text" placeholder="Pesquisar" id="search" name="search" type="search">
                    <label class="label-icon" for="search"><i class="orange-text material-icons">search</i></label>
                    <i class="material-icons">close</i>
                </div>
            </form>
        </div>
    </nav>

    <ul id="tabs-swipe-demo" class="tabs">
        <li class="tab col s3"><a href="#test-swipe-1">ESTUDANTES</a></li>
        <li class="tab col s3"><a href="#test-swipe-2">EMPRESAS</a></li>
    </ul>
    <div id="test-swipe-1" class="col s12">
        <h4 class="header center red white-text">${ NotFoundStudent } </h4>  
        <table class="striped">
            <thead>
                <tr>
                    <th>#</th>
                    <th>USERNAME</th>
                    <th>NOME COMPLETO</th>
                    <th>CPF</th>
                    <th>EMAIL</th>
                    <th>TELEFONE</th>
                    <th>AÇÕES</th>
                </tr>
            </thead>

            <tbody>
                <c:forEach var="user" items="${listaUsers}">
                    <tr>
                        <td>${user.user_id}</td>
                        <td>${user.username}</td>
                        <td>${user.nome} ${user.sobrenome} </td>
                        <td>${user.cpf}</td>
                        <td>${user.telefone} </td>
                        <td>${user.email} </td>
                        <td>
                        <a class="waves-effect waves-light btn-floating green" href="UserController?flag=edit&perfil=estudante&id=${user.user_id}"><i class="material-icons left">mode_edit</i></a>
                        <a class="waves-effect waves-light btn-floating blue"  href="UserController?flag=destroy&perfil=estudante&id=${user.user_id}"><i class="material-icons left">description</i></a>
                        <a class="waves-effect waves-light btn-floating red " href="UserController?flag=destroy&perfil=estudante&id=${user.user_id}"><i class="material-icons left">delete</i></a>
                        </td>
                    </tr>
                </c:forEach>
            </tbody>
        </table>

    </div>
    <div id="test-swipe-2" class="col s12">
        <h4 class="header center red white-text">${ NotFoundCompany } </h4>
        <table class="striped">
            <thead>
                <tr>
                    <th>USERNAME</th>
                    <th>CNPJ</th>
                    <th>RAZÃO</th>
                    <th>NOME FANTASIA</th>
                    <th>TELEFONE</th>
                    <th>EMAIL</th>
                    <th>RESPONSAVEL</th>
                    <th>RAMO</th>
                    <th>AÇÕES</th>
                </tr>
            </thead>

            <tbody>
                <c:forEach var="company" items="${listaCompany}">
                    <tr>
                        <td>${company.username}</td>
                        <td>${company.cnpj}</td>
                        <td>${company.razao_social}</td>
                        <td>${company.nome_fantasia}</td>
                        <td>${company.telefone}</td>
                        <td>${company.email}</td>
                        <td>${company.responsavel}</td>
                        <td>${company.ramo_atividades}</td>
                        <td>
                            <a class="waves-effect waves-light btn-floating blue" href="UserController?flag=edit&perfil=empresa&id=${company.user_id}"><i class="material-icons left">description</i></a>
                            <a class="waves-effect waves-light btn-floating yellow darken-4" href="UserController?flag=edit&perfil=empresa&id=${company.user_id}"><i class="fa fa-briefcase" aria-hidden="true"></i></a>
                            <a class="waves-effect waves-light btn-floating green" href="UserController?flag=edit&perfil=empresa&id=${company.user_id}"><i class="material-icons left">mode_edit</i></a>
                            <a class="waves-effect waves-light btn-floating red " href="UserController?flag=destroy&perfil=empresa&id=${company.user_id}"><i class="material-icons left">delete</i></a>
                        </td>




                    </tr>
                </c:forEach>
            </tbody>

        </table>


    </div>

</div>
<%@include file="footer.jsp" %>
<script>
    $('.fixed-action-btn').openFAB();
    $('.fixed-action-btn').closeFAB();
</script>