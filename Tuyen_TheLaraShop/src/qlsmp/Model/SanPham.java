package qlsmp.Model;

public class SanPham {

    private int maSP, maLoai, maThuongHieu, sl;
    private String tenSP, hinh, maVach;
    private double giaBan, giaNhap;

    public SanPham() {
    }

    public SanPham(int maSP, int maLoai, int maThuongHieu, int sl, String tenSP, String hinh, String maVach, double giaBan, double giaNhap) {
        this.maSP = maSP;
        this.maLoai = maLoai;
        this.maThuongHieu = maThuongHieu;
        this.sl = sl;
        this.tenSP = tenSP;
        this.hinh = hinh;
        this.maVach = maVach;
        this.giaBan = giaBan;
        this.giaNhap = giaNhap;
    }

    public int getSl() {
        return sl;
    }

    public void setSl(int sl) {
        this.sl = sl;
    }

    public int getMaSP() {
        return maSP;
    }

    public void setMaSP(int maSP) {
        this.maSP = maSP;
    }

    public int getMaLoai() {
        return maLoai;
    }

    public void setMaLoai(int maLoai) {
        this.maLoai = maLoai;
    }

    public int getMaThuongHieu() {
        return maThuongHieu;
    }

    public void setMaThuongHieu(int maThuongHieu) {
        this.maThuongHieu = maThuongHieu;
    }

    public String getTenSP() {
        return tenSP;
    }

    public void setTenSP(String tenSP) {
        this.tenSP = tenSP;
    }

    public String getHinh() {
        return hinh;
    }

    public void setHinh(String hinh) {
        this.hinh = hinh;
    }

    public String getMaVach() {
        return maVach;
    }

    public void setMaVach(String maVach) {
        this.maVach = maVach;
    }

    public double getGiaBan() {
        return giaBan;
    }

    public void setGiaBan(double giaBan) {
        this.giaBan = giaBan;
    }

    public double getGiaNhap() {
        return giaNhap;
    }

    public void setGiaNhap(double giaNhap) {
        this.giaNhap = giaNhap;
    }

}
