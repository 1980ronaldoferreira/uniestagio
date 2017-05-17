/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.uniestagios.models;

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
public class StudentDAO {

    private static Connection CONNECTION = null;
    private static String MSG = null;

    private static final String SQL_INSERT = "INSERT INTO estudantes (user_id, nome, sobrenome,cpf,email,telefone) VALUES (?,?,?,?,?,?)";

    private static final String SQL_UPDATE = "UPDATE users SET username=?, senha=?, perfil=? WHERE id=?";

    private static final String SQL_DELETE = "DELETE FROM estudantes WHERE user_id=?";

    private static final String SQL_FIND_ID = "SELECT * FROM users INNER JOIN estudantes ON users.id = estudantes.user_id WHERE user_id = ?";

    private static final String SQL_FIND_ALL_STUDENT = "SELECT * FROM users INNER JOIN estudantes ON users.id = estudantes.user_id";
    
    private static final String SQL_FIND_SEARCH = "SELECT * FROM users\n" +
"INNER JOIN estudantes ON users.id = estudantes.user_id WHERE username LIKE ? or nome LIKE ? or sobrenome LIKE ?  or email LIKE ? or cpf LIKE ?";

    
    public StudentDAO() throws SQLException {

        StudentDAO.CONNECTION = ConnectionFactory.getInstance().getConnection();

    }

    public void create(Student s) {
        try {

            try (PreparedStatement ps = CONNECTION.prepareStatement(SQL_INSERT)) {
                ps.setInt(1, s.getUser_id());
                ps.setString(2, s.getNome());
                ps.setString(3, s.getSobrenome());
                ps.setString(4, s.getCpf());
                ps.setString(5, s.getEmail());
                ps.setString(6, s.getTelefone());
                ps.executeUpdate();
            }

            CONNECTION.close();

            setMSG("ESTUDANTE CADASTRADO COM SUCESSO ! <i class=\"fa fa-smile-o\" aria-hidden=\"true\"></i> ");

        } catch (SQLException ex) {
            // Lança um erro novo personalizado 
            setMSG("ERRO AO TENTAR CADASTRAR NOVO ESTUDANTE <i class=\"fa fa-frown-o\" aria-hidden=\"true\"></i>");
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

            setMSG("ATUALIZADO COM SUCESSO COM SUCESSO ! <i class=\"fa fa-smile-o\" aria-hidden=\"true\"></i> ");

        } catch (SQLException ex) {
            // Lança um erro novo personalizado 
            setMSG("ERRO AO TENTAR ATUALIZAR ! <i class=\"fa fa-frown-o\" aria-hidden=\"true\"></i>");
        }

    }

    public void destroy(Student s) {

        try {

            PreparedStatement ps = CONNECTION.prepareStatement(SQL_DELETE);
            ps.setInt(1, s.getUser_id());
            ps.executeUpdate();

            setMSG("ESTUDANTE DELETADO COM SUCESSO ! <i class=\"fa fa-smile-o\" aria-hidden=\"true\"></i> ");

        } catch (SQLException ex) {
            // Lança um erro novo personalizado 
            setMSG("ERRO AO TENTAR DELETAR ESTUDANTE ! <i class=\"fa fa-frown-o\" aria-hidden=\"true\"></i>");
        }

    }

    public ArrayList<User> findAllStudant() throws SQLException {

        PreparedStatement ps = CONNECTION.prepareStatement(SQL_FIND_ALL_STUDENT);
        ResultSet rs = ps.executeQuery();

        ArrayList<User> users = new ArrayList();

        while (rs.next()) {

            Student e = new Student();
            e.setIdStudent(rs.getInt("estudante_id"));
            e.setId(rs.getInt("id"));
            e.setUsername(rs.getString("username"));
            e.setSenha(rs.getString("senha"));
            e.setNome(rs.getString("nome"));
            e.setSobrenome(rs.getString("sobrenome"));
            e.setCpf(rs.getString("cpf"));
            e.setTelefone(rs.getString("cellPhone"));
            e.setEmail(rs.getString("email"));

            users.add(e);
        }

        return users;

    }

    public ArrayList<Student> findId(Student s) throws SQLException {
        
        ArrayList<Student> users = new ArrayList();
        
        
        PreparedStatement ps = CONNECTION.prepareStatement(SQL_FIND_ID);
        ps.setInt(1, s.getUser_id());

        ResultSet rs = ps.executeQuery();

        Student student = null;

        if (rs.next()) {
            student = new Student();
            student.setId(rs.getInt("user_id"));
            student.setUsername(rs.getString("username"));
            student.setSenha(rs.getString("senha"));
            student.setNome(rs.getString("nome"));
            student.setSobrenome(rs.getString("sobrenome"));
            student.setCpf(rs.getString("cpf"));
            student.setEmail(rs.getString("email"));
            student.setTelefone(rs.getString("telefone"));
            users.add(student);
        }

        return users;
    }

    public ArrayList<Student> search(Student s) throws SQLException {

        ArrayList<Student> users = new ArrayList();

        PreparedStatement ps = CONNECTION.prepareStatement(SQL_FIND_SEARCH);
        ps.setString(1, '%' + s.getUsername() + '%');
        ps.setString(2, '%' + s.getNome() + '%');
        ps.setString(3, '%' + s.getSobrenome()+ '%');
        ps.setString(4, '%' + s.getEmail() + '%');
        ps.setString(5, '%' + s.getCpf() + '%');
        ResultSet rs = ps.executeQuery();

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
