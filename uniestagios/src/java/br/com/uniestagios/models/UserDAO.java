/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.uniestagios.models;

import br.com.uniestagios.beans.Company;
import br.com.uniestagios.beans.Student;
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
    private static final String SQL_FIND_ALL_STUDENT = "SELECT * FROM users INNER JOIN estudantes ON users.id = estudantes.user_id";
    private static final String SQL_FIND_ALL_COMPANY = "SELECT * FROM users INNER JOIN empresas ON users.id = empresas.user_id";
    private static final String SQL_FIND_LAST_ID = "SELECT id FROM users ORDER BY id DESC LIMIT 1";

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


            setMSG("CADASTRADO COM SUCESSO ! <i class=\"fa fa-smile-o\" aria-hidden=\"true\"></i>");

        } catch (SQLException ex) {
            // Lança um erro novo personalizado 
            setMSG("ERRO AO TENTAR CADASTRAR <i class=\"fa fa-frown-o\" aria-hidden=\"true\"></i>");
            System.out.println(ex.getMessage());
        }

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

            setMSG("USUÁRIO ATUALIZADO COM SUCESSO COM SUCESSO !<i class=\"fa fa-smile-o\" aria-hidden=\"true\"></i>");

        } catch (SQLException ex) {
            // Lança um erro novo personalizado 
            setMSG("OPS..  ERRO AO TENTAR ATUALIZAR USUÁRIO <i class=\"fa fa-frown-o\" aria-hidden=\"true\"></i>");
        }

    }

    public void destroy(User u) {

        try {

            PreparedStatement ps = CONNECTION.prepareStatement(SQL_DELETE);
            ps.setInt(1, u.getId());
            ps.executeUpdate();

            setMSG("USUÁRIO DELETADO COM SUCESSO ! <i class=\"fa fa-smile-o\" aria-hidden=\"true\"></i> ");

        } catch (SQLException ex) {
            // Lança um erro novo personalizado 
            setMSG("OPS .. NÃO FOI POSSIVEL DELETAR USUÁRIO ! <i class=\"fa fa-frown-o\" aria-hidden=\"true\"></i> ");
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

    public ArrayList<User> findAllStudent() throws SQLException {

        PreparedStatement ps = CONNECTION.prepareStatement(SQL_FIND_ALL_STUDENT);
        ResultSet rs = ps.executeQuery();

        ArrayList<User> users = new ArrayList();

        while (rs.next()) {

            Student e = new Student();
            e.setUser_id(rs.getInt("user_id"));
            e.setUsername(rs.getString("username"));
            e.setNome(rs.getString("nome"));
            e.setSobrenome(rs.getString("sobrenome"));
            e.setCpf(rs.getString("cpf"));
            e.setTelefone(rs.getString("email"));
            e.setEmail(rs.getString("telefone"));

            users.add(e);
        }

        return users;

    }

    public ArrayList<User> findAllCompany() throws SQLException {

        PreparedStatement ps = CONNECTION.prepareStatement(SQL_FIND_ALL_COMPANY);
        ResultSet rs = ps.executeQuery();

        ArrayList<User> users = new ArrayList();

        while (rs.next()) {
            Company c = new Company();
            c.setUser_id(rs.getInt("user_id"));
            c.setUsername(rs.getString("username"));
            c.setCnpj(rs.getString("cnpj"));
            c.setRazao_social(rs.getString("razao_social"));
            c.setNome_fantasia(rs.getString("nome_fantasia"));
            c.setTelefone(rs.getString("telefone"));
            c.setEmail(rs.getString("email"));
            c.setResponsavel(rs.getString("responsavel"));
            c.setRamo_atividades("ramo_atividades");

            users.add(c);
        }
        
        return users;

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
    
    
     public User findLastid( ) throws SQLException {
        PreparedStatement ps = CONNECTION.prepareStatement(SQL_FIND_LAST_ID);
        ResultSet rs = ps.executeQuery();

        User user = null;

        if (rs.next()) {
            user = new User();
            user.setId(rs.getInt("id"));
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

    /**
     * @return the MSG
     */
    public static String getMSG() {
        return MSG;
    }

    /**
     * @param m the MSG to set
     */
    public static void setMSG(String m) {
        MSG = m;
    }

}
