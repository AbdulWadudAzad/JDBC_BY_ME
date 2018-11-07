package com.coderbd;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;

public class createTableUsingMySql {

    
private static Connection conn=MySqlDbConnection.getConnection();

    public static void createTable() {
    try {
        String sql="create table division(id int(3), name varchar(30))";
        PreparedStatement ps=conn.prepareStatement(sql);
        ps.executeUpdate();     //use this code in form of insert, update, delete & create table
        System.out.println("Table created");
    } catch (SQLException ex) {
        Logger.getLogger(createTableUsingMySql.class.getName()).log(Level.SEVERE, null, ex);
    }
    }
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
}

