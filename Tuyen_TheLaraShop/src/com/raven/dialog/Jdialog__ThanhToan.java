//20/11 : HOÀN THÀNH
package com.raven.dialog;

import com.raven.form.Form_MuaHang;
import com.raven.main.Main;
import java.awt.Color;
import java.text.DecimalFormat;
import java.text.NumberFormat;
import java.util.ArrayList;
import java.util.List;
import qlsmp.DAO.CTHDDAO;
import qlsmp.DAO.HoaDonDAO;
import qlsmp.DAO.KhachHangDAO;
import qlsmp.Model.HoaDon;
import qlsmp.Model.NhanVien;
import qlsmp.DAO.NhanVienDAO;
import qlsmp.Model.CTHD;
import qlsmp.Model.KhachHang;

public class Jdialog__ThanhToan extends javax.swing.JDialog {

    public Jdialog__ThanhToan(java.awt.Frame parent, boolean modal) {
        super(parent, modal);
        initComponents();
        setLocationRelativeTo(null);
    }

    public void showThanhToan() {
        setVisible(true);
        setLocationRelativeTo(null);
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        lblUsername = new javax.swing.JLabel();
        lblErrorTien = new javax.swing.JLabel();
        lblSale = new javax.swing.JLabel();
        lblTongTien = new javax.swing.JLabel();
        lblTenKH = new javax.swing.JLabel();
        txtTienKhachDua = new javax.swing.JTextField();
        jLabel18 = new javax.swing.JLabel();
        lblTienThua = new javax.swing.JLabel();
        btnThanhToan = new javax.swing.JButton();
        lblThanhTien = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setTitle("Thanh Toán");
        addWindowListener(new java.awt.event.WindowAdapter() {
            public void windowOpened(java.awt.event.WindowEvent evt) {
                formWindowOpened(evt);
            }
        });

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));

        jLabel1.setText("Mã nhân viên:");

        jLabel2.setText("Tên khách hàng:");

        jLabel3.setText("Tổng tiền hàng:");

        jLabel4.setText("Giảm giá:");

        jLabel5.setText("Khách cần thanh toán:");

        jLabel6.setText("Khách thanh toán:");

        lblUsername.setText("Tâm Nguyễn");

        lblErrorTien.setForeground(new java.awt.Color(255, 0, 0));
        lblErrorTien.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        lblErrorTien.setText("Không đúng định dạng số. ");

        lblSale.setText("0");

        lblTongTien.setText("122.000");

        lblTenKH.setText("Nguyễn Thanh Tâm");

        txtTienKhachDua.setText("500.000");
        txtTienKhachDua.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtTienKhachDuaActionPerformed(evt);
            }
        });

        jLabel18.setText("Tiền thừ trả cho khách:");

        lblTienThua.setText("38.000");

        btnThanhToan.setBackground(new java.awt.Color(0, 0, 102));
        btnThanhToan.setForeground(new java.awt.Color(255, 255, 255));
        btnThanhToan.setText("Thanh Toán");
        btnThanhToan.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnThanhToanActionPerformed(evt);
            }
        });

        lblThanhTien.setText("122.000");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(40, 40, 40)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 97, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 132, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jLabel6, javax.swing.GroupLayout.PREFERRED_SIZE, 132, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 97, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 97, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 97, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(82, 82, 82)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(lblTongTien, javax.swing.GroupLayout.PREFERRED_SIZE, 97, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(lblSale, javax.swing.GroupLayout.PREFERRED_SIZE, 97, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(lblTenKH, javax.swing.GroupLayout.PREFERRED_SIZE, 138, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(lblUsername, javax.swing.GroupLayout.PREFERRED_SIZE, 122, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(txtTienKhachDua, javax.swing.GroupLayout.PREFERRED_SIZE, 111, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(lblThanhTien, javax.swing.GroupLayout.PREFERRED_SIZE, 97, javax.swing.GroupLayout.PREFERRED_SIZE)))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(jLabel18, javax.swing.GroupLayout.PREFERRED_SIZE, 155, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(59, 59, 59)
                                .addComponent(lblTienThua, javax.swing.GroupLayout.PREFERRED_SIZE, 97, javax.swing.GroupLayout.PREFERRED_SIZE))))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(170, 170, 170)
                        .addComponent(lblErrorTien, javax.swing.GroupLayout.PREFERRED_SIZE, 195, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(152, 152, 152)
                        .addComponent(btnThanhToan, javax.swing.GroupLayout.PREFERRED_SIZE, 157, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(70, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(30, 30, 30)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(lblUsername))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jLabel2)
                    .addComponent(lblTenKH, javax.swing.GroupLayout.PREFERRED_SIZE, 16, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3)
                    .addComponent(lblTongTien))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel4)
                    .addComponent(lblSale))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel5)
                    .addComponent(lblThanhTien))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jLabel6)
                    .addComponent(txtTienKhachDua, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(lblErrorTien)
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel18)
                    .addComponent(lblTienThua))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 301, Short.MAX_VALUE)
                .addComponent(btnThanhToan, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(36, 36, 36))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnThanhToanActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnThanhToanActionPerformed
        this.thanhToan();

    }//GEN-LAST:event_btnThanhToanActionPerformed

    private void txtTienKhachDuaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtTienKhachDuaActionPerformed
        checkErrorTien();
        if (checkErrorTien()) {
            DecimalFormat decimalFormat = new DecimalFormat("#,###,##0.0");
            tienKhachDua = Float.parseFloat(txtTienKhachDua.getText());

            HoaDon hd = getForm();
            FillForm(hd);
            txtTienKhachDua.setText(decimalFormat.format(tienKhachDua));
        }

    }//GEN-LAST:event_txtTienKhachDuaActionPerformed

    private void formWindowOpened(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_formWindowOpened

    }//GEN-LAST:event_formWindowOpened

    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(Jdialog__ThanhToan.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Jdialog__ThanhToan.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Jdialog__ThanhToan.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Jdialog__ThanhToan.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>

        /* Create and display the dialog */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                Jdialog__ThanhToan dialog = new Jdialog__ThanhToan(new javax.swing.JFrame(), true);
                dialog.addWindowListener(new java.awt.event.WindowAdapter() {
                    @Override
                    public void windowClosing(java.awt.event.WindowEvent e) {
                        System.exit(0);
                    }
                });
                dialog.setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnThanhToan;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel18;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JLabel lblErrorTien;
    private javax.swing.JLabel lblSale;
    private javax.swing.JLabel lblTenKH;
    private javax.swing.JLabel lblThanhTien;
    private javax.swing.JLabel lblTienThua;
    private javax.swing.JLabel lblTongTien;
    private javax.swing.JLabel lblUsername;
    private javax.swing.JTextField txtTienKhachDua;
    // End of variables declaration//GEN-END:variables

    public float tienKhachDua = 0;
    String ngayTao;
    float tienThanhToan = 0;
    int maKH;

    private void showMessage(String message) {
        Message obj = new Message(Main.getFrames()[0], true);
        obj.showMessage(message);
    }

    boolean checkErrorTien() {
        try {
            DecimalFormat format = new DecimalFormat();
            Number tongtienformat = format.parse(txtTienKhachDua.getText());
            float tien = tongtienformat.floatValue();

            if (txtTienKhachDua.getText().isBlank()) {
                lblErrorTien.setText("Vui lòng nhập số tiền.");
                lblErrorTien.setForeground(Color.red);
                return false;
            } else {
                lblErrorTien.setForeground(Color.white);
            }
//        try {
            //double tien = Double.parseDouble(txtTienKhachDua.getText());
            if (tien < tienThanhToan) {
                lblErrorTien.setText("Tiền không đủ.");
                lblErrorTien.setForeground(Color.red);
                return false;
            }
            lblErrorTien.setForeground(Color.white);
//        } catch (Exception e) {
//            lblErrorTien.setText("Tiền không đúng định dạng.");
//            lblErrorTien.setForeground(Color.red);
//            return false;
//        }
        } catch (Exception e) {
        }
        return true;
    }

    HoaDon getForm() {
        DecimalFormat format = new DecimalFormat();
        HoaDon hd = new HoaDon();
        try {
            Number tongtienformat = format.parse(lblTongTien.getText());
            float tongtien1 = tongtienformat.floatValue();
            hd.setTongTien(tongtien1);

            Number thanhtienformat = format.parse(lblThanhTien.getText());
            float thanhTien1 = thanhtienformat.floatValue();
            hd.setThanhTien(thanhTien1);
        } catch (Exception e) {
        }
        NhanVienDAO nvDao = new NhanVienDAO();
        NhanVien nv = nvDao.selectByUsername(lblUsername.getText());
        hd.setIDAccount(nv.getMaNV() + "");
        hd.setIDKhachHang(maKH + "");

        String percentString = lblSale.getText().replace("%", "");
        double sale = Double.parseDouble(percentString) / 100;
        hd.setSale(sale);
        hd.setNgayTao(ngayTao);
        return hd;
    }

    public void FillForm(HoaDon hd) {
        NumberFormat percentFormat = NumberFormat.getPercentInstance();
        DecimalFormat decimalFormat = new DecimalFormat("#,###,##0.0");
        String tienthua = decimalFormat.format(tienKhachDua - hd.getThanhTien());
        String tongtien = decimalFormat.format(hd.getTongTien());
        String thanhtien = decimalFormat.format(hd.getThanhTien());

        NhanVienDAO nvDao = new NhanVienDAO();
        NhanVien nv = nvDao.selectById(Integer.parseInt(hd.getIDAccount()));
        lblUsername.setText(nv.getUsername());
        KhachHangDAO khdao = new KhachHangDAO();
        KhachHang kh = khdao.selecteByID(Integer.parseInt(hd.getIDKhachHang()));
        lblTenKH.setText(kh.getTenKH());
        maKH = kh.getMaKH();
        lblTongTien.setText(tongtien);
        lblSale.setText(percentFormat.format(hd.getSale()));
        lblThanhTien.setText(thanhtien);
        tienThanhToan = hd.getThanhTien();
        txtTienKhachDua.setText(tienKhachDua + "");
        lblErrorTien.setForeground(Color.white);
        lblTienThua.setText(tienthua);
        ngayTao = hd.getNgayTao();
    }

    void thanhToan() {
        try {
            DecimalFormat format = new DecimalFormat();
            Number tongtienformat = format.parse(txtTienKhachDua.getText());
            float tien = tongtienformat.floatValue();
            txtTienKhachDua.setText(tien + "");
        } catch (Exception e) {
        }
        //mãng nhận giá trị rỗng
        if (checkErrorTien()) {
            HoaDon hd = getForm();
            hd.setTrangThai(true);
            HoaDonDAO hdDao = new HoaDonDAO();
            HoaDon hdnew = hdDao.selecteTOP1DESC();
            hd.setMaHD(hdnew.getMaHD() + 1);
            hdDao.insert(hd);

            List<CTHD> listcthd = new ArrayList<>();
            listcthd = Form_MuaHang.listCTHD;
            System.out.println(listcthd);
            CTHDDAO cthdDao = new CTHDDAO();
            for (CTHD cthd : listcthd) {
                cthdDao.insert(cthd);
            }
            this.dispose();
            setVisible(false);
            Jdialog__Bill bill = new Jdialog__Bill(Main.getFrames()[0], true);
            bill.showBill();
        }
    }

}
