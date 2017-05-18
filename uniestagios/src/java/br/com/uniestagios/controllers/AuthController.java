/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.uniestagios.controllers;

import br.com.uniestagios.beans.Company;
import br.com.uniestagios.beans.Student;
import br.com.uniestagios.beans.User;
import br.com.uniestagios.models.AuthDAO;
import java.io.IOException;
import java.io.PrintWriter;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 *
 * @author alefsilva
 */
public class AuthController extends HttpServlet {

    /**
     * Processes requests for both HTTP <code>GET</code> and <code>POST</code>
     * methods.
     *
     * @param request servlet request
     * @param response servlet response
     * @throws ServletException if a servlet-specific error occurs
     * @throws IOException if an I/O error occurs
     * @throws java.sql.SQLException
     */
    protected void processRequest(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException, SQLException {
        response.setContentType("text/html;charset=UTF-8");
        try (PrintWriter out = response.getWriter()) {

            String flag = request.getParameter("flag");
             System.out.println("flag => " + flag);
            /**
             * Direciona para a página que está determinada no parâmetro do
             * método
             */
            if (flag == null) {
                request.getRequestDispatcher("index.jsp").
                        forward(request, response);
            }
            
     
            // Variáveis dos formulários
            String username;
            String senha;
            String type;

            //Variavel para manipulação de id de usuarios
            int user_id;

            // Tabela Estudantes
            String cpf;

            // Tabela Esmpresas
            String cnpj;

            User user = new User();

            Student s = new Student();
            Student studentResult = new Student();

            Company c = new Company();
            Company companyResult = new Company();

            AuthDAO authDAO = new AuthDAO();

            switch (flag) {
                case "logar":

                    username = request.getParameter("username_cpf_cnpj");
                    senha = request.getParameter("pass");
                    type = request.getParameter("perfil");
                    
                    

                    // Cria o objeto e e atribui os dados recebidos
                    if ("estudante".equals(type)) {

                        s = new Student();
                        s.setUsername(username);
                        s.setCpf(username);
                        s.setSenha(senha);
                        s.setType(type);
                        studentResult = authDAO.loginStudent(s);
                        
                        if(studentResult != null){
                        
                             /**
                         * Repassa os valores dos atributos para o objeto DAO
                         * que irá manipular os dados e gravar no banco
                         */
                        
                        request.getSession().setAttribute("usuario", studentResult);
                        request.setAttribute("username", username);
                        request.setAttribute("msg", authDAO.getMSG());
                        // Cria um atributo para informar sobre  a inclusão
                        //request.setAttribute("mensagem", alunoDAO.toString());
                        // Redireciona para a View
                        request.getRequestDispatcher("list_jobs.jsp").
                                forward(request, response);
                        
                            
                        }else{
                          authDAO.setMSG("<h4 class=\"header center red white-text\"> NOME DE USUARIO OU SENHA <i class=\"fa fa-frown-o\" aria-hidden=\"true\"></i></h4>");
                            /**
                         * Repassa os valores dos atributos para o objeto DAO
                         * que irá manipular os dados e gravar no banco
                         */
                        request.setAttribute("username", username);
                        request.setAttribute("msg", authDAO.getMSG());
                        // Cria um atributo para informar sobre  a inclusão
                        //request.setAttribute("mensagem", alunoDAO.toString());
                        // Redireciona para a View
                        request.getRequestDispatcher("login.jsp").
                                forward(request, response);
                            
                        }
                       

                    } else if ("empresa".equals(type)) {

                         c = new Company();
                        c.setUsername(username);
                        c.setCnpj(username);
                        c.setSenha(senha);
                        c.setType(type);
                        companyResult = authDAO.loginCompany(c);
                        
                        if(companyResult != null){
                        
                             /**
                         * Repassa os valores dos atributos para o objeto DAO
                         * que irá manipular os dados e gravar no banco
                         */
                         request.getSession().setAttribute("usuario", companyResult);
                        request.setAttribute("username", username);
                        request.setAttribute("msg", authDAO.getMSG());
                        // Cria um atributo para informar sobre  a inclusão
                        //request.setAttribute("mensagem", alunoDAO.toString());
                        // Redireciona para a View
                        request.getRequestDispatcher("login.jsp").
                                forward(request, response);
                        
                            
                        }else{
                          authDAO.setMSG("<h4 class=\"header center red white-text\"> NOME DE USUARIO OU SENHA <i class=\"fa fa-frown-o\" aria-hidden=\"true\"></i></h4>");
                            /**
                         * Repassa os valores dos atributos para o objeto DAO
                         * que irá manipular os dados e gravar no banco
                         */
                        request.setAttribute("username", username);
                        request.setAttribute("msg", authDAO.getMSG());
                        // Cria um atributo para informar sobre  a inclusão
                        //request.setAttribute("mensagem", alunoDAO.toString());
                        // Redireciona para a View
                        request.getRequestDispatcher("my_jobs.jsp").
                                forward(request, response);
                            
                        }
                        /**
                         * Repassa os valores dos atributos para o objeto DAO
                         * que irá manipular os dados e gravar no banco
                         */
                        request.setAttribute("username", username);
                        request.setAttribute("msg", authDAO.getMSG());
                        // Cria um atributo para informar sobre  a inclusão
                        //request.setAttribute("mensagem", alunoDAO.toString());
                        // Redireciona para a View
                        request.getRequestDispatcher("login.jsp").
                                forward(request, response);
                    }
                    
                    authDAO.setMSG("<h4 class=\"header center red white-text\">FAVOR SELECIONAR O TIPO DE USUARIO</h4>");
                    request.setAttribute("msg", authDAO.getMSG());
                    request.getRequestDispatcher("login.jsp").
                                forward(request, response);

                    break;
                case "logout":
                
                    request.getSession().invalidate();
                    response.sendRedirect("index.jsp");
                    
                    
                    
                break;

            }

        }
    }

    /**
     * Handles the HTTP <code>GET</code> method.
     *
     * @param request servlet request
     * @param response servlet response
     * @throws ServletException if a servlet-specific error occurs
     * @throws IOException if an I/O error occurs
     */
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        try {
            processRequest(request, response);
        } catch (SQLException ex) {
            Logger.getLogger(AuthController.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    /**
     * Handles the HTTP <code>POST</code> method.
     *
     * @param request servlet request
     * @param response servlet response
     * @throws ServletException if a servlet-specific error occurs
     * @throws IOException if an I/O error occurs
     */
    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        try {
            processRequest(request, response);
        } catch (SQLException ex) {
            Logger.getLogger(AuthController.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

}
