/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package qlsmp.Model;

import java.security.*;
import java.time.LocalDate;

public class NhanVien {

    private int maNV;
    private String hoTen;
    private boolean gioiTinh;
    private String ngaySinh;
    private String diaChi;
    private String dienThoai;
    private String CCCD;
    private String Email;
    private String hinhAnh;
    private String Username;
    private String Password;
    private boolean chucVu;

    public NhanVien() {
        hinhAnh = "";
    }

    public NhanVien(int maNV, String hoTen, boolean gioiTinh, String ngaySinh, String diaChi, String dienThoai, String CCCD, String Email, String hinhAnh, String Username, String Password, boolean chucVu) {
        this.maNV = maNV;
        this.hoTen = hoTen;
        this.gioiTinh = gioiTinh;
        this.ngaySinh = ngaySinh;
        this.diaChi = diaChi;
        this.dienThoai = dienThoai;
        this.CCCD = CCCD;
        this.Email = Email;
        this.hinhAnh = hinhAnh;
        this.Username = Username;
        this.Password = Password;
        this.chucVu = chucVu;
    }

    public int getMaNV() {
        return maNV;
    }

    public void setMaNV(int maNV) {
        this.maNV = maNV;
    }

    public String getHoTen() {
        return hoTen;
    }

    public void setHoTen(String hoTen) {
        this.hoTen = hoTen;
    }

    public boolean isGioiTinh() {
        return gioiTinh;
    }

    public void setGioiTinh(boolean gioiTinh) {
        this.gioiTinh = gioiTinh;
    }

    public String getNgaySinh() {
        return ngaySinh;
    }

    public void setNgaySinh(String ngaySinh) {
        this.ngaySinh = ngaySinh;
    }

    public String getDiaChi() {
        return diaChi;
    }

    public void setDiaChi(String diaChi) {
        this.diaChi = diaChi;
    }

    public String getDienThoai() {
        return dienThoai;
    }

    public void setDienThoai(String dienThoai) {
        this.dienThoai = dienThoai;
    }

    public String getCCCD() {
        return CCCD;
    }

    public void setCCCD(String CCCD) {
        this.CCCD = CCCD;
    }

    public String getEmail() {
        return Email;
    }

    public void setEmail(String Email) {
        this.Email = Email;
    }

    public String getHinhAnh() {
        return hinhAnh;
    }

    public void setHinhAnh(String hinhAnh) {
        this.hinhAnh = hinhAnh;
    }

    public String getUsername() {
        return Username;
    }

    public void setUsername(String Username) {
        this.Username = Username;
    }

    public String getPassword() {
        return Password;
    }

    public void setPassword(String Password) {
        this.Password = Password;
    }

    public boolean isChucVu() {
        return chucVu;
    }

    public void setChucVu(boolean chucVu) {
        this.chucVu = chucVu;
    }

    public String toDate(String dateString) {
        LocalDate localDate = LocalDate.parse(dateString);
        String day = String.valueOf(localDate.getDayOfMonth());
        String month = String.valueOf(localDate.getMonthValue());
        String year = String.valueOf(localDate.getYear());

        if (String.valueOf(day).length() == 1) {
            day = "0" + day;
        }
        if (String.valueOf(month).length() == 1) {
            month = "0" + month;
        }
        return day + "/" + month + "/" + year;
    }

}
