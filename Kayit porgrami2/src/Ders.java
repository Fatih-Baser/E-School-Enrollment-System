
import com.mysql.jdbc.Connection;
import com.mysql.jdbc.PreparedStatement;

import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;

import java.sql.ResultSet;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;

import javax.swing.JComboBox;
import javax.swing.JTextField;


public class Ders {
    public static void insertUpdateDeleteStudent(char operation, Integer id,String label  ){
        Connection con=MyConnection.getConnection();
        PreparedStatement ps;
        
        if(operation == 'i'){
            try {
                ps=(PreparedStatement) con.prepareStatement("INSERT INTO `kurs`( `label`) VALUES (?)");
                ps.setString(1, label );
                
                     
                     if(ps.executeUpdate() > 0){
                         JOptionPane.showMessageDialog(null,"yeni ders kaydedildi");
                     }
            } catch (SQLException ex) {
                Logger.getLogger(Student.class.getName()).log(Level.SEVERE, null, ex);
            }
        }
        
        if(operation == 'u'){// bu u guncellemek icin 
            try {
                ps=(PreparedStatement) con.prepareStatement("UPDATE `kurs` SET `label` = ? WHERE `kursid` = ?");
                ps.setString(1, label);     
                
                     ps.setInt(2, id);
                     if(ps.executeUpdate() > 0){
                         JOptionPane.showMessageDialog(null,"Ders Data Updated");
                     }
            } catch (SQLException ex) {
                Logger.getLogger(Student.class.getName()).log(Level.SEVERE, null, ex);
            }
        }
        
        if(operation == 'd'){//  bu d silmek icin
            try {
                ps=(PreparedStatement) con.prepareStatement("DELETE FROM `kurs` WHERE `kursid` = ? ");
                ps.setInt(1, id);     
               
                     if(ps.executeUpdate() > 0){
                         JOptionPane.showMessageDialog(null,"Ders deleted");
                     }
            } catch (SQLException ex) {
                Logger.getLogger(Student.class.getName()).log(Level.SEVERE, null, ex);
            }
        }
    

}
    
public boolean isCourseExist(String courseName){
    boolean isExist =false;
    Connection con=MyConnection.getConnection();
        PreparedStatement ps;
        try {
            ps=(PreparedStatement) con.prepareStatement("SELECT * FROM `kurs` WHERE `label` = ?");
        ps.setString(1,courseName);
       
        ResultSet rs= ps.executeQuery();
           
          
            if (rs.next()) {
                        isExist=  true;
            }
            
                
           
        } catch (SQLException ex) {
            Logger.getLogger(Student.class.getName()).log(Level.SEVERE, null, ex);
        }
    
    return isExist;
}

public void fillCourseJtable(JTable table){
        Connection con=MyConnection.getConnection();
        PreparedStatement ps;
        try {
            ps=(PreparedStatement) con.prepareStatement("SELECT * FROM `kurs` ");
        
        ResultSet rs= ps.executeQuery();
            DefaultTableModel model =(DefaultTableModel) table.getModel();
            Object[] row;
            while (rs.next()) {
              row=new Object[2];
              row[0]=rs.getInt(1);
              row[1]=rs.getString(2);
              
              model.addRow(row);
                
            }
        } catch (SQLException ex) {
            Logger.getLogger(Student.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

public int getCourseId(String courseLabel){
   
    int courseId=0;
    
    Connection con=MyConnection.getConnection();
        PreparedStatement ps;
        try {
            ps=(PreparedStatement) con.prepareStatement("SELECT * FROM `kurs` WHERE `label` = ?");
        ps.setString(1,courseLabel);
       
        ResultSet rs= ps.executeQuery();
           
          
            if (rs.next()) {
                       courseId=rs.getInt("id");
            }
            
                
           
        } catch (SQLException ex) {
            Logger.getLogger(Student.class.getName()).log(Level.SEVERE, null, ex);
        }
    return courseId;
}

public void fillCourseCombo(JComboBox combo){
        Connection con=MyConnection.getConnection();
        PreparedStatement ps;
        try {
            ps=(PreparedStatement) con.prepareStatement("SELECT * FROM `kurs` ");
        
        ResultSet rs= ps.executeQuery();
           
            while (rs.next()) {
              
              
            combo.addItem(rs.getString(2));
                
            }
        } catch (SQLException ex) {
            Logger.getLogger(Student.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
public void fillCoursetextfield(String kursAdi) throws SQLException{
 
    
    Connection con=MyConnection.getConnection();
        PreparedStatement ps;
        try {
            ps=(PreparedStatement) con.prepareStatement("SELECT * FROM `kurs` WHERE `label` = ?");
        
       
        ResultSet rs= ps.executeQuery();
           
          
            if (rs.next()) {
                String label = rs.getString("label");
            }
            
                
           
        } catch (SQLException ex) {
            Logger.getLogger(Student.class.getName()).log(Level.SEVERE, null, ex);
        }
   
}

    void fillCoursetextfield(JTextField jTextField_Studentid1) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    void fillCourseJtable(JTable jTableders, String string) {
    }

    
//public void fillCourseTextField(JTextField field)
//{
//    Connection con =MyConnection.getConnection();
//    PreparedStatement ps;
//    
//    try {
//         ps=(PreparedStatement) con.prepareStatement("SELECT * FROM `kurs` WHERE `label` = ?");
//        ResultSet rs= ps.executeQuery();
//        
//        while(rs.next()){
//            field.add(rs.getInt(2));
//        }
//    }  catch (SQLException ex) {
//            Logger.getLogger(Student.class.getName()).log(Level.SEVERE, null, ex);
//    }
//            
//}

}