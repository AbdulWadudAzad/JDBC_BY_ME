
package com.coderBD;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;
import oracle.net.nt.ConnOption;


public class InsertDataIntoStudent {
   private static Connection conn=SqlConnection.getConnection();
   
    public static void insertData(Student s) {
        String sql="insert into student(id, name, email) values(?,?,?)";
        
       try {
           PreparedStatement ps=conn.prepareStatement(sql);
           ps.setInt(1,s.getId());
           ps.setString(2, s.getName());
           ps.setString(3, s.getEmail());
           
           ps.executeUpdate();
           System.out.println("Data inserted");
       } catch (SQLException ex) {
           Logger.getLogger(InsertDataIntoStudent.class.getName()).log(Level.SEVERE, null, ex);
       }
        
        
    }
   
 public static void insertData2(int divId, String n,String m) {
       String sql="insert into student(id, name, email) values(?,?,?)" ;
    
        try {
            PreparedStatement ps= conn.prepareStatement(sql);
            ps.setInt(1, divId);
            ps.setString(2, n);
             ps.setString(3, m);
            ps.executeUpdate();
            System.out.println("Data inserted");
        } catch (SQLException ex) {
            Logger.getLogger(InsertDataIntoStudent.class.getName()).log(Level.SEVERE, null, ex);
        }
    
    }
}
