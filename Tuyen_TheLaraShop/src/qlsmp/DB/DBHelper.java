package qlsmp.DB;

import com.raven.dialog.Message;
import com.raven.main.Main;
import java.sql.*;
import qlsmp.Model.Connect;

public class DBHelper {
 Connect dao = new Connect();

    private void showMessage(String message) {
        Message obj = new Message(Main.getFrames()[0], true);
        obj.showMessage(message);
    }

    public void readFile() {
        try {
            dao = (Connect) IO.readObject("src\\file\\NhanVien.txt");
            System.out.println(dao.getMaychu());
            System.out.println(dao.getMaychu());
        } catch (Exception e) {
            this.showMessage("Lỗi Đọc File");
        }
    }

    public static Connection getDBConnection() {
        Connection con = null;
        DBHelper helper = new DBHelper();
        try {
            helper.readFile(); // Gọi phương thức để đọc file
            String connectionUrl = "jdbc:sqlserver://" + helper.dao.getMaychu() + ";databaseName="+helper.dao.getTenDA()+";user=duan1;password=duan1123;encrypt=true;trustServerCertificate=true;";
            con = DriverManager.getConnection(connectionUrl);
            System.out.println("Kết nối thành công...");
        } catch (Exception e) {
            e.printStackTrace();
        }
        return con;
    }
     public static PreparedStatement getStmt(String sql, Object... args) throws SQLException {
        Connection conn = getDBConnection();
        PreparedStatement stmt;
        if (sql.trim().startsWith("{")) {
            stmt = conn.prepareCall(sql);
        } else {
            stmt = conn.prepareStatement(sql);
        }
        for (int i = 0; i < args.length; i++) {
            stmt.setObject(i + 1, args[i]);
        }
        return stmt;
    }

    public static ResultSet query(String sql, Object... args) throws SQLException {
        PreparedStatement stmt = DBHelper.getStmt(sql, args);
        return stmt.executeQuery();
    }

    public static Object value(String sql, Object... args) {
        try {
            ResultSet rs = query(sql, args);
            if (rs.next()) {
                return rs.getObject(0);
            }
            rs.getStatement().getConnection().close();
            return null;
        } catch (Exception e) {
            throw new RuntimeException(e);
        }
    }

    public static int update(String sql, Object... args) {
        try {
            PreparedStatement stmt = getStmt(sql, args);
            try {
                return stmt.executeUpdate();
            } finally {
                stmt.getConnection().close();
            }

        } catch (Exception e) {
            throw new RuntimeException(e);
        }
    }
}
