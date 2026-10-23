import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;

public class InsertPreparedStatement5 {
    public static void main(String[] args) {
        String url = "jdbc:oracle:thin:@localhost:1521:xe";
        String username = "system";
        String password = "your_password";

        try {
            Class.forName("oracle.jdbc.driver.OracleDriver");
            Connection con = DriverManager.getConnection(url, username, password);

            
            String sql = "INSERT INTO Student (roll_no, name, marks) VALUES (?, ?, ?)";
            PreparedStatement pstmt = con.prepareStatement(sql);

            
            pstmt.setInt(1, 102);
            pstmt.setString(2, "Bob");
            pstmt.setInt(3, 90);

            int rows = pstmt.executeUpdate();
            System.out.println(rows + " record(s) inserted successfully using PreparedStatement.");

            pstmt.close();
            con.close();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}