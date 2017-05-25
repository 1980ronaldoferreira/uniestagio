/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.uniestagios.controllers;

import br.com.uniestagios.beans.Address;
import br.com.uniestagios.beans.Company;
import br.com.uniestagios.beans.Student;
import br.com.uniestagios.beans.User;
import br.com.uniestagios.models.AddressDAO;
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
public class AddressController extends HttpServlet {

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

            //Variavel para manipulação de id de usuarios
            int user_id;
            String type;

            String logradouro;
            String bairro;
            String numero;
            String complemento;
            String cep;

            // Tabela Esmpresas
            // Variáveis para tratamento das mensagens de erro
            String tituloErro = "";
            String erro = "";

            User user = new User();
            User userResult = new User();
            UserDAO userDAO = new UserDAO();

            Student s = new Student();
            Student studentResult = new Student();
            StudentDAO stDAO = new StudentDAO();

            Company c = new Company();
            CompanyDAO cDAO = new CompanyDAO();
            Company companyResult = new Company();

            Address adr = new Address();
            AddressDAO adrDAO = new AddressDAO();
            Address adrResult = new Address();

            switch (flag) {
                case "cadastrar":
                    
                    
                    
                    
                    user_id = Integer.parseInt(request.getParameter("id"));
                    logradouro = request.getParameter("logradouro");
                    bairro = request.getParameter("bairro");
                    numero = request.getParameter("numero");
                    complemento = request.getParameter("complemento");
                    cep = request.getParameter("cep");

                    // Cria o objeto e e atribui os dados recebidos
                    user = new User();
                    user.setId(user_id);

                    userDAO = new UserDAO();
                    userResult = userDAO.findId(user);

                    adr.setUser_id(user_id);
                    adr.setLogradouro(logradouro);
                    adr.setBairro(bairro);
                    adr.setComplemento(complemento);
                    adr.setNumero(numero);
                    adr.setCep(cep);
                    
                    adrResult =  adrDAO.findAddress(adr);
                    
                    System.out.println(adrResult);
                    
                     if(adrResult == null){
                         
                     adrDAO.create(adr);
                     /**
                     * Repassa os valores dos atributos para o objeto DAO que
                     * irá manipular os dados e gravar no banco
                     */
                    request.setAttribute("msg", adrDAO.getMSG());
                    // Cria um atributo para informar sobre  a inclusão
                    //request.setAttribute("mensagem", alunoDAO.toString());
                    // Redireciona para a View
                    request.getRequestDispatcher("register_address.jsp").
                            forward(request, response);
                     }
                    
                    request.setAttribute("msg", "PERFIL COM ENDEREÇO JÁ CADASTRADO !<br> POSSIVEL SOMENTE ATUALIZAR.");
                    // Cria um atributo para informar sobre  a inclusão
                    //request.setAttribute("mensagem", alunoDAO.toString());
                    // Redireciona para a View
                    request.getRequestDispatcher("register_address.jsp").
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
            Logger.getLogger(AddressController.class.getName()).log(Level.SEVERE, null, ex);
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
            Logger.getLogger(AddressController.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

}
