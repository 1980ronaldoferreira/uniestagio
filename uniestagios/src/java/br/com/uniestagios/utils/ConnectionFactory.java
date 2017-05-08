/**
 * Arquivo: ConnectionFactory.java
 *
 */
package br.com.uniestagios.utils;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

/**
 * @file ConnectionFactory.java
 * @brief Classe Fabrica de Conexoes
 * @author DE SOUZA, Edson Melo <souzaem at outlook.com>
 * @date 14/11/2014, 20:29:02
 */
public class ConnectionFactory {

    /**
     * Conexão para MySQL
     */
    private final String driver = "com.mysql.jdbc.Driver";
    private final String url = "jdbc:mysql://localhost:3306/uniestagios";

    /**
     * Conexão para Oracle
     *
     * private final String driver = "oracle.jdbc.driver.OracleDriver"; private
     * final String url = "jdbc:oracle:thin:@localhost:1521:xe";
     */
    private final String usuario = "user";
    private final String senha = "root";

    private static ConnectionFactory connectionFactory = null;

    /**
     * Realiza a configuração para a conexão
     *
     * @throws SQLException
     */
    private ConnectionFactory() throws SQLException {
        try {
            Class.forName(driver);
        } catch (ClassNotFoundException e) {
            throw new SQLException("driver");
        }
    }

    /**
     * Realiza a conexão, caso tenha sucesso
     *
     * @return Connection
     * @throws SQLException
     */
    public Connection getConnection() throws SQLException {
        Connection conn = null;
        try {
            conn = DriverManager.getConnection(url, usuario, senha);
        } catch (SQLException e) {
            throw new SQLException(String.valueOf(e.getErrorCode()));
        }
        return conn;
    }

    /**
     * Retorna uma instância da conexão para utilização
     *
     * @return Connection
     * @throws SQLException
     */
    public static ConnectionFactory getInstance() throws SQLException {
        if (connectionFactory == null) {
            connectionFactory = new ConnectionFactory();
        }
        return connectionFactory;
    }
}
