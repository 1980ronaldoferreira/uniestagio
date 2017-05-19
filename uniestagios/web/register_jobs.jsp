<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%@include file="header.jsp" %>
<%@include file="validations/validadeSessionLogin.jsp" %>
<div class="section no-pad-bot" id="index-banner">
    <h4 class="header center orange-text">ANUNCIAR VAGA</h4>
    <hr>
</div>
<div class="container">
    <div class="section">
        <div id="tab2" class="col s12">
            <form action="JobController" method="POST">

                <input  type="hidden" name="id" value="Estudante">
                <input  type="hidden" name="flag" value="cadastrar">

                <div class="row">
                    <div class="section"></div>
                    <%@include file="forms/form_job.jsp" %>
                </div>
                <button class="btn waves-effect waves-light light-blue lighten-1" type="submit" name="action">CADASTRAR
                    <i class="fa fa-floppy-o" aria-hidden="true"></i>
                </button>
                <button  onclick="history.go(-1);"  class="btn waves-effect waves-light red"  name="action">CANCELAR
                    <i class="fa fa-ban" aria-hidden="true"></i>
                </button>
            </form>
        </div>
    </div>
</div>
<br><br>
<%@include file="footer.jsp" %>
<script>

    $(document).ready(function () {
        $('select').material_select();
    });
</script>