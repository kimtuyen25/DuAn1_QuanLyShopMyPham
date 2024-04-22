/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package qlsmp.DAO;

import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;
import qlsmp.DB.DBHelper;
import qlsmp.Model.PhieuNhap;

/**
 *
 * @author My Laptop
 */
public class PhieuNhapDAO {

    String SELECT_ALL = "SELECT * FROM PHIEUNHAP ";
    String SELECT_ALL_BETWEEN_AND = "SELECT * FROM PHIEUNHAP WHERE NgayTao BETWEEN ? AND ?";
    String INSERT_SQL = "SET IDENTITY_INSERT PHIEUNHAP ON;INSERT INTO PHIEUNHAP(MaPN,NgayTao, TongTien, ThanhTien, ChietKhau, TrangThai, MaNV, MaNhaCungCap) VALUES(?,?,?,?,?,1,?,?)";
    String DELETE_SQL ="DELETE PHIEUNHAP WHERE MaPN = ?";
    String SELECT_BY_ID_SQL = "SELECT * FROM PHIEUNHAP WHERE MaPN=?";
    String SELECT_TOP1_DESC = "select top 1 with ties MaPN,NgayTao, TongTien, ThanhTien, ChietKhau, TrangThai, MaNV, MaNhaCungCap from PHIEUNHAP order by MaPN desc";
    String SELECT_ALL_MONTH = "SELECT * FROM PHIEUNHAP where MOnth(NgayTao) >= Month(GETDATE()) and Year(NgayTao) = Year(GETDATE())";

    public void insert(PhieuNhap enity) {
        DBHelper.update(INSERT_SQL, enity.getMaPN(), enity.getNgayTao(), enity.getTongTien(), enity.getThanhTien(), enity.getChietKhau(), enity.getMaNV(), enity.getMaNCC());
    }

    public void update(PhieuNhap enity) {
        //PHIEUNHAP KHÔNG CHO UPDATE
    }

    public void delete(int id) {
        DBHelper.update(DELETE_SQL, id);
    }

    public PhieuNhap selecteByID(int id) {
        List<PhieuNhap> list = this.selectBySql(SELECT_BY_ID_SQL, id);
        if (list.isEmpty()) {
            return null;
        }
        return list.get(0);
    }

    public List<PhieuNhap> selectAll() {
        return this.selectBySql(SELECT_ALL);
    }
     public List<PhieuNhap> selectAllMonth() {
        return this.selectBySql(SELECT_ALL_MONTH);
    }

    public PhieuNhap selectByTop1DESC() {
        List<PhieuNhap> list = this.selectBySql(SELECT_TOP1_DESC);
        if (list.isEmpty()) {
            return null;
        }
        return list.get(0);
    }

    public List<PhieuNhap> selectBetweenAnd(String tuNgay, String denNgay) {
        return this.selectBySql(SELECT_ALL_BETWEEN_AND, tuNgay, denNgay);
    }

    public List<PhieuNhap> selectBySql(String sql, Object... args) {
        List<PhieuNhap> list = new ArrayList<>();
        try {
            ResultSet rs = DBHelper.query(sql, args);
            while (rs.next()) {
                PhieuNhap enity = new PhieuNhap();
                enity.setMaPN(rs.getInt("MaPN"));
                enity.setNgayTao(rs.getString("NgayTao"));
                enity.setTongTien(rs.getFloat("TongTien"));
                enity.setThanhTien(rs.getFloat("ThanhTien"));
                enity.setChietKhau(rs.getInt("ChietKhau"));
                enity.setTrangThai(rs.getBoolean("TrangThai"));
                enity.setMaNV(rs.getInt("MaNV"));
                enity.setMaNCC(rs.getInt("MaNhaCungCap"));
                list.add(enity);
            }
            rs.getStatement().getConnection().close();
            return list;
        } catch (Exception e) {
            throw new RuntimeException(e);
        }
    }
}
