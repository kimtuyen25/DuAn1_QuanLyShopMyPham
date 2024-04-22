package com.raven.form;

import java.util.ArrayList;
import java.util.List;
import javax.swing.JOptionPane;
import qlsmp.DAO.NhanVienDAO;
import qlsmp.Model.NhanVien;

/**
 *
 * @author HO THI TRUC LY
 */
public class QuenMatKhau2 extends javax.swing.JFrame {

    List<NhanVien> list = new ArrayList<>();

    public QuenMatKhau2() {
        initComponents();
        setLocationRelativeTo(this);
        txtMatKhauMoi.setBackground(new java.awt.Color(0, 0, 0, 1));
        txtXacNhan.setBackground(new java.awt.Color(0, 0, 0, 1));
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        txtXacNhan = new javax.swing.JPasswordField();
        jLabel6 = new javax.swing.JLabel();
        jButton1 = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();
        disable = new javax.swing.JLabel();
        show = new javax.swing.JLabel();
        disable1 = new javax.swing.JLabel();
        show1 = new javax.swing.JLabel();
        txtMatKhauMoi = new javax.swing.JPasswordField();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setUndecorated(true);
        addWindowListener(new java.awt.event.WindowAdapter() {
            public void windowOpened(java.awt.event.WindowEvent evt) {
                formWindowOpened(evt);
            }
        });
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel1.setBackground(new java.awt.Color(25, 118, 211));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setText("QUÊN MẬT KHẨU");
        jPanel1.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(303, 56, 214, -1));

