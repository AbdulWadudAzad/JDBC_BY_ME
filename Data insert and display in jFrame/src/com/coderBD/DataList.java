
package com.coderBD;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;


public class DataList {
      private static Connection conn=SqlConnection.getConnection();

    public static List<Student> getStudentList() {
        List <Student> list=new ArrayList<>();
      String sql="Select * from student" ;
          try {
              PreparedStatement ps=conn.prepareStatement(sql);
              ResultSet rs=ps.executeQuery();
              
              while(rs.next()){
                  list.add(new Student(rs.getInt(1),rs.getString(2),rs.getString(3)));
              }
          } catch (SQLException ex) {
              Logger.getLogger(DataList.class.getName()).log(Level.SEVERE, null, ex);
          }
        return list;
    }
 
}
