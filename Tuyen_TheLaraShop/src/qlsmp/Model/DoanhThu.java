/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package qlsmp.Model;

public class DoanhThu {
    int maHD,sl;
    double tongTien,sale,thanhTien,giaBan;
    String ngayTao,tenNV,tenKH,tenSP,tenMau;

    public DoanhThu(int maHD, int sl, double tongTien, double sale, double thanhTien, double giaBan, String ngayTao, String tenNV, String tenKH, String tenSP, String tenMau) {
        this.maHD = maHD;
        this.sl = sl;
        this.tongTien = tongTien;
        this.sale = sale;
        this.thanhTien = thanhTien;
        this.giaBan = giaBan;
        this.ngayTao = ngayTao;
        this.tenNV = tenNV;
        this.tenKH = tenKH;
        this.tenSP = tenSP;
        this.tenMau = tenMau;
    }

    public DoanhThu() {
    }

    public int getMaHD() {
        return maHD;
    }

    public void setMaHD(int maHD) {
        this.maHD = maHD;
    }

    public int getSl() {
        return sl;
    }

    public void setSl(int sl) {
        this.sl = sl;
    }

    public double getTongTien() {
        return tongTien;
    }

    public void setTongTien(double tongTien) {
        this.tongTien = tongTien;
    }

    public double getSale() {
        return sale;
    }

    public void setSale(double sale) {
        this.sale = sale;
    }

    public double getThanhTien() {
        return thanhTien;
    }

    public void setThanhTien(double thanhTien) {
        this.thanhTien = thanhTien;
    }

    public double getGiaBan() {
        return giaBan;
    }

    public void setGiaBan(double giaBan) {
        this.giaBan = giaBan;
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

    public String getTenKH() {
        return tenKH;
    }

    public void setTenKH(String tenKH) {
        this.tenKH = tenKH;
    }

    public String getTenSP() {
        return tenSP;
    }

    public void setTenSP(String tenSP) {
        this.tenSP = tenSP;
    }

    public String getTenMau() {
        return tenMau;
    }

    public void setTenMau(String tenMau) {
        this.tenMau = tenMau;
    }
    
    
}
