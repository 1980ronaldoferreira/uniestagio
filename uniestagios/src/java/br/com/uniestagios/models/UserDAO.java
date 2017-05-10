/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.uniestagios.models;

import br.com.uniestagios.beans.User;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import br.com.uniestagios.utils.ConnectionFactory;
import java.sql.ResultSet;
import java.util.ArrayList;

/**
 *
 * @author alefsilva
 */
public class UserDAO {

    private static Connection CONNECTION = null;
    private static String MSG = null;

    private static final String SQL_INSERT = "INSERT INTO users (username, senha, perfil) VALUES (?,?,?)";
    private static final String SQL_UPDATE = "UPDATE users SET username=?, senha=?, perfil=? WHERE id=?";
    private static final String SQL_DELETE = "DELETE FROM users WHERE id=?";
    private static final String SQL_FIND_ID = "SELECT * FROM users WHERE id = ?";
    private static final String SQL_FIND_ALL_ORDER_NAME = "SELECT * FROM users ORDER BY username";
    private static final String SQL_FIND_SEARCH = "SELECT * FROM users WHERE username LIKE ? or perfil LIKE ?";

    public UserDAO() throws SQLException {

        UserDAO.CONNECTION = ConnectionFactory.getInstance().getConnection();

    }

    public void create(User u) {
        try {

            try (PreparedStatement ps = CONNECTION.prepareStatement(SQL_INSERT)) {
                ps.setString(1, u.getUsername());
                ps.setString(2, u.getSenha());
                ps.setString(3, u.getType());
                ps.executeUpdate();
            }

            CONNECTION.close();

            MSG = "Usuario Cadastrado com sucesso!";

        } catch (SQLException ex) {
            // Lança um erro novo personalizado 
            MSG = "Erro ao inserir o usuario";
        }

    }

    public ArrayList<User> findAll() throws SQLException {

        PreparedStatement ps = CONNECTION.prepareStatement(SQL_FIND_ALL_ORDER_NAME);
        ResultSet rs = ps.executeQuery();

        ArrayList<User> users = new ArrayList();

        while (rs.next()) {
            User u = new User();
            u.setId(rs.getInt("id"));
            u.setUsername(rs.getString("username"));
            u.setSenha(rs.getString("senha"));
            u.setType(rs.getString("perfil"));

            users.add(u);
        }

        return users;

    }

    public void update(User u) {
        
        try {
            try (PreparedStatement ps = CONNECTION.prepareStatement(SQL_UPDATE)) {
                ps.setString(1, u.getUsername());
                ps.setString(2, u.getSenha());
                ps.setString(3, u.getType());
                ps.setInt(4, u.getId());
                ps.executeUpdate();
            }

            CONNECTION.close();

            MSG = "Usuario Atualizar com sucesso!";

        } catch (SQLException ex) {
            // Lança um erro novo personalizado 
            MSG = "Erro ao Atualizar o usuario";
        }

    }

    public void destroy(User u) throws SQLException {

        PreparedStatement ps = CONNECTION.prepareStatement(SQL_DELETE);
        ps.setInt(1, u.getId());
        ps.executeUpdate();

    }

    public User findId(User u) throws SQLException {
        PreparedStatement ps = CONNECTION.prepareStatement(SQL_FIND_ID);
        ps.setInt(1, u.getId());

        ResultSet rs = ps.executeQuery();

        User user = null;

        if (rs.next()) {
            user = new User();
            user.setId(rs.getInt("id"));
            user.setUsername(rs.getString("username"));
            user.setSenha(rs.getString("senha"));
            user.setType(rs.getString("perfil"));

        }

        return user;
    }

    public ArrayList<User> search(User u) throws SQLException {

        ArrayList<User> users = new ArrayList();

        PreparedStatement ps = CONNECTION.prepareStatement(SQL_FIND_SEARCH);
        ps.setString(1, '%' + u.getUsername() + '%');
        ps.setString(2, '%' + u.getType() + '%');
        ResultSet rs = ps.executeQuery();

        while (rs.next()) {
            User user = new User();
            user.setId(rs.getInt("id"));
            user.setUsername(rs.getString("username"));
            user.setSenha(rs.getString("senha"));
            user.setType(rs.getString("perfil"));

            users.add(user);
        }

        return users;

    }

    public static void main(String[] args) {
        /*
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
