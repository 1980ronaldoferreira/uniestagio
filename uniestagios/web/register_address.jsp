<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%@include file="panel_header.jsp" %>
<div class="col s6 border-orange">
    <div class="row">
        <div class="section">
            <div class="container">
                <hr style="margin-bottom: 5px; width: 100%;">
                <h4 class="header center orange-text">CADASTRAR ENDEREÇO</h4>  
                <hr style="margin-bottom: 5px; width: 100%;">
                <div class="section"> 
                    <h6 class="green white-text center center-align">    ${ msg }</h6>
                </div>
                <form action="AddressController" method="POST" name="cadastrar">
                    <input  type="hidden" name="flag" value="cadastrar">
                    <input  type="hidden" name="id" value="${ usuario.id }">
                    <%@include file="forms/form_address.jsp" %>

                    <div class="input-field col s12">
                        <button class="btn waves-effect waves-light light-blue lighten-1" type="submit" name="action">CADASTRAR
                            <i class="fa fa-floppy-o" aria-hidden="true"></i>
                        </button>
                        <button  onclick="history.go(-1);"  class="btn waves-effect waves-light red"  name="action">CANCELAR
                            <i class="fa fa-ban" aria-hidden="true"></i>
                        </button>

                    </div>
                </form>

            </div>
        </div>
    </div>
</div>
<%@include file="panel_footer.jsp" %>