/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package qlsmp.DAO;

import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;
import qlsmp.DB.DBHelper;
import qlsmp.Model.CTHD;
import qlsmp.Model.CTPN;

/**
 *
 * @author My Laptop
 */
public class CTPNDao {

    String SELECT_ALL = "SELECT * FROM CTPN";
    String DELETE_SQL = "DELETE CTPN WHERE MaPN = ?";
    String INSERT_SQL = "INSERT INTO CTPN(SL,GiaNhap,ThanhTien,MaPN,MaSP,TenMau) VALUES(?,?,?,?,?,?)";
    String SELECT_BY_ID_SQL = "SELECT * FROM CTPN WHERE MaCTPN=?";
    String SELECT_BY_MaPN_SQL = "SELECT * FROM CTPN WHERE MaPN=?";

    public void insert(CTPN enity) {
        DBHelper.update(INSERT_SQL, enity.getSl(), enity.getGiaNhap(), enity.getThanhTien(), enity.getMaPN(), enity.getMaSP(), enity.getTenMau());
    }

    public void deleteByMaPN(int id) {
        DBHelper.update(DELETE_SQL, id);
    }

    public List<CTPN> selectAll() {
        return this.selectBySql(SELECT_ALL);
    }

    public CTPN selecteByID(int id) {
        List<CTPN> list = this.selectBySql(SELECT_BY_ID_SQL, id);
        if (list.isEmpty()) {
            return null;
        }
        return list.get(0);
    }

    public List<CTPN> selecteByMaPN(int id) {
        return this.selectBySql(SELECT_BY_MaPN_SQL, id);
    }

    public List<CTPN> selectBySql(String sql, Object... args) {
        List<CTPN> list = new ArrayList<>();
        try {
            ResultSet rs = DBHelper.query(sql, args);
            while (rs.next()) {
                CTPN enity = new CTPN();
                enity.setMaCTPN(rs.getInt("MaCTPN"));
                enity.setSl(rs.getInt("SL"));
                enity.setGiaNhap(rs.getFloat("GiaNhap"));
                enity.setThanhTien(rs.getFloat("ThanhTien"));
                enity.setMaPN(rs.getInt("MaPN"));
                enity.setMaSP(rs.getInt("MaSP"));
                enity.setTenMau(rs.getString("TenMau"));
                list.add(enity);
            }
            rs.getStatement().getConnection().close();
            return list;
        } catch (Exception e) {
            throw new RuntimeException(e);
        }
    }

}
