/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package qlsmp.DAO;

import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;
import qlsmp.DB.DBHelper;
import qlsmp.Model.ChiTieu;

/**
 *
 * @author My Laptop
 */
public class ChiTieuDao {

    String SELECT_ALL = "SELECT a.MaPN,a.NgayTao,c.TenNV,d.TenNhaCungCap,a.TongTien,a.ChietKhau,a.ThanhTien,e.TenSP,b.SL,b.TenMau,b.GiaNhap as'GiaNhap' FROM PHIEUNHAP A\n"
            + "JOIN CTPN B ON A.MaPN = B.MaPN\n"
            + "JOIN NHANVIEN C ON C.MaNV = A.MaNV\n"
            + "JOIN NHACUNGCAP D ON D.MaNhaCungCap = A.MaNhaCungCap\n"
            + "JOIN SANPHAM E ON E.MaSP = B.MaSP\n"
            + "where NgayTao between ?  and ?";
    
     public List<ChiTieu> selectAll(String ngay1, String ngay2) {
        return this.selectBySql(SELECT_ALL, ngay1, ngay2);
    }

    protected List<ChiTieu> selectBySql(String sql, Object... args) {
        List<ChiTieu> list = new ArrayList<>();
        try {
            ResultSet rs = DBHelper.query(sql, args);
            while (rs.next()) {
                ChiTieu entity = new ChiTieu();
                entity.setMaPN(rs.getInt("MaPN"));
                entity.setNgayTao(rs.getString("NgayTao"));
                entity.setTenNV(rs.getString("TenNV"));
                entity.setTenNCC(rs.getString("TenNhaCungCap"));
                entity.setTongTien(rs.getDouble("TongTien"));
                entity.setChietKhau(rs.getInt("ChietKhau"));
                entity.setThanhTien(rs.getDouble("ThanhTien"));
                entity.setTenSp(rs.getString("TenSP"));
                entity.setSl(rs.getInt("SL"));
                entity.setTenMau(rs.getString("TenMau"));
                entity.setGiaNhap(rs.getDouble("GiaNhap"));
                list.add(entity);
            }
            rs.getStatement().getConnection().close();
            return list;
        } catch (Exception e) {
            throw new RuntimeException();
        }
    }
}
