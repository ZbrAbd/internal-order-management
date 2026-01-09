import java.sql.Connection;
import java.sql.DriverManager;

public class JdbcConnectionTest {

    public static void main(String[] args) {
        String url =
                "jdbc:sqlserver://192.168.1.145:1433;" +
                        "databaseName=OrderManagementDB;" +
                        "encrypt=true;" +
                        "trustServerCertificate=true";

        String username = "Zubair";
        String password = "Zubair@321";

        try (Connection conn = DriverManager.getConnection(url, username, password)) {
            System.out.println("✅ JDBC Connection SUCCESSFUL!");
        } catch (Exception e) {
            System.out.println("❌ JDBC Connection FAILED!");
            e.printStackTrace();
        }
    }
}
