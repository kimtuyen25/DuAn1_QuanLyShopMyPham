/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package qlsmp.DAO;

import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;
import qlsmp.DB.DBHelper;
import qlsmp.Model.DoanhThu;

/**
 *
 * @author My Laptop
 */
public class DoanhThuDao {

    String SELECT_ALL = "SELECT a.MaHD,a.NgayTao,d.TenNV,e.TenKH,a.TongTien,a.Sale,a.ThanhTien,c.TenSP,b.SL,b.TenMau,b.ThanhTien as 'GiaBan' FROM HOADON A \n"
            + "JOIN  CTHD B ON A.MaHD = b.MaHD \n"
            + "JOIN SANPHAM C ON C.MaSP = B.MaSP\n"
            + "JOIN NHANVIEN D ON D.MaNV = A.MaNV\n"
            + "JOIN KHACHHANG E ON E.MaKH = A.MaKH\n"
            + "where NgayTao between ?  and ?";

    public List<DoanhThu> selectAll(String ngay1, String ngay2) {
        return this.selectBySql(SELECT_ALL, ngay1, ngay2);
    }

    protected List<DoanhThu> selectBySql(String sql, Object... args) {
        List<DoanhThu> list = new ArrayList<>();
        try {
            ResultSet rs = DBHelper.query(sql, args);
            while (rs.next()) {
                DoanhThu entity = new DoanhThu();
                entity.setMaHD(rs.getInt("MaHD"));
                entity.setNgayTao(rs.getString("NgayTao"));
                entity.setTenNV(rs.getString("TenNV"));
                entity.setTenKH(rs.getString("TenKH"));
                entity.setTongTien(rs.getDouble("TongTien"));
                entity.setSale(rs.getDouble("Sale"));
                entity.setThanhTien(rs.getDouble("ThanhTien"));
                entity.setTenSP(rs.getString("TenSP"));
                entity.setSl(rs.getInt("SL"));
                entity.setTenMau(rs.getString("TenMau"));
                entity.setGiaBan(rs.getDouble("GiaBan"));
                list.add(entity);
            }
            rs.getStatement().getConnection().close();
            return list;
        } catch (Exception e) {
            throw new RuntimeException();
        }
    }
}
