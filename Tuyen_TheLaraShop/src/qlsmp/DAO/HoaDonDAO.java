package qlsmp.DAO;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;
import qlsmp.DB.DBHelper;
import qlsmp.Model.HoaDon;
import qlsmp.Model.HoaDon;
import qlsmp.Model.HoaDonTimKiem;

/**
 *
 * @author My Laptop
 */
public class HoaDonDAO extends ShopMyPhamDAO<HoaDon, String> {

    String SELECT_ALL = "SELECT MaHD, NgayTao, TongTien, Sale, ThanhTien, TrangThai, MaNV, MaKH FROM HOADON ";
    String INSERT_SQL = "SET IDENTITY_INSERT HOADON ON;INSERT INTO HOADON(MaHD,NgayTao, TongTien, Sale, ThanhTien, TrangThai, MaNV, MaKH) VALUES(?,?,?,?,?,?,?,?)";
    String SELECT_BY_ID_SQL = "SELECT NgayTao, TongTien, Sale, ThanhTien, TrangThai, MaNV, MaKH FROM SANPHAM WHERE MaHD=?";
    String SELECT_TOP1_DESC = "select top 1 with ties MaHD,NgayTao,TongTien,Sale,ThanhTien,TrangThai,MaNV,MaKH from HOADON order by MaHD desc";
    String SELECT_ALL_BETWEEN_AND = "SELECT * FROM HOADON WHERE NgayTao BETWEEN ? AND ?";
    String SELECT_ALL_MONTH = "SELECT MaHD, NgayTao, TongTien, Sale, ThanhTien, TrangThai, MaNV, MaKH FROM HOADON where MOnth(NgayTao) >= Month(GETDATE()) and Year(NgayTao) = Year(GETDATE())";
    String SELECT_ALL_DAY = "select COUNT(*) from HOADON WHERE Day(NgayTao) = Day(GETDATE()) and MONTH(NgayTao) = MONTH(GETDATE()) AND YEAR(NgayTao) = YEAR(GETDATE())";
    String DELETE_SQL = "  DELETE FROM HoaDon WHERE MaHD =?";

    @Override
    public void insert(HoaDon enity) {
        DBHelper.update(INSERT_SQL, enity.getMaHD(), enity.getNgayTao(), enity.getTongTien(), enity.getSale(), enity.getThanhTien(), enity.isTrangThai(), enity.getIDAccount(), enity.getIDKhachHang());
    }

    @Override
    public void update(HoaDon enity) {
        //HÓA ĐƠN KHÔNG CHO UPDATE
    }

    @Override
    public void delete(int id) {
        DBHelper.update(DELETE_SQL, id);
    }

    @Override
    public HoaDon selecteByID(int id) {
        List<HoaDon> list = this.selectBySql(SELECT_BY_ID_SQL, id);
        if (list.isEmpty()) {
            return null;
        }
        return list.get(0);
    }

    public HoaDon selecteTOP1DESC() {
        List<HoaDon> list = this.selectBySql(SELECT_TOP1_DESC);
        if (list.isEmpty()) {
            return null;
        }
        return list.get(0);
    }

    public List<HoaDon> selectBetweenAnd(String tuNgay, String denNgay) {
        return this.selectBySql(SELECT_ALL_BETWEEN_AND, tuNgay, denNgay);
    }
// để tìm kiếm

