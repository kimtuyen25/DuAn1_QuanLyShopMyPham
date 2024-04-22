/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package qlsmp.Model;

public class PhieuNhap {

    int maPN, MaNV, MaNCC, chietKhau;
    String ngayTao;
    float thanhTien, tongTien;
    boolean trangThai;

    public PhieuNhap(int maPN, int MaNV, int MaNCC, int chietKhau, String ngayTao, float tongTien, float thanhTien, boolean trangThai) {
        this.maPN = maPN;
        this.MaNV = MaNV;
        this.MaNCC = MaNCC;
        this.chietKhau = chietKhau;
        this.ngayTao = ngayTao;
        this.tongTien = tongTien;
        this.thanhTien = thanhTien;
        this.trangThai = trangThai;
    }

    public PhieuNhap() {
    }

    public float getTongTien() {
        return tongTien;
    }

    public void setTongTien(float tongTien) {
        this.tongTien = tongTien;
    }

    public int getMaPN() {
        return maPN;
    }

    public void setMaPN(int maPN) {
        this.maPN = maPN;
    }

    public int getMaNV() {
        return MaNV;
    }

    public void setMaNV(int MaNV) {
        this.MaNV = MaNV;
    }

    public int getMaNCC() {
        return MaNCC;
    }

    public void setMaNCC(int MaNCC) {
        this.MaNCC = MaNCC;
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

    public float getThanhTien() {
        return thanhTien = tongTien - tongTien * chietKhau / 100;
    }

    public void setThanhTien(float thanhTien) {
        this.thanhTien = thanhTien;
    }

    public boolean isTrangThai() {
        return trangThai;
    }

    public void setTrangThai(boolean trangThai) {
        this.trangThai = trangThai;
    }

}
