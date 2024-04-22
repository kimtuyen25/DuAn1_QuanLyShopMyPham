package qlsmp.Model;

import java.time.LocalDate;
import qlsmp.DAO.*;

public class HoaDon {

    private int maHD;
    private String ngayTao;
    private float tongTien;
    private double sale;
    private float thanhTien;
    private boolean trangThai;
    private String IDAccount;
    private String IDKhachHang;
    private String TenKH;

    public HoaDon() {
    }

    public HoaDon(int maHD, String ngayTao, float tongTien, double sale, float thanhTien, boolean trangThai, String IDAccount, String IDKhachHang, String TenKH) {
        this.maHD = maHD;
        this.ngayTao = ngayTao;
        this.tongTien = tongTien;
        this.sale = sale;
        this.thanhTien = thanhTien;
        this.trangThai = trangThai;
        this.IDAccount = IDAccount;
        this.IDKhachHang = IDKhachHang;
        this.TenKH = TenKH;
    }

    public String getTenKH() {
        return TenKH;
    }

    public void setTenKH(String TenKH) {
        this.TenKH = TenKH;
    }

    public int getMaHD() {
        return maHD;
    }

    public void setMaHD(int maHD) {
        this.maHD = maHD;
    }

    public String getNgayTao() {
        return ngayTao;
    }

    public void setNgayTao(String ngayTao) {
        this.ngayTao = ngayTao;
    }

    public float getTongTien() {
        return tongTien;
    }

    public void setTongTien(float tongTien) {
        this.tongTien = tongTien;
    }

    public double getSale() {
        return sale;
    }

    public void setSale(double sale) {
        this.sale = sale;
    }

    public float getThanhTien() {
        return thanhTien = (float) (tongTien - tongTien * sale);
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

    public String getIDAccount() {
        return IDAccount;
    }

    public void setIDAccount(String IDAccount) {
        this.IDAccount = IDAccount;
    }

    public String getIDKhachHang() {
        return IDKhachHang;
    }

    public void setIDKhachHang(String IDKhachHang) {
        this.IDKhachHang = IDKhachHang;
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

    @Override
    public String toString() {
        return "HoaDon{" + "maHD=" + maHD + ", ngayTao=" + ngayTao + ", tongTien=" + tongTien + ", sale=" + sale + ", thanhTien=" + thanhTien + ", trangThai=" + trangThai + ", IDAccount=" + IDAccount + ", IDKhachHang=" + IDKhachHang + ", TenKH=" + TenKH + '}';
    }
    public int doubleToInt(double sale) {
             return (int) sale;
    }
}
