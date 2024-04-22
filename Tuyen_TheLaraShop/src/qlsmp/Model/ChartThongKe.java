/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package qlsmp.Model;

public class ChartThongKe {

    String ngay;
    double doanhThu, chiPhi, loiNhuan;
    int slBill, slPN, slSosanh;

    public ChartThongKe() {
    }

    public ChartThongKe(String ngay, double doanhThu, double chiPhi, double loiNhuan, int slBill, int slPN, int slSosanh) {
        this.ngay = ngay;
        this.doanhThu = doanhThu;
        this.chiPhi = chiPhi;
        this.loiNhuan = loiNhuan;
        this.slBill = slBill;
        this.slPN = slPN;
        this.slSosanh = slSosanh;
    }

    public String getNgay() {
        return ngay;
    }

    public void setNgay(String ngay) {
        this.ngay = ngay;
    }

    public double getDoanhThu() {
        return doanhThu;
    }

    public void setDoanhThu(double doanhThu) {
        this.doanhThu = doanhThu;
    }

    public double getChiPhi() {
        return chiPhi;
    }

    public void setChiPhi(double chiPhi) {
        this.chiPhi = chiPhi;
    }

    public double getLoiNhuan() {
        return loiNhuan;
    }

    public void setLoiNhuan(double loiNhuan) {
        this.loiNhuan = loiNhuan;
    }

    public int getSlBill() {
        return slBill;
    }

    public void setSlBill(int slBill) {
        this.slBill = slBill;
    }

    public int getSlPN() {
        return slPN;
    }

    public void setSlPN(int slPN) {
        this.slPN = slPN;
    }

    public int getSlSosanh() {
        return slSosanh;
    }

    public void setSlSosanh(int slSosanh) {
        this.slSosanh = slSosanh;
    }

}
