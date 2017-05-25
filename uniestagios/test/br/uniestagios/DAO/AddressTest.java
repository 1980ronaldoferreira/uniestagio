/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.uniestagios.DAO;

import br.com.uniestagios.beans.Address;
import br.com.uniestagios.beans.User;
import br.com.uniestagios.models.AddressDAO;
import br.com.uniestagios.models.UserDAO;
import java.sql.SQLException;

/**
 *
 * @author alefsilva
 */
public class AddressTest {

    public static void main(String[] args) {

//        User u = new User();
//        u.setId(5);
//        
//        try{
//            
//        UserDAO uDAO = new UserDAO();
//        User uresult = uDAO.findId(u);
//        
//        Address adrU = new Address();
//        adrU.setUser_id(uresult.getId());
//        adrU.setLogradouro("R: Libero Badaró");
//        adrU.setNumero("254");
//        adrU.setBairro("SP");
//        adrU.setComplemento("1 AND");
//        adrU.setCep("00000000");
//        
//        
//        AddressDAO adrDAO = new AddressDAO();
//        adrDAO.create(adrU);
//        
//        System.out.println("sucesso! => " + adrDAO.getMSG());
//        
//        } catch (SQLException ex) {
//            System.out.println("Erro !");
//            ex.getStackTrace();
//        }
       

//User u = new User();
//        u.setId(5);
//
//        try {
//
//            UserDAO uDAO = new UserDAO();
//            User uresult = uDAO.findId(u);
//
//            Address adrU = new Address();
//            adrU.setUser_id(uresult.getId());
//            adrU.setLogradouro("R: Libero Badaró 2");
//            adrU.setNumero("254");
//            adrU.setBairro("SP");
//            adrU.setComplemento("1 AND");
//            adrU.setCep("00000000");
//
//            AddressDAO adrDAO = new AddressDAO();
//            adrDAO.update(adrU);
//
//            System.out.println("sucesso! => " + adrDAO.getMSG());
//
//        } catch (SQLException ex) {
//            System.out.println("Erro ! =>" + ex.getMessage());
//            ex.getStackTrace();
//        }
//
//    }


//        User u = new User();
//        u.setId(5);
//
//        try {
//
//            UserDAO uDAO = new UserDAO();
//            User uresult = uDAO.findId(u);
//
//            Address adrU = new Address();
//            adrU.setUser_id(uresult.getId());
//
//            AddressDAO adrDAO = new AddressDAO();
//            adrDAO.destroy(adrU);
//
//            System.out.println("sucesso! => " + adrDAO.getMSG());
//
//        } catch (SQLException ex) {
//            System.out.println("Erro ! =>" + ex.getMessage());
//            ex.getStackTrace();
//        }
    
  User u = new User();
        u.setId(3);

        try {

            UserDAO uDAO = new UserDAO();
            User uresult = uDAO.findId(u);

            Address adrU = new Address();
            adrU.setUser_id(uresult.getId());

            AddressDAO adrDAO = new AddressDAO();
            adrDAO.findAddress(adrU);

            System.out.println("sucesso! => " + adrDAO.findAddress(adrU));

        } catch (SQLException ex) {
            System.out.println("Erro ! =>" + ex.getMessage());
            ex.getStackTrace();
        }


    }

}
