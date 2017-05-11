<%@include file="header.jsp" %>
<div class="container">
    <div class="section">
        <div class="row">
                <div class="section">   </div>
                <div class="row border-orange">
                    <form action="UserController" method="POST" name="cadastrar">
                        <div class="section">
                            <div class="row  orange-text">
                                <h4 class="header center">ATUALIZAÇAO DE EMPRESA</h4> 
                                <div class="col s8 offset-s2">

                                    <div class="input-field col s12">
                                        <input  type="hidden" name="perfil" value="Estudante">
                                    </div>

                                    <div class="input-field col s12">
                                        <input  type="hidden" name="flag" value="">
                                    </div>
                                    
                                    <%@include file="forms/form_company.jsp" %>

                                    <div class="input-field col s12">
                                        <button class="btn waves-effect waves-light light-blue lighten-1" type="submit" name="action">CADASTRAR
                                            <i class="fa fa-floppy-o" aria-hidden="true"></i>
                                        </button>
                                        
                                        <button  onclick="history.go(-1);"  class="btn waves-effect waves-light red"  name="action">Cancelar
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