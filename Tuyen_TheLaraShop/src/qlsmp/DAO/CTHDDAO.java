package qlsmp.DAO;

import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;
import qlsmp.DB.DBHelper;
import qlsmp.Model.CTHD;
import qlsmp.Model.ChiTietHD;

public class CTHDDAO {

    String SELECT_ALL = "SELECT * FROM CTHD";
    String SELECT_BY_MaHD = "SELECT * FROM CTHD where MaHD=?";
    String INSERT_SQL = "INSERT INTO CTHD(SL,GIA,MaHD,MaSP,ThanhTien, TenMau) VALUES(?,?,?,?,?,?)";
    String SELECT_TOP_1_DESC = "select top 1 with ties * from CTHD order by MaHD desc";

    public void insert(CTHD enity) {
        DBHelper.update(INSERT_SQL, enity.getSl(), enity.getGiaBan(), enity.getMaHD(), enity.getMaSP(), enity.getThanhTien(), enity.getTenmau());
    }

    public void delete(int id) {
//        DBHelper.update(DELETE_SQL, id);
    }

    public List<CTHD> selectAll() {
        return this.selectBySql(SELECT_ALL);
    }

    public List<CTHD> selectByMaHD(int id) {
        return this.selectBySql(SELECT_BY_MaHD,id);
    }

    public List<CTHD> selectTO1Desc() {
        return this.selectBySql(SELECT_TOP_1_DESC);
    }

    public List<CTHD> selectBySql(String sql, Object... args) {
        List<CTHD> list = new ArrayList<>();
        try {
            ResultSet rs = DBHelper.query(sql, args);
            while (rs.next()) {
                CTHD enity = new CTHD();
                enity.setMaCTHD(rs.getInt("MaCTHD"));
                enity.setSl(rs.getInt("SL"));
                enity.setGiaBan(rs.getFloat("GIA"));
                enity.setThanhTien(rs.getFloat("ThanhTien"));
                enity.setMaHD(rs.getInt("MaHD"));
                enity.setMaSP(rs.getInt("MaSP"));
                enity.setTenmau(rs.getString("TenMau"));
                list.add(enity);
            }
            rs.getStatement().getConnection().close();
            return list;
        } catch (Exception e) {
            throw new RuntimeException(e);
        }
    }

    public List<ChiTietHD> selectBySqlHoaDonXuat(String sql, Object... args) {
        List<ChiTietHD> list = new ArrayList<>();
        try {
            ResultSet rs = DBHelper.query(sql, args);
            while (rs.next()) {
                ChiTietHD enity = new ChiTietHD();
                enity.setMaSP(rs.getInt("MaSP"));
                enity.setTenSP(rs.getString("TenSP"));
                enity.setMauSac(rs.getString("TenMau"));
                enity.setSoLuong(rs.getInt("SL"));
                enity.setDonGia(rs.getFloat("GiaBan"));
                enity.setThanhTien(rs.getFloat("ThanhTien"));
                enity.setMaHD(rs.getInt("MaHD"));
                list.add(enity);
            }
            rs.getStatement().getConnection().close();
            return list;
        } catch (Exception e) {
            throw new RuntimeException(e);
        }
    }

    public List<ChiTietHD> getChiTietHoaDon(int id) {
        String sql = "SELECT CTHD.MaSP, sp.TenSP, CTHD.TenMau, CTHD.SL, sp.GiaBan,CTHD.ThanhTien, hd.MaHD  from CTHD \n"
                + "  INNER JOIN HOADON hd ON CTHD.MaHD = hd.MaHD\n"
                + "  INNER JOIN SANPHAM sp ON CTHD.MaSP = sp.MaSP \n"
                + "  WHERE CTHD.MaHD = ?";
        return this.selectBySqlHoaDonXuat(sql, id);
    }

    public List<ChiTietHD> getChiTietHoaDonXuat(int id) {
        String sql = "SELECT hd.MaHD, hd.NgayTao, hd.TongTien, hd.Sale, hd.ThanhTien, hd.MaNV, kh.TenKH FROM HOADON hd \n"
                + "INNER JOIN KHACHHANG kh ON hd.MaKH = kh.MaKH where MaHD = ?";
        return this.selectBySqlHoaDonXuat(sql, id);
    }

    public List<ChiTietHD> getChiTietSanPhamHoaDonXuat(int id) {
        String sql = "SELECT CTHD.MaSP, sp.TenSP, CTHD.TenMau, CTHD.SL, sp.GiaBan,CTHD.ThanhTien, hd.MaHD  from CTHD \n"
                + "  INNER JOIN HOADON hd ON CTHD.MaHD = hd.MaHD\n"
                + "  INNER JOIN SANPHAM sp ON CTHD.MaSP = sp.MaSP \n"
                + "  WHERE CTHD.MaSP = ?";
        return this.selectBySqlHoaDonXuat(sql, id);
    }

//    @Override
    public List<ChiTietHD> selectByKeyword(String ten) {
        return null;
    }
}
