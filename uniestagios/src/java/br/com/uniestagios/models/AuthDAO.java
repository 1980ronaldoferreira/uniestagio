/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.uniestagios.models;

import br.com.uniestagios.beans.Company;
import br.com.uniestagios.beans.Student;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import br.com.uniestagios.utils.ConnectionFactory;
import java.sql.ResultSet;

/**
 *
 * @author alefsilva
 */
public class AuthDAO {

    private static Connection CONNECTION = null;
    private static String MSG = null;

    private static final String SQL_LOGIN_ESTUDENT = "SELECT * FROM users INNER JOIN estudantes ON users.id = estudantes.user_id WHERE username=? AND senha=? OR cpf=? AND senha=?";
    private static final String SQL_LOGIN_COMPANY = "SELECT * FROM users INNER JOIN empresas ON users.id = empresas.user_id WHERE username=? AND senha=? OR cnpj=? AND senha=?";

    public AuthDAO() throws SQLException {

        AuthDAO.CONNECTION = ConnectionFactory.getInstance().getConnection();

    }
    
    
    public Student Student(Student u) throws SQLException {
        PreparedStatement ps = CONNECTION.prepareStatement(SQL_LOGIN_ESTUDENT);
        ps.setString(1, u.getUsername());
        ps.setString(2, u.getSenha());

        ps.setString(3, u.getCpf());
        ps.setString(4, u.getSenha());

        ResultSet rs = ps.executeQuery();

        Student user = null;

        if (rs.next()) {
            user = new Student();
            user.setId(rs.getInt("id"));
            user.setUser_id(rs.getInt("user_id"));
            user.setIdStudent(rs.getInt("estudante_id"));
            user.setUsername(rs.getString("username"));
            user.setSenha(rs.getString("senha"));
            user.setType(rs.getString("perfil"));
            user.setNome(rs.getString("nome"));
            user.setSobrenome(rs.getString("sobrenome"));
            user.setCpf(rs.getString("cpf"));
            user.setEmail(rs.getString("email"));
            user.setTelefone(rs.getString("telefone"));

        }
        
        return user;
    }

    public Student loginStudent(Student u) throws SQLException {
        PreparedStatement ps = CONNECTION.prepareStatement(SQL_LOGIN_ESTUDENT);
        ps.setString(1, u.getUsername());
        ps.setString(2, u.getSenha());

        ps.setString(3, u.getCpf());
        ps.setString(4, u.getSenha());

        ResultSet rs = ps.executeQuery();

        Student user = null;

        if (rs.next()) {
            user = new Student();
            user.setId(rs.getInt("estudante_id"));
            user.setUsername(rs.getString("username"));
            user.setSenha(rs.getString("senha"));
            user.setType(rs.getString("perfil"));
            user.setNome(rs.getString("nome"));
            user.setSobrenome(rs.getString("sobrenome"));
            user.setCpf(rs.getString("cpf"));
            user.setEmail(rs.getString("email"));
            user.setTelefone(rs.getString("telefone"));

        }
        if(user != null){
            setMSG("<h4 class=\"header center orange white-text\">SEJA BEM VINDO "+ user.getNome() + " " + user.getSobrenome() + " <i class=\"fa fa-smile-o\" aria-hidden=\"true\"></i></h4>");
        return user;
        }
        
        return user;
    }

    public Company loginCompany(Company u) throws SQLException {
        PreparedStatement ps = CONNECTION.prepareStatement(SQL_LOGIN_COMPANY);

        ps.setString(1, u.getUsername());
        ps.setString(2, u.getSenha());

        ps.setString(3, u.getCnpj());
        ps.setString(4, u.getSenha());

        ResultSet rs = ps.executeQuery();

        Company user = null;

        if (rs.next()) {
            user = new Company();
            user.setId(rs.getInt("empresa_id"));
            user.setUsername(rs.getString("username"));
            user.setSenha(rs.getString("senha"));
            user.setType(rs.getString("perfil"));
            user.setCnpj(rs.getString("cnpj"));
            user.setRazao_social(rs.getString("razao_social"));
            user.setNome_fantasia(rs.getString("nome_fantasia"));
            user.setTelefone(rs.getString("telefone"));
            user.setEmail(rs.getString("email"));
            user.setResponsavel(rs.getString("responsavel"));
            user.setRamo_atividades(rs.getString("ramo_atividades"));

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
