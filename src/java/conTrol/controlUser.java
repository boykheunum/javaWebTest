/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package conTrol;

import Model.userModel;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.Vector;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author Admin
 */
public class controlUser {

    public static int listUser(Vector ds) {
        Connection cnn = CSDL.dataBaseConnection();
        if (cnn == null) {
            return -1;
        } else {
            try {
                PreparedStatement sql = cnn.prepareStatement("SELECT * FROM user");
                ResultSet rs = sql.executeQuery();
                while (rs.next()) {
                    userModel u = new userModel();
                    u.setTaiKhoan(rs.getString("TaiKhoan"));
                    u.setMatKhau(rs.getString("MatKhau"));
                    u.setId(rs.getInt("id"));
                    u.setImage(rs.getString("image"));
                    ds.add(u);
                }
                return 1;
            } catch (SQLException ex) {
                Logger.getLogger(controlUser.class.getName()).log(Level.SEVERE, null, ex);
                return -2;
            }

        }
    }

    public static int login(userModel u) {
        Connection cnn = CSDL.dataBaseConnection();
        if (cnn == null) {
            return -1;
        } else {
            try {
                String Sql = "SELECT * FROM user WHERE TaiKhoan=? AND MatKhau=?";
                PreparedStatement sql = cnn.prepareStatement(Sql);
                sql.setString(1, u.getTaiKhoan());
                sql.setString(2, u.getMatKhau());
                ResultSet rs = sql.executeQuery();
                if (rs.next()) {
                    return 1;
                } else {
                    return 0;
                }
            } catch (SQLException ex) {
                Logger.getLogger(controlUser.class.getName()).log(Level.SEVERE, null, ex);
                return -2;
            }

        }
    }
    public static int searchTK(String tk){
        Connection cnn = CSDL.dataBaseConnection();
        if(cnn == null){
            return -1;
        }else{
            String Sql = "SELECT * FROM user WHERE TaiKhoan=?";
            try {
                PreparedStatement sql = cnn.prepareStatement(Sql);
                sql.setString(1, tk);
                return sql.executeUpdate();
            } catch (SQLException ex) {
                Logger.getLogger(controlUser.class.getName()).log(Level.SEVERE, null, ex);
                return -2;
            }
        }
    }
    public static int DoiMK(userModel us){
        Connection cnn = CSDL.dataBaseConnection();
        if(cnn == null){
            return -1;
        }else{
            String Sql = "UPDATE user SET MatKhau = ? WHERE TaiKhoan = ?";
            try {
                PreparedStatement sql = cnn.prepareStatement(Sql);
                sql.setString(1, us.getMatKhau());
                sql.setString(2, us.getTaiKhoan());
                return sql.executeUpdate();
            } catch (SQLException ex) {
                Logger.getLogger(controlUser.class.getName()).log(Level.SEVERE, null, ex);
                return -2;
            }
        }
    }
    public static int addUser(userModel us){
        Connection cnn = CSDL.dataBaseConnection();
        if(cnn == null){
         return -1;
        }else{
            PreparedStatement ps;
            try {
                ps = cnn.prepareStatement("INSERT INTO user(TaiKhoan,MatKhau,image) VALUES(?, ?, ?)");
                ps.setString(1, us.getTaiKhoan());
                ps.setString(2, us.getTaiKhoan());
                ps.setString(3, us.getImage());
                return ps.executeUpdate();
            } catch (SQLException ex) {
                Logger.getLogger(controlUser.class.getName()).log(Level.SEVERE, null, ex);
                return -2;
            }
            
        }
    }
}
