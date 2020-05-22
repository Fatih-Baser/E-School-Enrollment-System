
import com.mysql.jdbc.Connection;
import com.mysql.jdbc.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;


public class Ogretmen {
      public void insertUpdateDeleteStudent(char operation, Integer id,String ad,String soyad,String brans,String username
                                                           ,String password){
Connection con=MyConnection.getConnection();
        PreparedStatement ps;
        
         if(operation == 'i'){
            
    try {
        ps=(PreparedStatement) con.prepareStatement("INSERT INTO user( ad , soyad , brans, username , password ) VALUES (?,?,?,?,?)");
        
                        ps.setString(1, ad);
                      ps.setString(2,soyad);
                      ps.setString(3, brans);
                   ps.setString(4,username);
                    ps.setString(5, password);
                    
                     if(ps.executeUpdate() > 0){
                         JOptionPane.showMessageDialog(null,"ogretmen kaydedildi");
                         
                     }
    } catch (SQLException ex) {
        Logger.getLogger(Ogretmen.class.getName()).log(Level.SEVERE, null, ex);
    }
               
      }
      }


      public void fillOgretmenJtable(JTable table){
        Connection con=MyConnection.getConnection();
        PreparedStatement ps;
        try {
            ps=(PreparedStatement) con.prepareStatement("SELECT * FROM `user` ");
        
        ResultSet rs= ps.executeQuery();
            DefaultTableModel model =(DefaultTableModel) table.getModel();
            Object[] row;
            while (rs.next()) {
              row=new Object[6];
              row[0]=rs.getInt(1);
              row[1]=rs.getString(2);
             row[2]=rs.getString(3);
              row[3]=rs.getString(4);
              row[4]=rs.getString(5);
              row[5]=rs.getString(6);
              
              
              model.addRow(row);
                
            }
        } catch (SQLException ex) {
            Logger.getLogger(Student.class.getName()).log(Level.SEVERE, null, ex);
        }
}

  

    
}