        jLabel2.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(255, 255, 255));
        jLabel2.setText("Mật Khẩu Mới");
        jPanel1.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(158, 129, 96, -1));

        jLabel3.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(255, 255, 255));
        jLabel3.setText("Xác Nhận Mật Khẩu");
        jPanel1.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(158, 189, 125, -1));

        txtXacNhan.setFont(txtXacNhan.getFont().deriveFont(txtXacNhan.getFont().getSize()+3f));
        txtXacNhan.setForeground(new java.awt.Color(255, 255, 255));
        txtXacNhan.setBorder(null);
        txtXacNhan.setCaretColor(new java.awt.Color(255, 255, 255));
        jPanel1.add(txtXacNhan, new org.netbeans.lib.awtextra.AbsoluteConstraints(320, 180, 230, -1));

        jLabel6.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(255, 255, 255));
        jLabel6.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel6.setText("X");
        jLabel6.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel6MouseClicked(evt);
            }
        });
        jPanel1.add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(790, 10, 40, -1));

        jButton1.setText("Xác Nhận");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        jPanel1.add(jButton1, new org.netbeans.lib.awtextra.AbsoluteConstraints(320, 250, -1, -1));

        jButton2.setText("Thoát");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });
        jPanel1.add(jButton2, new org.netbeans.lib.awtextra.AbsoluteConstraints(480, 250, -1, -1));

        disable.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/hidden.png"))); // NOI18N
        disable.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                disableMouseClicked(evt);
            }
        });
        jPanel1.add(disable, new org.netbeans.lib.awtextra.AbsoluteConstraints(580, 120, -1, -1));

        show.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/mo.png"))); // NOI18N
        show.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                showMouseClicked(evt);
            }
        });
        jPanel1.add(show, new org.netbeans.lib.awtextra.AbsoluteConstraints(580, 120, -1, -1));

        disable1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/hidden.png"))); // NOI18N
        disable1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                disable1MouseClicked(evt);
            }
        });
        jPanel1.add(disable1, new org.netbeans.lib.awtextra.AbsoluteConstraints(580, 180, -1, -1));

        show1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/mo.png"))); // NOI18N
        show1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                show1MouseClicked(evt);
            }
        });
        jPanel1.add(show1, new org.netbeans.lib.awtextra.AbsoluteConstraints(580, 180, -1, -1));

        txtMatKhauMoi.setFont(txtMatKhauMoi.getFont().deriveFont(txtMatKhauMoi.getFont().getSize()+3f));
        txtMatKhauMoi.setForeground(new java.awt.Color(255, 255, 255));
        txtMatKhauMoi.setBorder(null);
        txtMatKhauMoi.setCaretColor(new java.awt.Color(255, 255, 255));
        jPanel1.add(txtMatKhauMoi, new org.netbeans.lib.awtextra.AbsoluteConstraints(320, 120, 230, 20));

        jLabel7.setForeground(new java.awt.Color(255, 255, 255));
        jLabel7.setText("______________________________________________");
        jPanel1.add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(320, 190, 230, -1));

        jLabel8.setForeground(new java.awt.Color(255, 255, 255));
        jLabel8.setText("______________________________________________");
        jPanel1.add(jLabel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(320, 130, 230, -1));

        getContentPane().add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 840, 350));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void show1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_show1MouseClicked
        txtXacNhan.setEchoChar((char) 8226);
        disable1.setVisible(true);
        disable1.setEnabled(true);
        show1.setEnabled(false);
        show1.setEnabled(false);
    }//GEN-LAST:event_show1MouseClicked

    private void disable1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_disable1MouseClicked
        txtXacNhan.setEchoChar((char) 0);
        disable1.setVisible(false);
        disable1.setEnabled(false);
        show1.setEnabled(true);
        show1.setEnabled(true);
    }//GEN-LAST:event_disable1MouseClicked

    private void showMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_showMouseClicked
        txtMatKhauMoi.setEchoChar((char) 8226);
        disable.setVisible(true);
        disable.setEnabled(true);
        show.setEnabled(false);
        show.setEnabled(false);
    }//GEN-LAST:event_showMouseClicked

    private void disableMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_disableMouseClicked
        txtMatKhauMoi.setEchoChar((char) 0);
        disable.setVisible(false);
        disable.setEnabled(false);
        show.setEnabled(true);
        show.setEnabled(true);
    }//GEN-LAST:event_disableMouseClicked

    private void jLabel6MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel6MouseClicked
        System.exit(0);
    }//GEN-LAST:event_jLabel6MouseClicked

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        if (check()) {
            update();
        }
    }//GEN-LAST:event_jButton1ActionPerformed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        System.exit(0);
    }//GEN-LAST:event_jButton2ActionPerformed

    private void formWindowOpened(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_formWindowOpened
        for (double i = 0.0; i <= 1.0; i = i + 0.1) {
            String val = i + "";
            float f = Float.valueOf(val);
            this.setOpacity(f);
            try {
                Thread.sleep(50);
            } catch (Exception e) {
            }
        }
    }//GEN-LAST:event_formWindowOpened

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
            java.util.logging.Logger.getLogger(QuenMatKhau2.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(QuenMatKhau2.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(QuenMatKhau2.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(QuenMatKhau2.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new QuenMatKhau2().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel disable;
    private javax.swing.JLabel disable1;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JLabel show;
    private javax.swing.JLabel show1;
    private javax.swing.JPasswordField txtMatKhauMoi;
    private javax.swing.JPasswordField txtXacNhan;
    // End of variables declaration//GEN-END:variables
public static String email;

    public String ktEmail(String kt) {
        return email = kt;
    }

    public void update() {
        NhanVien nv = new NhanVien();
        nv.setEmail(email);
        nv.setPassword(NhanVienDAO.getMd5(txtMatKhauMoi.getText().toString()));
        System.out.println(nv.getPassword());
        NhanVienDAO.doiMatKhau(nv);
        JOptionPane.showMessageDialog(this, "Đổi mật khẩu thành công");
        dispose();

    }

    public boolean check() {
        if (txtMatKhauMoi.getText().isBlank()) {
            JOptionPane.showMessageDialog(this, "Mật khẩu mới đang rỗng.");
            return false;
        }
        if (txtMatKhauMoi.getText().equals(txtXacNhan.getText()) && !txtMatKhauMoi.getText().isBlank()) {
            return true;
        }
        JOptionPane.showMessageDialog(this, "Mật Khẩu Mới Và Xác Nhận Mật Khẩu Không Khớp!!");
        return false;
    }
}
