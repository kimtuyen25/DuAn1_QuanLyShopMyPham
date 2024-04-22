package qlsmp.Model;

public class NhanVienKiemKe {

    private String nhanVien1;
    private String nhanVien2;
    private String nhanVien3;

    public NhanVienKiemKe() {
    }

    public NhanVienKiemKe(String nhanVien1, String nhanVien2, String nhanVien3) {
        this.nhanVien1 = nhanVien1;
        this.nhanVien2 = nhanVien2;
        this.nhanVien3 = nhanVien3;
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
}
