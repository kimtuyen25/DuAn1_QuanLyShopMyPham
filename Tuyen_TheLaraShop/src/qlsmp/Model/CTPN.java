/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package qlsmp.Model;

/**
 *
 * @author My Laptop
 */
public class CTPN {
    int maCTPN, sl,MaPN,MaSP;
    String tenMau;
    float giaNhap,ThanhTien;

    public CTPN() {
    }

    public CTPN(int maCTPN, int sl, int MaPN, int MaSP, String tenMau, float giaNhap, float ThanhTien) {
        this.maCTPN = maCTPN;
        this.sl = sl;
        this.MaPN = MaPN;
        this.MaSP = MaSP;
        this.tenMau = tenMau;
        this.giaNhap = giaNhap;
        this.ThanhTien = ThanhTien;
    }

    
    public int getMaCTPN() {
        return maCTPN;
    }

    public void setMaCTPN(int maCTPN) {
        this.maCTPN = maCTPN;
    }

    public int getSl() {
        return sl;
    }

    public void setSl(int sl) {
        this.sl = sl;
    }

    public int getMaPN() {
        return MaPN;
    }

    public void setMaPN(int MaPN) {
        this.MaPN = MaPN;
    }

    public int getMaSP() {
        return MaSP;
    }

    public void setMaSP(int MaSP) {
        this.MaSP = MaSP;
    }

    public String getTenMau() {
        return tenMau;
    }

    public void setTenMau(String tenMau) {
        this.tenMau = tenMau;
    }

    public float getGiaNhap() {
        return giaNhap;
    }

    public void setGiaNhap(float giaNhap) {
        this.giaNhap = giaNhap;
    }

    public float getThanhTien() {
        return ThanhTien;
    }

    public void setThanhTien(float ThanhTien) {
        this.ThanhTien = ThanhTien;
    }
    
    
}
