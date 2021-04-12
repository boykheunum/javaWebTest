/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package conTrol;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author Admin
 */
public class CSDL {
    public static String userName ="root";
    public static String passWord="";
    public static String url ="jdbc:mysql://localhost:3306/msqlbook";
    
    public static Connection dataBaseConnection(){
        Connection cnn = null;
        try {
            Class.forName("com.mysql.jdbc.Driver");
            try {
                cnn = DriverManager.getConnection(url, userName, passWord);
            } catch (SQLException ex) {
                Logger.getLogger(CSDL.class.getName()).log(Level.SEVERE, null, ex);
            }
        } catch (ClassNotFoundException ex) {
            Logger.getLogger(CSDL.class.getName()).log(Level.SEVERE, null, ex);
        }
        return cnn;
    }
}
