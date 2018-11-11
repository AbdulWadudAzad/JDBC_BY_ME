
package Product;

import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;




public class InsertTable {
   private static java.sql.Connection con = MySqlDbConnection.getConnection();
    public static void insertData(Category c) {
        String sql = "insert into Category (id,name)values (?,?) ";
       try {
           PreparedStatement ps = con.prepareStatement(sql);
           ps.setInt(1, c.getId());
           ps.setString(2, c.getName());
       } catch (SQLException ex) {
           Logger.getLogger(InsertTable.class.getName()).log(Level.SEVERE, null, ex);
       }
        
        
        
        
    }
}
