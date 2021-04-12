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
public class detailPMModel {

    public detailPMModel() {
    }

    public detailPMModel(String MaPCT, String MaPM, String MaS, int SoLuong) {
        this.MaPCT = MaPCT;
        this.MaPM = MaPM;
        this.MaS = MaS;
        this.SoLuong = SoLuong;
    }

    public String getMaPCT() {
        return MaPCT;
    }

    public void setMaPCT(String MaPCT) {
        this.MaPCT = MaPCT;
    }

    public String getMaPM() {
        return MaPM;
    }

    public void setMaPM(String MaPM) {
        this.MaPM = MaPM;
    }

    public String getMaS() {
        return MaS;
    }

    public void setMaS(String MaS) {
        this.MaS = MaS;
    }

    public int getSoLuong() {
        return SoLuong;
    }

    public void setSoLuong(int SoLuong) {
        this.SoLuong = SoLuong;
    }

    private String MaPCT;
    private String MaPM;
    private String MaS;
    private int SoLuong;
}
