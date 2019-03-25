package Service;

import Connection.MySqlDbConnection;
import Domain.Purchese;
import Domain.Sales;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;

public class SalesService {

    static Connection conn = MySqlDbConnection.getConnection();

    public static void createTable() {
        String sql = "create table salestable(id int auto_increment primary key,code varchar(30),name varchar(30),qty doble,unitprice doble,totalprice doble,salesdate date, purchase_id int, foreign key (purchase_id) references purchese(id))";
        try {
            PreparedStatement ps = conn.prepareStatement(sql);
            ps.executeUpdate();
            System.out.println("table created");
        } catch (SQLException ex) {
            Logger.getLogger(PurchaseService.class.getName()).log(Level.SEVERE, null, ex);
        }

    }

    public static void insertData(Sales sales) {
        String sql = "insert into salestable(code,name,qty,unitprice,totalprice,salesdate,purchase_id) values(?,?,?,?,?,?,?)";
        try {
            PreparedStatement ps = conn.prepareStatement(sql);
            ps.setString(1, sales.getName());
            ps.setString(2, sales.getCode());
            ps.setDouble(3, sales.getQty());
            ps.setDouble(4, sales.getUnitPrice());
            ps.setDouble(5, sales.getTotalPrice());
            ps.setDate(6, new java.sql.Date(sales.getSalseDate().getTime()));
            ps.setInt(7, sales.getPurchese().getId());
            System.out.println("Data Inserted!");
        } catch (SQLException ex) {
            Logger.getLogger(PurchaseService.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
}
