/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package qlsmp.DAO;

import java.sql.PreparedStatement;
import java.sql.Connection;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;
import qlsmp.DB.DBHelper;
import qlsmp.Model.ChartThongKe;

/**
 *
 * @author My Laptop
 */
public class ThongKeDao {

    String SELECT_THANG = "EXEC PROC_DT_Tuan";

    public List<ChartThongKe> selectAll() {
        return this.selectBySql(SELECT_THANG);
    }

    public List<ChartThongKe> selectBySql(String sql, Object... args) {
        List<ChartThongKe> list = new ArrayList<>();
        try {
            ResultSet rs = DBHelper.query(sql, args);
            while (rs.next()) {
                ChartThongKe enity = new ChartThongKe();
                enity.setNgay(rs.getString("NGAY"));
                enity.setDoanhThu(rs.getDouble("DOANHTHU"));
                enity.setChiPhi(rs.getDouble("CHIPHI"));
                enity.setLoiNhuan(rs.getDouble("LOINHUAN"));
                list.add(enity);
            }
            rs.getStatement().getConnection().close();
            return list;
        } catch (Exception e) {
            throw new RuntimeException(e);
        }
    }

    public int selectBillDate() {
        String sql = "select COUNT(*)  AS'SOHOADON' from HOADON WHERE Day(NgayTao) = Day(GETDATE()) and MONTH(NgayTao) = MONTH(GETDATE()) AND YEAR(NgayTao) = YEAR(GETDATE())";
        try {
            int slBill=0;
            ResultSet rs = DBHelper.query(sql);
            while (rs.next()) {
                ChartThongKe enity = new ChartThongKe();
                enity.setSlBill(rs.getInt(1));
                slBill = enity.getSlBill();
            }
            rs.getStatement().getConnection().close();
            return slBill;
        } catch (Exception e) {
            throw new RuntimeException(e);
        }
    }

    public int selectPhieuNhapDate() {
        String sql = "select COUNT(*) AS'SOHOADON' from PHIEUNHAP WHERE Day(NgayTao) = Day(GETDATE()) and MONTH(NgayTao) = MONTH(GETDATE()) AND YEAR(NgayTao) = YEAR(GETDATE())";
        try {
            int slPN = 0;
            ResultSet rs = DBHelper.query(sql);
            while (rs.next()) {
                ChartThongKe enity = new ChartThongKe();
                enity.setSlPN(rs.getInt(1));
                slPN = enity.getSlPN();
            }
            rs.getStatement().getConnection().close();
            return slPN;
        } catch (Exception e) {
            throw new RuntimeException(e);
        }
    }

    public double selectLoiNhuanDate() {
        String sql = "EXEC ThongKe_TheoNgay";
        try {
            double loinhuan = 0;
            ResultSet rs = DBHelper.query(sql);
            while (rs.next()) {
                ChartThongKe enity = new ChartThongKe();
                enity.setLoiNhuan(rs.getDouble(1));
                loinhuan = enity.getLoiNhuan();
            }
            rs.getStatement().getConnection().close();
            return loinhuan;
        } catch (Exception e) {
            throw new RuntimeException(e);
        }
    }

    public int selectSSbill() {
        String sql = "EXEC SL_Bill_Ngay";
        try {
            int slss = 0;
            ResultSet rs = DBHelper.query(sql);
            while (rs.next()) {
                ChartThongKe enity = new ChartThongKe();
                enity.setSlSosanh(rs.getInt(1));
                slss = enity.getSlSosanh();
            }
            rs.getStatement().getConnection().close();
            return slss;
        } catch (Exception e) {
            throw new RuntimeException(e);
        }
    }

}
