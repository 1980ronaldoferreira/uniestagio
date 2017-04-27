<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%@include file="header.jsp" %>
<div class="section no-pad-bot" id="index-banner">
    <div class="container">
        <br><br>
        <h4 class="header center orange-text">ANUNCIAR VAGA</h4>
        <hr>
        <br><br>

    </div>
</div>


<div class="container">
    <div class="section">
        <div id="tab2" class="col s12">
            <form action="" method="">
                <div class="row">
                    <div class="section"></div>
                    
                     <div class="input-field col s6">
                        <input id="titleJob" type="text" class="validate" name="titleJob" required>
                        <label for="titleJob">Título da vaga</label>
                    </div>
                    
                    <div class="input-field col s6">
                        <input placeholder="TI, Saúde e etc" id="area" type="text" class="validate" name="area" required>
                        <label for="area">Área</label>
                    </div>
                   

                    <div class="input-field col s2">
                        <select name="journeyJob">
                            <option value="" disabled selected>Jornada</option>
                            <option value="4">4 Horas</option>
                            <option value="6">6 Horas</option>
                            <option value="8">8 Horas</option>
                        </select>
                        <label>Carga Horária</label>
                    </div>

                    <div class="input-field col s2">
                        <select name="contract">
                            <option value="Estágio">Estagio</option>
                        </select>
                        <label>Tipo de Contrato</label>
                    </div>

                    <div class="input-field col s3">
                        <input id="bag" type="text" class="validate" name="bag" required>
                        <label for="bag">Valor da Bolsa</label>
                    </div>

                    <div class="input-field col s5">
                        <input id="workplace" type="text" class="validate" name="workplace" required>
                        <label for="workplace">Local de Trabalho</label>
                    </div>

                    <div class="input-field col s6">
                        <input  id="actives" type="text" class="validate" name="actives" required>
                        <label for="actives">Atividades/Requisitos:</label>
                    </div>
                </div>

                <button class="btn waves-effect waves-light light-green lighten-1" type="submit" name="action">Cadastrar
                    <i class="material-icons right">send</i>
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