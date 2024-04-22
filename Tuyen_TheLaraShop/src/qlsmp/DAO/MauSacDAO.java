package qlsmp.DAO;

import java.util.ArrayList;
import java.util.List;
import java.sql.ResultSet;
import qlsmp.DB.DBHelper;
import qlsmp.Model.MauSac;

public class MauSacDAO {

    String SELECT_ALL_SQL = "SELECT * FROM MAUSAC";
    String SELECT_ALL_MaMau = "SELECT * FROM MAUSAC WHERE MaMau=?";
    String DELETE_SQL = "DELETE FROM MAUSAC WHERE MaMau=?";
    String INSERT_SQL = "SET IDENTITY_INSERT MAUSAC ON; INSERT INTO MAUSAC(MaMau,Tenmau) VALUES(?,?)";
    String SELECT_MAMAU_INSERT = "SELECT TOP 1 WITH TIES MaMau,TenMau FROM MAUSAC ORDER BY MaMau DESC";
    String SELECT_NOT_IN_BANGMAU_BY_MASP = "SELECT * FROM MAUSAC WHERE MaMau NOT IN (\n"
            + "	SELECT B.MaMau\n"
            + "	FROM SanPham_MauSac A JOIN MAUSAC B ON A.MaMau= B.MaMau \n"
            + "	WHERE MaSP = ?) AND MaMau != 7";
    String SELECT_BY_TEN_MAU = "SELECT * FROM MAUSAC WHERE Tenmau=?";

    public List<MauSac> selectAll() {
        return this.selectBySql(SELECT_ALL_SQL);
    }

    public List<MauSac> selectNotInCTM_ByMaSP(int id) {
        return this.selectBySql(SELECT_NOT_IN_BANGMAU_BY_MASP, id);
    }

    public MauSac selectByTenMau(String id) {
        List<MauSac> list = this.selectBySql(SELECT_BY_TEN_MAU, id);
        if (list.isEmpty()) {
            return null;
        }
        return list.get(0);
    }

    public MauSac selectByMaMau(int id) {
        List<MauSac> list = this.selectBySql(SELECT_ALL_MaMau, id);
        if (list.isEmpty()) {
            return null;
        }
        return list.get(0);
    }

    public MauSac selectMaMauNext() {
        List<MauSac> list = this.selectBySql(SELECT_MAMAU_INSERT);
        if (list.isEmpty()) {
            return null;
        }
        return list.get(0);
    }

    public void Insert(MauSac enity) {
        DBHelper.update(INSERT_SQL, enity.getMaMau(), enity.getTenMau());
    }

    public void Delete(int id) {
        DBHelper.update(DELETE_SQL, id);
    }

    public List<MauSac> selectBySql(String sql, Object... args) {
        List<MauSac> list = new ArrayList<>();
        try {
            ResultSet rs = DBHelper.query(sql, args);
            while (rs.next()) {
                MauSac enity = new MauSac();
                enity.setMaMau(rs.getInt("MaMau"));
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
