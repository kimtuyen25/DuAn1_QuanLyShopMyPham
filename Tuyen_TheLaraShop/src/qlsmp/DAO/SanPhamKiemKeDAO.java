package qlsmp.DAO;

import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;
import qlsmp.DB.DBHelper;
import qlsmp.Model.SanPham;
import qlsmp.Model.SanPhamKiemKe;

public class SanPhamKiemKeDAO {

    public List<SanPhamKiemKe> selectBySql(String sql, Object... args) {
        List<SanPhamKiemKe> list = new ArrayList<>();
        try {
            ResultSet rs = DBHelper.query(sql, args);
            while (rs.next()) {
                SanPhamKiemKe enity = new SanPhamKiemKe();
                enity.setMaSP(rs.getInt("MaSP"));
                enity.setTenSP(rs.getString("TenSP"));
                enity.setMauSac(rs.getString("TenMau"));
                enity.setSoLuongKeToan(rs.getInt("SoLuong"));
                list.add(enity);
            }
            rs.getStatement().getConnection().close();
            return list;
        } catch (Exception e) {
            throw new RuntimeException(e);
        }
    }

    public List<SanPhamKiemKe> selectSPByIDSanPham(int idSP) {
        String SQL = "SELECT SanPham_MauSac.MaSP, SANPHAM.TenSP, MAUSAC.TenMau, SanPham_MauSac.SoLuong\n"
                + "               FROM SanPham\n"
                + "               INNER JOIN SanPham_MauSac ON SANPHAM.MaSP = SanPham_MauSac.MaSP\n"
                + "               INNER JOIN MAUSAC ON SanPham_MauSac.MaMau = MAUSAC.MaMau\n"
                + "               WHERE SanPham_MauSac.MaSP = ? ";
        return this.selectBySql(SQL, idSP);
    }

    public List<SanPhamKiemKe> selectSPByIDSanPhamAndMauSac(int idSP, String mauSP) {
        String SQL = "SELECT  SanPham_MauSac.MaSP, SANPHAM.TenSP, MAUSAC.TenMau, SanPham_MauSac.SoLuong\n"
                + "FROM SanPham \n"
                + " INNER JOIN SanPham_MauSac ON SANPHAM.MaSP = SanPham_MauSac.MaSP\n"
                + "INNER JOIN MAUSAC ON SanPham_MauSac.MaMau = MAUSAC.MaMau"
                + " WHERE SanPham_MauSac.MaSP = ? AND MAUSAC.TenMau = ?";
        return this.selectBySql(SQL, idSP, mauSP);
    }
}
