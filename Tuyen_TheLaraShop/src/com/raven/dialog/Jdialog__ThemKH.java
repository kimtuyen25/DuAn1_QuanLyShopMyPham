//HOÀN THÀNH
package com.raven.dialog;

import com.raven.main.Main;
import java.awt.Color;
import java.util.List;
import qlsmp.DAO.KhachHangDAO;
import qlsmp.Model.KhachHang;

public class Jdialog__ThemKH extends javax.swing.JDialog {

    public Jdialog__ThemKH(java.awt.Frame parent, boolean modal) {
        super(parent, modal);
        initComponents();
    }

    public void showThemKHMoi(String sdt) {
        init();
        txtSDT.setText(sdt);
        setVisible(true);

    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        buttonGroup1 = new javax.swing.ButtonGroup();
        jPanel3 = new javax.swing.JPanel();
        jLabel11 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jPanel4 = new javax.swing.JPanel();
        rdoNu = new javax.swing.JRadioButton();
        rdoNam = new javax.swing.JRadioButton();
        jLabel9 = new javax.swing.JLabel();
        txtHoTen = new javax.swing.JTextField();
        txtSDT = new javax.swing.JTextField();
        jLabel7 = new javax.swing.JLabel();
        txtNgaySinh = new javax.swing.JTextField();
        txtDiaChi = new javax.swing.JTextField();
        btnThem = new javax.swing.JButton();
        btnMoi = new javax.swing.JButton();
        lblErrSDT = new javax.swing.JLabel();
        lblErrNgaySinh = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setTitle("Thêm khách hàng mới");

        jPanel3.setBackground(new java.awt.Color(255, 255, 255));
        jPanel3.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        jPanel3.setEnabled(false);

        jLabel11.setText("Điện thoại");

        jLabel8.setText("Địa chỉ");

        jLabel4.setText("Họ tên");

        jPanel4.setBackground(new java.awt.Color(255, 255, 255));
        jPanel4.setBorder(javax.swing.BorderFactory.createEtchedBorder(new java.awt.Color(226, 232, 240), null));

        buttonGroup1.add(rdoNu);
        rdoNu.setText("Nữ");

        buttonGroup1.add(rdoNam);
        rdoNam.setText("Nam");

        javax.swing.GroupLayout jPanel4Layout = new javax.swing.GroupLayout(jPanel4);
        jPanel4.setLayout(jPanel4Layout);
        jPanel4Layout.setHorizontalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(rdoNam)
                .addGap(18, 18, 18)
                .addComponent(rdoNu)
                .addGap(0, 0, Short.MAX_VALUE))
        );
        jPanel4Layout.setVerticalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel4Layout.createSequentialGroup()
                .addContainerGap(10, Short.MAX_VALUE)
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(rdoNam)
                    .addComponent(rdoNu))
                .addGap(10, 10, 10))
        );

        jLabel9.setText("Giới tính");

        txtHoTen.setBackground(new java.awt.Color(226, 232, 240));

        txtSDT.setBackground(new java.awt.Color(226, 232, 240));

        jLabel7.setText("Ngày sinh");

        txtNgaySinh.setBackground(new java.awt.Color(226, 232, 240));

        txtDiaChi.setBackground(new java.awt.Color(226, 232, 240));

        btnThem.setBackground(new java.awt.Color(11, 52, 106));
        btnThem.setForeground(new java.awt.Color(255, 255, 255));
        btnThem.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/add.png"))); // NOI18N
        btnThem.setText("Khách hàng");
        btnThem.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnThemActionPerformed(evt);
            }
        });

        btnMoi.setBackground(new java.awt.Color(11, 52, 106));
        btnMoi.setForeground(new java.awt.Color(255, 255, 255));
        btnMoi.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/restart.png"))); // NOI18N
        btnMoi.setText("Mới");
        btnMoi.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnMoiActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addGap(21, 21, 21)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(txtSDT)
                    .addComponent(jLabel7)
                    .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 149, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel9)
                    .addComponent(jPanel4, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jLabel8)
                    .addComponent(txtHoTen)
                    .addComponent(txtNgaySinh)
                    .addComponent(txtDiaChi)
                    .addComponent(jLabel11)
                    .addComponent(lblErrSDT, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel3Layout.createSequentialGroup()
                        .addComponent(btnThem, javax.swing.GroupLayout.PREFERRED_SIZE, 125, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 268, Short.MAX_VALUE)
                        .addComponent(btnMoi, javax.swing.GroupLayout.PREFERRED_SIZE, 125, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(lblErrNgaySinh, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap(34, Short.MAX_VALUE))
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addGap(56, 56, 56)
                .addComponent(jLabel4)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(txtHoTen, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(27, 27, 27)
                .addComponent(jLabel9)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(27, 27, 27)
                .addComponent(jLabel7)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(txtNgaySinh, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(1, 1, 1)
                .addComponent(lblErrNgaySinh, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel8)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(txtDiaChi, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(27, 27, 27)
                .addComponent(jLabel11)
                .addGap(2, 2, 2)
                .addComponent(txtSDT, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(3, 3, 3)
                .addComponent(lblErrSDT, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnThem)
                    .addComponent(btnMoi))
                .addContainerGap(89, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 577, Short.MAX_VALUE)
            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addComponent(jPanel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 587, Short.MAX_VALUE)
            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addComponent(jPanel3, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnThemActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnThemActionPerformed
        insert();
    }//GEN-LAST:event_btnThemActionPerformed

    private void btnMoiActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnMoiActionPerformed
        clearForm();
    }//GEN-LAST:event_btnMoiActionPerformed

    /**
     * @param args the command line arguments
     */
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
            java.util.logging.Logger.getLogger(Jdialog__ThemKH.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Jdialog__ThemKH.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Jdialog__ThemKH.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Jdialog__ThemKH.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the dialog */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                Jdialog__ThemKH dialog = new Jdialog__ThemKH(new javax.swing.JFrame(), true);
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
    private javax.swing.JButton btnMoi;
    private javax.swing.JButton btnThem;
    private javax.swing.ButtonGroup buttonGroup1;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JLabel lblErrNgaySinh;
    private javax.swing.JLabel lblErrSDT;
    private javax.swing.JRadioButton rdoNam;
    private javax.swing.JRadioButton rdoNu;
    private javax.swing.JTextField txtDiaChi;
    private javax.swing.JTextField txtHoTen;
    private javax.swing.JTextField txtNgaySinh;
    private javax.swing.JTextField txtSDT;
    // End of variables declaration//GEN-END:variables

    private boolean indexInsert = false;
    KhachHangDAO dao = new KhachHangDAO();

    private void init() {
        setLocationRelativeTo(null);
        rdoNam.setSelected(true);
        clearForm();
    }

    private void showMessage(Jdialog__ThemKH aThis, String message) {
        Message obj = new Message(Main.getFrames()[0], true);
        obj.showMessage(message);
    }

    private void clearForm() {
        this.setForm(new KhachHang());
    }

    private void setForm(KhachHang nv) {
        txtDiaChi.setText(nv.getDiaChi());
        txtHoTen.setText(nv.getTenKH());
        txtNgaySinh.setText(nv.getNgaySinh());
        txtSDT.setText(nv.getSDT());
        if (nv.isGioiTinh() == true) {
            rdoNam.setSelected(true);
        } else {
            rdoNu.setSelected(true);
        }
        rdoNam.setSelected(true);
    }

    private KhachHang getForm() {
        KhachHang model = new KhachHang();

        if (checkForm() == false) {
            return model = null;
        } else {
            model.setTenKH(txtHoTen.getText());
            if (rdoNam.isSelected()) {
                model.setGioiTinh(true);
            } else {
                model.setGioiTinh(false);
            }
            model.setNgaySinh(txtNgaySinh.getText());
            model.setDiaChi(txtDiaChi.getText());
            model.setSDT(txtSDT.getText());
            return model;
        }
    }

    boolean checkExitSDt(String sdt, String sdttrue) {
        List<KhachHang> list = dao.selectAll();
        for (KhachHang kh : list) {
            if (sdt.equals(kh.getSDT())) {
                this.showMessage(this, sdttrue);
                return true;
            }
        }
        return false;
    }

    boolean checkForm() {
        String PHONE_NUMBER_REGEX = "^(089|090|093|070|079|097|096|098|038|039)[0-9]{7}";
        String DATE_REGEX = "^\\d{4}\\-(0?[1-9]|1[012])\\-(0?[1-9]|[12][0-9]|3[01])$";

        if (txtDiaChi.getText().isBlank() || txtHoTen.getText().isBlank() || txtNgaySinh.getText().isBlank()
                || txtSDT.getText().isBlank()) {
            this.showMessage(this, "Vui lòng điền đầy đủ thông tin");
            return false;
        }
        //check sdt 10 số
        if (txtSDT.getText().length() < 10) {
            lblErrSDT.setForeground(Color.red);
            lblErrSDT.setText("Vui lòng nhập đúng số điện thoại gồm 10 số.");
            return false;
        } else if (!txtSDT.getText().matches(PHONE_NUMBER_REGEX)) {
            lblErrSDT.setForeground(Color.red);
            lblErrSDT.setText("Số điện thoại không đúng định dạng.");
            return false;
        } else {
            lblErrSDT.setForeground(Color.white);
            lblErrSDT.setText("");
            if (checkExitSDt(txtSDT.getText(), "Số điện thoại đã tồn tại.")) {
                return false;
            }
        }

        //check ngày sinh đúng định dạng
        if (!txtNgaySinh.getText().matches(DATE_REGEX)) {
            lblErrNgaySinh.setForeground(Color.red);
            lblErrNgaySinh.setText("Vui lòng nhập ngày sinh theo định dạng yyyy-MM-dd");
            return false;
        } else {
            lblErrNgaySinh.setForeground(Color.white);
            lblErrNgaySinh.setText("");
        }
        return true;
    }

    private void insert() {
        if (checkForm()) {
            KhachHang model = getForm();
            try {
                dao.insert2(model);
                this.clearForm();
                this.showMessage(this, "Thêm mới thành công");
            } catch (Exception e) {
                System.out.println(e);
                this.showMessage(this, "Thêm mới thất bại");
            }
        }
    }

}
