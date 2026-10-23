import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.Statement;

public class DeleteData4 {
    public static void main(String[] args) {
        String url = "jdbc:oracle:thin:@localhost:1521:xe";
        String username = "system";
        String password = "your_password";

        try {
            Class.forName("oracle.jdbc.driver.OracleDriver");
            Connection con = DriverManager.getConnection(url, username, password);

            Statement stmt = con.createStatement();
            String sql = "DELETE FROM Student WHERE roll_no = 101";

            int rows = stmt.executeUpdate(sql);
            System.out.println(rows + " record(s) deleted successfully.");

            stmt.close();
            con.close();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}