package Test;

import org.testng.annotations.Test;

import com.raven.component.Menu;
import com.raven.event.EventMenuSelected;
import com.raven.form.Form_DangNhap;
import com.raven.form.Form_KhachHang;
import com.raven.form.MainForm;
import com.raven.main.Main;

import qlsmp.DAO.NhanVienDAO;
import qlsmp.Model.KhachHang;
import qlsmp.Model.NhanVien;

import org.testng.annotations.BeforeMethod;
import org.testng.annotations.DataProvider;

import static org.testng.Assert.assertEquals;
import static org.testng.Assert.assertFalse;
import static org.testng.Assert.assertTrue;

import java.awt.Robot;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.concurrent.TimeUnit;

import javax.swing.JOptionPane;

import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;

public class ThemKhachHang {
	Main main;
	Form_KhachHang form_KhachHang;

	@BeforeMethod
	public void beforMethod() throws InterruptedException {
		Form_DangNhap form_login = new Form_DangNhap();

		form_login.txtMayChu.setText("127.0.0.1");
		form_login.txtTenDUAn.setText("QLSHOPMYPHAM");
		form_login.setVisible(true);
		// TimeUnit.SECONDS.sleep(2);
		form_login.btnConnect.doClick();
		// TimeUnit.SECONDS.sleep(2);
		form_login.txtUsername.setText("ChuTam");
		form_login.txtPass.setText("123");
		form_login.btnLogin1.doClick();
		main = new Main();
		main.main.showForm(new Form_KhachHang());
		main.setVisible(true);
		// TimeUnit.SECONDS.sleep(0);
		form_KhachHang = new Form_KhachHang();
	}

	public Date ngay(String txtDate) {
		// Thay đổi kiểu dữ liệu của txtNgaySinh
		java.util.Date ngaySinh = new java.util.Date();
		try {
			// Sử dụng SimpleDateFormat để format ngày tháng
			SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd");
			ngaySinh = sdf.parse(txtDate);
		} catch (Exception e) {
			e.printStackTrace();
		}
		return ngaySinh;
	}

	@Test(priority = 1)
	public void test1() throws InterruptedException {
		form_KhachHang.txtHoTen.setText("Nguyễn Văn A");
		form_KhachHang.buttonGroup1.setSelected(form_KhachHang.rdoNam.getModel(), true);
		form_KhachHang.txtNgaySinh.setDate(ngay("2000-12-12"));
		form_KhachHang.txtDiaChi.setText("Vô gia cư");
		form_KhachHang.txtSDT.setText("0981232391");
		main.main.showForm(form_KhachHang);
		main.setVisible(true);
		TimeUnit.SECONDS.sleep(5);
		form_KhachHang.btnThem.doClick();
		assertTrue(form_KhachHang.check);
	}
	// Fail bỏ trống full ô
	@Test(priority = 2)
	public void test2() throws InterruptedException {
		form_KhachHang.txtHoTen.setText("");
		form_KhachHang.buttonGroup1.setSelected(form_KhachHang.rdoNam.getModel(), true);
		form_KhachHang.txtNgaySinh.setDate(ngay(""));
		form_KhachHang.txtDiaChi.setText("");
		form_KhachHang.txtSDT.setText("");
		main.main.showForm(form_KhachHang);
		main.setVisible(true);
		TimeUnit.SECONDS.sleep(2);
		form_KhachHang.btnThem.doClick();
		assertFalse(form_KhachHang.check);
	}

//	// Fail bỏ trống họ tên
	@Test(priority = 3)
	public void test3() throws InterruptedException {
		form_KhachHang.txtHoTen.setText("");
		form_KhachHang.buttonGroup1.setSelected(form_KhachHang.rdoNam.getModel(), true);
		form_KhachHang.txtNgaySinh.setDate(ngay("2003-12-12"));
		form_KhachHang.txtDiaChi.setText("Cần thơ");
		form_KhachHang.txtSDT.setText("0981232391");
		main.main.showForm(form_KhachHang);
		main.setVisible(true);
		TimeUnit.SECONDS.sleep(2);
		form_KhachHang.btnThem.doClick();
		assertFalse(form_KhachHang.check);
	}

