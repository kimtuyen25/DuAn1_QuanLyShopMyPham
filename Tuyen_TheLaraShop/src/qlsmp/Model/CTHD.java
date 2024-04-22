package qlsmp.Model;

public class CTHD {

    int maCTHD, sl, maHD, maSP;
    float giaBan, thanhTien;
    String tenmau;

    public CTHD() {
    }

    public CTHD(int maCTHD, int sl, int maHD, int maSP, float giaBan, float thanhTien, String tenmau) {
        this.maCTHD = maCTHD;
        this.sl = sl;
        this.maHD = maHD;
        this.maSP = maSP;
        this.giaBan = giaBan;
        this.thanhTien = thanhTien;
        this.tenmau = tenmau;
    }

    public int getMaCTHD() {
        return maCTHD;
    }

    public void setMaCTHD(int maCTHD) {
        this.maCTHD = maCTHD;
    }

    public int getSl() {
        return sl;
    }

    public void setSl(int sl) {
        this.sl = sl;
    }

    public int getMaHD() {
        return maHD;
    }

    public void setMaHD(int maHD) {
        this.maHD = maHD;
    }

    public int getMaSP() {
        return maSP;
    }

    public void setMaSP(int maSP) {
        this.maSP = maSP;
    }

    public float getGiaBan() {
        return giaBan;
    }

    public void setGiaBan(float giaBan) {
        this.giaBan = giaBan;
    }

    public float getThanhTien() {
        return thanhTien;
    }

    public void setThanhTien(float thanhTien) {
        this.thanhTien = thanhTien;
    }

    public String getTenmau() {
        return tenmau;
    }

    public void setTenmau(String tenmau) {
        this.tenmau = tenmau;
    }

  
}
