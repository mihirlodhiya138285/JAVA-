import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;

public class UpdateDeletePreparedStatement7 {
    public static void main(String[] args) {
        String url = "jdbc:oracle:thin:@localhost:1521:xe";
        String username = "system";
        String password = "your_password";

        try {
            Class.forName("oracle.jdbc.driver.OracleDriver");
            Connection con = DriverManager.getConnection(url, username, password);

            
            String updateSql = "UPDATE Student SET marks = ? WHERE roll_no = ?";
            PreparedStatement pstmtUpdate = con.prepareStatement(updateSql);
            pstmtUpdate.setInt(1, 98);
            pstmtUpdate.setInt(2, 102);

            int updatedRows = pstmtUpdate.executeUpdate();
            System.out.println(updatedRows + " record(s) updated successfully.");
            pstmtUpdate.close();

            
            String deleteSql = "DELETE FROM Student WHERE roll_no = ?";
            PreparedStatement pstmtDelete = con.prepareStatement(deleteSql);
            pstmtDelete.setInt(1, 102);

            int deletedRows = pstmtDelete.executeUpdate();
            System.out.println(deletedRows + " record(s) deleted successfully.");
            pstmtDelete.close();

            con.close();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}