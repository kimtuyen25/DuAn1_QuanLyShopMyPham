package qlsmp.DAO;

import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;
import qlsmp.DB.DBHelper;
import qlsmp.Model.ChiTietKiemKe;
import qlsmp.Model.SanPhamKiemKe;

public class ChiTietKiemKeDAO {

    String INSERT_SQL = "INSERT INTO CHITIETKIEMKE VALUES (?,?,?,?,?,?,?,?)";

    String UPDATE_SQL = "UPDATE CHITIETKIEMKE SET ctkk.SoLuongThuc AS SLThucTe, (ctkk.SoLuongThuc - sp.SL) AS ChenhLech, NgayTaoKiemKe=?,MucDich=?,KetLuan=?,DaXuLy=? WHERE MaSP =?";
    String DELETE_SQL = " DELETE FROM CHITIETKIEMKE WHERE MaKiemKe = ?";
    String SELECT_ALL_SQL = " SELECT  SanPham_MauSac.MaSP, SANPHAM.TenSP, MAUSAC.TenMau, SanPham_MauSac.SoLuong\n"
            + "              FROM SanPham\n"
            + "              INNER JOIN SanPham_MauSac ON SANPHAM.MaSP = SanPham_MauSac.MaSP\n"
            + "             INNER JOIN MAUSAC ON SanPham_MauSac.MaMau = MAUSAC.MaMau";
    String UPDATE_BY_ID_KIEMKE = "Update CHITIETKIEMKE\n"
            + "SET SoLuongThuc = ?, LoaiXuLy =  ?, ChenhLech = ?, NVDem1 = ?, NVDem2 =?, NVDem3 =?\n"
            + "WHERE MaSPham_MSac = ? AND MaKiemKe = ?";
//    String SELECT_CHITIET = "SELECT ";

    public void insert(ChiTietKiemKe enity) {
        DBHelper.update(INSERT_SQL, enity.getSlThucTe(), enity.getNhanVien1(), enity.getNhanVien2(), enity.getNhanVien3(), enity.getLoaiXuLy(),enity.getChenhLech(),enity.getMaSPham_MSac(), enity.getMaKK());
    }

    public void updateByIdKiemKe(ChiTietKiemKe enity) {
        DBHelper.update(INSERT_SQL, enity.getSlThucTe(), enity.getLoaiXuLy(), enity.getChenhLech(), enity.getNhanVien1(), enity.getNhanVien2(), enity.getNhanVien3(), enity.getMaSPham_MSac(), enity.getMaKK());
    }

    public void deleteByIDKiemKe(int id) {
        DBHelper.update(DELETE_SQL, id);
    }

    public List<ChiTietKiemKe> selectBySql(String sql, Object... args) {
        List<ChiTietKiemKe> list = new ArrayList<>();
        try {
            ResultSet rs = DBHelper.query(sql, args);
            while (rs.next()) {
                ChiTietKiemKe enity = new ChiTietKiemKe();
                enity.setMaSP(rs.getInt("MaSP"));
                enity.setTenSP(rs.getString("TenSP"));
                enity.setMauSac(rs.getString("TenMau"));
                enity.setSlKeToan(rs.getInt("SoLuong"));
                enity.setSlThucTe(rs.getInt("SoLuongThuc"));
                enity.setChenhLech(rs.getInt("ChenhLech"));
                enity.setLoaiXuLy(rs.getString("LoaiXuLy"));
                list.add(enity);
            }
            rs.getStatement().getConnection().close();
            return list;
        } catch (Exception e) {
            e.printStackTrace();
            throw new RuntimeException(e);
        }
    }

    public List<ChiTietKiemKe> selectBySqlNV(String sql, Object... args) {
        List<ChiTietKiemKe> list = new ArrayList<>();
        try {
            ResultSet rs = DBHelper.query(sql, args);
            while (rs.next()) {
                ChiTietKiemKe enity = new ChiTietKiemKe();
                enity.setNhanVien1(rs.getString("NVDem1"));
                enity.setNhanVien2(rs.getString("NVDem2"));
                enity.setNhanVien3(rs.getString("NVDem3"));
                list.add(enity);
            }
            rs.getStatement().getConnection().close();
            return list;
        } catch (Exception e) {
            e.printStackTrace();
            throw new RuntimeException(e);
        }
    }

    public int selectBySqlSanPhamMauSac(String sql, Object... args) {
        List<ChiTietKiemKe> list = new ArrayList<>();
        int idSanPhamMauSac = 0;
        try {
            ResultSet rs = DBHelper.query(sql, args);
            while (rs.next()) {
                idSanPhamMauSac = rs.getInt("MaSPham_MSac");
            }
            rs.getStatement().getConnection().close();
            return idSanPhamMauSac;
        } catch (Exception e) {
            e.printStackTrace();
            throw new RuntimeException(e);
        }
    }

