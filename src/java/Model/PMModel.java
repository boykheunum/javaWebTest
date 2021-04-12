/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Model;

import java.sql.Date;

/**
 *
 * @author Admin
 */
public class PMModel {

    public PMModel() {
    }

    public PMModel(Date NgayMuon, Date NgayTra, String MaPM) {
        this.NgayMuon = NgayMuon;
        this.NgayTra = NgayTra;
        this.MaPM = MaPM;
    }

    public Date getNgayMuon() {
        return NgayMuon;
    }

    public void setNgayMuon(Date NgayMuon) {
        this.NgayMuon = NgayMuon;
    }

    public Date getNgayTra() {
        return NgayTra;
    }

    public void setNgayTra(Date NgayTra) {
        this.NgayTra = NgayTra;
    }

    public String getMaPM() {
        return MaPM;
    }

    public void setMaPM(String MaPM) {
        this.MaPM = MaPM;
    }
    private Date NgayMuon;
    private Date NgayTra;
    private String MaPM;
}
