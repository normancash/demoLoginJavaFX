package ni.edu.uam.demologin.config;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class PostgreSQLConnection {

    private static final String URL = "jdbc:postgresql://localhost:5432/";

    private static final String usuario = "postgres";
    private static final String password = "admin";

    public Connection getConnection() throws SQLException {
        return DriverManager.getConnection(
                URL
                ,usuario
                ,password);
    }
}
