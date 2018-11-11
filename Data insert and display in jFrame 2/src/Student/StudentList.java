
package Student;

import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;


public class StudentList {
    
    private static java.sql.Connection con = MySqlDbConnection.getConnection();
    public List<Student> getstudentList() {
        List<Student> list = new ArrayList<>();
        String sql = "select * from student1";
        try {
            PreparedStatement ps = con.prepareStatement(sql);
            ResultSet rs = ps.executeQuery();
            while (rs.next()){
                list.add(new Student(rs.getInt(1), rs.getString(2), rs.getString(3)));
            }
        } catch (SQLException ex) {
            Logger.getLogger(StudentList.class.getName()).log(Level.SEVERE, null, ex);
        }
        
        
        return list;

    }
}
