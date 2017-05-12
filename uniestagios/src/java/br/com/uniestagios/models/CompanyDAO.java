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
public class CompanyDAO {

    private static Connection CONNECTION = null;
    private static String MSG = null;

    private static final String SQL_INSERT = "INSERT INTO empresas (user_id, cnpj, razao_social,nome_fantasia,telefone,email,responsavel,ramo_atividades) VALUES (?,?,?,?,?,?,?,?)";

    private static final String SQL_UPDATE = "UPDATE users SET username=?, senha=?, perfil=? WHERE id=?";
    private static final String SQL_DELETE = "DELETE FROM empresas WHERE user_id=?";
    private static final String SQL_FIND_ID = "SELECT * FROM users WHERE id = ?";
    private static final String SQL_FIND_SEARCH = "SELECT * FROM users WHERE username LIKE ? or perfil LIKE ?";



    public CompanyDAO() throws SQLException {
                CompanyDAO.CONNECTION = ConnectionFactory.getInstance().getConnection();
    }

    public void create(Company c) {
        try {

            try (PreparedStatement ps = CONNECTION.prepareStatement(SQL_INSERT)) {
                ps.setInt(1,c.getUser_id());
                ps.setString(2, c.getCnpj());
                ps.setString(3, c.getRazao_social());
                ps.setString(4, c.getNome_fantasia());
                ps.setString(5, c.getTelefone());
                ps.setString(6, c.getEmail());
                ps.setString(7, c.getResponsavel());
                ps.setString(8, c.getRamo_atividades());
                ps.executeUpdate();
            }

            CONNECTION.close();

            setMSG("EMPRESA CADASTRADO COM SUCESSO ! <i class=\"fa fa-smile-o\" aria-hidden=\"true\"></i>");

        } catch (SQLException ex) {
            // Lança um erro novo personalizado 
            setMSG("ERRO AO TENTAR CADASTRAR NOVA EMPRESA  <i class=\"fa fa-frown-o\" aria-hidden=\"true\"></i>");
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

            setMSG("ATUALIZADO COM SUCESSO COM SUCESSO ! <i class=\"fa fa-smile-o\" aria-hidden=\"true\"></i>");

        } catch (SQLException ex) {
            // Lança um erro novo personalizado 
            setMSG("ERRO AO TENTAR ATUALIZAR <i class=\"fa fa-frown-o\" aria-hidden=\"true\"></i>");
        }

    }

    public void destroy(Company c) {

        try {

            PreparedStatement ps = CONNECTION.prepareStatement(SQL_DELETE);
            ps.setInt(1, c.getUser_id());
            ps.executeUpdate();

            setMSG("DELETADO COM SUCESSO ! <i class=\"fa fa-smile-o\" aria-hidden=\"true\"></i>" );

        } catch (SQLException ex) {
            // Lança um erro novo personalizado 
            setMSG("ERRO AO TENTAR DELETAR ! <i class=\"fa fa-frown-o\" aria-hidden=\"true\"></i>" );
        }

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
