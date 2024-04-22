package qlsmp.DAO;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;
import qlsmp.DB.DBHelper;
import qlsmp.Model.KhachHang;

/**
 *
 * @author My Laptop
 */
public class KhachHangDAO {

    String SELECT_ALL = "SELECT MaKH,TenKH,GioiTinh,NgaySinh,DiaChi,SDT FROM KHACHHANG";
    String UPDATE_SQL = "UPDATE KHACHHANG SET TenKH=?, GioiTinh=?, NgaySinh=?,DiaChi=?,SDT=? WHERE MaKH=?";
    String INSERT_SQL = "INSERT INTO KHACHHANG(TenKH,GioiTinh,NgaySinh,DiaChi,SDT) VALUES(?,?,?,?,?)";
    String DELETE_SQL = "DELETE KHACHHANG WHERE MaKH=?";
    String SELECT_BY_ID_SQL = "SELECT MaKH,TenKH,GioiTinh,NgaySinh,DiaChi,SDT  FROM KHACHHANG WHERE MaKH=?";
    String SELECT_BY_SDT_SQL = "SELECT MaKH,TenKH,GioiTinh,NgaySinh,DiaChi,SDT  FROM KHACHHANG WHERE SDT like ?";

    String INSERT2_SQL = "INSERT INTO KHACHHANG(TenKH,GioiTinh,NgaySinh,DiaChi,SDT) VALUES(?,?,?,?,?)";

    public void insert(KhachHang enity) {
        DBHelper.update(INSERT_SQL, enity.getTenKH(), enity.isGioiTinh(), enity.getNgaySinh(), enity.getDiaChi(), enity.getSDT());
    }

    public void update(KhachHang enity) {
        DBHelper.update(UPDATE_SQL, enity.getTenKH(), enity.isGioiTinh(), enity.getNgaySinh(), enity.getDiaChi(), enity.getSDT(), enity.getMaKH());
    }

    public void delete(int id) {
        DBHelper.update(DELETE_SQL, id);
    }

    public KhachHang selecteByID(int id) {
        List<KhachHang> list = this.selectBySql(SELECT_BY_ID_SQL, id);
        if (list.isEmpty()) {
            return null;
        }
        return list.get(0);
    }

    public KhachHang selecteBySDT(String sdt) {
        List<KhachHang> list = this.selectBySql(SELECT_BY_SDT_SQL, sdt);
        if (list.isEmpty()) {
            return null;
        }
        return list.get(0);
    }
// để tìm kiếm

    public List<KhachHang> selectBySql(String sql, Object... args) {
        List<KhachHang> list = new ArrayList<>();
        try {
            ResultSet rs = DBHelper.query(sql, args);
            while (rs.next()) {
                KhachHang enity = new KhachHang();
                enity.setMaKH(rs.getInt("MaKH"));
                enity.setTenKH(rs.getString("TenKH"));
                enity.setGioiTinh(rs.getBoolean("GioiTinh"));
                enity.setNgaySinh(rs.getString("NgaySinh"));
                enity.setDiaChi(rs.getString("DiaChi"));
                enity.setSDT(rs.getString("SDT"));
                list.add(enity);
            }
            rs.getStatement().getConnection().close();
            return list;
        } catch (Exception e) {
            throw new RuntimeException(e);
        }
    }

    public KhachHang selectByKeyword(String keyword) {
        Connection con = DBHelper.getDBConnection();
        String sql = SELECT_ALL + " WHERE SDT like N'" + keyword + "'";
        try {
            Statement st = con.createStatement();
            ResultSet rs = st.executeQuery(sql);
            while (rs.next()) {
                KhachHang enity = new KhachHang();
                enity.setMaKH(rs.getInt("MaKH"));
                enity.setTenKH(rs.getString("TenKH"));
                enity.setGioiTinh(rs.getBoolean("GioiTinh"));
                enity.setNgaySinh(rs.getString("NgaySinh"));
                enity.setDiaChi(rs.getString("DiaChi"));
                enity.setSDT(rs.getString("SDT"));
                return enity;
            }
        } catch (Exception e) {
        }
        return null;
    }

    public List<KhachHang> selectByKeyWord(String keyword) {
        String sql = "SELECT * FROM KHACHHANG WHERE TenKH LIKE ?";
        return this.selectBySql(sql, "%" + keyword + "%");
    }

    public List<KhachHang> selectAll() {
        return this.selectBySql(SELECT_ALL);
    }

    public void insert2(KhachHang enity) {
        DBHelper.update(INSERT2_SQL, enity.getTenKH(), enity.isGioiTinh(), enity.getNgaySinh(), enity.getDiaChi(), enity.getSDT());
    }
}
