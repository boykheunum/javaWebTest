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
public class bookModel {

    public bookModel(String MaS, String TenSach, String MoTaNgan, String MoTaChiTiet, String MaLoaiS) {
        this.MaS = MaS;
        this.TenSach = TenSach;
        this.MoTaNgan = MoTaNgan;
        this.MoTaChiTiet = MoTaChiTiet;
        this.MaLoaiS = MaLoaiS;
    }

    public bookModel() {
    }

    public String getMaS() {
        return MaS;
    }

    public void setMaS(String MaS) {
        this.MaS = MaS;
    }

    public String getTenSach() {
        return TenSach;
    }

    public void setTenSach(String TenSach) {
        this.TenSach = TenSach;
    }

    public String getMoTaNgan() {
        return MoTaNgan;
    }

    public void setMoTaNgan(String MoTaNgan) {
        this.MoTaNgan = MoTaNgan;
    }

    public String getMoTaChiTiet() {
        return MoTaChiTiet;
    }

    public void setMoTaChiTiet(String MoTaChiTiet) {
        this.MoTaChiTiet = MoTaChiTiet;
    }

    public String getMaLoaiS() {
        return MaLoaiS;
    }

    public void setMaLoaiS(String MaLoaiS) {
        this.MaLoaiS = MaLoaiS;
    }

    private String MaS;
    private String TenSach;
    private String MoTaNgan;
    private String MoTaChiTiet;
    private String MaLoaiS;
}
