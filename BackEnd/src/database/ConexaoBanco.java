package BackEnd.src.database;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class ConexaoBanco {

    private static final String URL = System.getenv("JDBC_DATABASE_URL");
    private static final String USER = System.getenv("DB_USER");
    private static final String PASSWORD = System.getenv("DB_PASSWORD");

    public Connection conectar() throws SQLException {
        carregarDriver();
        return DriverManager.getConnection(URL, USER, PASSWORD);
    }

    private void carregarDriver() throws SQLException {
        try {
            Class.forName("org.postgresql.Driver");
        } catch (ClassNotFoundException e) {
            throw new SQLException("Driver PostgreSQL nao encontrado", e);
        }
    }
}