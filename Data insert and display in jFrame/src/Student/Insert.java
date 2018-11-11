package Student;

import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;

public class Insert {

    private static java.sql.Connection con = MySqlDbConnection.getConnection();

    public static void insertData(Student s) {
        String sql = "insert into student1(id,name,email) values (?,?,?)";
        try {
            PreparedStatement ps = con.prepareStatement(sql);
            ps.setInt(1, s.getId());
            ps.setString(2, s.getName());
            ps.setString(3, s.getEmail());
            ps.executeUpdate();
            System.out.println("Data insert");

        } catch (SQLException ex) {
            Logger.getLogger(Insert.class.getName()).log(Level.SEVERE, null, ex);
        }

    }

    public static void deleteData(Student s) {
        String sql = "delete from Student1 where id = ?";

        try {
            PreparedStatement ps = con.prepareStatement(sql);
            ps.setInt(1, s.getId());

            ps.executeUpdate();
            System.out.println("Data Deleted");

        } catch (SQLException ex) {
            Logger.getLogger(Insert.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    public static void updateData(Student s) {
        String sql = "update student1 set name=?, email=? where id = ?";

        try {
            PreparedStatement ps = con.prepareStatement(sql);

            ps.setString(1, s.getName());
            ps.setString(2, s.getEmail());
            ps.setInt(3, s.getId());
            ps.executeUpdate();
            System.out.println("Update Data");

        } catch (SQLException ex) {
            Logger.getLogger(Insert.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    // public static void getStudentList(Student s) {
    //  String sql = "select * from Student1 ";
    // try {
    // PreparedStatement ps = con.prepareStatement(sql);
    //ResultSet rs = ps.executeQuery();
    //while (rs.next()) {
    //  System.out.println("" + rs.getInt(1) + " " + rs.getString(2) + " " + rs.getString(3));
    //}
    // } catch (SQLException ex) {
    //Logger.getLogger(Insert.class.getName()).log(Level.SEVERE, null, ex);
    // }
    //}
    public static List<Student> getstudentList() {
        List<Student> list = new ArrayList<>();
        String sql = "select * from student1";
        try {
            PreparedStatement ps = con.prepareStatement(sql);
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
