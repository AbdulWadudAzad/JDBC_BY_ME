
package jdbc;

import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;


public class DeleteData {
     private static java.sql.Connection con = MySqlDbConnection.getConnection();
    public static void deletedata(int divId) {
        String sql = "delete from division where id = ?";

        try {
            PreparedStatement ps = con.prepareStatement(sql);
            ps.setInt(1, divId);
          
            ps.executeUpdate();
            System.out.println("delete data");
        } catch (SQLException ex) {
            Logger.getLogger(InsertIntoTable.class.getName()).log(Level.SEVERE, null, ex);
        }

    }
}
