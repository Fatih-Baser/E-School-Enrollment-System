
import com.mysql.jdbc.Connection;
import com.mysql.jdbc.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;


public class score {
    
        public void insertUpdateDeleteStudent(char operation, Integer Sid,Integer Cid,double scr,String descp  ){
        Connection con=MyConnection.getConnection();
        PreparedStatement ps;
        
        if(operation == 'i'){
            try {
                ps=(PreparedStatement) con.prepareStatement("INSERT INTO `puan`(`student_id`, `kurs_id`, `student_puan`, `description`) VALUES (?,?,?,?)");
                ps.setInt(1, Sid );
                ps.setInt(2, Cid);
                ps.setDouble(3, scr);
                ps.setString(4, descp);
           
                
                     
                     if(ps.executeUpdate() > 0){
                         JOptionPane.showMessageDialog(null,"puani eklendi");
                     }
            } catch (SQLException ex) {
                Logger.getLogger(Student.class.getName()).log(Level.SEVERE, null, ex);
            }
        }
        
//        if(operation == 'u'){// bu u guncellemek icin 
//            try {
//                ps=(PreparedStatement) con.prepareStatement("UPDATE `kurs` SET `label` = ? WHERE `id` = ?");
//                ps.setString(1, label);     
//                
//                     ps.setInt(2, id);
//                     if(ps.executeUpdate() > 0){
//                         JOptionPane.showMessageDialog(null,"Ders Data Updated");
//                     }
//            } catch (SQLException ex) {
//                Logger.getLogger(Student.class.getName()).log(Level.SEVERE, null, ex);
//            }
//        }
//        
//        if(operation == 'd'){//  bu d silmek icin
//            try {
//                ps=(PreparedStatement) con.prepareStatement("DELETE FROM `kurs` WHERE `id` = ? ");
//                ps.setInt(1, id);     
//               
//                     if(ps.executeUpdate() > 0){
//                         JOptionPane.showMessageDialog(null,"Ders deleted");
//                     }
//            } catch (SQLException ex) {
//                Logger.getLogger(Student.class.getName()).log(Level.SEVERE, null, ex);
//            }
//        }
//    

}
        public void fillScoreJtable(JTable table){
        Connection con=MyConnection.getConnection();
        PreparedStatement ps;
        try {
            ps=(PreparedStatement) con.prepareStatement("SELECT * FROM `puan` ");
        
        ResultSet rs= ps.executeQuery();
            DefaultTableModel model =(DefaultTableModel) table.getModel();
            Object[] row;
            while (rs.next()) {
              row=new Object[4];
              row[0]=rs.getInt(1);
              row[1]=rs.getInt(2);
              row[2]=rs.getDouble(3);
              row[3] =rs.getString(4);
              
             
              model.addRow(row);
                
            }
        } catch (SQLException ex) {
            Logger.getLogger(Student.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
         public void fillScoreJtable2(JTable table1,String valueToSearch){
        Connection con=MyConnection.getConnection();
        PreparedStatement ps;
        try {
           ps=(PreparedStatement) con.prepareStatement("SELECT * FROM `puan` WHERE CONCAT(`student_id`)LIKE ?");
        ps.setString(1,"%"+ valueToSearch+"%");
        
        ResultSet rs= ps.executeQuery();
            DefaultTableModel model =(DefaultTableModel) table1.getModel();
            Object[] row;
            while (rs.next()) {
              row=new Object[4];
              row[0]=rs.getInt(1);
            row[1]=rs.getInt(2);
            row[2]=rs.getDouble(3);
            row[3] =rs.getString(4);
             
              model.addRow(row);
                
            }
        } catch (SQLException ex) {
            Logger.getLogger(Student.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    void insertUpdateDeleteStudent(char c, int stdId, int crsId, double scr) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    void fillScoreJtable(JTable jTable4, String text) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    
}
