package qlsmp.DAO;

import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;
import qlsmp.DB.DBHelper;
import qlsmp.Model.ThuongHieu;

public class ThuongHieuDAO {

    String SELECT_ALL_SQL = "SELECT * FROM THUONGHIEU order by MaThuongHieu desc";
    String INSERT_SQL = "SET IDENTITY_INSERT THUONGHIEU ON; INSERT INTO THUONGHIEU(MaThuongHieu,TenThuongHieu) Values(?,?)";
    String UPDATE_SQL = "Update THUONGHIEU Set TenThuongHieu=?  where MaThuongHieu = ?";
    String DELETE_SQL = "DELETE THUONGHIEU WHERE MaThuongHieu = ?";
    String SELECT_BY_ID = "SELECT * FROM THUONGHIEU where MaThuongHieu=?";
    String SELECT_TOP1_DESC = "select top 1 with ties * from THUONGHIEU order by MaThuongHieu desc";
    String SELECT_BY_TEN = "SELECT * FROM THUONGHIEU where TenThuongHieu=?";

    public void insert(ThuongHieu enity) {
        DBHelper.update(INSERT_SQL, enity.getMaTH(), enity.getTenTH());
    }

    public void update(ThuongHieu enity) {
        DBHelper.update(UPDATE_SQL, enity.getTenTH(), enity.getMaTH());
    }

    public void delete(int id) {
        DBHelper.update(DELETE_SQL, id);
    }

    public List<ThuongHieu> selectAll() {
        return this.selectBySql(SELECT_ALL_SQL);
    }

    public ThuongHieu selecteByID(int id) {
        List<ThuongHieu> list = this.selectBySql(SELECT_BY_ID, id);
        if (list.isEmpty()) {
            return null;
        }
        return list.get(0);
    }

    public ThuongHieu selecteByTen(String ten) {
        List<ThuongHieu> list = this.selectBySql(SELECT_BY_TEN, ten);
        if (list.isEmpty()) {
            return null;
        }
        return list.get(0);
    }
    
    public ThuongHieu selecteTop1DESC() {
        List<ThuongHieu> list = this.selectBySql(SELECT_TOP1_DESC);
        if (list.isEmpty()) {
            return null;
        }
        return list.get(0);
    }
    public List<ThuongHieu> selectByKeyword(String keyword) {
        String sql = "SELECT * FROM THUONGHIEU WHERE TenThuongHieu LIKE ? order by MaThuongHieu desc";
        return this.selectBySql(sql, "%" + keyword + "%");
    }

    public List<ThuongHieu> selectBySql(String sql, Object... args) {
        List<ThuongHieu> list = new ArrayList<>();
        try {
            ResultSet rs = DBHelper.query(sql, args);
            while (rs.next()) {
                ThuongHieu enity = new ThuongHieu();
                enity.setMaTH(rs.getInt("MaThuongHieu"));
                enity.setTenTH(rs.getString("TenThuongHieu"));
                list.add(enity);
            }
            rs.getStatement().getConnection().close();
            return list;
        } catch (Exception e) {
            throw new RuntimeException(e);
        }
    }
}
