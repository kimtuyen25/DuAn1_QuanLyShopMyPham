package com.raven.form;

import java.util.ArrayList;
import java.util.List;
import javax.swing.JOptionPane;
import qlsmp.DAO.NhanVienDAO;
import qlsmp.Model.NhanVien;
import qlsmp.utis.Auth;

public class Form_DoiMK extends javax.swing.JPanel {

    List<NhanVien> list = new ArrayList<>();
    NhanVienDAO dao = new NhanVienDAO();

    public Form_DoiMK() {
        initComponents();
        txtMatKhauMoi.setBackground(new java.awt.Color(0, 0, 0, 1));
        txtXacNhan.setBackground(new java.awt.Color(0, 0, 0, 1));
        txtMKCu.setBackground(new java.awt.Color(0, 0, 0, 1));
    }

    @SuppressWarnings("unchecked") 
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        txtXacNhan = new javax.swing.JPasswordField();
        jButton1 = new javax.swing.JButton();
        disable = new javax.swing.JLabel();
        show = new javax.swing.JLabel();
        disable1 = new javax.swing.JLabel();
        show1 = new javax.swing.JLabel();
        txtMatKhauMoi = new javax.swing.JPasswordField();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        txtMKCu = new javax.swing.JPasswordField();
        disable2 = new javax.swing.JLabel();
        show2 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();

