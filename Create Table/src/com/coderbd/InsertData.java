
package com.coderbd;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;


public class InsertData {
    private static Connection conn=MySqlDbConnection.getConnection();
    public static void insertData() {
       String sql="insert into division(id, name) values(1, 'Dhaka')" ;
    
        try {
            PreparedStatement ps= conn.prepareStatement(sql);
            ps.executeUpdate();
            System.out.println("Data inserted");
        } catch (SQLException ex) {
            Logger.getLogger(InsertData.class.getName()).log(Level.SEVERE, null, ex);
        }
    
    }
   
    
     public static void insertData2(int divId, String n) {
       String sql="insert into division(id, name) values(?,?)" ;
    
        try {
            PreparedStatement ps= conn.prepareStatement(sql);
            ps.setInt(1, divId);
            ps.setString(2, n);
            ps.executeUpdate();
            System.out.println("Data inserted");
        } catch (SQLException ex) {
            Logger.getLogger(InsertData.class.getName()).log(Level.SEVERE, null, ex);
        }
    
    }
    
    
}
