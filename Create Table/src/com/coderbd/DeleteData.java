
package com.coderbd;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;


public class DeleteData {
   private static Connection conn=MySqlDbConnection.getConnection();
    public static void deleteData(int divId) {
     String sql="delete from division where id=?" ;
       try {
           PreparedStatement ps=conn.prepareStatement(sql);
           ps.setInt(1, divId);
           ps.executeUpdate();  //use this code in form of insert, update, delete & create table
           System.out.println("Deleted data");
           
       } catch (SQLException ex) {
           Logger.getLogger(DeleteData.class.getName()).log(Level.SEVERE, null, ex);
       }
        
    }
}
