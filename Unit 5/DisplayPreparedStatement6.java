import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

public class DisplayPreparedStatement6 {
    public static void main(String[] args) {
        String url = "jdbc:oracle:thin:@localhost:1521:xe";
        String username = "system";
        String password = "your_password";

        try {
            Class.forName("oracle.jdbc.driver.OracleDriver");
            Connection con = DriverManager.getConnection(url, username, password);

            
            String sql = "SELECT * FROM Student WHERE roll_no = ?";
            PreparedStatement pstmt = con.prepareStatement(sql);

            
            pstmt.setInt(1, 102);

            ResultSet rs = pstmt.executeQuery();

            System.out.println("Roll No\tName\tMarks");
            System.out.println("-------------------------");
            while (rs.next()) {
                System.out.println(rs.getInt("roll_no") + "\t" + rs.getString("name") + "\t" + rs.getInt("marks"));
            }

            rs.close();
            pstmt.close();
            con.close();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}