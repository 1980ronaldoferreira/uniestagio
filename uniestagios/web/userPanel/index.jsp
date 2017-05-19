<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%@include file="header.jsp" %>
<div class="col s6 border-orange">
    <div class="row">
        <div class="section">
            ${ msg }
            <hr style="margin-bottom: 5px; width: 79%; margin-left: 15%;">
            <div class="container">
                <img src="http://localhost:8080/uniestagios/img/pequenoprincipe.jpg"/>
            </div>
            <hr style="margin-bottom: 5px; width: 79%; margin-left: 15%;">
            <div class="container">
                <ul>
                    
                    <li class="grey lighten-1">
                        <span  class="black-text "> <b>DADOS PESSOAIS</b></span>
                    </li>
                    <br>
                    <li>USERNAME</li>
                    <li>NOME</li>
                    <li>CPF</li>
                    <li>EMAIL</li>
                    <li>TELEFONE</li>
                    <br>
                </ul>
                
                 <ul>
                    <li class="grey lighten-1">
                        <span  class="black-text"> <b>DADOS DE ENDEREÇO</b></span>
                    </li>
                    <br>
                    <li class="col s6">LOGRADOURO</li>
                    <li>N</li>
                    <li class="col s6">CEP</li>
                    <li>BAIRRO</li>
                    <li class="col s6">CIDADE</li>
                    <li>ESTADO</li>
                    <br>
                </ul>
                
                 <ul>
                    <li class="grey lighten-1">
                        <span  class="black-text "> <b>DADOS PESSOAIS</b></span>
                    </li>
                    <br>
                    <li>USERNAME</li>
                    <li>NOME</li>
                    <li>CPF</li>
                    <li>EMAIL</li>
                    <li>TELEFONE</li>
                    <br>
                </ul>
            </div>
            <hr style="margin-bottom: 5px; width: 79%; margin-left: 15%;">
        </div>
    </div>
</div>
<%@include file="footer.jsp" %>