        setBackground(new java.awt.Color(218, 240, 253));
        setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setFont(new java.awt.Font("Segoe UI", 1, 36)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(51, 102, 255));
        jLabel1.setText("ĐỔI MẬT KHẨU");
        jPanel1.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(230, 90, 290, -1));

        jLabel2.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(0, 153, 255));
        jLabel2.setText("Mật Khẩu Mới");
        jPanel1.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 270, 96, -1));

        jLabel3.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(0, 153, 255));
        jLabel3.setText("Xác Nhận Mật Khẩu");
        jPanel1.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 330, 125, -1));

        txtXacNhan.setFont(txtXacNhan.getFont().deriveFont(txtXacNhan.getFont().getSize()+3f));
        txtXacNhan.setBorder(null);
        txtXacNhan.setCaretColor(new java.awt.Color(51, 51, 255));
        jPanel1.add(txtXacNhan, new org.netbeans.lib.awtextra.AbsoluteConstraints(249, 328, 280, -1));

        jButton1.setBackground(new java.awt.Color(0, 51, 255));
        jButton1.setForeground(new java.awt.Color(255, 255, 255));
        jButton1.setText("Xác Nhận");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        jPanel1.add(jButton1, new org.netbeans.lib.awtextra.AbsoluteConstraints(438, 392, 96, 39));

        disable.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/hidden.png"))); // NOI18N
        disable.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                disableMouseClicked(evt);
            }
        });
        jPanel1.add(disable, new org.netbeans.lib.awtextra.AbsoluteConstraints(559, 268, -1, -1));

        show.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/mo.png"))); // NOI18N
        show.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                showMouseClicked(evt);
            }
        });
        jPanel1.add(show, new org.netbeans.lib.awtextra.AbsoluteConstraints(559, 268, -1, -1));

        disable1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/hidden.png"))); // NOI18N
        disable1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                disable1MouseClicked(evt);
            }
        });
        jPanel1.add(disable1, new org.netbeans.lib.awtextra.AbsoluteConstraints(559, 328, -1, -1));

        show1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/mo.png"))); // NOI18N
        show1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                show1MouseClicked(evt);
            }
        });
        jPanel1.add(show1, new org.netbeans.lib.awtextra.AbsoluteConstraints(559, 328, -1, -1));

        txtMatKhauMoi.setFont(txtMatKhauMoi.getFont().deriveFont(txtMatKhauMoi.getFont().getSize()+3f));
        txtMatKhauMoi.setBorder(null);
        txtMatKhauMoi.setCaretColor(new java.awt.Color(51, 51, 255));
        jPanel1.add(txtMatKhauMoi, new org.netbeans.lib.awtextra.AbsoluteConstraints(249, 268, 280, 20));

        jLabel7.setForeground(new java.awt.Color(102, 204, 255));
        jLabel7.setText("__________________________________________________________");
        jPanel1.add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(250, 338, 290, -1));

        jLabel8.setForeground(new java.awt.Color(102, 204, 255));
        jLabel8.setText("__________________________________________________________");
        jPanel1.add(jLabel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(250, 278, 290, -1));

        jLabel5.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(0, 153, 255));
        jLabel5.setText("Mật Khẩu Hiện Tại");
        jPanel1.add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 220, -1, -1));

        jLabel6.setForeground(new java.awt.Color(102, 204, 255));
        jLabel6.setText("_________________________________________________________");
        jPanel1.add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(250, 220, 280, -1));

        txtMKCu.setFont(txtMKCu.getFont().deriveFont(txtMKCu.getFont().getSize()+3f));
        txtMKCu.setBorder(null);
        txtMKCu.setCaretColor(new java.awt.Color(51, 51, 255));
        jPanel1.add(txtMKCu, new org.netbeans.lib.awtextra.AbsoluteConstraints(250, 210, 280, -1));

        disable2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/hidden.png"))); // NOI18N
        disable2.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                disable2MouseClicked(evt);
            }
        });
        jPanel1.add(disable2, new org.netbeans.lib.awtextra.AbsoluteConstraints(560, 210, -1, -1));

        show2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/mo.png"))); // NOI18N
        show2.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                show2MouseClicked(evt);
            }
        });
        jPanel1.add(show2, new org.netbeans.lib.awtextra.AbsoluteConstraints(560, 210, -1, -1));

        add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(290, 100, 720, 490));

        jLabel4.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/NENmp.jpg"))); // NOI18N
        add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, -80, 1290, 840));
    }// </editor-fold>//GEN-END:initComponents

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        if (!validates()) {
            return;
        } else {
            update();
        }
    }//GEN-LAST:event_jButton1ActionPerformed

    private void disableMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_disableMouseClicked
        txtMatKhauMoi.setEchoChar((char) 0);
        disable.setVisible(false);
        disable.setEnabled(false);
        show.setEnabled(true);
        show.setEnabled(true);
    }//GEN-LAST:event_disableMouseClicked

    private void showMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_showMouseClicked
        txtMatKhauMoi.setEchoChar((char) 8226);
        disable.setVisible(true);
        disable.setEnabled(true);
        show.setEnabled(false);
        show.setEnabled(false);
    }//GEN-LAST:event_showMouseClicked

    private void disable1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_disable1MouseClicked
        txtXacNhan.setEchoChar((char) 0);
        disable1.setVisible(false);
        disable1.setEnabled(false);
        show1.setEnabled(true);
        show1.setEnabled(true);
    }//GEN-LAST:event_disable1MouseClicked

    private void show1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_show1MouseClicked
        txtXacNhan.setEchoChar((char) 8226);
        disable1.setVisible(true);
        disable1.setEnabled(true);
        show1.setEnabled(false);
        show1.setEnabled(false);
    }//GEN-LAST:event_show1MouseClicked

    private void disable2MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_disable2MouseClicked
        txtMKCu.setEchoChar((char) 0);
        disable2.setVisible(false);
        disable2.setEnabled(false);
        show2.setEnabled(true);
        show2.setEnabled(true);
    }//GEN-LAST:event_disable2MouseClicked

    private void show2MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_show2MouseClicked
        txtMKCu.setEchoChar((char) 8226);
        disable2.setVisible(true);
        disable2.setEnabled(true);
        show2.setEnabled(false);
        show2.setEnabled(false);
    }//GEN-LAST:event_show2MouseClicked


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel disable;
    private javax.swing.JLabel disable1;
    private javax.swing.JLabel disable2;
    private javax.swing.JButton jButton1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JLabel show;
    private javax.swing.JLabel show1;
    private javax.swing.JLabel show2;
    private javax.swing.JPasswordField txtMKCu;
    private javax.swing.JPasswordField txtMatKhauMoi;
    private javax.swing.JPasswordField txtXacNhan;
    // End of variables declaration//GEN-END:variables

    public void update() {
        NhanVien nv = dao.selectByUsername(Auth.user.getUsername());
        nv.setPassword(NhanVienDAO.getMd5(txtMatKhauMoi.getText().toString().trim()));
        NhanVienDAO.doiMatKhauNV(nv);
        JOptionPane.showMessageDialog(this, "Đổi mật khẩu thành công");
    }

    boolean validates() {
        String username = Auth.user.getUsername();
        String matKhau = new String(dao.getMd5(txtMKCu.getText()));
        NhanVien acc = dao.selectByUssername(username);
        if (txtMKCu.getText().equals("")) {
            JOptionPane.showMessageDialog(this, "MẬT KHẨU HIỆN TẠI KHÔNG ĐƯỢC TRỐNG!! ", "CHÚ Ý!!!", 1);
            txtMKCu.requestFocus();
            return false;
        }
        if (!matKhau.equals(acc.getPassword())) {
            JOptionPane.showMessageDialog(this, "SAI MẬT KHẨU ĐĂNG NHẬP!!");
            return false;
        }
        if (txtMatKhauMoi.getText().equals("")) {
            JOptionPane.showMessageDialog(this, "MẬT KHẨU MỚI KHÔNG ĐƯỢC TRỐNG!! ", "CHÚ Ý!!!", 1);
            txtMatKhauMoi.requestFocus();
            return false;
        }
        if (txtXacNhan.getText().equals("")) {
            JOptionPane.showMessageDialog(this, "XÁC NHẬN MẬT KHẨU KHÔNG ĐƯỢC TRỐNG!! ", "CHÚ Ý!!!", 1);
            txtXacNhan.requestFocus();
            return false;
        }
        if (txtMKCu.getText().equals(txtMatKhauMoi.getText())) {
            JOptionPane.showMessageDialog(this, "MẬT KHẨU CŨ VÀ MẬT KHẨU MỚI KHÔNG ĐƯỢC GIỐNG NHAU!!");
            txtMKCu.requestFocus();
            return false;
        } else if (!txtXacNhan.getText().equals(txtMatKhauMoi.getText())) {
            JOptionPane.showMessageDialog(this, "MẬT KHẨU XÁC NHẬN KHÔNG TRÙNG KHỚP!");
            txtXacNhan.requestFocus();
            return false;
        }
        return true;
    }
}
