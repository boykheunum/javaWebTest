/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package conTrol;

import Model.bookModel;
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
public class controlBook {

    public static int listBook(Vector<bookModel> ds) {
        Connection cnn = CSDL.dataBaseConnection();
        if (cnn == null) {
            return 1;
        } else {
            try {
                PreparedStatement ps = cnn.prepareStatement("SELECT * FROM sach");
                ResultSet rs = ps.executeQuery();
                while (rs.next()) {
                    bookModel bk = new bookModel();
                    bk.setMaS(rs.getString("MaS"));
                    bk.setTenSach(rs.getString("TenSach"));
                    bk.setMoTaNgan(rs.getString("MoTaNgan"));
                    bk.setMoTaChiTiet(rs.getString("MoTaChiTiet"));
                    bk.setMaLoaiS(rs.getString("MaLoaiS"));
                    ds.add(bk);
                }
                return 1;
            } catch (SQLException ex) {
                Logger.getLogger(controlBook.class.getName()).log(Level.SEVERE, null, ex);
                return -2;
            }

        }
    }

    public static int addBook(bookModel bk) {
        Connection cnn = CSDL.dataBaseConnection();
        if (cnn == null) {
            return -1;
        } else {
            PreparedStatement ps;
            try {
                ps = cnn.prepareStatement("INSERT INTO sach values(?,?,?,?,?)");
                ps.setString(1, bk.getMaS());
                ps.setString(2, bk.getTenSach());
                ps.setString(3, bk.getMoTaNgan());
                ps.setString(4, bk.getMoTaChiTiet());
                ps.setString(5, bk.getMaLoaiS());
                return ps.executeUpdate();
            } catch (SQLException ex) {
                Logger.getLogger(controlBook.class.getName()).log(Level.SEVERE, null, ex);
                return -2;
            }

        }
    }

    public static int deleteBook(String MaS) {
        Connection cnn = CSDL.dataBaseConnection();
        if (cnn == null) {
            return -1;
        } else {
            try {
                PreparedStatement ps = cnn.prepareStatement("DELETE FROM sach WHERE MaS = ?");
                ps.setString(1, MaS);
                return ps.executeUpdate();
            } catch (SQLException ex) {
                Logger.getLogger(controlBook.class.getName()).log(Level.SEVERE, null, ex);
                return -2;
            }
        }
    }
}
