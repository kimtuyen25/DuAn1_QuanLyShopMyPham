package qlsmp.Model;

public class MauSac {

    private String tenMau;
    private int maMau;

    public MauSac(String tenMau, int maMau) {
        this.tenMau = tenMau;
        this.maMau = maMau;
    }

    public MauSac() {
    }

    public String getTenMau() {
        return tenMau;
    }

    public void setTenMau(String tenMau) {
        this.tenMau = tenMau;
    }

    public int getMaMau() {
        return maMau;
    }

    public void setMaMau(int maMau) {
        this.maMau = maMau;
    }

}
