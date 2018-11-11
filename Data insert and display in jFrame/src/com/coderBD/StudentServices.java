
package com.coderBD;

import Student.Student;
import Student.StudentList;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;

public class StudentServices {
  static Connection conn=SqlConnection.getConnection();
    public static void tableCreate() {
        String sql="create table students(id int(11) auto_increment primary key,name varchar(20),email varchar(40))";
      try {
          PreparedStatement ps=conn.prepareStatement(sql);
          ps.executeUpdate();
          System.out.println("Table created");
      } catch (SQLException ex) {
          Logger.getLogger(StudentServices.class.getName()).log(Level.SEVERE, null, ex);
      }
       
    }
    
    public static void insert(Students s) {
        String sql="insert into students(name,email) value(?,?)";
      try {
          PreparedStatement ps=conn.prepareStatement(sql);
          ps.setString(1, s.getName());
          ps.setString(2, s.getEmail());
          ps.executeUpdate();
          System.out.println("data inserted");
      } catch (SQLException ex) {
          Logger.getLogger(StudentServices.class.getName()).log(Level.SEVERE, null, ex);
      }
 
    }
    
    
     public static void update(Students s) {
        String sql="update students set name=? where id=? ";
      try {
          PreparedStatement ps=conn.prepareStatement(sql);
          ps.setString(1, s.getName());
          ps.setInt(2, s.getId());
          ps.executeUpdate();
          System.out.println("update data");
      } catch (SQLException ex) {
          Logger.getLogger(StudentServices.class.getName()).log(Level.SEVERE, null, ex);
      }
 
    }
     
     public static void delete(Students s) {
        String sql="delete from students where id=? ";
      try {
          PreparedStatement ps=conn.prepareStatement(sql);
         
          ps.setInt(1, s.getId());
          ps.executeUpdate();
          System.out.println("data deleted");
      } catch (SQLException ex) {
          Logger.getLogger(StudentServices.class.getName()).log(Level.SEVERE, null, ex);
      }
 
    }
     
   public static List<Student> getstudentList() {
        List<Student> list = new ArrayList<>();
        String sql = "select * from students";
        try {
            PreparedStatement ps = conn.prepareStatement(sql);
            ResultSet rs = ps.executeQuery();
            while (rs.next()) {
                list.add(new Student(rs.getInt(1), rs.getString(2), rs.getString(3)));
            }
        } catch (SQLException ex) {
            Logger.getLogger(StudentList.class.getName()).log(Level.SEVERE, null, ex);
        }

        return list;

    }
}
