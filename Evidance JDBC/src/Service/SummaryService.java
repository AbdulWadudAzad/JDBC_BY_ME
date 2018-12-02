
package Service;

import Connection.MySqlDbConnection;
import Domain.Sales;
import Domain.Summary;
import com.sun.org.glassfish.external.statistics.annotations.Reset;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;

public class SummaryService {
      static Connection conn = MySqlDbConnection.getConnection();

    public static void createTable() {
        String sql = "create table summarytable(id int auto_increment primary key,code varchar(30),name varchar(30),totalqty doble,soldqty doble,availableqty doble,lastupdate date, purchase_id int, foreign key (purchase_id) references purchese(id))";
        try {
            PreparedStatement ps = conn.prepareStatement(sql);
            ps.executeUpdate();
            System.out.println("table created");
        } catch (SQLException ex) {
            Logger.getLogger(PurchaseService.class.getName()).log(Level.SEVERE, null, ex);
        }

    }

    public static void insertData(Summary summary) {
        String sql = "insert into summarytable(code,name,totalqty,soldqty,availableqty,lastupdate,purchase_id) values(?,?,?,?,?,?,?)";
        try {
            PreparedStatement ps = conn.prepareStatement(sql);
            ps.setString(1, summary.getName());
            ps.setString(2, summary.getCode());
            ps.setDouble(3, summary.getTotalQty());
            ps.setDouble(4, summary.getSoldQty());
            ps.setDouble(5, summary.getAvailableQty());
            ps.setDate(6, new java.sql.Date(summary.getLastUpdate().getTime()));
            ps.setInt(7, summary.getPurchese().getId());
            System.out.println("Data Inserted!");
        } catch (SQLException ex) {
            Logger.getLogger(PurchaseService.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
    
     public static void update(Summary summary) {
        String sql = "update summarytable set totalqty=?,soldqty=?,availableqty=?,lastupdate=? where code=?";
        try {
            PreparedStatement ps = conn.prepareStatement(sql);
            ps.setDouble(1, summary.getTotalQty());
            ps.setDouble(2, summary.getSoldQty());
            ps.setDouble(3, summary.getAvailableQty());
            ps.setDate(4, new java.sql.Date(summary.getLastUpdate().getTime()));
            ps.setString(5, summary.getCode());
            System.out.println("Data Inserted!");
        } catch (SQLException ex) {
            Logger.getLogger(PurchaseService.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
     
    public static Summary getSummarybyCode(String code) {
        Summary s=new Summary();
        String sql="select * from summarytable where code=? ";
          try {
              PreparedStatement ps=conn.prepareStatement(sql);
              ps.setString(1, code);
              ResultSet rs=ps.executeQuery();
              while (rs.next()) {
                  
                  
              }
              
              
              
              
              
          } catch (SQLException ex) {
              Logger.getLogger(SummaryService.class.getName()).log(Level.SEVERE, null, ex);
          }
        
    }
 
     
     
     
     
     
}
