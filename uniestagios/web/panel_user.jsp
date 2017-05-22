<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%@include file="panel_header.jsp" %>
<div class="col s6 border-orange">
    <div class="row">
        <div class="section">
            <div class="container">
                <%   if (request.getSession().getAttribute("perfil").equals("estudante")) { %>
                       
                        <%@include file="info_users/info_student.jsp" %>
                    
                    <% } else {%>
                      
                        <%@include file="info_users/info_company.jsp" %>
                  
                        <% }%>
                <hr style="margin-bottom: 5px; width: 100%;">
            </div>
        </div>
    </div>
</div>
<%@include file="panel_footer.jsp" %>