/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.uniestagios.DAO;

import br.com.uniestagios.beans.Student;
import br.com.uniestagios.beans.User;
import br.com.uniestagios.models.AuthDAO;
import br.com.uniestagios.models.StudentDAO;
import br.com.uniestagios.models.UserDAO;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author alefsilva
 */
public class LoginTest {

    public static void main(String[] args) {

        Student s = new Student();
        Student result = new Student();
        
        //s.setCpf("123456781119");
        s.setUsername("alele");
        s.setSenha("5h6a33");
        
        try {
            
            AuthDAO authDAO = new AuthDAO();
            result = authDAO.loginStudent(s);
            
            if(result != null){
              System.err.println("sucesso ! = " + result);
            }else{
                System.err.println("USUARIO/CPF/CNPJ OU SENHA INVALIDOS");
            }
        } catch (SQLException ex) {
              System.err.println("ERRO" + ex.getMessage());
        }
        
        
        
    }

}
