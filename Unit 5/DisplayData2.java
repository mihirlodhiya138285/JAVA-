import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;

public class DisplayData2 {
    public static void main(String[] args) {
        String url = "jdbc:oracle:thin:@localhost:1521:xe";
        String username = "system";
        String password = "your_password";

        try {
            Class.forName("oracle.jdbc.driver.OracleDriver");
            Connection con = DriverManager.getConnection(url, username, password);

            Statement stmt = con.createStatement();
            String sql = "SELECT * FROM Student";

           
            ResultSet rs = stmt.executeQuery(sql);

            
            System.out.println("Roll No\tName\tMarks");
            System.out.println("-------------------------");
            while (rs.next()) {
                int roll = rs.getInt("roll_no");
                String name = rs.getString("name");
                int marks = rs.getInt("marks");
                System.out.println(roll + "\t" + name + "\t" + marks);
            }

            rs.close();
            stmt.close();
            con.close();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}