
package qlsmp.Model;

public class SanPhamKiemKe {
    private int maSP;
    private String tenSP;
    private String mauSac;
    int soLuongKeToan;

    public SanPhamKiemKe() {
    }

    public SanPhamKiemKe(int maSP, String tenSP, String mauSac, int soLuongKeToan) {
        this.maSP = maSP;
        this.tenSP = tenSP;
        this.mauSac = mauSac;
        this.soLuongKeToan = soLuongKeToan;
    }

    public int getMaSP() {
        return maSP;
    }

    public void setMaSP(int maSP) {
        this.maSP = maSP;
    }

    public String getTenSP() {
        return tenSP;
    }

    public void setTenSP(String tenSP) {
        this.tenSP = tenSP;
    }

    public String getMauSac() {
        return mauSac;
    }

    public void setMauSac(String mauSac) {
        this.mauSac = mauSac;
    }

    public int getSoLuongKeToan() {
        return soLuongKeToan;
    }

    public void setSoLuongKeToan(int soLuongKeToan) {
        this.soLuongKeToan = soLuongKeToan;
    }
    
    
}
