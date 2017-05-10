<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%@taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<%@include file="header.jsp" %>
<div class="col s9 offset-4">
    <ul id="tabs-swipe-demo" class="tabs">
        <li class="tab col s3"><a href="#test-swipe-1">ESTUDANTES</a></li>
        <li class="tab col s3"><a href="#test-swipe-2">EMPRESAS</a></li>
    </ul>
    <div id="test-swipe-1" class="col s12">
        <table class="striped">
            <thead>
                <tr>
                    <th>USERNAME</th>
                    <th>NOME</th>
                    <th>CPF</th>
                    <th>EMAIL</th>
                    <th>TELEFONE</th>
                    <th>AÇÕES</th>
                </tr>
            </thead>

            <tbody>
             <c:forEach var="user" items="${listaUsers}">
                <tr>
                    <td>${user.username}</td>
                    <td> </td>
                    <td> </td>
                    <td> </td>
                    <td> </td>
                    <td>
                        <a class="waves-effect waves-light btn-floating green" href="UserController?flag=edit"><i class="material-icons left">mode_edit</i></a>
                        <%-- <a class="waves-effect waves-light btn-floating blue" href="UserController?flag=edit"><i class="material-icons left">description</i></a> --%>
                        <a class="waves-effect waves-light btn-floating red " href="UserController?flag=destroy"><i class="material-icons left">delete</i></a>
                    </td>
                </tr>
            </c:forEach>
            </tbody>
        </table>

    </div>
    <div id="test-swipe-2" class="col s12">
        <table class="striped">
            <thead>
                <tr>
                    <th>USERNAME</th>
                    <th>CNPJ</th>
                    <th>NOME FANTASIA</th>
                    <th>TELEFONE</th>
                    <th>EMAIL</th>
                    <th>RESPONSAVEL</th>
                    <th>RAMO</th>
                    <th>AÇÕES</th>
                </tr>
            </thead>

            <tbody>
                <tr>
                    <td>UNIESTAGIOS</td>
                    <td>444.444.444-44</td>
                    <td>ADMINISTRADOR</td>
                    <td>11-11111-1111</td>
                    <td>ADMIN@ADMIN.COM</td>
                    <td>HENRIQUE BORGES</td>
                    <td>T.I</td>
                    <td>
                        <a class="waves-effect waves-light btn-floating green"><i class="material-icons left">mode_edit</i></a>
                        <a class="waves-effect waves-light btn-floating blue"><i class="material-icons left">description</i></a>
                        <a class="waves-effect waves-light btn-floating red "><i class="material-icons left">delete</i></a>
                    </td>
                </tr>
            </tbody>
        </table>


    </div>

</div>
<%@include file="footer.jsp" %>
<script>
    $('.fixed-action-btn').openFAB();
    $('.fixed-action-btn').closeFAB();
</script>