package co.edu.sena.proyect_novoa.connection_test;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class UseConnectionPool {
    private static Connection getConnection()
            throws SQLException {
        return ConnectionPool.getConnection();
    }
    public static void main(String[] args)
            throws SQLException {
        try (Connection conn = getConnection();
             Statement stmt = conn.createStatement();
             ResultSet rs = stmt.executeQuery("SELECT * FROM BaseDatos1.users_tbl")) {
            while (rs.next()) {

                System.out.print(rs.getString("user_firstname"));
                System.out.print(" | ");
                System.out.print(rs.getString("user_lastname"));
                System.out.print(" | ");
                System.out.print(rs.getString("user_email"));
                System.out.print(" | ");
                System.out.print(rs.getString("user_password"));
            }
        }
    }
} // UseConnectionPool