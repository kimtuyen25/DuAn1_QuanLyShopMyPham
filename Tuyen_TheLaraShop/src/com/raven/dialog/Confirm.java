package com.raven.dialog;

import java.awt.Color;

public class Confirm extends javax.swing.JDialog {

    private String thongBao;
    private boolean trangThai = false;

    public String getThongBao() {
        return thongBao;
    }

    public void setThongBao(String thongBao) {
        this.thongBao = thongBao;
    }

    public Confirm(java.awt.Frame parent, boolean modal) {
        super(parent, modal);
        initComponents();
    }

    public Confirm(String thongBao) {
        this.thongBao = thongBao;
    }

    public void showConfirm(String Confirm) {
        setLocationRelativeTo(null);
        lblThongBao.setText(Confirm);
        setVisible(true);
    }

    public boolean ExitOK() {
        if (trangThai) {
            return true;
        } else {
            setVisible(false);
            return false;
        }
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        btnOK = new javax.swing.JLabel();
        lblThongBao = new javax.swing.JLabel();
        btnCanel = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setUndecorated(true);
        setResizable(false);

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));
        jPanel1.setBorder(javax.swing.BorderFactory.createMatteBorder(1, 1, 1, 1, new java.awt.Color(102, 102, 102)));

        btnOK.setBackground(new java.awt.Color(255, 255, 255));
        btnOK.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        btnOK.setText("OK");
        btnOK.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        btnOK.setOpaque(true);
        btnOK.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btnOKMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                btnOKMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                btnOKMouseExited(evt);
            }
        });

        lblThongBao.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblThongBao.setIcon(new javax.swing.ImageIcon(getClass().getResource("/com/raven/icon/bell.png"))); // NOI18N
        lblThongBao.setText("Thành công");

        btnCanel.setBackground(new java.awt.Color(255, 255, 255));
        btnCanel.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        btnCanel.setText("Canel");
        btnCanel.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        btnCanel.setOpaque(true);
        btnCanel.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btnCanelMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                btnCanelMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                btnCanelMouseExited(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(lblThongBao, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(132, 132, 132)
                .addComponent(btnOK, javax.swing.GroupLayout.PREFERRED_SIZE, 72, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(btnCanel, javax.swing.GroupLayout.PREFERRED_SIZE, 74, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(104, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addGap(24, 24, 24)
                .addComponent(lblThongBao, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnOK, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnCanel, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(17, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnOKMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnOKMouseClicked
        setVisible(false);
        trangThai = true;
    }//GEN-LAST:event_btnOKMouseClicked

    private void btnOKMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnOKMouseEntered
        btnOK.setBackground(new Color(12, 53, 106));
        btnOK.setForeground(Color.white);
    }//GEN-LAST:event_btnOKMouseEntered

    private void btnOKMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnOKMouseExited
        btnOK.setBackground(Color.white);
        btnOK.setForeground(Color.black);
    }//GEN-LAST:event_btnOKMouseExited

    private void btnCanelMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnCanelMouseClicked
        setVisible(false);
    }//GEN-LAST:event_btnCanelMouseClicked

    private void btnCanelMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnCanelMouseEntered
        btnCanel.setBackground(new Color(12, 53, 106));
        btnCanel.setForeground(Color.white);
    }//GEN-LAST:event_btnCanelMouseEntered

    private void btnCanelMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnCanelMouseExited
        btnCanel.setBackground(Color.white);
        btnCanel.setForeground(Color.black);
    }//GEN-LAST:event_btnCanelMouseExited

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
            java.util.logging.Logger.getLogger(Confirm.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Confirm.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Confirm.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Confirm.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the dialog */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                Confirm dialog = new Confirm(new javax.swing.JFrame(), true);
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
    private javax.swing.JLabel btnCanel;
    private javax.swing.JLabel btnOK;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JLabel lblThongBao;
    // End of variables declaration//GEN-END:variables
}