    public int selectBySqlMaKK(String sql, Object... args) {
        List<ChiTietKiemKe> list = new ArrayList<>();
        int idKK = 0;
        try {
            ResultSet rs = DBHelper.query(sql, args);
            while (rs.next()) {
                idKK = rs.getInt("MaKiemKe");
            }
            rs.getStatement().getConnection().close();
            return idKK;
        } catch (Exception e) {
            e.printStackTrace();
            throw new RuntimeException(e);
        }
    }

    public List<ChiTietKiemKe> selectBySqlSP(String sql, Object... args) {
        List<ChiTietKiemKe> list = new ArrayList<>();
        try {
            ResultSet rs = DBHelper.query(sql, args);
            while (rs.next()) {
                ChiTietKiemKe enity = new ChiTietKiemKe();
                enity.setMaSP(rs.getInt("MaSP"));
                enity.setTenSP(rs.getString("TenSP"));
                enity.setMauSac(rs.getString("TenMau"));
                enity.setSlKeToan(rs.getInt("SoLuong"));
                list.add(enity);
            }
            rs.getStatement().getConnection().close();
            return list;
        } catch (Exception e) {
            throw new RuntimeException(e);
        }
    }

    private List<Object[]> getListOfArray(String sql, String[] cols, Object... args) {
        try {
            List<Object[]> list = new ArrayList<>();
            ResultSet rs = DBHelper.query(sql, args);
            while (rs.next()) {
                Object[] vals = new Object[cols.length];
                for (int i = 0; i < cols.length; i++) {
                    vals[i] = rs.getObject(cols[i]);
                }
                list.add(vals);
            }
            rs.getStatement().getConnection().close();
            return list;
        } catch (Exception e) {
            e.printStackTrace();
            throw new RuntimeException();
        }
    }

//    public List<ChiTietKiemKe> getChiTietChiTietKiemKeByIDKK(int IDChiTietKiemKe) {
//        String SQL = " SELECT sp.MaSP, sp.TenSP,ms.TenMau,spms.SoLuong ,ctkk.SoLuongThuc AS SLThucTe, (ctkk.SoLuongThuc - spms.SoLuong) AS ChenhLech, ctkk.LoaiXuLy\n"
//                + "                FROM CHITIETKIEMKE ctkk INNER JOIN SanPham_MauSac spms ON ctkk.MaSPham_MSac = spms.MaSPham_MSac INNER JOIN SANPHAM sp ON spms.MaSP = sp.MaSP INNER JOIN MAUSAC ms ON spms.MaMau = ms.MaMau\n"
//                + "                WHERE MaKiemKe =  ?";
//        return this.selectBySql(SQL, IDChiTietKiemKe);
//    }
    public List<ChiTietKiemKe> getNhanVienKKByIDKK(int IDKiemKe) {
        String SQL = "SELECT DISTINCT NVDem1, NVDem2, NVDem3 FROM CHITIETKIEMKE WHERE MaKiemKe = ?";
        return this.selectBySqlNV(SQL, IDKiemKe);
    }

    public List<ChiTietKiemKe> getChiTietKiemKe(int IDKiemKe) {
        String SQL = "SELECT SanPham_MauSac.MaSP, SANPHAM.TenSP, MAUSAC.TenMau, SanPham_MauSac.SoLuong, \n"
                + "  CHITIETKIEMKE.SoLuongThuc,(CHITIETKIEMKE.SoLuongThuc - SanPham_MauSac.SoLuong) AS ChenhLech, CHITIETKIEMKE.LoaiXuLy\n"
                + "  FROM CHITIETKIEMKE\n"
                + "  INNER JOIN SanPham_MauSac ON CHITIETKIEMKE.MaSPham_MSac = SanPham_MauSac.MaSPham_MSac\n"
                + "  INNER JOIN SANPHAM ON SanPham_MauSac.MaSP = SANPHAM.MaSP \n"
                + "  INNER JOIN MAUSAC ON SanPham_MauSac.MaMau = MAUSAC.MaMau\n"
                + "  WHERE CHITIETKIEMKE.MaKiemKe = ?";
        return this.selectBySql(SQL, IDKiemKe);
    }

    public List<ChiTietKiemKe> selectAll() {
        return this.selectBySqlSP(SELECT_ALL_SQL);
    }