	// Fail bỏ trống ngày
	@Test(priority = 4)
	public void test4() throws InterruptedException {
		form_KhachHang.txtHoTen.setText("Võ Văn A");
		form_KhachHang.buttonGroup1.setSelected(form_KhachHang.rdoNam.getModel(), true);
		form_KhachHang.txtNgaySinh.setToolTipText("");
		form_KhachHang.txtDiaChi.setText("Cần Thơ");
		form_KhachHang.txtSDT.setText("0987678984");
		main.main.showForm(form_KhachHang);
		main.setVisible(true);
		TimeUnit.SECONDS.sleep(2);
		form_KhachHang.btnThem.doClick();
		assertFalse(form_KhachHang.check);
	}

	// Fail ngày không đúng định dạng
	@Test(priority = 5)
	public void test5() throws InterruptedException {
		form_KhachHang.txtHoTen.setText("Võ Văn A");
		form_KhachHang.buttonGroup1.setSelected(form_KhachHang.rdoNam.getModel(), true);
		form_KhachHang.txtNgaySinh.setToolTipText("hkbc");
		form_KhachHang.txtDiaChi.setText("Cần Thơ");
		form_KhachHang.txtSDT.setText("0989864267");
		main.main.showForm(form_KhachHang);
		main.setVisible(true);
		TimeUnit.SECONDS.sleep(2);
		form_KhachHang.btnThem.doClick();
		assertFalse(form_KhachHang.check);
	}

	// True trống địa chỉ
	@Test(priority = 6)
	public void test6() throws InterruptedException {
		form_KhachHang.txtHoTen.setText("Võ Văn A");
		form_KhachHang.buttonGroup1.setSelected(form_KhachHang.rdoNam.getModel(), true);
		form_KhachHang.txtNgaySinh.setDate(ngay("2004-12-12"));
		form_KhachHang.txtDiaChi.setText("");
		form_KhachHang.txtSDT.setText("0987875421");
		main.main.showForm(form_KhachHang);
		main.setVisible(true);
		TimeUnit.SECONDS.sleep(2);
		form_KhachHang.btnThem.doClick();
		assertTrue(form_KhachHang.check);
	}

//	 Fail bỏ trống số điện thoại
	@Test(priority = 7)
	public void test7() throws InterruptedException {
		form_KhachHang.txtHoTen.setText("Võ Văn A");
		form_KhachHang.buttonGroup1.setSelected(form_KhachHang.rdoNam.getModel(), true);
		form_KhachHang.txtNgaySinh.setDate(ngay("2004-12-12"));
		form_KhachHang.txtDiaChi.setText("Cần Thơ");
		form_KhachHang.txtSDT.setText("");
		main.main.showForm(form_KhachHang);
		main.setVisible(true);
		TimeUnit.SECONDS.sleep(2);
		form_KhachHang.btnThem.doClick();
		assertFalse(form_KhachHang.check);
	}

	// Fail số điện thoại không đủ 10 số
	@Test(priority = 8)
	public void test8() throws InterruptedException {
		form_KhachHang.txtHoTen.setText("Võ Văn V");
		form_KhachHang.buttonGroup1.setSelected(form_KhachHang.rdoNam.getModel(), true);
		form_KhachHang.txtNgaySinh.setDate(ngay("2001-12-12"));
		form_KhachHang.txtDiaChi.setText("Cần Thơ");
		form_KhachHang.txtSDT.setText("0909");
		main.main.showForm(form_KhachHang);
		main.setVisible(true);
		TimeUnit.SECONDS.sleep(2);
		form_KhachHang.btnThem.doClick();
		assertFalse(form_KhachHang.check);
	}

