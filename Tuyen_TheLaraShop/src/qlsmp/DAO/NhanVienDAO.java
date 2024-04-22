//Quản lý nhân viên chổ username m vắt k trùng nha, số điện thoại của khác với nhân viên 
//cũng k trùng nha
package qlsmp.DAO;

import java.io.UnsupportedEncodingException;
import java.math.BigInteger;
import java.nio.charset.StandardCharsets;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.text.html.parser.Entity;
import qlsmp.DB.DBHelper;
import qlsmp.Model.NhanVien;

/**
 *
 * @author Anh Thu
 */
public class NhanVienDAO {

    String INSERT_SQL = "INSERT INTO NhanVien(MaNV,TenNV,GioiTinh,NgaySinh,SDT, DiaChi, CCCD, Email, HinhAnh, UserName, Passwords, ChucVu)VALUES (?,?,?,?,?,?,?,?,?,?,?,?) ";
    String UPDATE_SQL = "UPDATE NhanVien SET TenNV =?, GioiTinh=?, NgaySinh =?, SDT=?, DiaChi=?, CCCD=?, Email =?, HinhAnh =?,  UserName =?, Passwords=?, ChucVu=? WHERE MaNV=?";
    String DELETE_SQL = "DELETE FROM NhanVien WHERE MaNV = ?";
    String SELECT_ALL_SQL = "SELECT * FROM NhanVien";
    String SELECT_BY_ID_SQL = "SELECT * FROM NhanVien WHERE MaNV = ?";
    String SELECT_BY_Username = "SELECT * FROM NhanVien WHERE  UserName= ?";
    String SELECT_BY_USERNAME_SQL = "SELECT * FROM NhanVien WHERE  UserName = ?";
    String SELECT_ALL_TRUONGPHONG = "SELECT * FROM NHANVIEN WHERE CHUCVU=1";

    public void insert(NhanVien entity) {
        DBHelper.update(INSERT_SQL, entity.getMaNV(), entity.getHoTen(), entity.isGioiTinh(), entity.getNgaySinh(), entity.getDienThoai(), entity.getDiaChi(), entity.getCCCD(), entity.getEmail(), entity.getHinhAnh(), entity.getUsername(), entity.getPassword(), entity.isChucVu());
    }

    public void update(NhanVien entity) {
        DBHelper.update(UPDATE_SQL, entity.getHoTen(), entity.isGioiTinh(), entity.getNgaySinh(), entity.getDienThoai(), entity.getDiaChi(), entity.getCCCD(), entity.getEmail(), entity.getHinhAnh(), entity.getUsername(), entity.getPassword(), entity.isChucVu(), entity.getMaNV());
    }

    public void delete(int id) {
        DBHelper.update(DELETE_SQL, id);
    }

    public NhanVien selectById(int id) {
        List<NhanVien> list = this.selectBySql(SELECT_BY_ID_SQL, id);
        if (list.isEmpty()) {
            return null;
        }
        return list.get(0);
    }

    public List<NhanVien> selectByID(int id) {
        String sql = "SELECT * FROM NhanVien WHERE MaNV = ?";
        return this.selectBySql(sql, id);
    }

    public List<NhanVien> selectAll() {
        return this.selectBySql(SELECT_ALL_SQL);
    }

    public List<NhanVien> selectAllTruongPhong() {
        return this.selectBySql(SELECT_ALL_TRUONGPHONG);
    }

    public NhanVien selectByUsername(String id) {
        List<NhanVien> list = this.selectBySql(SELECT_BY_USERNAME_SQL, id);
        if (list.isEmpty()) {
            return null;
        }
        return list.get(0);
    }

    protected List<NhanVien> selectBySql(String sql, Object... args) {
        List<NhanVien> list = new ArrayList<>();
        try {
            ResultSet rs = DBHelper.query(sql, args);
            while (rs.next()) {
                NhanVien entity = new NhanVien();
                entity.setMaNV(rs.getInt("MaNV"));
                entity.setHoTen(rs.getString("TenNV"));
                entity.setGioiTinh(rs.getBoolean("GioiTinh"));
                entity.setNgaySinh(rs.getString("NgaySinh"));
                entity.setDiaChi(rs.getString("DiaChi"));
                entity.setDienThoai(rs.getString("SDT"));
                entity.setCCCD(rs.getString("CCCD"));
                entity.setEmail(rs.getString("Email"));
                entity.setHinhAnh(rs.getString("HinhAnh"));
                entity.setUsername(rs.getString("Username"));
                entity.setPassword(rs.getString("Passwords"));
                entity.setChucVu(rs.getBoolean("ChucVu"));
                list.add(entity);
            }
            rs.getStatement().getConnection().close();
            return list;
        } catch (Exception e) {
            throw new RuntimeException();
        }
    }

    public List<NhanVien> selectByKeyWord(String keyword) {
        String sql = "SELECT * FROM NhanVien WHERE TenNV LIKE ?";
        return this.selectBySql(sql, "%" + keyword + "%");
    }

    public static String getMd5(String input) {
        try {
            // Static getInstance method is called with hashing MD5 
            MessageDigest md = MessageDigest.getInstance("MD5");

            // digest() method is called to calculate message digest 
            //  of an input digest() return array of byte 
            byte[] messageDigest = md.digest(input.getBytes());

            // Convert byte array into signum representation 
            BigInteger no = new BigInteger(1, messageDigest);

            // Convert message digest into hex value 
            String hashtext = no.toString(16);
            while (hashtext.length() < 32) {
                hashtext = "0" + hashtext;
            }
            return hashtext.toUpperCase();
        } // For specifying wrong message digest algorithms 
        catch (NoSuchAlgorithmException e) {
            throw new RuntimeException(e);
        }
    }

    public NhanVien selectByUssername(String id) {
        List<NhanVien> list = this.selectBySql(SELECT_BY_Username, id);
        if (list.isEmpty()) {
            return null;
        }
        return list.get(0);
    }

    public static int doiMatKhau(NhanVien sv) {
        int rs = 0;
        try {
            Connection con = DBHelper.getDBConnection();
            String sql = "UPDATE NhanVien SET Passwords=? WHERE Email=?";

            PreparedStatement stmt = con.prepareStatement(sql);
            stmt.setString(1, sv.getPassword());
            stmt.setString(2, sv.getEmail());
            rs = stmt.executeUpdate();
        } catch (Exception e) {
            System.out.println("ket noi loi");
            e.printStackTrace();
        }
        return rs;
    }

    public static int doiMatKhauNV(NhanVien sv) {
        int rs = 0;
        try {
            Connection con = DBHelper.getDBConnection();
            String sql = "UPDATE NhanVien SET Passwords=? WHERE UserName=?";

            PreparedStatement stmt = con.prepareStatement(sql);

            stmt.setString(1, sv.getPassword());
            stmt.setString(2, sv.getUsername());
            rs = stmt.executeUpdate();
        } catch (Exception e) {
            System.out.println("ket noi loi");
            e.printStackTrace();
        }
        return rs;
    }

}