    public List<ChiTietKiemKe> selectAll(int maSP) {
        String SQL = SELECT_ALL_SQL + " WHERE SanPham_MauSac.MaSP = ?";
        return selectBySqlSP(SQL, maSP);
    }

    public int selectIdSanPhamMauSac(int idSP, String tenMau) {
        String SQL = " SELECT MaSPham_MSac FROM SanPham_MauSac WHERE MaSP= ? AND MaMau = (SELECT MaMau FROM MAUSAC WHERE TenMau = ?)";
        return this.selectBySqlSanPhamMauSac(SQL, idSP, tenMau);
    }

    public int selectIdKK(int IDKiemKe) {
        String SQL = "  SELECT MaKiemKe FROM KIEMKE WHERE MaKiemKe = ?";
        return this.selectBySqlMaKK(SQL, IDKiemKe);
    }

    public List<ChiTietKiemKe> selectSPByIDSanPhamMauSacAndMauSac(int idSP, String mauSac) {
        String SQL = "SELECT  SanPham_MauSac.MaSP, SANPHAM.TenSP, MAUSAC.TenMau, SanPham_MauSac.SoLuong\n"
                + "FROM SanPham \n"
                + " INNER JOIN SanPham_MauSac ON SANPHAM.MaSP = SanPham_MauSac.MaSP\n"
                + "INNER JOIN MAUSAC ON SanPham_MauSac.MaMau = MAUSAC.MaMau"
                + " WHERE SanPham_MauSac.MaSP = ? AND MAUSAC.TenMau = ?";
        return this.selectBySqlSP(SQL, idSP, mauSac);
    }

    public List<ChiTietKiemKe> selectSPNotInChiTietKiemKe(int idSanPhamMauSac) {
        String SQL = "SELECT  SanPham_MauSac.MaSP, SANPHAM.TenSP, MAUSAC.TenMau, SanPham_MauSac.SoLuong\n"
                + "                  FROM SanPham\n"
                + "                  INNER JOIN SanPham_MauSac ON SANPHAM.MaSP = SanPham_MauSac.MaSP\n"
                + "                 INNER JOIN MAUSAC ON SanPham_MauSac.MaMau = MAUSAC.MaMau \n"
                + "				 WHERE SanPham_MauSac.MaSPham_MSac = ?";
        return this.selectBySqlSP(SQL, idSanPhamMauSac);
    }

    public List<ChiTietKiemKe> getChiTietKiemKeXuatKho(int idKK) {
        String SQL = "  SELECT  SanPham_MauSac.MaSP, SANPHAM.TenSP, MAUSAC.TenMau, SanPham_MauSac.SoLuong,"
                + "  CHITIETKIEMKE.SoLuongThuc, CHITIETKIEMKE.ChenhLech, CHITIETKIEMKE.LoaiXuLy\n"
                + "  FROM SanPham  \n"
                + "  INNER JOIN SanPham_MauSac ON SANPHAM.MaSP = SanPham_MauSac.MaSP \n"
                + "  INNER JOIN MAUSAC ON SanPham_MauSac.MaMau = MAUSAC.MaMau \n"
                + "  INNER JOIN CHITIETKIEMKE ON CHITIETKIEMKE.MaSPham_MSac = SanPham_MauSac.MaSPham_MSac\n"
                + "  WHERE CHITIETKIEMKE.MaKiemKe = ? AND CHITIETKIEMKE.LoaiXuLy =N'Xuất kho'";
        return this.selectBySql(SQL, idKK);
    }

    public List<ChiTietKiemKe> getChiTietKiemKeNhapKho(int idKK) {
        String SQL = "  SELECT  SanPham_MauSac.MaSP, SANPHAM.TenSP, MAUSAC.TenMau, SanPham_MauSac.SoLuong,"
                + "  CHITIETKIEMKE.SoLuongThuc, CHITIETKIEMKE.ChenhLech, CHITIETKIEMKE.LoaiXuLy\n"
                + "  FROM SanPham  \n"
                + "  INNER JOIN SanPham_MauSac ON SANPHAM.MaSP = SanPham_MauSac.MaSP \n"
                + "  INNER JOIN MAUSAC ON SanPham_MauSac.MaMau = MAUSAC.MaMau \n"
                + "  INNER JOIN CHITIETKIEMKE ON CHITIETKIEMKE.MaSPham_MSac = SanPham_MauSac.MaSPham_MSac\n"
                + "  WHERE CHITIETKIEMKE.MaKiemKe = ? AND CHITIETKIEMKE.LoaiXuLy =N'Nhập kho'";
        return this.selectBySql(SQL, idKK);
    }

    public void updateIsXuLy(String text) {
   
    }

}
