
package qlsmp.Model;

/**
 *
 * @author My Laptop
 */
public class CTMau {
    private int maCTM,maSP,maMau,sl;

    public CTMau() {
    }

    public CTMau(int maCTM, int maSP, int maMau, int sl) {
        this.maCTM = maCTM;
        this.maSP = maSP;
        this.maMau = maMau;
        this.sl = sl;
    }

    public int getMaCTM() {
        return maCTM;
    }

    public void setMaCTM(int maCTM) {
        this.maCTM = maCTM;
    }

    public int getMaSP() {
        return maSP;
    }

    public void setMaSP(int maSP) {
        this.maSP = maSP;
    }

    public int getMaMau() {
        return maMau;
    }

    public void setMaMau(int maMau) {
        this.maMau = maMau;
    }

    public int getSl() {
        return sl;
    }

    public void setSl(int sl) {
        this.sl = sl;
    }
    
}
