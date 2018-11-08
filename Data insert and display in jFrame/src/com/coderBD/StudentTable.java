
package com.coderBD;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;

public class StudentTable {
private static Connection conn=SqlConnection.getConnection();
    
    public static void createTable() {
        String sql="create table student (id int(3) primary key, name varchar(15), email varchar(40))";
    try {
        PreparedStatement ps=conn.prepareStatement(sql);
        ps.executeUpdate();
        System.out.println("Table Created");
    } catch (SQLException ex) {
        Logger.getLogger(StudentTable.class.getName()).log(Level.SEVERE, null, ex);
    }
        
        
    }
}
