/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package conTrol;

import Model.typeModel;
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
public class controlTypeBook {

    public static int listTypeBook(Vector<typeModel> ds) {
        Connection cnn = CSDL.dataBaseConnection();
        if (cnn == null) {
            return -1;
        }else {
            try {
                PreparedStatement pst = cnn.prepareStatement("SELECT * FROM loaisach");
                ResultSet rs = pst.executeQuery();
                while (rs.next()) {
                    typeModel tb = new typeModel();
                    tb.setMaLoaiS(rs.getString("MaLoaiS"));
                    tb.setTenLoaiS(rs.getString("TenLoaiS"));
                    ds.add(tb);
                }
                return 1;
            } catch (SQLException ex) {
                Logger.getLogger(controlTypeBook.class.getName()).log(Level.SEVERE, null, ex);
                return -2;
            }

        }
    }

    public static int addTypeBook(typeModel tb) {
        Connection cnn = CSDL.dataBaseConnection();
        if (cnn == null) {
            return -1;
        } else {
            try {
                PreparedStatement pst = cnn.prepareStatement("INSERT INTO loaisach(MaLoaiS,TenLoaiS) VALUES(?,?)");
                pst.setString(1, tb.getMaLoaiS());
                pst.setString(2, tb.getTenLoaiS());
                pst.executeUpdate();
                return 1;
            } catch (SQLException ex) {
                Logger.getLogger(controlTypeBook.class.getName()).log(Level.SEVERE, null, ex);
                return -2;
            }
        }

    }

    public static int deleteType(String MS) {
        Connection cnn = CSDL.dataBaseConnection();
        if (cnn == null) {
            return -1;
        } else {
            try {
                PreparedStatement pst = cnn.prepareStatement("DELETE * FROM loaisach WHERE MaLoaiS = ?");
                pst.setString(1, MS);
                return pst.executeUpdate();
            } catch (SQLException ex) {
                Logger.getLogger(controlTypeBook.class.getName()).log(Level.SEVERE, null, ex);
                return -2;
            }
        }
    }
}
