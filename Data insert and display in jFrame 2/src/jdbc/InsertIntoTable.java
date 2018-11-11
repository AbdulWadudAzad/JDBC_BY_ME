package jdbc;

import com.sun.jndi.ldap.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;

public class InsertIntoTable {

    private static java.sql.Connection con = MySqlDbConnection.getConnection();

    public static void insertData() throws SQLException {
        String sql = "insert into division (id,name) values (1,'Dhaka')";

        PreparedStatement ps = con.prepareStatement(sql);
        try {
            ps.executeUpdate();
            System.out.println("data Inserted");
        } catch (SQLException ex) {
            Logger.getLogger(InsertIntoTable.class.getName()).log(Level.SEVERE, null, ex);
        }

    }

    public static void insertData2(int divId, String n) {
        String sql = "insert into division (id,name) values (?,?)";

        try {
            PreparedStatement ps = con.prepareStatement(sql);
            ps.setInt(1, divId);
            ps.setString(2, n);
            ps.executeUpdate();
            System.out.println("data Inserted");
        } catch (SQLException ex) {
            Logger.getLogger(InsertIntoTable.class.getName()).log(Level.SEVERE, null, ex);
        }

    }

    public static void getDataId(int id) {
        ResultSet rs = null;
        String sql = " select * from division where id = ?";
        try {
            PreparedStatement ps = con.prepareStatement(sql);
            ps.setInt(1, id);
            rs = ps.executeQuery();
         
        } catch (SQLException ex) {
            Logger.getLogger(InsertIntoTable.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
}
