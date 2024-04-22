
package qlsmp.DAO;

import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;
import qlsmp.DB.DBHelper;
import qlsmp.Model.KetQuaXuLy;
import qlsmp.Model.NhanVienKiemKe;


public class KetQuaXuLyDAO {
    
    public List<KetQuaXuLy> selectBySql(String sql, Object... args) {
        List<KetQuaXuLy> list = new ArrayList<>();
        try {
            ResultSet rs = DBHelper.query(sql, args);
            while (rs.next()) {
                KetQuaXuLy enity = new KetQuaXuLy();
                enity.setMucDich(rs.getString("NVDem1"));
                enity.setKetLuan(rs.getString("NVDem2"));
                enity.setIsXuLy(rs.getBoolean("NVDem3"));
                list.add(enity);
            }
            rs.getStatement().getConnection().close();
            return list;
        } catch (Exception e) {
            e.printStackTrace();
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

//       public List<NhanVienKiemKe> getKetQuaXuLy(int IDKiemKe) {
//        String SQL = "SELECT KetLuan, Mucdich FROM KiemKe WHERE MaKiemKe = ?";
//        return this.selectBySql(SQL, IDKiemKe);
//    }
}
