package BackEnd.src.database;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class ConexaoBanco {

    private static final String URL =
            "jdbc:postgresql://aws-1-us-west-2.pooler.supabase.com:5432/postgres?sslmode=require";

    private static final String USER =
            "postgres.leusgxwjhicsogotpffz";

    private static final String PASSWORD =
            "Natan221287@";

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