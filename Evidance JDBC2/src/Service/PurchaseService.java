package Service;

import Connection.MySqlDbConnection;
import Domain.Purchese;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;

public class PurchaseService {

    static Connection conn = MySqlDbConnection.getConnection();

    public static void createTable() {
        String sql = "create table purchasetable(id int auto_increment primary key,code varchar(30),name varchar(30),qty doble,unitprice doble,purchasedate date)";
        try {
            PreparedStatement ps = conn.prepareStatement(sql);
            ps.executeUpdate();
            System.out.println("table created");
        } catch (SQLException ex) {
            Logger.getLogger(PurchaseService.class.getName()).log(Level.SEVERE, null, ex);
        }

    }

    public static void insertData(Purchese purchese) {
        String sql = "insert into purchasetable(code,name,qty,unitprice,purchasedate) values(?,?,?,?,?)";
        try {
            PreparedStatement ps = conn.prepareStatement(sql);
            ps.setString(1, purchese.getName());
            ps.setString(2, purchese.getCode());
            ps.setDouble(3, purchese.getQty());
            ps.setDouble(4, purchese.getUnitPrice());
            ps.setDate(5, new java.sql.Date(purchese.getPurchaseDate().getTime()));
            ps.executeUpdate();
        } catch (SQLException ex) {
            Logger.getLogger(PurchaseService.class.getName()).log(Level.SEVERE, null, ex);
        }

    }

}
