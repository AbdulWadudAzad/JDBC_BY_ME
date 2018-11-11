
package com.coderBD.Category;

import com.coderBD.Domain.Category;
import com.coderBD.SqlConnection;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;

public class CategoryService {
    static Connection conn=SqlConnection.getConnection();
    public static void createTable() {
        String sql="create table category(id int(11) auto_increment primary key, name varchar(50)) ";
        try {
            PreparedStatement ps=conn.prepareStatement(sql);
            ps.executeUpdate();
            System.out.println("category table created");
            
        } catch (SQLException ex) {
            Logger.getLogger(CategoryService.class.getName()).log(Level.SEVERE, null, ex);
        }
        
    }
    
    public static void insert(Category category) {
        String sql="insert into category(name) value(?) ";
        try {
            PreparedStatement ps=conn.prepareStatement(sql);
            ps.setString(1,category.getName());
            ps.executeUpdate();
            System.out.println("data inserted");
        } catch (SQLException ex) {
            Logger.getLogger(CategoryService.class.getName()).log(Level.SEVERE, null, ex);
        }
  
    }
    
}
