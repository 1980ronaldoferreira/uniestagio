/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.uniestagios.models;

import br.com.uniestagios.beans.User;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;
import br.com.uniestagios.utils.ConnectionFactory;

/**
 *
 * @author alefsilva
 */
public class UserDAO {

    // Declaração das variáveis globais
    private static Connection conexao = null;
    private static String status;

    /**
     * Método construtor da classe
     *
     * @throws SQLException
     */
    public UserDAO() throws SQLException {
        // Retorna a conexao no momento da chamada da classe
        this.conexao = ConnectionFactory.getInstance().getConnection();
    }

    /**
     * Realiza a inclusão de um novo registro no banco de dados
     *
     * @param user
     */
    @SuppressWarnings("empty-statement")
    
    public static void create(User user) {

        try {
            // Declaração da variável para a instrução SQL
            String sql = "insert INTO users (username, password, type) VALUES (?,?,?)";

            // Atribui os valores ao objeto ps
            try (PreparedStatement ps = conexao.prepareStatement(sql)) {
                // seta os valores
                ps.setString(1, user.getUsername());
                ps.setString(2, user.getPassword());
                ps.setString(3, user.getType());

                // Executa o sql (execute)
                ps.execute();

                // Fecha o ps
                ps.close();
            }

            // Fecha a conexão
            conexao.close();

            // Retorna o status da inserção
            status = "Inserido com Sucesso!";

        } catch (SQLException ex) {
            // Lança um erro novo personalizado 
            status = "Erro ao inserir o usuario";
        }
    }
    
    
    public void update(User user) {
        try {
            // Declaração da variável para a instrução SQL
            String sql = "UPDATE aluno SET username=?, password=?, type=? WHERE id=?";

            // Atribui os valores ao objeto ps
            try (PreparedStatement ps = conexao.prepareStatement(sql)) {
                // seta os valores
                 ps.setString(1, user.getUsername());
                ps.setString(2, user.getPassword());
                ps.setString(3, user.getType());

                // Executa o sql (executeUpdate)
                ps.executeUpdate();

                // Fecha o ps
                ps.close();
            }

            // Fecha a conexão
            conexao.close();

            // Retorna o status da inserção
            status = "Atualizado com Sucesso!";

        } catch (SQLException ex) {
            // Lança um erro novo personalizado 
            status = "Erro ao atualizar os dados do usuario";
        }
    }
    
    public void delete(User user) {
        try {
            // Declaração da variável para a instrução SQL
            String sql = "DELETE FROM users WHERE id=?";

            // Atribui os valores ao objeto ps
            try (PreparedStatement ps = conexao.prepareStatement(sql)) {
                // seta os valores
                ps.setString(1, user.getId());

                // Executa o sql (executeUpdate)
                ps.executeUpdate();

                // Fecha o ps
                ps.close();
            }

            // Fecha a conexão
            conexao.close();

            // Retorna o status da inserção
            status = "Excluído com Sucesso!";

        } catch (SQLException ex) {
            // Lança um erro novo personalizado 
            status = "Erro ao excluir o aluno";
        }
    }
    
    
    
     public List<User> listar() {
        List<User> users = new ArrayList<>();
        try {
            String sql = "SELECT * FROM users ORDER BY username";
            try (PreparedStatement ps = conexao.prepareStatement(sql); ResultSet rs = ps.executeQuery()) {

                while (rs.next()) {
                    User user = new User();
                    user.setId(rs.getString("id"));
                    user.setUsername(rs.getString("username"));
                    user.setPassword(rs.getString("Password"));
                    user.setType(rs.getString("type"));

                    users.add(user);
                }
            }
            return users;

        } catch (SQLException ex) {
            Logger.getLogger(UserDAO.class.getName()).log(Level.SEVERE, null, ex);
            throw new RuntimeException("Falha ao listar os alunos.", ex);
        }
    }
    
     
     public List<User> pesquisar(User user) {
        List<User> users = new ArrayList<>();
        String sql = "SELECT * FROM users WHERE username like ?";
        try {
            PreparedStatement ps = conexao.prepareStatement(sql);
            ps.setString(1, '%' + user.getUsername() + '%');

            ResultSet rs = ps.executeQuery();

            while (rs.next()) {
                user = new User();
                user.setId(rs.getString("id"));
                user.setUsername(rs.getString("username"));
                user.setPassword(rs.getString("Password"));
                user.setType(rs.getString("type"));
                
                users.add(user);
            }
            return users;

        } catch (SQLException ex) {
            throw new RuntimeException("Falha ao listar os alunos.", ex);
        }
    }
     
     
    
    
    /**
     * Método que retorna o status da operação realizada
     *
     * @return String
     */
    @Override
    public String toString() {
        return status;
    }

}
