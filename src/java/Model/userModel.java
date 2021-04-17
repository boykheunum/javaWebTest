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
public class userModel {

    public userModel() {
    }

    public String getTaiKhoan() {
        return TaiKhoan;
    }

    public void setTaiKhoan(String TaiKhoan) {
        this.TaiKhoan = TaiKhoan;
    }

    public String getMatKhau() {
        return MatKhau;
    }

    public void setMatKhau(String MatKhau) {
        this.MatKhau = MatKhau;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getImage() {
        return image;
    }

    public void setImage(String image) {
        this.image = image;
    }

    public userModel(String TaiKhoan, String MatKhau, String image) {
        this.TaiKhoan = TaiKhoan;
        this.MatKhau = MatKhau;
        this.image = image;
    }
    private String TaiKhoan;
    private String MatKhau;
    private int id;
    private String image;

    public userModel(String TaiKhoan, String MatKhau, int id, String image) {
        this.TaiKhoan = TaiKhoan;
        this.MatKhau = MatKhau;
        this.id = id;
        this.image = image;
    }
}
