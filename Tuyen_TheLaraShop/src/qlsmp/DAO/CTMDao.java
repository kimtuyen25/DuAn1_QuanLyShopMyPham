/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package qlsmp.DAO;

import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;
import qlsmp.DB.DBHelper;
import qlsmp.Model.CTMau;

/**
 *
 * @author My Laptop
 */
public class CTMDao {

    String SELECT_ALL_SQL = "SELECT * FROM SanPham_MauSac";
    String DELETE_SQL = "DELETE FROM SanPham_MauSac WHERE MaSPham_MSac=?";
    String SELECT_BY_MAMAU_MASP = "SELECT * FROM SanPham_MauSac WHERE MaSP=? AND MaMau=?";
    String DELETE_BY_MAMAU_MASP = "DELETE FROM SanPham_MauSac WHERE MaSP=? AND MaMau=?";
    String DELETE_BY_MASP = "DELETE FROM SanPham_MauSac WHERE MASP=?";
    String INSERT_SQL = "INSERT INTO SanPham_MauSac(MaSP,MaMau,SoLuong) VALUES(?,?,0)";
    String DELETE_SL_SPNEW = "EXEC UPDATE_SL_SPNEW @MASP=?";
    String SELECT_BY_MaSP = "SELECT * FROM SANPHAM_MAUSAC WHERE MASP = ?";

    public List<CTMau> selectAll() {
        return this.selectBySql(SELECT_ALL_SQL);
    }

    public List<CTMau> selectByMaSP(int id) {
        return this.selectBySql(SELECT_BY_MaSP, id);
    }

    public CTMau selectByMaMauMaSP(int maSP, int maMau) {
        List<CTMau> list = this.selectBySql(SELECT_BY_MAMAU_MASP, maSP, maMau);
        if (list.isEmpty()) {
            return null;
        }
        return list.get(0);
    }

    public void Insert(CTMau enity) {
        DBHelper.update(INSERT_SQL, enity.getMaSP(), enity.getMaMau());
    }

    public void DeleteSLSpnew(int id) {
        DBHelper.update(DELETE_SL_SPNEW, id);
    }

    public void DeleteByMaSP(int id) {
        DBHelper.update(DELETE_BY_MASP, id);
    }

    public void DeleteByMaMauMaSP(int maSP, int maMau) {
        DBHelper.update(DELETE_BY_MAMAU_MASP, maSP, maMau);
    }

    public void Delete(int id) {
        DBHelper.update(DELETE_SQL, id);
    }

    public List<CTMau> selectBySql(String sql, Object... args) {
        List<CTMau> list = new ArrayList<>();
        try {
            ResultSet rs = DBHelper.query(sql, args);
            while (rs.next()) {
                CTMau enity = new CTMau();
                enity.setMaCTM(rs.getInt("MaSPham_MSac"));
                enity.setMaSP(rs.getInt("MaSP"));
                enity.setMaMau(rs.getInt("MaMau"));
                enity.setSl(rs.getInt("SoLuong"));
                list.add(enity);
            }
            rs.getStatement().getConnection().close();
            return list;
        } catch (Exception e) {
            throw new RuntimeException(e);
        }
    }

}
