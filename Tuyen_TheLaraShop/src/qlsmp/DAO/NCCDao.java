/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package qlsmp.DAO;

import java.util.ArrayList;
import java.util.List;
import qlsmp.DB.DBHelper;
import qlsmp.Model.NCC;
import java.sql.ResultSet;

/**
 *
 * @author My Laptop
 */
public class NCCDao {

    String SELECT_ALL = "SELECT * FROM NhaCungCap order by MaNhaCungCap desc";
    String INSERT_SQL = "SET IDENTITY_INSERT NhaCungCap ON; INSERT INTO NhaCungCap(MaNhaCungCap,TenNhaCungCap) Values(?,?)";
    String UPDATE_SQL = "Update NhaCungCap Set TenNhaCungCap=?  where MaNhaCungCap = ?";
    String DELETE_SQL = "DELETE NhaCungCap WHERE MaNhaCungCap = ?";
    String SELECT_BY_ID_SQL = "SELECT * FROM NhaCungCap WHERE MaNhaCungCap=?";
    String SELECT_BY_TEN_SQL = "SELECT * FROM NhaCungCap WHERE TenNhaCungCap=?";
    String SELECT_TOP1_DESC = "select top 1 with ties * from NHACUNGCAP order by MaNhaCungCap desc";

    public void insert(NCC enity) {
        DBHelper.update(INSERT_SQL, enity.getMaNCC(), enity.getTenNCC());
    }

    public void update(NCC enity) {
        DBHelper.update(UPDATE_SQL, enity.getTenNCC(), enity.getMaNCC());
    }

    public void delete(int id) {
        DBHelper.update(DELETE_SQL, id);
    }

    public List<NCC> selectAll() {
        return this.selectBySql(SELECT_ALL);
    }

    public NCC selecteByID(int id) {
        List<NCC> list = this.selectBySql(SELECT_BY_ID_SQL, id);
        if (list.isEmpty()) {
            return null;
        }
        return list.get(0);
    }

    public NCC selecteByTen(String ten) {
        List<NCC> list = this.selectBySql(SELECT_BY_TEN_SQL, ten);
        if (list.isEmpty()) {
            return null;
        }
        return list.get(0);
    }

    public NCC selecteTop1DESC() {
        List<NCC> list = this.selectBySql(SELECT_TOP1_DESC);
        if (list.isEmpty()) {
            return null;
        }
        return list.get(0);
    }

    public List<NCC> selectByKeyword(String keyword) {
        String sql = "SELECT * FROM NHACUNGCAP WHERE TenNhaCungCap LIKE ? order by MaNhaCungCap desc";
        return this.selectBySql(sql, "%" + keyword + "%");
    }

    public List<NCC> selectBySql(String sql, Object... args) {
        List<NCC> list = new ArrayList<>();
        try {
            ResultSet rs = DBHelper.query(sql, args);
            while (rs.next()) {
                NCC enity = new NCC();
                enity.setMaNCC(rs.getInt("MaNhaCungCap"));
                enity.setTenNCC(rs.getString("TenNhaCungCap"));
                list.add(enity);
            }
            rs.getStatement().getConnection().close();
            return list;
        } catch (Exception e) {
            throw new RuntimeException(e);
        }
    }

}
