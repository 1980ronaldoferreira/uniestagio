/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.uniestagios.controllers;

import br.com.uniestagios.beans.Student;
import br.com.uniestagios.beans.User;
import br.com.uniestagios.models.StudentDAO;
import br.com.uniestagios.models.UserDAO;
import java.io.IOException;
import java.io.PrintWriter;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.xml.bind.ParseConversionEvent;

/**
 *
 * @author alefsilva
 */
public class UserController extends HttpServlet {

    /**
     * Processes requests for both HTTP <code>GET</code> and <code>POST</code>
     * methods.
     *
     * @param request servlet request
     * @param response servlet response
     * @throws ServletException if a servlet-specific error occurs
     * @throws IOException if an I/O error occurs
     */
    protected void processRequest(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException, SQLException {
        response.setContentType("text/html;charset=UTF-8");
        try (PrintWriter out = response.getWriter()) {

            String flag = request.getParameter("flag");

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

            // Tabela Estudantes
            int user_id;
            String name;
            String last_name;
            String cpf;
            String email;
            String cellPhone;

            // Variáveis para tratamento das mensagens de erro
            String tituloErro = "";
            String erro = "";
            
            User user = new User();
            UserDAO userDAO = new UserDAO();
            ArrayList<User> listUsers = new ArrayList();
            List<User> users;
            List<User> pesquisa;
            List<User> userUpdateDAO;
            
            
            Student s = new Student();
            StudentDAO stDAO = new StudentDAO();
            
            
            

            switch (flag) {
                case "cadastrar":

                    username = request.getParameter("username");
                    senha = request.getParameter("pass");
                    type = request.getParameter("perfil");

                    // Cria o objeto e e atribui os dados recebidos
                    user = new User();
                    user.setUsername(username);
                    user.setSenha(senha);
                    user.setType(type);

                    userDAO = new UserDAO();
                    userDAO.create(user);

                    UserDAO uDAO = new UserDAO();
                    user_id = userDAO.findLastid().getId();

                    System.out.println(user_id);

                    if ("Estudante".equals(type)) {
                        
                        name = request.getParameter("name");
                        last_name = request.getParameter("last_name");
                        cpf = request.getParameter("cpf");
                        email = request.getParameter("email");
                        cellPhone = request.getParameter("cellPhone");
                        
                        System.out.println(cpf);
                        
                        s = new Student();
                        s.setUser_id(user_id);
                        s.setNome(name);
                        s.setSobrenome(last_name);
                        s.setCpf(cpf);
                        s.setEmail(email);
                        s.setTelefone(cellPhone);
                        
                        stDAO = new StudentDAO();
                        stDAO.create(s);
                        
                        /**
                     * Repassa os valores dos atributos para o objeto DAO que
                     * irá manipular os dados e gravar no banco
                     */
                    request.setAttribute("username", username);
                    request.setAttribute("msg", stDAO.getMSG());
                    // Cria um atributo para informar sobre  a inclusão
                    //request.setAttribute("mensagem", alunoDAO.toString());
                    // Redireciona para a View
                    request.getRequestDispatcher("login.jsp").
                            forward(request, response);

                    } 
                    
                    
                    
                    
                    
                        /**
                     * Repassa os valores dos atributos para o objeto DAO que
                     * irá manipular os dados e gravar no banco
                     */
                    request.setAttribute("username", username);
                    request.setAttribute("msg", userDAO.getMSG());
                    // Cria um atributo para informar sobre  a inclusão
                    //request.setAttribute("mensagem", alunoDAO.toString());
                    // Redireciona para a View
                    request.getRequestDispatcher("login.jsp").
                            forward(request, response);
                    
                    break;
                case "list":
                    // Busca no model os dados
                    userDAO = new UserDAO();

                    // Coloca todos os alunos em uma lista
                    listUsers = userDAO.findAll();

                    // se não for encontrado nenhum registro, retorna a mensagem
                    if (listUsers.isEmpty()) {
                        // Cria um atributo com o aluno para ser utilizado na View
                        request.setAttribute("mensagem", "Não há registros para serem listados");

                        // Redireciona para a View
                        request.getRequestDispatcher("admin/index.jsp").
                                forward(request, response);
                    } else {
                        // Cria um atributo com o aluno para ser utilizado na View
                        request.setAttribute("listaUsers", listUsers);

                        // Redireciona para a View
                        request.getRequestDispatcher("admin/users.jsp").
                                forward(request, response);
                    }

                    break;

                case "pesquisar":
                    // Cria um novo aluno
                    user = new User();
                    /**
                     * Atribui os valores recuperados do formulário O parâmetro
                     * utilizado "pesquisa" é igual para os três campos, pois
                     * está sendo utilizado o LIKE na instrução SQL do DAO
                     */
                    user.setUsername(request.getParameter("search"));

                    // Busca no model (DAO) os dados
                    userDAO = new UserDAO();

                    // Coloca todos os alunos em uma lista
                    listUsers = userDAO.search(user);

                    // se não for encontrado nenhum registro, retorna a mensagem
                    if (listUsers.isEmpty()) {
                        // Cria um atributo com o aluno para ser utilizado na View
                        request.setAttribute("msg", "Ops !! Nenhum Estudante Encontrado <button class=\"waves-effect waves-light btn blue-grey\" onclick=\"history.go(-1);\" \">Voltar<button>");

                        // Redireciona para a View
                        request.getRequestDispatcher("admin/users.jsp").
                                forward(request, response);
                    } else {
                        // Cria um atributo com o aluno para ser utilizado na View
                        request.setAttribute("listaUsers", listUsers);

                        // Redireciona para a View
                        request.getRequestDispatcher("admin/users.jsp").
                                forward(request, response);
                    }

                    break;
                case "editar":

                    /**
                     * Cria o objeto aluno e atribui o RA para pesquisa
                     */
                    user = new User();
                    user.setId(Integer.parseInt(request.getParameter("id")));

                    // Busca no model os dados
                    userDAO = new UserDAO();

                    // Coloca todos os alunos em uma lista
                    userUpdateDAO = (List<User>) userDAO.findId(user);

                    // Cria um atributo com o aluno para ser utilizado na View
                    request.setAttribute("listUser", userUpdateDAO);

                    // Redireciona para a View
                    request.getRequestDispatcher("edit_user_student.jsp").
                            forward(request, response);

                    break;

                case "save":
                    //Recupera os valores enviados pelo formulário
                    username = request.getParameter("username");
                    senha = request.getParameter("password");
                    type = request.getParameter("type");

                    // Cria o objeto e e atribui os dados recebidos
                    user = new User();
                    user.setUsername(username);
                    user.setSenha(senha);
                    user.setType(type);

                    /**
                     * Repassa os valores dos atributos para o objeto DAO que
                     * irá manipular os dados e gravar no banco
                     */
                    userDAO = new UserDAO();
                    userDAO.update(user);

                    // Cria um atributo para informar sobre a atualização
                    request.setAttribute("msg", userDAO.getMSG());

                    // Redireciona para a View
                    request.getRequestDispatcher("index.jsp").
                            forward(request, response);

                    break;

                case "destroy":
                    /**
                     * Cria o objeto aluno e atribui o RA para pesquisa
                     */
                    user = new User();
                    user.setId(Integer.parseInt(request.getParameter("id")));

                    // Busca no model os dados
                    userDAO = new UserDAO();

                    // Coloca todos os alunos em uma lista
                    userDAO.destroy(user);
                    request.setAttribute("msg", userDAO.getMSG());
                    // Cria um atributo com o aluno para ser utilizado na View
                    //request.setAttribute("mensagem", userDAO.toString());

                    // Redireciona para a View
                    request.getRequestDispatcher("UserController?flag=list").
                            forward(request, response);

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
            Logger.getLogger(UserController.class.getName()).log(Level.SEVERE, null, ex);
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
            Logger.getLogger(UserController.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

}