	// Fail số điện thoại nhiều hơn 10 số
	@Test(priority = 9)
	public void test9() throws InterruptedException {
		form_KhachHang.txtHoTen.setText("Võ Văn V");
		form_KhachHang.buttonGroup1.setSelected(form_KhachHang.rdoNam.getModel(), true);
		form_KhachHang.txtNgaySinh.setDate(ngay("2001-12-12"));
		form_KhachHang.txtDiaChi.setText("Cần Thơ");
		form_KhachHang.txtSDT.setText("09095678254612");
		main.main.showForm(form_KhachHang);
		main.setVisible(true);
		TimeUnit.SECONDS.sleep(2);
		form_KhachHang.btnThem.doClick();
		assertFalse(form_KhachHang.check);
	}
	// Fail số điện thoại không đúng định dạng
	@Test(priority = 10)
	public void test10() throws InterruptedException {
		form_KhachHang.txtHoTen.setText("Võ Văn A");
		form_KhachHang.buttonGroup1.setSelected(form_KhachHang.rdoNam.getModel(), true);
		form_KhachHang.txtNgaySinh.setDate(ngay("2004-12-12"));
		form_KhachHang.txtDiaChi.setText("Cần Thơ");
		form_KhachHang.txtSDT.setText("a098787542");
		main.main.showForm(form_KhachHang);
		main.setVisible(true);
		TimeUnit.SECONDS.sleep(2);
		form_KhachHang.btnThem.doClick();
		assertFalse(form_KhachHang.check);
	}
	// Fail khi số điện thoại trùng
	@Test(priority = 11)
	public void test11() throws InterruptedException {
		form_KhachHang.txtHoTen.setText("Nguyễn Văn V");
		form_KhachHang.buttonGroup1.setSelected(form_KhachHang.rdoNam.getModel(), true);
		form_KhachHang.txtNgaySinh.setDate(ngay("2004-12-12"));
		form_KhachHang.txtDiaChi.setText("Cần Thơ");
		form_KhachHang.txtSDT.setText("0791234212");
		main.main.showForm(form_KhachHang);
		main.setVisible(true);
		TimeUnit.SECONDS.sleep(2);
		form_KhachHang.btnThem.doClick();
		assertFalse(form_KhachHang.check);
	}

	// Fail khi số điện chứ dấu cách
	@Test(priority = 12)
	public void test12() throws InterruptedException {
		form_KhachHang.txtHoTen.setText("Nguyễn Văn V");
		form_KhachHang.buttonGroup1.setSelected(form_KhachHang.rdoNam.getModel(), true);
		form_KhachHang.txtNgaySinh.setDate(ngay("2004-12-12"));
		form_KhachHang.txtDiaChi.setText("Cần Thơ");
		form_KhachHang.txtSDT.setText("                      ");
		main.main.showForm(form_KhachHang);
		main.setVisible(true);
		TimeUnit.SECONDS.sleep(2);
		form_KhachHang.btnThem.doClick();
		assertFalse(form_KhachHang.check);
	}
	// Fail tên khoản cách
	@Test(priority = 13)
	public void test13() throws InterruptedException {
		form_KhachHang.txtHoTen.setText("                     ");
		form_KhachHang.buttonGroup1.setSelected(form_KhachHang.rdoNam.getModel(), true);
		form_KhachHang.txtNgaySinh.setDate(ngay("2004-12-12"));
		form_KhachHang.txtDiaChi.setText("Cần Thơ");
		form_KhachHang.txtSDT.setText("0989897653");
		main.main.showForm(form_KhachHang);
		main.setVisible(true);
		TimeUnit.SECONDS.sleep(2);
		form_KhachHang.btnThem.doClick();
		assertFalse(form_KhachHang.check);
	}

// Fail tên kí tự đặc biệt
	@Test(priority = 14)
	public void test14() throws InterruptedException {
		form_KhachHang.txtHoTen.setText("@123j");
		form_KhachHang.buttonGroup1.setSelected(form_KhachHang.rdoNam.getModel(), true);
		form_KhachHang.txtNgaySinh.setDate(ngay("2004-12-12"));
		form_KhachHang.txtDiaChi.setText("Cần Thơ");
		form_KhachHang.txtSDT.setText("0989897653");
		main.main.showForm(form_KhachHang);
		main.setVisible(true);
		TimeUnit.SECONDS.sleep(2);
		form_KhachHang.btnThem.doClick();
		assertFalse(form_KhachHang.check);
	}

	@AfterMethod
	public void afterMethod() {
		main.setVisible(false);
	}

}
