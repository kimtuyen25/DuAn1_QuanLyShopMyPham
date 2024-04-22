package qlsmp.DAO;

import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;
import qlsmp.DB.DBHelper;
import qlsmp.Model.SanPham;

public class KhoDAO {

    String SELECT_ALL_SQL = "select A.MaSP,A.TenSP,A.GiaBan,A.GiaNhap,A.Hinh,A.MaVachSP,A.MaLoai,A.MaThuongHieu,SUM(B.SoLuong)AS'SL' from SANPHAM A JOIN SanPham_MauSac B ON A.MaSP = B.MaSP \n"
            + "GROUP BY A.MaSP,A.TenSP,A.GiaBan,A.GiaNhap,A.Hinh,A.MaVachSP,A.MaLoai,A.MaThuongHieu";
    String SELECT_BY_ID = "select A.MaSP,A.TenSP,A.GiaBan,A.GiaNhap,A.Hinh,A.MaVachSP,A.MaLoai,A.MaThuongHieu,SUM(B.SoLuong)AS'SL' from SANPHAM A JOIN SanPham_MauSac B ON A.MaSP = B.MaSP \n"
            + "GROUP BY A.MaSP,A.TenSP,A.GiaBan,A.GiaNhap,A.Hinh,A.MaVachSP,A.MaLoai,A.MaThuongHieu HAVING A.MaSP = ?";
    String SELECT_SAP_HT = "select A.MaSP,A.TenSP,A.GiaBan,A.GiaNhap,A.Hinh,A.MaVachSP,A.MaLoai,A.MaThuongHieu,SUM(B.SoLuong)AS'SL' from SANPHAM A JOIN SanPham_MauSac B ON A.MaSP = B.MaSP \n"
            + "GROUP BY A.MaSP,A.TenSP,A.GiaBan,A.GiaNhap,A.Hinh,A.MaVachSP,A.MaLoai,A.MaThuongHieu HAVING SUM(B.SoLuong) <= 10 AND SUM(B.SoLuong) > 0";
    String SELECT_SP_HT = "select A.MaSP,A.TenSP,A.GiaBan,A.GiaNhap,A.Hinh,A.MaVachSP,A.MaLoai,A.MaThuongHieu,SUM(B.SoLuong)AS'SL' from SANPHAM A JOIN SanPham_MauSac B ON A.MaSP = B.MaSP \n"
            + "GROUP BY A.MaSP,A.TenSP,A.GiaBan,A.GiaNhap,A.Hinh,A.MaVachSP,A.MaLoai,A.MaThuongHieu HAVING SUM(B.SoLuong) <= 0";

    public List<SanPham> selectAll() {
        return this.selectBySql(SELECT_ALL_SQL);
    }

    public List<SanPham> selectSapHet() {
        return this.selectBySql(SELECT_SAP_HT);
    }

    public List<SanPham> selectSPHet() {
        return this.selectBySql(SELECT_SP_HT);
    }

    public List<SanPham> selectByKeyword(String keyword) {
        String sql = "select A.MaSP,A.TenSP,A.GiaBan,A.GiaNhap,A.Hinh,A.MaVachSP,A.MaLoai,A.MaThuongHieu,SUM(B.SoLuong)AS'SL' from SANPHAM A JOIN SanPham_MauSac B ON A.MaSP = B.MaSP \n"
                + "GROUP BY A.MaSP,A.TenSP,A.GiaBan,A.GiaNhap,A.Hinh,A.MaVachSP,A.MaLoai,A.MaThuongHieu HAVING A.TenSP LIKE ?";
        return this.selectBySql(sql, "%" + keyword + "%");
    }

    public SanPham selectByMaSP(int maSP) {
        List<SanPham> list = this.selectBySql(SELECT_BY_ID, maSP);
        if (list.isEmpty()) {
            return null;
        }
        return list.get(0);
    }

    public List<SanPham> selectBySql(String sql, Object... args) {
        List<SanPham> list = new ArrayList<>();
        try {
            ResultSet rs = DBHelper.query(sql, args);
            while (rs.next()) {
                SanPham enity = new SanPham();
                enity.setMaSP(rs.getInt("MaSP"));
                enity.setTenSP(rs.getString("TenSP"));
                enity.setGiaBan(rs.getDouble("GiaBan"));
                enity.setGiaNhap(rs.getDouble("GiaNhap"));
                enity.setHinh(rs.getString("Hinh"));
                enity.setMaVach(rs.getString("MaVachSP"));
                enity.setSl(rs.getInt("SL"));
                enity.setMaLoai(rs.getInt("MaLoai"));
                enity.setMaThuongHieu(rs.getInt("MaThuongHieu"));
                list.add(enity);
            }
            rs.getStatement().getConnection().close();
            return list;
        } catch (Exception e) {
            throw new RuntimeException(e);
        }
    }
}
