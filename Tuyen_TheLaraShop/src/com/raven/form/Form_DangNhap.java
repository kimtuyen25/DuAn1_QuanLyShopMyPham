 package com.raven.form;

import Form_JFrame_Test.Chao;
import com.raven.dialog.Message;
import com.raven.main.Main;
import java.awt.Color;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.sql.Connection;
import java.util.ArrayList;
import java.util.List;
import javax.swing.JOptionPane;
import qlsmp.DAO.NhanVienDAO;
import qlsmp.DB.DBHelper;
import qlsmp.DB.IO;
import qlsmp.Model.Connect;
import qlsmp.Model.NhanVien;
import qlsmp.utis.Auth;

public class Form_DangNhap extends javax.swing.JFrame {

    NhanVienDAO dao = new NhanVienDAO();

    String urlFile = "D:\\luuMatKhau.txt";
    List<Object[]> list = new ArrayList();

    public Form_DangNhap() {
        this.getContentPane().setBackground(Color.WHITE);
        initComponents();
        setLocationRelativeTo(null);
        pnelConnect.setVisible(false);
        setBounds(320, 80, 890, 460);

        txtUsername.setBackground(new java.awt.Color(0, 0, 0, 1));
        txtPass.setBackground(new java.awt.Color(0, 0, 0, 1));

        readFile();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    public void initComponents() {

        jPanel2 = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        txtUsername = new javax.swing.JTextField();
        txtPass = new javax.swing.JPasswordField();
        btnLogin1 = new javax.swing.JButton();
        jLabel11 = new javax.swing.JLabel();
        jLabel13 = new javax.swing.JLabel();
        disable = new javax.swing.JLabel();
        show = new javax.swing.JLabel();
        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        pnelConnect = new javax.swing.JPanel();
        btnConnect = new javax.swing.JButton();
        jLabel4 = new javax.swing.JLabel();
        txtMayChu = new javax.swing.JTextField();
        txtTenDUAn = new javax.swing.JTextField();
        jLabel12 = new javax.swing.JLabel();
        
        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setUndecorated(true);
        addWindowListener(new java.awt.event.WindowAdapter() {
            public void windowOpened(java.awt.event.WindowEvent evt) {
                formWindowOpened(evt);
            }
        });

        jPanel2.setBackground(new java.awt.Color(25, 118, 211));
        jPanel2.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel2.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(255, 255, 255));
        jLabel2.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel2.setText("X");
        jLabel2.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jLabel2.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel2MouseClicked(evt);
            }
        });
        jPanel2.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(394, 0, 40, -1));

        jLabel3.setFont(new java.awt.Font("Segoe UI", 0, 32)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(255, 255, 255));
        jLabel3.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel3.setText("ĐĂNG NHẬP");
        jPanel2.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 43, 440, -1));

        jLabel5.setForeground(new java.awt.Color(255, 255, 255));
        jLabel5.setText("________________________________________________________________");
        jPanel2.add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 130, 310, 33));

        jLabel6.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jPanel2.add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(349, 128, 38, -1));

        jLabel7.setFont(new java.awt.Font("Segoe UI", 0, 13)); // NOI18N
        jLabel7.setForeground(new java.awt.Color(199, 226, 255));
        jLabel7.setText("Mật khẩu");
        jPanel2.add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(27, 167, 360, -1));

        jLabel8.setForeground(new java.awt.Color(255, 255, 255));
        jLabel8.setText("________________________________________________________________");
        jPanel2.add(jLabel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 200, 315, 33));

        jLabel9.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jPanel2.add(jLabel9, new org.netbeans.lib.awtextra.AbsoluteConstraints(348, 203, 38, -1));

        jLabel10.setFont(new java.awt.Font("Segoe UI", 0, 13)); // NOI18N
        jLabel10.setForeground(new java.awt.Color(199, 226, 255));
        jLabel10.setText("Quên mật khẩu");
        jLabel10.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel10MouseClicked(evt);
            }
        });
        jPanel2.add(jLabel10, new org.netbeans.lib.awtextra.AbsoluteConstraints(280, 244, 106, -1));

        txtUsername.setFont(txtUsername.getFont().deriveFont(txtUsername.getFont().getSize()+3f));
        txtUsername.setForeground(new java.awt.Color(255, 255, 255));
        txtUsername.setBorder(null);
        txtUsername.setCaretColor(new java.awt.Color(255, 255, 255));
        txtUsername.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                txtUsernameMouseClicked(evt);
            }
        });
        txtUsername.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtUsernameActionPerformed(evt);
            }
        });
        jPanel2.add(txtUsername, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 120, 310, 30));

        txtPass.setFont(txtPass.getFont().deriveFont(txtPass.getFont().getSize()+3f));
        txtPass.setForeground(new java.awt.Color(255, 255, 255));
        txtPass.setBorder(null);
        txtPass.setCaretColor(new java.awt.Color(255, 255, 255));
        txtPass.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                txtPassMouseClicked(evt);
            }
        });
        jPanel2.add(txtPass, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 190, 310, 30));

        btnLogin1.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        btnLogin1.setForeground(new java.awt.Color(25, 118, 211));
        btnLogin1.setText("ĐĂNG NHẬP");
        btnLogin1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnLogin1ActionPerformed(evt);
            }
        });
        jPanel2.add(btnLogin1, new org.netbeans.lib.awtextra.AbsoluteConstraints(27, 282, 359, 41));

        jLabel11.setFont(new java.awt.Font("Segoe UI", 0, 13)); // NOI18N
        jLabel11.setForeground(new java.awt.Color(199, 226, 255));
        jLabel11.setText("Tên đăng nhập");
        jPanel2.add(jLabel11, new org.netbeans.lib.awtextra.AbsoluteConstraints(27, 92, 360, -1));

        jLabel13.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/user.png"))); // NOI18N
        jPanel2.add(jLabel13, new org.netbeans.lib.awtextra.AbsoluteConstraints(360, 120, -1, -1));

        disable.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/hidden.png"))); // NOI18N
        disable.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                disableMouseClicked(evt);
            }
        });
        jPanel2.add(disable, new org.netbeans.lib.awtextra.AbsoluteConstraints(360, 200, -1, -1));

        show.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/mo.png"))); // NOI18N
        show.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                showMouseClicked(evt);
            }
        });
        jPanel2.add(show, new org.netbeans.lib.awtextra.AbsoluteConstraints(360, 200, -1, -1));

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/bg-login.png"))); // NOI18N
        jLabel1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel1MouseClicked(evt);
            }
        });
        jPanel1.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 45, 450, 392));

        pnelConnect.setBackground(new java.awt.Color(255, 255, 255));

        btnConnect.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        btnConnect.setForeground(new java.awt.Color(25, 118, 211));
        btnConnect.setText("KẾT NỐI");
        btnConnect.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnConnectActionPerformed(evt);
            }
        });

        jLabel4.setFont(new java.awt.Font("Segoe UI", 0, 13)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(25, 118, 211));
        jLabel4.setText("Máy chủ");

        txtMayChu.setFont(txtMayChu.getFont());

        txtTenDUAn.setFont(txtTenDUAn.getFont());

        jLabel12.setFont(new java.awt.Font("Segoe UI", 0, 13)); // NOI18N
        jLabel12.setForeground(new java.awt.Color(25, 118, 211));
        jLabel12.setText("Cơ sở dữ liệu");

        javax.swing.GroupLayout pnelConnectLayout = new javax.swing.GroupLayout(pnelConnect);
        pnelConnect.setLayout(pnelConnectLayout);
        pnelConnectLayout.setHorizontalGroup(
            pnelConnectLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, pnelConnectLayout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(btnConnect, javax.swing.GroupLayout.PREFERRED_SIZE, 359, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(253, 253, 253))
            .addGroup(pnelConnectLayout.createSequentialGroup()
                .addGap(52, 52, 52)
                .addGroup(pnelConnectLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel12, javax.swing.GroupLayout.PREFERRED_SIZE, 360, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtTenDUAn, javax.swing.GroupLayout.PREFERRED_SIZE, 791, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 360, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtMayChu, javax.swing.GroupLayout.PREFERRED_SIZE, 791, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        pnelConnectLayout.setVerticalGroup(
            pnelConnectLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, pnelConnectLayout.createSequentialGroup()
                .addGap(14, 14, 14)
                .addComponent(jLabel4)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(txtMayChu, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jLabel12)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(txtTenDUAn, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 38, Short.MAX_VALUE)
                .addComponent(btnConnect, javax.swing.GroupLayout.PREFERRED_SIZE, 41, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(28, 28, 28))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(pnelConnect, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 0, 0)
                        .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, 460, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, 460, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(0, 0, 0)
                .addComponent(pnelConnect, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    public void jLabel2MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel2MouseClicked
        System.exit(0);
    }//GEN-LAST:event_jLabel2MouseClicked

    public void btnConnectActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnConnectActionPerformed
        writeFile();
    }//GEN-LAST:event_btnConnectActionPerformed

    public void btnLogin1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnLogin1ActionPerformed
        if (dangNhap()) {
            new Chao(this, true).setVisible(true);
//            Main main = new Main();
//            main.setVisible(true);
        }
    }//GEN-LAST:event_btnLogin1ActionPerformed

    public void jLabel1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel1MouseClicked
        pnelConnect.setVisible(true);
        setBounds(320, 80, 890, 707);
    }//GEN-LAST:event_jLabel1MouseClicked

    public void formWindowOpened(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_formWindowOpened
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

    public void disableMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_disableMouseClicked
        txtPass.setEchoChar((char) 0);
        disable.setVisible(false);
        disable.setEnabled(false);
        show.setEnabled(true);
        show.setEnabled(true);
    }//GEN-LAST:event_disableMouseClicked

    public void showMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_showMouseClicked
        txtPass.setEchoChar((char) 8226);
        disable.setVisible(true);
        disable.setEnabled(true);
        show.setEnabled(false);
        show.setEnabled(false);
    }//GEN-LAST:event_showMouseClicked

    public void jLabel10MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel10MouseClicked
        new QuenMatKhau1().setVisible(true);
    }//GEN-LAST:event_jLabel10MouseClicked

    public void txtUsernameMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_txtUsernameMouseClicked

    }//GEN-LAST:event_txtUsernameMouseClicked

    public void txtPassMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_txtPassMouseClicked
    }//GEN-LAST:event_txtPassMouseClicked

    public void txtUsernameActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtUsernameActionPerformed
        showPass();
    }//GEN-LAST:event_txtUsernameActionPerformed

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
            java.util.logging.Logger.getLogger(Form_DangNhap.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Form_DangNhap.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Form_DangNhap.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Form_DangNhap.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Form_DangNhap().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    public javax.swing.JButton btnConnect;
    public javax.swing.JButton btnLogin1;
    public javax.swing.JLabel disable;
    public javax.swing.JLabel jLabel1;
    public javax.swing.JLabel jLabel10;
    public javax.swing.JLabel jLabel11;
    public javax.swing.JLabel jLabel12;
    public javax.swing.JLabel jLabel13;
    public javax.swing.JLabel jLabel2;
    public javax.swing.JLabel jLabel3;
    public javax.swing.JLabel jLabel4;
    public javax.swing.JLabel jLabel5;
    public javax.swing.JLabel jLabel6;
    public javax.swing.JLabel jLabel7;
    public javax.swing.JLabel jLabel8;
    public javax.swing.JLabel jLabel9;
    public javax.swing.JPanel jPanel1;
    public javax.swing.JPanel jPanel2;
    public javax.swing.JPanel pnelConnect;
    public javax.swing.JLabel show;
    public javax.swing.JTextField txtMayChu;
    public javax.swing.JPasswordField txtPass;
    public javax.swing.JTextField txtTenDUAn;
    public javax.swing.JTextField txtUsername;
    // End of variables declaration//GEN-END:variables
    public void showMessage(String message) {
        Message obj = new Message(Main.getFrames()[0], true);
        obj.showMessage(message);
    }

//    public String writeFile() {
//		Connect dao = new Connect(txtTenDUAn.getText(), null, null, txtMayChu.getText());
//		String check;
//		try {
//
//			IO.writeObject("src\\file\\NhanVien.txt", dao);
//			DBHelper.getDBConnection();
//			if (DBHelper.getDBConnection() == null) {
////				this.showMessage("Kết nối thất bại!");
//				check = "Kết nối thất bại!";
//			} else {
//				this.showMessage("Kết nối thành công!");
//				check =  "Kết nối thành công!";
//			}
//		} catch (Exception e) {
//			check = "Lỗi Ghi File";
//			this.showMessage("Lỗi Ghi File");
//		}
//		
//		return check;
//	}
    
    public String writeFile() {
        String server = txtMayChu.getText();
        String database = txtTenDUAn.getText();
        String check;

        if (server.isEmpty()) {
            check = "Kết nối thất bại do máy chủ trống!";
        } else if (database.isEmpty()) {
            check = "Kết nối thất bại do cơ sở dữ liệu trống!";
        } else {
            Connect dao = new Connect(database, null, null, server);
            try {
                IO.writeObject("src\\file\\NhanVien.txt", dao);
                Connection connection = DBHelper.getDBConnection();
                if (connection == null) {
                    check = "Kết nối thất bại!";
                } else {
                    check = "Kết nối thành công!";
                    showMessage("Kết nối thành công!");
                }
            } catch (Exception e) {
                check = "Lỗi ghi file";
                showMessage("Lỗi ghi file");
            }
        }

        return check;
    }

    public boolean dangNhap() {
        String username = txtUsername.getText();
        String matKhau = new String(dao.getMd5(txtPass.getText()));
        NhanVien acc = dao.selectByUssername(username);
        if (txtUsername.getText().isBlank() || txtPass.getText().isBlank()) {
            this.showMessage("Thông tin chưa nhập đủ");
            return false;
        }
        if (acc == null) {
            this.showMessage("sai Username");
            return false;
        } else if (!matKhau.equals(acc.getPassword())) {
            this.showMessage("Sai Password");
            return false;
        } else {
            this.setVisible(false);
            Auth.user = acc;
        }
        return true;
    }

    public void luuMatKhau() {
        list.add(new Object[]{txtUsername.getText().trim(), new String(txtPass.getPassword()).trim()});
        try {
            FileOutputStream fos = new FileOutputStream(urlFile);
            ObjectOutputStream os = new ObjectOutputStream(fos);
            os.writeObject(list);

        } catch (Exception e) {
            JOptionPane.showMessageDialog(this, "Đã xảy ra lỗi không thể lưu file");
        }
    }

    public void readFile() {
        try {
            FileInputStream fis = new FileInputStream(urlFile);
            ObjectInputStream dis = new ObjectInputStream(fis);
            list = (List<Object[]>) dis.readObject();
        } catch (Exception e) {
        }
    }

    public boolean showPass() {
        readFile();
        for (Object[] objects : list) {
            if (txtUsername.getText().trim().equals(objects[0])) {
                txtPass.setText(objects[1].toString());
                return true;
            }
        }
        return false;
    }

}
