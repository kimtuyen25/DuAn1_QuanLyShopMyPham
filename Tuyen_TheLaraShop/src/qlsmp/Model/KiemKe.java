package qlsmp.Model;

public class KiemKe {

    private int MaKiemKe;
    private String NgayTaoKiemKe;
    private int KyKiemKe;
    private String MucDich;
    private String KetLuan;
    private boolean DaXuLy;

    public KiemKe() {
    }

    public KiemKe(int MaKiemKe, String NgayTaoKiemKe, int KyKiemKe, String MucDich, String KetLuan, boolean DaXuLy) {
        this.MaKiemKe = MaKiemKe;
        this.NgayTaoKiemKe = NgayTaoKiemKe;
        this.KyKiemKe = KyKiemKe;
        this.MucDich = MucDich;
        this.KetLuan = KetLuan;
        this.DaXuLy = DaXuLy;
    }

    public int getMaKiemKe() {
        return MaKiemKe;
    }

    public void setMaKiemKe(int MaKiemKe) {
        this.MaKiemKe = MaKiemKe;
    }

    public String getNgayTaoKiemKe() {
        return NgayTaoKiemKe;
    }

    public void setNgayTaoKiemKe(String NgayTaoKiemKe) {
        this.NgayTaoKiemKe = NgayTaoKiemKe;
    }

    public int getKyKiemKe() {
        return KyKiemKe;
    }

    public void setKyKiemKe(int KyKiemKe) {
        this.KyKiemKe = KyKiemKe;
    }

    public String getMucDich() {
        return MucDich;
    }

    public void setMucDich(String MucDich) {
        this.MucDich = MucDich;
    }

    public String getKetLuan() {
        return KetLuan;
    }

    public void setKetLuan(String KetLuan) {
        this.KetLuan = KetLuan;
    }

    public boolean isDaXuLy() {
        return DaXuLy;
    }

    public void setDaXuLy(boolean DaXuLy) {
        this.DaXuLy = DaXuLy;
    }
    
}
