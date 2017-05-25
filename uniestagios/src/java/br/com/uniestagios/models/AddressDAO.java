/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.uniestagios.models;

import br.com.uniestagios.beans.Address;
import br.com.uniestagios.beans.User;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import br.com.uniestagios.utils.ConnectionFactory;
import java.sql.ResultSet;
/**
 *
 * @author alefsilva
 */
public class AddressDAO {

    private static Connection CONNECTION = null;
    private static String MSG = null;

    private static final String SQL_INSERT = "INSERT INTO enderecos (user_id, logradouro, complemento,bairro,numero,cep) VALUES (?,?,?,?,?,?)";
    private static final String SQL_UPDATE = "UPDATE enderecos SET logradouro=?, complemento=?, bairro=? ,numero=?, cep=? WHERE user_id=?";
    private static final String SQL_DELETE = "DELETE FROM enderecos WHERE user_id=?";
    private static final String SQL_FIND_USER_ADDRESS = "SELECT * FROM users INNER JOIN enderecos ON users.id = enderecos.user_id";

    public AddressDAO() throws SQLException {

        AddressDAO.CONNECTION = ConnectionFactory.getInstance().getConnection();

    }

    public void create(Address u) {
        try {

            try (PreparedStatement ps = CONNECTION.prepareStatement(SQL_INSERT)) {
                ps.setInt(1, u.getUser_id());
                ps.setString(2, u.getLogradouro());
                ps.setString(3, u.getComplemento());
                ps.setString(4, u.getBairro());
                ps.setString(5, u.getNumero());
                ps.setString(6, u.getCep());
                ps.executeUpdate();
            }

            CONNECTION.close();

            setMSG("CADASTRADO ENDEREÇO COM SUCESSO ! <i class=\"fa fa-smile-o\" aria-hidden=\"true\"></i>");

        } catch (SQLException ex) {
            // Lança um erro novo personalizado 
            setMSG("ERRO AO TENTAR CADASTRAR ENDEREÇO <i class=\"fa fa-frown-o\" aria-hidden=\"true\"></i>");
            System.out.println(ex.getMessage());
        }

    }

    public void update(Address u) {

        try {
            try (PreparedStatement ps = CONNECTION.prepareStatement(SQL_UPDATE)) {
                ps.setString(1, u.getLogradouro());
                ps.setString(2, u.getComplemento());
                ps.setString(3, u.getBairro());
                ps.setString(4, u.getNumero());
                ps.setString(5, u.getCep());
                ps.setInt(6, u.getUser_id());
                ps.executeUpdate();
            }

            CONNECTION.close();

            setMSG("ENDEREÇO ATUALIZADO COM SUCESSO COM SUCESSO !<i class=\"fa fa-smile-o\" aria-hidden=\"true\"></i>");

        } catch (SQLException ex) {
            // Lança um erro novo personalizado 
            setMSG("OPS..  ERRO AO TENTAR ATUALIZAR ENDEREÇO <i class=\"fa fa-frown-o\" aria-hidden=\"true\"></i>");
        }

    }

    public void destroy(Address u) {

        try {

            PreparedStatement ps = CONNECTION.prepareStatement(SQL_DELETE);
            ps.setInt(1, u.getUser_id());
            ps.executeUpdate();

            setMSG("ENDEREÇO DELETADO COM SUCESSO ! <i class=\"fa fa-smile-o\" aria-hidden=\"true\"></i> ");

        } catch (SQLException ex) {
            // Lança um erro novo personalizado 
            setMSG("OPS .. NÃO FOI POSSIVEL DELETAR ENDEREÇO ! <i class=\"fa fa-frown-o\" aria-hidden=\"true\"></i> ");
        }

    }

      

    

    public Address findAddress(Address adr) throws SQLException {
        PreparedStatement ps = CONNECTION.prepareStatement(SQL_FIND_USER_ADDRESS);
        ps.setInt(1 , adr.getId());

        ResultSet rs = ps.executeQuery();

        Address user = null;

        if (rs.next()) {
            user = new Address();
            user.setId(rs.getInt("user_id"));
            user.setUsername(rs.getString("username"));
            user.setSenha(rs.getString("senha"));
            user.setType(rs.getString("perfil"));
            user.setLogradouro(rs.getString("logradouro"));
            user.setNumero(rs.getString("numero"));
            user.setBairro(rs.getString("bairro"));
            user.setComplemento(rs.getString("complemento"));
            user.setCep(rs.getString("cep"));
        }

        return user;
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

