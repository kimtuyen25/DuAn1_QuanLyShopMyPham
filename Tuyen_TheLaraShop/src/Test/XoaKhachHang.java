package Test;

import static org.testng.Assert.assertFalse;
import static org.testng.Assert.assertTrue;

import java.util.concurrent.TimeUnit;

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

public class XoaKhachHang {
	Main main;
	Form_KhachHang form_KhachHang;
	KhachHangDAO dao;

	@BeforeClass
	public void beforClass() throws InterruptedException {
		Form_DangNhap form_login = new Form_DangNhap();

		form_login.txtMayChu.setText("127.0.0.1");
		form_login.txtTenDUAn.setText("QLSHOPMYPHAM");
		form_login.setVisible(true);
		// TimeUnit.SECONDS.sleep(2);
		form_login.btnConnect.doClick();
		// TimeUnit.SECONDS.sleepr(2);
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
		dao = new KhachHangDAO();
	}
// Xóa thành công do khách hàng chưa hoạt động
	@Test(priority = 1)
	public void test1() throws InterruptedException {
		KhachHang entity = dao.selecteByID(2);
		form_KhachHang.setForm(entity);
		main.main.showForm(form_KhachHang);
		form_KhachHang.btnXoa.setEnabled(true);
		main.setVisible(true);
		TimeUnit.SECONDS.sleep(5);
		form_KhachHang.btnXoa.doClick();
		form_KhachHang.luachondelete = 1;
		assertTrue(form_KhachHang.check);
	}
//	Xóa thất bại do khách hàng đang hoạt động
	@Test(priority = 2)
	public void test2() throws InterruptedException {
		KhachHang entity = dao.selecteByID(10);
		form_KhachHang.setForm(entity);
		main.main.showForm(form_KhachHang);
		form_KhachHang.btnXoa.setEnabled(true);
		main.setVisible(true);
		TimeUnit.SECONDS.sleep(5);
		form_KhachHang.btnXoa.doClick();
		form_KhachHang.luachondelete = 1;
		assertFalse(form_KhachHang.check);
	}
	

	@AfterMethod
	public void afterMethod() {
	}

	@AfterClass
	public void afterClass() {
		main.setVisible(false);
	}
}
