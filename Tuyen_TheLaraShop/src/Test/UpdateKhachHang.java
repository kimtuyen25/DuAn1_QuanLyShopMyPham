package Test;

import static org.testng.Assert.assertFalse;
import static org.testng.Assert.assertTrue;

import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.concurrent.TimeUnit;

import javax.swing.JOptionPane;

import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import com.raven.form.Form_DangNhap;
import com.raven.form.Form_KhachHang;
import com.raven.main.Main;

import qlsmp.DAO.KhachHangDAO;
import qlsmp.Model.KhachHang;

public class UpdateKhachHang {
	Main main;
	Form_KhachHang form_KhachHang;

	@BeforeClass
	public void beforClass() throws InterruptedException {
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

	@BeforeMethod
	public void beforeMethod() {
		KhachHangDAO dao = new KhachHangDAO();
		KhachHang entity = dao.selecteByID(12);
		form_KhachHang.setForm(entity);
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

// Pass Update họ tên,giới tính, ngày sinh, địa chỉ, số điện thoại
//	@Test(priority = 1)
//	public void test1() throws InterruptedException {
//		form_KhachHang.txtHoTen.setText("Yên Chi");
//		form_KhachHang.buttonGroup1.setSelected(form_KhachHang.rdoNu.getModel(), true);
//		form_KhachHang.txtNgaySinh.setDate(ngay("2000-12-12"));
//		form_KhachHang.txtDiaChi.setText("Yên Bái");
//		form_KhachHang.txtSDT.setText("0981232390");
//		main.main.showForm(form_KhachHang);
//		form_KhachHang.btnSua.setEnabled(true);
//		main.setVisible(true);
//		TimeUnit.SECONDS.sleep(5);
//		form_KhachHang.btnSua.doClick();
//		assertTrue(form_KhachHang.check);
//	}
//
//// Fail Update mã khách hàng = null	
//	@Test(priority = 2)
//	public void test2() throws InterruptedException {
//		main.main.showForm(form_KhachHang);
//		form_KhachHang.btnMoi.setEnabled(true);
//		form_KhachHang.btnMoi.doClick();
//		form_KhachHang.btnSua.setEnabled(true);
//		main.setVisible(true);
//		TimeUnit.SECONDS.sleep(5);
//		form_KhachHang.btnSua.doClick();
//		assertFalse(form_KhachHang.check);
//	}

// Fail Update tên chứa kí tự đặc biệt
//	@Test(priority = 3)
//	public void test3() throws InterruptedException {
//		form_KhachHang.txtHoTen.setText("@123");
//		main.main.showForm(form_KhachHang);
//		form_KhachHang.btnSua.setEnabled(true);
//		main.setVisible(true);
//		TimeUnit.SECONDS.sleep(5);
//		form_KhachHang.btnSua.doClick();
//		assertFalse(form_KhachHang.check);
//	}

// Fail Update họ tên bằng null
//	@Test(priority = 4)
//	public void test4() throws InterruptedException {
//		form_KhachHang.txtHoTen.setText("");
//		main.main.showForm(form_KhachHang);
//		form_KhachHang.btnSua.setEnabled(true);
//		main.setVisible(true);
//		TimeUnit.SECONDS.sleep(5);
//		form_KhachHang.btnSua.doClick();
//		assertFalse(form_KhachHang.check);
//	}
//
//// Fail Update không nhập ngày sinh
//	@Test(priority = 5)
//	public void test5() throws InterruptedException {
//		form_KhachHang.txtNgaySinh.setDate(null);
//		main.main.showForm(form_KhachHang);
//		form_KhachHang.btnSua.setEnabled(true);
//		main.setVisible(true);
//		TimeUnit.SECONDS.sleep(5);
//		form_KhachHang.btnSua.doClick();
//		assertFalse(form_KhachHang.check);
//	}
//
//// Pass Update địa chỉ băng null
//	@Test(priority = 6)
//	public void test6() throws InterruptedException {
//		form_KhachHang.txtDiaChi.setText("");
//		main.main.showForm(form_KhachHang);
//		form_KhachHang.btnSua.setEnabled(true);
//		main.setVisible(true);
//		TimeUnit.SECONDS.sleep(5);
//		form_KhachHang.btnSua.doClick();
//		assertTrue(form_KhachHang.check);
//	}
//
////	Fail Update sdt bằng null
//	@Test(priority = 7)
//	public void test7() throws InterruptedException {
//		form_KhachHang.txtDiaChi.setText("Cần Thơ");
//		form_KhachHang.txtSDT.setText("");
//		main.main.showForm(form_KhachHang);
//		form_KhachHang.btnSua.setEnabled(true);
//		main.setVisible(true);
//		TimeUnit.SECONDS.sleep(5);
//		form_KhachHang.btnSua.doClick();
//		assertFalse(form_KhachHang.check);
//	}
//
////	Fail Update sdt không đủ 10 số
//	@Test(priority = 8)
//	public void test8() throws InterruptedException {
//		form_KhachHang.txtSDT.setText("098987");
//		main.main.showForm(form_KhachHang);
//		form_KhachHang.btnSua.setEnabled(true);
//		main.setVisible(true);
//		TimeUnit.SECONDS.sleep(5);
//		form_KhachHang.btnSua.doClick();
//		assertFalse(form_KhachHang.check);
//	}
//
////	Fail Update sdt hơn 10 số
//	@Test(priority =9)
//	public void test9() throws InterruptedException {
//		form_KhachHang.txtSDT.setText("09453498787623");
//		main.main.showForm(form_KhachHang);
//		form_KhachHang.btnSua.setEnabled(true);
//		main.setVisible(true);
//		TimeUnit.SECONDS.sleep(5);
//		form_KhachHang.btnSua.doClick();
//		assertFalse(form_KhachHang.check);
//	}
//
////	Fail Update sdt đủ 10 kí tự không đúng định dạng
//	@Test(priority = 10)
//	public void test10() throws InterruptedException {
//		form_KhachHang.txtSDT.setText("ag34567891");
//		main.main.showForm(form_KhachHang);
//		form_KhachHang.btnSua.setEnabled(true);
//		main.setVisible(true);
//		TimeUnit.SECONDS.sleep(5);
//		form_KhachHang.btnSua.doClick();
//		assertTrue(form_KhachHang.check);
//	}
////Fail Update số thoại chứa kí tự đặc biệt không đủ 10 kí tự
//	@Test(priority = 11)
//	public void test11() throws InterruptedException {
//	form_KhachHang.txtSDT.setText("@098767");
//		main.main.showForm(form_KhachHang);
//		form_KhachHang.btnSua.setEnabled(true);
//		main.setVisible(true);
//		TimeUnit.SECONDS.sleep(5);
//		form_KhachHang.btnSua.doClick();
//		assertFalse(form_KhachHang.check);
//	}
////	 Fail Update họ tên bằng kí tự trắng
		@Test(priority = 12)
		public void test12() throws InterruptedException {
			form_KhachHang.txtHoTen.setText("                ");
			main.main.showForm(form_KhachHang);
			form_KhachHang.btnSua.setEnabled(true);
			main.setVisible(true);
			TimeUnit.SECONDS.sleep(5);
			form_KhachHang.btnSua.doClick();
			assertFalse(form_KhachHang.check);
		}
////	 Fail Update số điện thoại
//	@Test(priority = 13)
//	public void test13() throws InterruptedException {
//		form_KhachHang.txtSDT.setText("                ");
//		main.main.showForm(form_KhachHang);
//		form_KhachHang.btnSua.setEnabled(true);
//		main.setVisible(true);
//		TimeUnit.SECONDS.sleep(5);
//		form_KhachHang.btnSua.doClick();
//		assertFalse(form_KhachHang.check);
//	}

	@AfterMethod
	public void afterMethod() {
	}

	@AfterClass
	public void afterClass() {
		main.setVisible(false);
	}
}
