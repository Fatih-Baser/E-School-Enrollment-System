
import com.mysql.jdbc.Connection;
import com.mysql.jdbc.Statement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;

public class MyFunction {
    public static int countData(String tableName){
        int total =0;
        Connection con=MyConnection.getConnection();
       Statement st;
        try {
            st = (Statement) con.createStatement();
            ResultSet rs= st.executeQuery("SELECT COUNT(*) AS 'sistem' FROM  "+tableName);
            while (rs.next()) {
                
           total = rs.getInt(1);  
                
            }
        } catch (SQLException ex) {
            Logger.getLogger(MyFunction.class.getName()).log(Level.SEVERE, null, ex);
        }
       
       
        return  total;
    }
}
