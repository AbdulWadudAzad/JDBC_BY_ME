
package com.coderBD;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;

public class UpdateStudent {
  private static Connection conn=SqlConnection.getConnection();
  
    public static void updateTable(Student s) {
        String sql="update student set name=? where id=?";
      try {
          PreparedStatement ps=conn.prepareStatement(sql);
          ps.setString(1, s.getName());
          ps.setInt(2,s.getId());
          ps.executeUpdate();
          System.out.println("data updated");
      } catch (SQLException ex) {
          Logger.getLogger(UpdateStudent.class.getName()).log(Level.SEVERE, null, ex);
      }
        
    }
}
