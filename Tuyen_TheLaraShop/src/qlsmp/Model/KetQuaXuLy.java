package qlsmp.Model;

public class KetQuaXuLy {

    private String mucDich;
    private String ketLuan;
    private boolean isXuLy;

    public String getMucDich() {
        return mucDich;
    }

    public void setMucDich(String mucDich) {
        this.mucDich = mucDich;
    }

    public String getKetLuan() {
        return ketLuan;
    }

    public void setKetLuan(String ketLuan) {
        this.ketLuan = ketLuan;
    }

    public boolean isIsXuLy() {
        return isXuLy;
    }

    public void setIsXuLy(boolean isXuLy) {
        this.isXuLy = isXuLy;
    }

    public KetQuaXuLy(String mucDich, String ketLuan, boolean isXuLy) {
        this.mucDich = mucDich;
        this.ketLuan = ketLuan;
        this.isXuLy = isXuLy;
    }

    public KetQuaXuLy() {
    }
    
}
