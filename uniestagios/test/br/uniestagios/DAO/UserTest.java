/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.uniestagios.DAO;

import br.com.uniestagios.beans.User;
import br.com.uniestagios.models.UserDAO;
import java.sql.SQLException;
import java.util.ArrayList;

/**
 *
 * @author alefsilva
 */
public class UserTest {

    public static void main(String[] args) {

        
        
        
        
        
        
        /*
        try {

            UserDAO uDAO = new UserDAO();
            System.out.println("Fora do for => " + uDAO.findLastid());

        } catch (SQLException ex) {
            System.out.println("Erro !");
            ex.getStackTrace();
        }

       try{
        
        User u = new User();
        u.setUsername("TESTE 4");
        
        UserDAO uDAO = new UserDAO();    
        ArrayList<User> list = uDAO.search(u);
        
        list.forEach((user) -> {
            System.out.println("sucesso! => " + user );
           });
        
        
        } catch (SQLException ex) {
            System.out.println("Erro !");
            ex.getStackTrace();
        }

        
         User u1 = new User();
        u1.setUsername("TESTE 4");
        u1.setSenha("123444");
        u1.setType("student");
       
        try {
            
            UserDAO uDAO = new UserDAO();
            uDAO.create(u1);

            System.out.println("Usuario cadastrados com sucesso.");
            
        } catch (SQLException ex) {
            
            ex.getStackTrace();
        }
        ___________________________________________________
         

        User u1 = new User();
        u1.setId(3);

        User u2 = new User();
        u2.setId(10);

        UserDAO uDAO;
        try {

            uDAO = new UserDAO();
            uDAO.destroy(u1);
            uDAO.destroy(u2);
            System.out.println("Usuario deletado com sucesso!");

        } catch (SQLException ex) {
            ex.getStackTrace();
        }
    ___________________________________________________
        
        
        User u = new User();
        u.setUsername("ATUALIZADO 1");
        u.setSenha("NOVA SENHA");
        u.setType("company");
        u.setId(4);
        
        try{
            
        UserDAO uDAO = new UserDAO();
        uDAO.update(u);
        System.out.println("Usuario atualizado com sucesso!");
        } catch (SQLException ex) {
            ex.getStackTrace();
        }
        
         
___________________________________________________
        
        User u = new User();
        u.setId(4);
        
        try{
            
        UserDAO uDAO = new UserDAO();
        User uresult = uDAO.findId(u);
        
        System.out.println("sucesso! => " + uresult);
        
        } catch (SQLException ex) {
            System.out.println("Erro !");
            ex.getStackTrace();
        }

         ___________________________________________________
        

        try{
        
            UserDAO uDAO = new UserDAO();    
        ArrayList<User> list = uDAO.findAll();
        
        for(User u : list){
            System.out.println("sucesso! => " + u );
        }
        
        
        } catch (SQLException ex) {
            System.out.println("Erro !");
            ex.getStackTrace();
        }

         ___________________________________________________

        try {
            User u = new User();
            u.setUsername("t");

            UserDAO uDAO = new UserDAO();
            ArrayList<User> list = uDAO.search(u);

            list.forEach((ul) -> {
                System.out.println("sucesso! => " + ul);
            });

        } catch (SQLException ex) {
            System.out.println("Erro !");
            ex.getStackTrace();
        }

         */
    }

}
