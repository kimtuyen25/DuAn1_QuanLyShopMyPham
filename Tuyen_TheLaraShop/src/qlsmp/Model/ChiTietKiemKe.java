package qlsmp.Model;

public class ChiTietKiemKe {

    private int maSP;
    private String tenSP;
    private int slThucTe;
    private int slKeToan;
    private int chenhLech;
    private String loaiXuLy;
    private String mauSac;
    private String nhanVien1;
    private String nhanVien2;
    private String nhanVien3;
    private String mucDich;
    private String ketLuan;
    private int MaSPham_MSac;
    private int maKK;

    public ChiTietKiemKe() {
    }

    public ChiTietKiemKe(int maSP, String tenSP, int slThucTe, int slKeToan, int chenhLech, String loaiXuLy, String mauSac, String nhanVien1, String nhanVien2, String nhanVien3) {
        this.maSP = maSP;
        this.tenSP = tenSP;
        this.slThucTe = slThucTe;
        this.slKeToan = slKeToan;
        this.chenhLech = chenhLech;
        this.loaiXuLy = loaiXuLy;
        this.mauSac = mauSac;
        this.nhanVien1 = nhanVien1;
        this.nhanVien2 = nhanVien2;
        this.nhanVien3 = nhanVien3;
    }

    public ChiTietKiemKe(String nhanVien1, String nhanVien2, String nhanVien3) {
        this.nhanVien1 = nhanVien1;
        this.nhanVien2 = nhanVien2;
        this.nhanVien3 = nhanVien3;
    }

    public ChiTietKiemKe(int maSP, String tenSP, int slThucTe, int slKeToan, int chenhLech, String loaiXuLy, String mauSac) {
        this.maSP = maSP;
        this.tenSP = tenSP;
        this.slThucTe = slThucTe;
        this.slKeToan = slKeToan;
        this.chenhLech = chenhLech;
        this.loaiXuLy = loaiXuLy;
        this.mauSac = mauSac;
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

    public int getSlThucTe() {
        return slThucTe;
    }

    public void setSlThucTe(int slThucTe) {
        this.slThucTe = slThucTe;
    }

    public int getSlKeToan() {
        return slKeToan;
    }

    public void setSlKeToan(int slKeToan) {
        this.slKeToan = slKeToan;
    }

    public int getChenhLech() {
        return chenhLech;
    }

    public void setChenhLech(int chenhLech) {
        this.chenhLech = chenhLech;
    }

    public String getLoaiXuLy() {
        return loaiXuLy;
    }

    public void setLoaiXuLy(String loaiXuLy) {
        this.loaiXuLy = loaiXuLy;
    }

    public String getMauSac() {
        return mauSac;
    }

    public void setMauSac(String mauSac) {
        this.mauSac = mauSac;
    }

    public String getNhanVien1() {
        return nhanVien1;
    }

    public void setNhanVien1(String nhanVien1) {
        this.nhanVien1 = nhanVien1;
    }

    public String getNhanVien2() {
        return nhanVien2;
    }

    public void setNhanVien2(String nhanVien2) {
        this.nhanVien2 = nhanVien2;
    }

    public String getNhanVien3() {
        return nhanVien3;
    }

    public void setNhanVien3(String nhanVien3) {
        this.nhanVien3 = nhanVien3;
    }

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

    public int getMaSPham_MSac() {
        return MaSPham_MSac;
    }

    public void setMaSPham_MSac(int MaSPham_MSac) {
        this.MaSPham_MSac = MaSPham_MSac;
    }

    public int getMaKK() {
        return maKK;
    }

    public void setMaKK(int maKK) {
        this.maKK = maKK;
    }
}
