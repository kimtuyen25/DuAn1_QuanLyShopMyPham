package qlsmp.Model;

public class HoaDonTimKiem {

    private String tuNgay;
    private String denNgay;

    public HoaDonTimKiem(String tuNgay, String denNgay) {

        this.tuNgay = tuNgay;
        this.denNgay = denNgay;
    }

    public HoaDonTimKiem() {
    }

    public String getTuNgay() {
        return tuNgay;
    }

    public void setTuNgay(String tuNgay) {
        this.tuNgay = tuNgay;
    }

    public String getDenNgay() {
        return denNgay;
    }

    public void setDenNgay(String denNgay) {
        this.denNgay = denNgay;
    }

    @Override
    public String toString() {
        return "HoaDonTimKiem{" + "tuNgay=" + tuNgay + ", denNgay=" + denNgay + '}';
    }

}
