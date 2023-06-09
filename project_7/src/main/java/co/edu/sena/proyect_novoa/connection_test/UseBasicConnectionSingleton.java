package co.edu.sena.proyect_novoa.connection_test;
import java.sql.*;
public class UseBasicConnectionSingleton {
    public static void main(String[] args) throws
            SQLException {
        try (Connection conn = BasicConnectionSingleton.getInstance();
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
    } // end try
}
} // UseBasicConnectionSingleton