    @Override
    public List<HoaDon> selectBySql(String sql, Object... args) {
        List<HoaDon> list = new ArrayList<>();
        try {
            ResultSet rs = DBHelper.query(sql, args);
            while (rs.next()) {
                HoaDon enity = new HoaDon();
                enity.setMaHD(rs.getInt("MaHD"));
                enity.setNgayTao(rs.getString("NgayTao"));
                enity.setTongTien(rs.getFloat("TongTien"));
                enity.setSale(rs.getDouble("Sale"));
                enity.setThanhTien(rs.getFloat("ThanhTien"));
                enity.setTrangThai(rs.getBoolean("TrangThai"));
                enity.setIDAccount(rs.getString("MaNV"));
                enity.setIDKhachHang(rs.getString("MaKH"));
                list.add(enity);
            }
            rs.getStatement().getConnection().close();
            return list;
        } catch (Exception e) {
            throw new RuntimeException(e);
        }
    }

//    @Override
//    public HoaDon selectByKeyword(String keyword) {
//        Connection con = DBHelper.getDBConnection();
//        return null;
//    }
    @Override
    public List<HoaDon> selectByKeyword(String ten) {
        return null;
    }

    @Override
    public List<HoaDon> selectAll() {
        return this.selectBySql(SELECT_ALL);
    }

    public List<HoaDon> selectAllMonth() {
        return this.selectBySql(SELECT_ALL_MONTH);
    }

    private List<Object[]> getListOfArray(String sql, String[] cols, Object... args) {
        try {
            List<Object[]> list = new ArrayList<>();
            ResultSet rs = DBHelper.query(sql, args);
            while (rs.next()) {
                Object[] vals = new Object[cols.length];
                for (int i = 0; i < cols.length; i++) {
                    vals[i] = rs.getObject(cols[i]);
                }
                list.add(vals);
            }
            rs.getStatement().getConnection().close();
            return list;
        } catch (Exception e) {
            System.out.println(e);
            throw new RuntimeException();
        }
    }

    public List<Object[]> getHoaDonTheoNam(String date) {
        String sql = "{CALL sp_HoaDonTheoNam(?)}";
        String[] cols = {"MaHD", "NgayTao", "TongTien", "Sale", "ThanhTien", "TrangThai", "MaNV", "MaKH"};
        return this.getListOfArray(sql, cols, date);
    }

    public List<Object[]> getHoaDonTheoThang(String date) {
        String sql = "{CALL sp_HoaDonTheoThang(?)}";
        String[] cols = {"MaHD", "NgayTao", "TongTien", "Sale", "ThanhTien", "TrangThai", "MaNV", "MaKH"};
        return this.getListOfArray(sql, cols, date);
    }

    public List<Object[]> getHoaDonTheoNgay(String date) {
        String sql = "{CALL sp_HoaDonTheoNgay(?)}";
        String[] cols = {"MaHD", "NgayTao", "TongTien", "Sale", "ThanhTien", "TrangThai", "MaNV", "MaKH"};
        return this.getListOfArray(sql, cols, date);
    }

    public List<Object[]> getHoaDonBHTheoThang(String date) {
        String sql = "{CALL doanhThu_Thang(?)}";
        String[] cols = {"MaHD", "NgayTao", "TongTien", "Sale", "ThanhTien", "TrangThai", "MaNV", "MaKH"};
        return this.getListOfArray(sql, cols, date);
    }

    public List<Object[]> getHoaDonBHTheoNam(String date) {
        String sql = "{CALL doanhThu_Nam(?)}";
        String[] cols = {"MaHD", "NgayTao", "TongTien", "Sale", "ThanhTien", "TrangThai", "MaNV", "MaKH"};
        return this.getListOfArray(sql, cols, date);
    }

    public List<HoaDon> selectNgayNhap(String date) {
        String sql = "SELECT * from HOADON WHERE NgayTao = '";
        sql += date + "'";
        return this.selectBySql(sql);
    }

    public List<HoaDon> selectBySqlHoaDon(String sql, Object... args) {
        List<HoaDon> list = new ArrayList<>();
        try {
            ResultSet rs = DBHelper.query(sql, args);
            while (rs.next()) {
                HoaDon enity = new HoaDon();
                enity.setMaHD(rs.getInt("MaHD"));
                enity.setNgayTao(rs.getString("NgayTao"));
                enity.setTongTien(rs.getFloat("TongTien"));
                enity.setSale(rs.getDouble("Sale"));
                enity.setThanhTien(rs.getFloat("ThanhTien"));
                enity.setIDAccount(rs.getString("MaNV"));
                enity.setTenKH(rs.getString("TenKH"));
                list.add(enity);
            }
            rs.getStatement().getConnection().close();
            return list;
        } catch (Exception e) {
            throw new RuntimeException(e);
        }
    }

