package qlsmp.DAO;

import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;
import qlsmp.DB.DBHelper;
import static qlsmp.DB.DBHelper.getStmt;
import qlsmp.Model.ChiTietKiemKe;
import qlsmp.Model.SanPham_MauSac;
import qlsmp.Model.SanPham_MauSac;
import java.sql.*;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
import org.apache.xmlbeans.impl.soap.SOAPFault;

public class SanPham_MauSacDAO {

    public void executeUpdateSqlSP(String sql, Object... args) {

        List<SanPham_MauSac> list = new ArrayList<>();
        int row = DBHelper.update(sql, args);
        if (row > 0) {
            System.out.println("Cập nhật thành công!");
        } else {
            System.out.println("Không có dòng nào được cập nhật.");
        }
    }

    public void Update(int soLuong, int idSP, String mauSac) {
        String SQL = "UPDATE SanPham_MauSac\n"
                + "SET SoLuong = ?\n"
                + "WHERE MaSP = ? AND MaMau = (SELECT MaMau FROM MAUSAC WHERE TenMau = ?)";
        executeUpdateSqlSP(SQL, soLuong, idSP, mauSac);
    }

    public static void main(String[] args) {
        SanPham_MauSac model = new SanPham_MauSac();
        try {
            PreparedStatement stmt = null;
            Connection conn = null;
            String sql = "UPDATE SanPham_MauSac\n"
                    + "SET SoLuong = ?\n"
                    + "WHERE MaSP = ? AND MaMau = (SELECT MaMau FROM MAUSAC WHERE TenMau = ?)";
            conn = DBHelper.getDBConnection();
            stmt = DBHelper.getStmt(sql, args);
            int row = stmt.executeUpdate();
            System.out.println(String.format("Row affected %d", row));

        } catch (SQLException ex) {
            Logger.getLogger(SanPham_MauSacDAO.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
}
