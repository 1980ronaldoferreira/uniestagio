<% if(request.getSession().getAttribute("usuario") != null ){%> 

${ welcome }

 <% }else {

response.sendRedirect("AuthController?flag=validateLogin");

  }
 %>