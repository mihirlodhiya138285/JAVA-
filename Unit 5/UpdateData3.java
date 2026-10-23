import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.Statement;

public class UpdateData3 {
    public static void main(String[] args) {
        String url = "jdbc:oracle:thin:@localhost:1521:xe";
        String username = "system";
        String password = "your_password";

        try {
            Class.forName("oracle.jdbc.driver.OracleDriver");
            Connection con = DriverManager.getConnection(url, username, password);

            Statement stmt = con.createStatement();
            String sql = "UPDATE Student SET marks = 95 WHERE roll_no = 101";

            int rows = stmt.executeUpdate(sql);
            System.out.println(rows + " record(s) updated successfully.");

            stmt.close();
            con.close();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}