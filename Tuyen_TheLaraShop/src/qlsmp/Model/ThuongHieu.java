
package qlsmp.Model;


public class ThuongHieu {
    private int maTH;
    private String tenTH;

    public ThuongHieu() {
    }

    public ThuongHieu(int maTH, String tenTH) {
        this.maTH = maTH;
        this.tenTH = tenTH;
    }

    public int getMaTH() {
        return maTH;
    }

    public void setMaTH(int maTH) {
        this.maTH = maTH;
    }

    public String getTenTH() {
        return tenTH;
    }

    public void setTenTH(String tenTH) {
        this.tenTH = tenTH;
    }
    
    
}
