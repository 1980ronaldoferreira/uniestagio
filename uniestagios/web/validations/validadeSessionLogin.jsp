<% if(request.getSession().getAttribute("usuario") != null ){%> 

${ msg }

 <% }else {

response.sendRedirect("AuthController?flag=validateLogin");

  }
 %>