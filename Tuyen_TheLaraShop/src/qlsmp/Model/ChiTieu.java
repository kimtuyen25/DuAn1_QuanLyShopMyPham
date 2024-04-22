/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package qlsmp.Model;

public class ChiTieu {

    int maPN, sl, chietKhau;
    String ngayTao, tenNV, tenNCC, tenSp, tenMau;
    double tongTien, thanhTien, giaNhap;

    public ChiTieu() {
    }

    public ChiTieu(int maPN, int sl, int chietKhau, String ngayTao, String tenNV, String tenNCC, String tenSp, String tenMau, double tongTien, double thanhTien, double giaNhap) {
        this.maPN = maPN;
        this.sl = sl;
        this.chietKhau = chietKhau;
        this.ngayTao = ngayTao;
        this.tenNV = tenNV;
        this.tenNCC = tenNCC;
        this.tenSp = tenSp;
        this.tenMau = tenMau;
        this.tongTien = tongTien;
        this.thanhTien = thanhTien;
        this.giaNhap = giaNhap;
    }

    public int getMaPN() {
        return maPN;
    }

    public void setMaPN(int maPN) {
        this.maPN = maPN;
    }

    public int getSl() {
        return sl;
    }

    public void setSl(int sl) {
        this.sl = sl;
    }

    public int getChietKhau() {
        return chietKhau;
    }

    public void setChietKhau(int chietKhau) {
        this.chietKhau = chietKhau;
    }

    public String getNgayTao() {
        return ngayTao;
    }

    public void setNgayTao(String ngayTao) {
        this.ngayTao = ngayTao;
    }

    public String getTenNV() {
        return tenNV;
    }

    public void setTenNV(String tenNV) {
        this.tenNV = tenNV;
    }

    public String getTenNCC() {
        return tenNCC;
    }

    public void setTenNCC(String tenNCC) {
        this.tenNCC = tenNCC;
    }

    public String getTenSp() {
        return tenSp;
    }

    public void setTenSp(String tenSp) {
        this.tenSp = tenSp;
    }

    public String getTenMau() {
        return tenMau;
    }

    public void setTenMau(String tenMau) {
        this.tenMau = tenMau;
    }

    public double getTongTien() {
        return tongTien;
    }

    public void setTongTien(double tongTien) {
        this.tongTien = tongTien;
    }

    public double getThanhTien() {
        return thanhTien;
    }

    public void setThanhTien(double thanhTien) {
        this.thanhTien = thanhTien;
    }

    public double getGiaNhap() {
        return giaNhap;
    }

    public void setGiaNhap(double giaNhap) {
        this.giaNhap = giaNhap;
    }

}