    public List<HoaDon> selectHoaDonXuat() {
        String sql = "	  SELECT hd.MaHD, hd.NgayTao, hd.TongTien, hd.Sale, hd.ThanhTien, hd.MaNV, kh.TenKH\n"
                + "	  FROM HOADON hd INNER JOIN KHACHHANG kh ON hd.MaKH = kh.MaKH\n";
        return this.selectBySqlHoaDon(sql);
    }

    public List<HoaDon> getIDHoaDonXuat(int Id) {
        String sql = "	  SELECT hd.MaHD, hd.NgayTao, hd.TongTien, hd.Sale, hd.ThanhTien, hd.MaNV, kh.TenKH\n"
                + "	  FROM HOADON hd INNER JOIN KHACHHANG kh ON hd.MaKH = kh.MaKH\n"
                + "	  WHERE MaHD = ? ORDER BY MaHD asc";
        return this.selectBySqlHoaDon(sql, Id);
    }

    public List<HoaDon> timKiemHoaDon(HoaDonTimKiem hoaDonTimKiem) {
        String sql = "SELECT hd.MaHD, hd.NgayTao, hd.TongTien, hd.Sale, hd.ThanhTien, hd.MaNV, kh.TenKH\n"
                + "	  FROM HOADON hd INNER JOIN KHACHHANG kh ON hd.MaKH = kh.MaKH WHERE ";

        System.out.println(hoaDonTimKiem.getDenNgay() + "---" + hoaDonTimKiem.getTuNgay());

        int count = 0;

        if (hoaDonTimKiem.getTuNgay() != null && !hoaDonTimKiem.getTuNgay().isBlank()) {
            if (count > 0) {
                sql += " and ";
            }
            count++;
            sql += "NgayTao >= '" + hoaDonTimKiem.getTuNgay() + "'";
        }

        if (hoaDonTimKiem.getDenNgay() != null && !hoaDonTimKiem.getDenNgay().isBlank()) {
            if (count > 0) {
                sql += " and ";
            }
            count++;
            sql += "NgayTao <= '" + hoaDonTimKiem.getDenNgay() + "'";
        }

        if (sql.endsWith("WHERE ")) {
            return selectHoaDonXuat();
        }

        List<HoaDon> list = new ArrayList<>();
        try {
            ResultSet rs = DBHelper.query(sql);
            while (rs.next()) {
                HoaDon enity = new HoaDon();
                enity.setMaHD(rs.getInt("MaHD"));
                enity.setNgayTao(rs.getString("NgayTao"));
                enity.setTongTien(rs.getFloat("TongTien"));
                enity.setSale(rs.getDouble("Sale"));
                enity.setThanhTien(rs.getFloat("ThanhTien"));
                enity.setIDAccount(rs.getString("MaNV"));
                enity.setTenKH(rs.getString("TenKH"));
                list.add(enity);
            }
            rs.getStatement().getConnection().close();
            return list;
        } catch (Exception e) {
            throw new RuntimeException(e);
        }
    }

    public List<HoaDon> gettHoaDonXuat(int id) {
        String sql = "SELECT hd.MaHD, hd.NgayTao, hd.TongTien, hd.Sale, hd.ThanhTien, hd.MaNV, kh.TenKH\n"
                + "	  FROM HOADON hd INNER JOIN KHACHHANG kh ON hd.MaKH = kh.MaKH\n"
                + "	  ORDER BY MaHD asc";
        return this.selectBySql(sql, id);
    }
}
