import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Connection;

public class Main {

    public static void main(String[] args) {

        String dbURL = "jdbc:oracle:thin:@192.168.56.1:1521:orcl";
        String username = "hr";
        String password = "oracle";

        try {
            Connection connection = DriverManager.getConnection(dbURL, username, password);
            System.out.println("Connected to Oracle database:");
        } catch(SQLException e) {
                System.out.println("Ooops, error:");
                e.printStackTrace();
        }
    }
}
