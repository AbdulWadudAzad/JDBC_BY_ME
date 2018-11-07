
package com.coderbd;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;


public class UpdateData {
  private static Connection conn=MySqlDbConnection.getConnection();
    public static void updatedata() {
        String sql="update division set name='Borisal' where id=1";
      try {
          PreparedStatement ps=conn.prepareStatement(sql);
          ps.executeUpdate();       //use this code in form of insert, update, delete & create table
          System.out.println("Data updated");
      } catch (SQLException ex) {
          Logger.getLogger(UpdateData.class.getName()).log(Level.SEVERE, null, ex);
      }
       
    }
    
    
        public static void updatedata2(String n ,int divId) {
        String sql="update division set name=? where id=?";
      try {
          PreparedStatement ps=conn.prepareStatement(sql);
          ps.setString(1, n);
          ps.setInt(2, divId);
          ps.executeUpdate();
          System.out.println("Data updated");
      } catch (SQLException ex) {
          Logger.getLogger(UpdateData.class.getName()).log(Level.SEVERE, null, ex);
      }
       
    }
}
