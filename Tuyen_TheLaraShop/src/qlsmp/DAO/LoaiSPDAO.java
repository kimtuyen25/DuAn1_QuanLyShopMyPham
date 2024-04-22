package qlsmp.DAO;

import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;
import qlsmp.DB.DBHelper;
import qlsmp.Model.LoaiSP;

public class LoaiSPDAO {

    String SELECT_ALL_SQL = "SELECT * FROM LOAISP";
    String INSERT_SQL = "SET IDENTITY_INSERT LOAISP ON; INSERT INTO LOAISP(MaLoai,TenLoai) Values(?,?)";
    String UPDATE_SQL = "Update LOAISP Set TenLoai=?  where MaLoai = ?";
    String DELETE_SQL = "DELETE LOAISP WHERE MaLoai = ?";
    String SELECT_BY_ID = "SELECT * FROM LOAISP WHERE MaLoai=?";
    String SELECT_TOP1_DESC = "select top 1 with ties * from LOAISP order by MaLoai desc";
    String SELECT_BY_Ten = "SELECT * FROM LOAISP WHERE TenLoai=?";

    public void insert(LoaiSP enity) {
        DBHelper.update(INSERT_SQL, enity.getMaLoai(), enity.getTenLoai());
    }

    public void update(LoaiSP enity) {
        DBHelper.update(UPDATE_SQL, enity.getTenLoai(), enity.getMaLoai());
    }

    public void delete(int id) {
        DBHelper.update(DELETE_SQL, id);
    }

    public List<LoaiSP> selectAll() {
        return this.selectBySql(SELECT_ALL_SQL);
    }

    public LoaiSP selectByID(int id) {
         List<LoaiSP> list = this.selectBySql(SELECT_BY_ID,id);
        if (list.isEmpty()) {
            return null;
        }
        return list.get(0);
    }

    public LoaiSP selectByTen(String ten) {
         List<LoaiSP> list = this.selectBySql(SELECT_BY_Ten,ten);
        if (list.isEmpty()) {
            return null;
        }
        return list.get(0);
    }
    
    public LoaiSP selecteTop1DESC() {
        List<LoaiSP> list = this.selectBySql(SELECT_TOP1_DESC);
        if (list.isEmpty()) {
            return null;
        }
        return list.get(0);
    }

    public List<LoaiSP> selectByKeyword(String keyword) {
        String sql = "SELECT * FROM LOAISP WHERE TenLoai LIKE ? order by MaLoai desc";
        return this.selectBySql(sql, "%" + keyword + "%");
    }

    public List<LoaiSP> selectBySql(String sql, Object... args) {
        List<LoaiSP> list = new ArrayList<>();
        try {
            ResultSet rs = DBHelper.query(sql, args);
            while (rs.next()) {
                LoaiSP enity = new LoaiSP();
                enity.setMaLoai(rs.getInt("MaLoai"));
                enity.setTenLoai(rs.getString("TenLoai"));
                list.add(enity);
            }
            rs.getStatement().getConnection().close();
            return list;
        } catch (Exception e) {
            throw new RuntimeException(e);
        }
    }
}
