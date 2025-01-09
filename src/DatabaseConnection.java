import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class DatabaseConnection {
    private static final String URL = "jdbc:mysql://localhost:3307/pizza_ordering_db";
    private static final String USER = "root";
    private static final String PASSWORD = "";

    public static Connection getConnection() throws SQLException {
        //System.out.println("Database Connected");
        return DriverManager.getConnection(URL, USER, PASSWORD);
        
    }
}