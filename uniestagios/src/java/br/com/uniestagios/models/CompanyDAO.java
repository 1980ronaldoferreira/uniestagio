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
    private static final String SQL_UPDATE = "UPDATE empresas SET cnpj=?, razao_social=?, nome_fantasia=?, telefone=?, email=?, responsavel=?, ramo_atividades=? WHERE user_id=?";
    private static final String SQL_DELETE = "DELETE FROM empresas WHERE user_id=?";
    private static final String SQL_FIND_ID = "SELECT * FROM users INNER JOIN empresas ON users.id = empresas.user_id WHERE user_id = ?";
    private static final String SQL_FIND_SEARCH = "SELECT * FROM users\n" +
"INNER JOIN empresas ON users.id = empresas.user_id WHERE username LIKE ? or cnpj LIKE ? or razao_social LIKE ?  or nome_fantasia LIKE ? or email LIKE ? or responsavel LIKE ? or ramo_atividades LIKE ?";



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

            setMSG("<h4 class=\"header center orange white-text\"> EMPRESA CADASTRADO COM SUCESSO ! <i class=\"fa fa-smile-o\" aria-hidden=\"true\"></i></h4>");

        } catch (SQLException ex) {
            // Lança um erro novo personalizado 
            setMSG("<h4 class=\"header center red white-text\"> ERRO AO TENTAR CADASTRAR NOVA EMPRESA  <i class=\"fa fa-frown-o\" aria-hidden=\"true\"></i></h4>");
            System.out.println(ex.getMessage());
        }

    }

    public void update(Company c) {

        try {
            try (PreparedStatement ps = CONNECTION.prepareStatement(SQL_UPDATE)) {
                ps.setString(1, c.getCnpj());
                ps.setString(2, c.getRazao_social());
                ps.setString(3, c.getNome_fantasia());
                ps.setString(4, c.getTelefone());
                ps.setString(5, c.getEmail());
                ps.setString(6, c.getResponsavel());
                ps.setString(7, c.getRamo_atividades());
                ps.setInt(8, c.getUser_id());
                ps.executeUpdate();
                
            }

            CONNECTION.close();

            setMSG("<h4 class=\"header center orange white-text\">ATUALIZADO COM SUCESSO COM SUCESSO ! <i class=\"fa fa-smile-o\" aria-hidden=\"true\"></i></h4>");

        } catch (SQLException ex) {
            // Lança um erro novo personalizado 
            setMSG("<h4 class=\"header center red white-text\"> ERRO AO TENTAR ATUALIZAR <i class=\"fa fa-frown-o\" aria-hidden=\"true\"></i></h4>");
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


    public ArrayList<Company>  findId(Company c) throws SQLException {
        
         ArrayList<Company> users = new ArrayList();
         
         
        PreparedStatement ps = CONNECTION.prepareStatement(SQL_FIND_ID);
        ps.setInt(1, c.getUser_id());

        ResultSet rs = ps.executeQuery();

        Company company = null;

        if (rs.next()) {
            company = new Company();
            company.setId(rs.getInt("user_id"));
            company.setUsername(rs.getString("username"));
            company.setSenha(rs.getString("senha"));
            company.setCnpj(rs.getString("cnpj"));
            company.setRazao_social(rs.getString("razao_social"));
            company.setNome_fantasia(rs.getString("nome_fantasia"));
            company.setTelefone(rs.getString("telefone"));
            company.setEmail(rs.getString("email"));
            company.setResponsavel(rs.getString("responsavel"));
            company.setRamo_atividades(rs.getString("ramo_atividades"));
            users.add(company);
        }

        return users;
    }

    public ArrayList<Company> search(Company u) throws SQLException {

        ArrayList<Company> users = new ArrayList();
        
        PreparedStatement ps = CONNECTION.prepareStatement(SQL_FIND_SEARCH);
        ps.setString(1, '%' + u.getUsername() + '%');
        ps.setString(2, '%' + u.getCnpj()+ '%');
        ps.setString(3, '%' + u.getRazao_social()+ '%');
        ps.setString(4, '%' + u.getNome_fantasia()+ '%');
        ps.setString(5, '%' + u.getEmail()+ '%');
        ps.setString(6, '%' + u.getResponsavel()+ '%');
        ps.setString(7, '%' + u.getRamo_atividades()+ '%');
        ResultSet rs = ps.executeQuery();

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
