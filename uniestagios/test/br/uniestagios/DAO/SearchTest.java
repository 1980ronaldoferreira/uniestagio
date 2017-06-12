/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.uniestagios.DAO;

import br.com.uniestagios.beans.Company;
import br.com.uniestagios.beans.Student;
import br.com.uniestagios.models.CompanyDAO;
import br.com.uniestagios.models.StudentDAO;
import static com.sun.corba.se.spi.presentation.rmi.StubAdapter.request;
import java.sql.SQLException;
import java.util.ArrayList;

/**
 *
 * @author alefsilva
 */
public class SearchTest {

    public static void main(String[] args) throws SQLException {
        ArrayList<Student> listStudents = new ArrayList();
        ArrayList<Company> listCompanys = new ArrayList();

        

        /**
         * Atribui os valores recuperados do formulário O parâmetro utilizado
         * "pesquisa" é igual para os três campos, pois está sendo utilizado o
         * LIKE na instrução SQL do DAO
         */
        //c.setResponsavel("h");
        // Busca no model (DAO) os dados
//                     // Coloca todos os usuarios em uma lista
//                    listStudents = stDAO.search(s);
//                    listCompanys = cDAO.search(c);
//                    
//                    System.out.println(listStudents);
//                    System.out.println(listCompanys);
        Company c = new Company();
        c.setUser_id(32);

        CompanyDAO cDAO = new CompanyDAO();
        ArrayList<Company> uresult = cDAO.findId(c);
        System.out.println("sucesso! => " + uresult);
    }

}
