/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.uniestagios.controllers;

import br.com.uniestagios.beans.Company;
import br.com.uniestagios.beans.Student;
import br.com.uniestagios.beans.User;
import br.com.uniestagios.models.CompanyDAO;
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

            //Variavel para manipulação de id de usuarios
            int user_id;

            // Tabela Estudantes
            String name;
            String lastName;
            String cpf;
            String cellPhone;
            String email;

            // Tabela Esmpresas
            String cnpj;
            String socialReason;
            String nameCompany;
            String emailCompany;
            String phoneCompany;
            String responsible;
            String companyBranch;

            // Variáveis para tratamento das mensagens de erro
            String tituloErro = "";
            String erro = "";

            User user = new User();
            UserDAO userDAO = new UserDAO();
            ArrayList<User> listUsers = new ArrayList();
            List<User> users;
            List<User> listUsersStudents;
            List<User> listUsersCompanys;
            List<User> pesquisa;
            List<User> userUpdateDAO;

            ArrayList<Student> listStudents = new ArrayList();
            List<Student> StudentEdit;

            ArrayList<Company> listCompanys = new ArrayList();
            List<Company> companyEdit;

            Student s = new Student();
            Student studentResult = new Student();
            StudentDAO stDAO = new StudentDAO();

            Company c = new Company();
            CompanyDAO cDAO = new CompanyDAO();
            Company CompanyResult = new Company();

            switch (flag) {
                case "cadastrar":

                    username = request.getParameter("username");
                    senha = request.getParameter("pass");
                    type = request.getParameter("perfil");
                    email = request.getParameter("email");

                    cpf = request.getParameter("cpf");
                    name = request.getParameter("name");
                    lastName = request.getParameter("last_name");
                    cellPhone = request.getParameter("cellPhone");

                    cnpj = request.getParameter("cnpj");
                    socialReason = request.getParameter("socialReason");
                    nameCompany = request.getParameter("nameCompany");
                    phoneCompany = request.getParameter("phoneCompany");
                    responsible = request.getParameter("responsible");
                    companyBranch = request.getParameter("companyBranch");

                    request.setAttribute("username", username);
                    request.setAttribute("email", email);
                    request.setAttribute("cpf", cpf);
                    request.setAttribute("name", name);
                    request.setAttribute("lastName", lastName);
                    request.setAttribute("cellPhone", cellPhone);

                    request.setAttribute("cnpj", cnpj);
                    request.setAttribute("socialReason", socialReason);
                    request.setAttribute("nameCompany", nameCompany);
                    request.setAttribute("phoneCompany", phoneCompany);
                    request.setAttribute("responsible", responsible);
                    request.setAttribute("companyBranch", companyBranch);

                    // Cria o objeto e e atribui os dados recebidos
                    user = new User();
                    user.setUsername(username);
                    user.setSenha(senha);
                    user.setType(type);

                    User u = new User();
                    u.setUsername(username);

                    UserDAO uDAO = new UserDAO();
                    ArrayList<User> list = uDAO.search(u);

                    s = new Student();
                    s.setCpf(cpf);
                    s.setEmail(email);
                    s.setUsername(username);

                    c = new Company();
                    c.setCnpj(cnpj);
                    c.setEmail(email);
                    c.setUsername(username);

                    listStudents = stDAO.search(s);
                    listCompanys = cDAO.search(c);

                    if ("student".equals(type)) {

                        for (Student listStu : listStudents) {

                                if (listStu.getCpf().equals(cpf)) {

                                    request.setAttribute("msg", "<h4 class=\"header center red white-text\"> ERRO CPF JA CADASTRADO <i class=\"fa fa-frown-o\" aria-hidden=\"true\"></i></h4>");
                                    request.setAttribute("actStudent", "active");

                                    request.getRequestDispatcher("register_user.jsp").
                                            forward(request, response);

                                } else if (listStu.getEmail().equals(email)) {

                                    request.setAttribute("msg", "<h4 class=\"header center red white-text\"> ERRO E-MAIL JA CADASTRADO <i class=\"fa fa-frown-o\" aria-hidden=\"true\"></i></h4>");
                                    request.setAttribute("actStudent", "active");
                                    request.getRequestDispatcher("register_user.jsp").
                                            forward(request, response);

                                } else if (listStu.getUsername().equals(username)) {

                                    request.setAttribute("msg", "<h4 class=\"header center red white-text\"> ERRO NOME DE USUARIO JA EXISTENTE <i class=\"fa fa-frown-o\" aria-hidden=\"true\"></i></h4>");
                                    request.setAttribute("actStudent", "active");
                                    request.getRequestDispatcher("register_user.jsp").
                                            forward(request, response);

                                }


                        }
                        
                            userDAO = new UserDAO();
                            userDAO.create(user);
                            user_id = userDAO.findLastid().getId();

                            s = new Student();
                            s.setUser_id(user_id);
                            s.setNome(name);
                            s.setSobrenome(lastName);
                            s.setCpf(cpf);
                            s.setEmail(email);
                            s.setTelefone(cellPhone);

                            stDAO = new StudentDAO();
                            stDAO.create(s);

                            /**
                             * Repassa os valores dos atributos para o objeto
                             * DAO que irá manipular os dados e gravar no banco
                             */
                            request.setAttribute("msg", stDAO.getMSG());
                            // Cria um atributo para informar sobre  a inclusão
                            //request.setAttribute("mensagem", alunoDAO.toString());
                            // Redireciona para a View
                            request.getRequestDispatcher("login.jsp").
                                    forward(request, response);


                    } else if ("company".equals(type)) {

                        for (Company listCom : listCompanys) {


                                if (listCom.getCnpj().equals(cnpj)) {

                                    request.setAttribute("msg", "<h4 class=\"header center red white-text\"> ERRO CNPJ JA CADASTRADO <i class=\"fa fa-frown-o\" aria-hidden=\"true\"></i></h4>");
                                    request.setAttribute("actCompany", "active");
                                    request.getRequestDispatcher("register_user.jsp").
                                            forward(request, response);

                                } else if (listCom.getEmail().equals(email)) {

                                    request.setAttribute("msg", "<h4 class=\"header center red white-text\"> ERRO E-MAIL JA CADASTRADO <i class=\"fa fa-frown-o\" aria-hidden=\"true\"></i></h4>");
                                    request.setAttribute("actCompany", "active");
                                    request.getRequestDispatcher("register_user.jsp").
                                            forward(request, response);

                                } else if (listCom.getUsername().equals(username)) {

                                    request.setAttribute("msg", "<h4 class=\"header center red white-text\"> ERRO USUÁRIO JÁ CADASTRADO <i class=\"fa fa-frown-o\" aria-hidden=\"true\"></i></h4>");
                                    request.setAttribute("actCompany", "active");
                                    request.getRequestDispatcher("register_user.jsp").
                                            forward(request, response);

                                }


                        }

                        userDAO = new UserDAO();
                        userDAO.create(user);
                        user_id = userDAO.findLastid().getId();

                        c = new Company();
                        c.setUser_id(user_id);
                        c.setCnpj(cnpj);
                        c.setRazao_social(socialReason);
                        c.setNome_fantasia(nameCompany);
                        c.setEmail(email);
                        c.setTelefone(phoneCompany);
                        c.setResponsavel(responsible);
                        c.setRamo_atividades(companyBranch);

                        cDAO = new CompanyDAO();
                        cDAO.create(c);

                        /**
                         * Repassa os valores dos atributos para o objeto DAO
                         * que irá manipular os dados e gravar no banco
                         */
                        request.setAttribute("msg", cDAO.getMSG());
                        // Cria um atributo para informar sobre  a inclusão
                        //request.setAttribute("mensagem", alunoDAO.toString());
                        // Redireciona para a View
                        request.getRequestDispatcher("login.jsp").
                                forward(request, response);

                    }

                    break;
                case "list":
                    // Busca no model os dados
                    userDAO = new UserDAO();

                    // Coloca todos os alunos em uma lista
                    listUsersStudents = userDAO.findAllStudent();
                    listUsersCompanys = userDAO.findAllCompany();

                    // se não for encontrado nenhum registro, retorna a mensagem
//                    if (listUsersStudents.isEmpty() || listUsersCompanys.isEmpty()) {
//                        
//                        if(listUsersStudents.isEmpty()){
//                            request.setAttribute("msg", "Não há Estudantes Cadastrados para serem listados");
//                        }
//                        
//                        if(listUsersCompanys.isEmpty()){
//                            request.setAttribute("msg", "Não há Empresas Cadastradas para serem listados");
//                        }
//                        
                    // Redireciona para a View
//                        request.getRequestDispatcher("admin/users.jsp").
//                                forward(request, response);
//                    } else {
                    // Cria um atributo com o aluno para ser utilizado na View
                    request.setAttribute("listaUsers", listUsersStudents);
                    request.setAttribute("listaCompany", listUsersCompanys);

                    // Redireciona para a View
                    request.getRequestDispatcher("admin/users.jsp").
                            forward(request, response);
//                    }

                    break;

                case "pesquisar":
                    // Cria um novo estudante e nova empresa
                    s = new Student();
                    c = new Company();

                    /**
                     * Atribui os valores recuperados do formulário O parâmetro
                     * utilizado "pesquisa" é igual para os três campos, pois
                     * está sendo utilizado o LIKE na instrução SQL do DAO
                     */
                    s.setUsername(request.getParameter("search"));
                    s.setNome(request.getParameter("search"));
                    s.setSobrenome(request.getParameter("search"));
                    s.setEmail(request.getParameter("search"));
                    s.setCpf(request.getParameter("search"));

                    /**
                     * Atribui os valores recuperados do formulário O parâmetro
                     * utilizado "pesquisa" é igual para os três campos, pois
                     * está sendo utilizado o LIKE na instrução SQL do DAO
                     */
                    c.setUsername(request.getParameter("search"));
                    c.setCnpj(request.getParameter("search"));
                    c.setRazao_social(request.getParameter("search"));
                    c.setNome_fantasia(request.getParameter("search"));
                    c.setEmail(request.getParameter("search"));
                    c.setResponsavel(request.getParameter("search"));
                    c.setRamo_atividades(request.getParameter("search"));

                    // Busca no model (DAO) os dados
                    stDAO = new StudentDAO();
                    cDAO = new CompanyDAO();

                    // Coloca todos os usuarios em uma lista
                    listStudents = stDAO.search(s);
                    listCompanys = cDAO.search(c);

                    // se não for encontrado nenhum registro, retorna a mensagem
                    if (listCompanys.isEmpty() || listStudents.isEmpty()) {
                        // Cria um atributo com o aluno para ser utilizado na View
                        request.setAttribute("listaUsers", listStudents);
                        request.setAttribute("listaCompany", listCompanys);

                        if (listStudents.isEmpty()) {
                            request.setAttribute("NotFoundStudent", "Ops !! Nenhum Usuário Estudante Encontrado <button class=\"waves-effect waves-light btn blue-grey\" onclick=\"history.go(-1);\" \">Voltar<button>");
                        }
                        if (listCompanys.isEmpty()) {
                            request.setAttribute("NotFoundCompany", "Ops !! Nenhum Usuário Empresa Encontrado <button class=\"waves-effect waves-light btn blue-grey\" onclick=\"history.go(-1);\" \">Voltar<button>");
                        }

                        // Redireciona para a View
                        request.getRequestDispatcher("admin/users.jsp").
                                forward(request, response);
                    } else {
                        // Cria um atributo com o aluno para ser utilizado na View
                        request.setAttribute("listaUsers", listStudents);
                        request.setAttribute("listaCompany", listCompanys);

                        // Redireciona para a View
                        request.getRequestDispatcher("admin/users.jsp").
                                forward(request, response);
                    }

                    break;
                case "edit":

                    type = request.getParameter("perfil");
                    /**
                     * Cria o objeto aluno e atribui o RA para pesquisa
                     */
                    if ("estudante".equals(type)) {
                        s = new Student();

                        s.setUser_id(Integer.parseInt(request.getParameter("id")));

                        stDAO = new StudentDAO();
                        StudentEdit = stDAO.findId(s);
                        request.setAttribute("listUser", StudentEdit);

                        // Redireciona para a View
                        request.getRequestDispatcher("edit_user_student.jsp").
                                forward(request, response);

                    } else if ("empresa".equals(type)) {

                        c = new Company();
                        c.setUser_id(Integer.parseInt(request.getParameter("id")));

                        cDAO = new CompanyDAO();
                        companyEdit = cDAO.findId(c);

                        request.setAttribute("listUser", companyEdit);
                        System.out.println(companyEdit);
                        // Redireciona para a View
                        request.getRequestDispatcher("edit_user_company.jsp").
                                forward(request, response);

                    }

                    break;

                case "save":

                    int id = Integer.parseInt(request.getParameter("id"));
                    username = request.getParameter("username");
                    senha = request.getParameter("pass");
                    type = request.getParameter("perfil");

                    // Cria o objeto e e atribui os dados recebidos
                    user = new User();
                    user.setUsername(username);
                    user.setSenha(senha);
                    user.setType(type);
                    user.setId(id);

                    userDAO = new UserDAO();
                    userDAO.update(user);

                    if ("estudante".equals(type)) {

                        name = request.getParameter("name");
                        lastName = request.getParameter("last_name");
                        cpf = request.getParameter("cpf");
                        email = request.getParameter("email");
                        cellPhone = request.getParameter("cellPhone");

                        s = new Student();
                        s.setUser_id(id);
                        s.setNome(name);
                        s.setSobrenome(lastName);
                        s.setCpf(cpf);
                        s.setEmail(email);
                        s.setTelefone(cellPhone);

                        stDAO = new StudentDAO();
                        stDAO.update(s);

                        /**
                         * Repassa os valores dos atributos para o objeto DAO
                         * que irá manipular os dados e gravar no banco
                         */
                        request.setAttribute("username", username);
                        request.setAttribute("msg", stDAO.getMSG());
                        // Cria um atributo para informar sobre  a inclusão
                        //request.setAttribute("mensagem", alunoDAO.toString());
                        // Redireciona para a View
                        request.getRequestDispatcher("UserController?flag=list").
                                forward(request, response);

                    } else if ("empresa".equals(type)) {

                        cnpj = request.getParameter("cnpj");
                        socialReason = request.getParameter("socialReason");
                        nameCompany = request.getParameter("nameCompany");
                        emailCompany = request.getParameter("email");
                        phoneCompany = request.getParameter("phoneCompany");
                        responsible = request.getParameter("responsible");
                        companyBranch = request.getParameter("companyBranch");

                        c = new Company();
                        c.setUser_id(id);
                        c.setCnpj(cnpj);
                        c.setRazao_social(socialReason);
                        c.setNome_fantasia(nameCompany);
                        c.setEmail(emailCompany);
                        c.setTelefone(phoneCompany);
                        c.setResponsavel(responsible);
                        c.setRamo_atividades(companyBranch);

                        cDAO = new CompanyDAO();
                        cDAO.update(c);

                        /**
                         * Repassa os valores dos atributos para o objeto DAO
                         * que irá manipular os dados e gravar no banco
                         */
                        request.setAttribute("username", username);
                        request.setAttribute("msg", cDAO.getMSG());
                        // Cria um atributo para informar sobre  a inclusão
                        //request.setAttribute("mensagem", alunoDAO.toString());
                        // Redireciona para a View
                        request.getRequestDispatcher("UserController?flag=list").
                                forward(request, response);
                    } else {

                        request.getRequestDispatcher("index.jsp").
                                forward(request, response);
                    }

                    break;

                case "destroy":
                    String perfil;

                    perfil = request.getParameter("perfil");

                    if ("estudante".equals(perfil)) {
                        s = new Student();
                        s.setUser_id(Integer.parseInt(request.getParameter("id")));

                        user = new User();
                        user.setId(s.getUser_id());

                        stDAO = new StudentDAO();
                        stDAO.destroy(s);

                        userDAO = new UserDAO();
                        userDAO.destroy(user);

                        request.setAttribute("msg", stDAO.getMSG());

                    }

                    if ("empresa".equals(perfil)) {
                        c = new Company();
                        c.setUser_id(Integer.parseInt(request.getParameter("id")));

                        user = new User();
                        user.setId(c.getUser_id());

                        cDAO = new CompanyDAO();
                        cDAO.destroy(c);

                        userDAO = new UserDAO();
                        userDAO.destroy(user);

                        request.setAttribute("msg", cDAO.getMSG());

                    }

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
