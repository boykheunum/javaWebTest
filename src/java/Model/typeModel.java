/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Model;

/**
 *
 * @author Admin
 */
public class typeModel {

    public typeModel(String MaLoaiS, String TenLoaiS) {
        this.MaLoaiS = MaLoaiS;
        this.TenLoaiS = TenLoaiS;
    }

    public String getMaLoaiS() {
        return MaLoaiS;
    }

    public void setMaLoaiS(String MaLoaiS) {
        this.MaLoaiS = MaLoaiS;
    }

    public String getTenLoaiS() {
        return TenLoaiS;
    }

    public void setTenLoaiS(String TenLoaiS) {
        this.TenLoaiS = TenLoaiS;
    }

    public typeModel() {
    }
    private String MaLoaiS;
    private String TenLoaiS;
}
