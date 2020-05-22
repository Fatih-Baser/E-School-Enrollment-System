
import com.mysql.jdbc.Connection;
import com.mysql.jdbc.PreparedStatement;
import com.mysql.jdbc.RowData;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
import javax.swing.JTable;
import java.sql.ResultSet;
import javax.swing.table.DefaultTableModel;

public class Student {
  
    public void insertUpdateDeleteStudent(char operation, Integer id,String fname,String lname,String sex
                                                           ,String bdate, String phone, String address){
        Connection con=MyConnection.getConnection();
        PreparedStatement ps;
        
        if(operation == 'i'){
            try {
                ps=(PreparedStatement) con.prepareStatement("INSERT INTO student(ad, soyad, cinsiyet, dogum_tarihi, telefon, adres) VALUES (?,?,?,?,?,?)");
                ps.setString(1, fname);
                 ps.setString(2, lname);
                  ps.setString(3, sex);
                   ps.setString(4,bdate );
                    ps.setString(5, phone);
                     ps.setString(6,address);
                     
                     if(ps.executeUpdate() > 0){
                         JOptionPane.showMessageDialog(null,"new Student Added");
                     }
            } catch (SQLException ex) {
                Logger.getLogger(Student.class.getName()).log(Level.SEVERE, null, ex);
            }
        }
        
        if(operation == 'u'){// bu u guncellemek icin 
            try {
                ps=(PreparedStatement) con.prepareStatement("UPDATE `student` SET `ad`= ?, `soyad`= ? , `cinsiyet`= ? ,`dogum_tarihi`= ? , `telefon`= ?, `adres`= ? WHERE `id`= ?");
                ps.setString(1, fname);     
                 ps.setString(2, lname);
                  ps.setString(3, sex);
                   ps.setString(4,bdate );
                    ps.setString(5, phone);
                     ps.setString(6,address);
                     ps.setInt(7, id);
                     if(ps.executeUpdate() > 0){
                         JOptionPane.showMessageDialog(null,"Student Data Updated");
                     }
            } catch (SQLException ex) {
                Logger.getLogger(Student.class.getName()).log(Level.SEVERE, null, ex);
            }
        }
        
        if(operation == 'd'){//  bu d silmek icin
            try {
                ps=(PreparedStatement) con.prepareStatement("DELETE FROM `student` WHERE `id` = ?");
                ps.setInt(1, id);     
               
                     if(ps.executeUpdate() > 0){
                         JOptionPane.showMessageDialog(null,"Student deleted");
                     }
            } catch (SQLException ex) {
                Logger.getLogger(Student.class.getName()).log(Level.SEVERE, null, ex);
            }
        }
    }
    public void fillStudentJtable(JTable table, String valueToSearch){
        Connection con=MyConnection.getConnection();
        PreparedStatement ps;
        try {
            ps=(PreparedStatement) con.prepareStatement("SELECT * FROM `student` WHERE CONCAT(`ad`, `soyad`,`telefon`,`adres`)LIKE ?");
        ps.setString(1,"%"+ valueToSearch+"%");
        ResultSet rs= ps.executeQuery();
            DefaultTableModel model =(DefaultTableModel) table.getModel();
            Object[] row;
            while (rs.next()) {
              row=new Object[7];
              row[0]=rs.getInt(1);
              row[1]=rs.getString(2);
              row[2]=rs.getString(3);
              row[3]=rs.getString(4);
              row[4]=rs.getString(5);
              row[5]=rs.getString(6);
              row[6]=rs.getString(7);
              model.addRow(row);
                
            }
        } catch (SQLException ex) {
            Logger.getLogger(Student.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
}
