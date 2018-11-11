package com.coderBD.Category;

import com.coderBD.Domain.Product;
import com.coderBD.SqlConnection;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;

public class ProductService {

    static Connection conn = SqlConnection.getConnection();

    public static void createTable() {
        String sql = " create table product(id int(11) auto_increment primary key, name varchar(20), qty int(11), unitPrice double, totalPrice double,"
                + "purchaseDate Date, cat_id int(11), FOREIGN KEY (cat_id) REFERENCES category(id) )";

        try {
            PreparedStatement ps = conn.prepareStatement(sql);

            ps.executeUpdate();
            System.out.println("product table created");
        } catch (SQLException ex) {
            Logger.getLogger(ProductService.class.getName()).log(Level.SEVERE, null, ex);
        }

    }

    public static void inserty(Product product) {
        String sql = "insert into product(name,qty,unitPrice,totalPrice,purchaseDate,cat_id) value(?,?,?,?,?,?)";
        try {
            PreparedStatement ps = conn.prepareStatement(sql);
            ps.setString(1, product.getName());
            ps.setInt(2, product.getId());
            ps.setDouble(3, product.getUnitPrice());
            ps.setDouble(4, product.getTotalPrice());
            ps.setDate(5, new java.sql.Date(product.getPurchaseDate().getTime()));
            ps.setInt(6, product.getCategory().getId());
            ps.executeUpdate();
            System.out.println("Data inserted");
        } catch (SQLException ex) {
            Logger.getLogger(ProductService.class.getName()).log(Level.SEVERE, null, ex);
        }

    }

}
