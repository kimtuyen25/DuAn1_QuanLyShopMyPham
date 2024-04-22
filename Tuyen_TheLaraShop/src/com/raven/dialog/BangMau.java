//HOÀN THÀNH
package com.raven.dialog;

import com.raven.main.Main;
import java.awt.Image;
import java.util.ArrayList;
import java.util.List;
import javax.swing.DefaultComboBoxModel;
import javax.swing.ImageIcon;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;
import qlsmp.DAO.CTMDao;
import qlsmp.DAO.MauSacDAO;
import qlsmp.Model.CTMau;
import qlsmp.Model.MauSac;
import qlsmp.Model.SanPham;
import qlsmp.utis.XImage;

public class BangMau extends javax.swing.JDialog {

    private int maSP = 0;
    private int maMau = 0;
    private List<MauSac> listMau = new ArrayList<>();
    private MauSacDAO mauDAO = new MauSacDAO();
    private List<CTMau> listCTMau = new ArrayList<>();
    private CTMDao ctmDAO = new CTMDao();

    public BangMau(java.awt.Frame parent, boolean modal) {
        super(parent, modal);
        initComponents();

    }

    public void showColor() {
        setLocationRelativeTo(null);
        pnelThemMau.setVisible(false);
        setVisible(true);
    }

    private void showMessage(String message) {
        Message obj = new Message(Main.getFrames()[0], true);
        obj.showMessage(message);
    }

    private boolean showConfirm(String Confirm) {
        Confirm obj = new Confirm(Main.getFrames()[0], true);
        obj.showConfirm(Confirm);

        if (obj.ExitOK()) {
            return true;
        } else {
            return false;
        }
    }
//    void init(){
//        fillCobobox();
//        fillTableMau();
//        setHinhAnh(tenMau, hinh);
//    }

    void fillCobobox() {
        DefaultComboBoxModel modelMS = new DefaultComboBoxModel();
        modelMS.removeAllElements();
        listCTMau = ctmDAO.selectByMaSP(maSP);
        for (CTMau enity : listCTMau) {
            MauSac mau = mauDAO.selectByMaMau(enity.getMaMau());
            modelMS.addElement(mau.getTenMau());
        }
        cbxMau.setModel(modelMS);
    }

    public void setFormSP(SanPham sp) {
        maSP = sp.getMaSP();
        lblMaSP.setText(sp.getMaSP() + "");
        lblTenSP.setText(sp.getTenSP());
        fillCobobox();
        setHinhAnh(sp.getHinh(), hinh);
        fillTableMau();
    }

    void setHinhAnh(String path, JLabel hinh) {
        if (path != null) {
            ImageIcon icon = XImage.read(path);
            Image image = icon.getImage();
            Image image2 = image.getScaledInstance(111, 93, Image.SCALE_SMOOTH);
            hinh.setToolTipText(path);
            hinh.setIcon(new ImageIcon(image2));
        } else {
            hinh.setIcon(null);
        }
    }

    public void fillTableMau() {
        String[] colums = {"Mã màu", "Tên màu"};
        DefaultTableModel model = new DefaultTableModel(colums, 0);

        listMau = mauDAO.selectNotInCTM_ByMaSP(maSP);
        for (MauSac mau : listMau) {
            model.addRow(new Object[]{mau.getMaMau(), mau.getTenMau()});
        }
        tblBangMau.setModel(model);
    }

    void clearNewColor() {
        lblMaSP2.setText(lblMaSP.getText());
        txtTenMau.setText("");
        MauSacDAO MauDAO = new MauSacDAO();
        MauSac enity = MauDAO.selectMaMauNext();
        int id = enity.getMaMau();
        lblMaMau.setText((id + 1) + "");
    }

    void delete() {
        if (cbxMau.getSelectedItem().equals("")) {
            this.showMessage("Vui lòng chọn màu muốn xóa!");
        } else {
            if (this.showConfirm("Bạn thật sự muốn xóa?")) {
                if (cbxMau.getItemCount() == 1) {
                    this.showMessage("Sản phẩm đã phải có màu! ");
                    return;
                } else {
                    try {
                        MauSac enity = mauDAO.selectByTenMau((String) cbxMau.getSelectedItem());
                        CTMau ctmau = ctmDAO.selectByMaMauMaSP(maSP, enity.getMaMau());
                        if (ctmau.getSl() == 0) {
                            ctmDAO.DeleteByMaMauMaSP(maSP, enity.getMaMau());
                            fillCobobox();
                            fillTableMau();
                            this.showMessage("Xóa thành công!");
                        } else {
                            this.showMessage("Số lượng sản phẩm có màu này đang còn tồn kho!");
                        }
                    } catch (Exception e) {
                        this.showMessage("Màu đang hoạt động");
                    }
                }
            }
        }
    }

    void insertSP() {
        CTMau enity = new CTMau();
        enity.setMaMau(maMau);
        enity.setMaSP(maSP);
        //ctmDAO.DeleteSLSpnew(maSP);
        ctmDAO.Insert(enity);
        fillCobobox();
        fillTableMau();
    }

    boolean CheckExitTenMau() {
        listMau = mauDAO.selectAll();
        for (MauSac mauSac : listMau) {
            if (mauSac.getTenMau().equals(txtTenMau.getText())) {
                return true;
            }
        }
        return false;
    }

    void insertNewColor() {
        if (CheckExitTenMau()) {
            this.showMessage("Màu đã tồn tại");
        } else {
            MauSac enity = new MauSac();
            enity.setMaMau(Integer.parseInt(lblMaMau.getText()));
            enity.setTenMau(txtTenMau.getText());
            mauDAO.Insert(enity);
            CTMau enityCT = new CTMau();
            enityCT.setMaMau(Integer.parseInt(lblMaMau.getText()));
            enityCT.setMaSP(maSP);
            ctmDAO.Insert(enityCT);
            fillCobobox();
            fillTableMau();
        }
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        pnelThongTin = new javax.swing.JPanel();
        hinh = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        lblMaSP = new javax.swing.JLabel();
        lblTenSP = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        cbxMau = new javax.swing.JComboBox<>();
        btnXoaMau = new javax.swing.JButton();
        pnelBangMau = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        tblBangMau = new javax.swing.JTable();
        btnInsertSP = new javax.swing.JButton();
        btnInsertMauMoi = new javax.swing.JButton();
        pnelThemMau = new javax.swing.JPanel();
        jLabel6 = new javax.swing.JLabel();
        lblMaMau = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        txtTenMau = new javax.swing.JTextField();
        jLabel9 = new javax.swing.JLabel();
        lblMaSP2 = new javax.swing.JLabel();
        btnThemMauMoi = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setTitle("Bảng màu");

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));

        pnelThongTin.setBackground(new java.awt.Color(255, 255, 255));

        hinh.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(204, 204, 204)));

        jLabel1.setText("Mã sản phẩm:");

        jLabel2.setText("Tên sản phẩm:");

        lblMaSP.setText("123");

        lblTenSP.setText("SON MÔI ROUGE PUR COUTURE THE SLIM VELVET RADICAL");

        jLabel5.setText("Bảng màu:");

        cbxMau.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));

        btnXoaMau.setBackground(new java.awt.Color(12, 53, 106));
        btnXoaMau.setForeground(new java.awt.Color(255, 255, 255));
        btnXoaMau.setText("Xóa");
        btnXoaMau.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnXoaMauActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout pnelThongTinLayout = new javax.swing.GroupLayout(pnelThongTin);
        pnelThongTin.setLayout(pnelThongTinLayout);
        pnelThongTinLayout.setHorizontalGroup(
            pnelThongTinLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnelThongTinLayout.createSequentialGroup()
                .addGap(38, 38, 38)
                .addComponent(hinh, javax.swing.GroupLayout.PREFERRED_SIZE, 118, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(pnelThongTinLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(pnelThongTinLayout.createSequentialGroup()
                        .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 96, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(29, 29, 29)
                        .addComponent(lblTenSP, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(pnelThongTinLayout.createSequentialGroup()
                        .addGroup(pnelThongTinLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(pnelThongTinLayout.createSequentialGroup()
                                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 96, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(29, 29, 29)
                                .addComponent(lblMaSP, javax.swing.GroupLayout.PREFERRED_SIZE, 96, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 96, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(pnelThongTinLayout.createSequentialGroup()
                                .addComponent(cbxMau, javax.swing.GroupLayout.PREFERRED_SIZE, 184, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(btnXoaMau, javax.swing.GroupLayout.PREFERRED_SIZE, 78, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGap(0, 0, Short.MAX_VALUE)))
                .addGap(30, 30, 30))
        );
        pnelThongTinLayout.setVerticalGroup(
            pnelThongTinLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnelThongTinLayout.createSequentialGroup()
                .addGroup(pnelThongTinLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(pnelThongTinLayout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(hinh, javax.swing.GroupLayout.PREFERRED_SIZE, 124, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, pnelThongTinLayout.createSequentialGroup()
                        .addGap(16, 16, 16)
                        .addGroup(pnelThongTinLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel1)
                            .addComponent(lblMaSP))
                        .addGap(18, 18, 18)
                        .addGroup(pnelThongTinLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel2)
                            .addComponent(lblTenSP))
                        .addGap(18, 18, 18)
                        .addComponent(jLabel5)
                        .addGap(18, 18, 18)
                        .addGroup(pnelThongTinLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(cbxMau, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(btnXoaMau, javax.swing.GroupLayout.PREFERRED_SIZE, 22, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addContainerGap(20, Short.MAX_VALUE))
        );

        pnelBangMau.setBackground(new java.awt.Color(255, 255, 255));

        tblBangMau.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null},
                {null, null},
                {null, null},
                {null, null}
            },
            new String [] {
                "Mã màu", "Tên màu"
            }
        ));
        tblBangMau.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tblBangMauMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(tblBangMau);

        btnInsertSP.setBackground(new java.awt.Color(12, 53, 106));
        btnInsertSP.setForeground(new java.awt.Color(255, 255, 255));
        btnInsertSP.setText("Thêm vào sản phẩm");
        btnInsertSP.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnInsertSPActionPerformed(evt);
            }
        });

        btnInsertMauMoi.setBackground(new java.awt.Color(12, 53, 106));
        btnInsertMauMoi.setForeground(new java.awt.Color(255, 255, 255));
        btnInsertMauMoi.setText("Thêm màu mới");
        btnInsertMauMoi.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnInsertMauMoiActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout pnelBangMauLayout = new javax.swing.GroupLayout(pnelBangMau);
        pnelBangMau.setLayout(pnelBangMauLayout);
        pnelBangMauLayout.setHorizontalGroup(
            pnelBangMauLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnelBangMauLayout.createSequentialGroup()
                .addGap(142, 142, 142)
                .addComponent(btnInsertSP, javax.swing.GroupLayout.PREFERRED_SIZE, 152, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(btnInsertMauMoi, javax.swing.GroupLayout.PREFERRED_SIZE, 152, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(pnelBangMauLayout.createSequentialGroup()
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 647, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );
        pnelBangMauLayout.setVerticalGroup(
            pnelBangMauLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnelBangMauLayout.createSequentialGroup()
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 184, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(pnelBangMauLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnInsertSP, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnInsertMauMoi, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(0, 19, Short.MAX_VALUE))
        );

        pnelThemMau.setBackground(new java.awt.Color(255, 255, 255));
        pnelThemMau.setBorder(javax.swing.BorderFactory.createMatteBorder(2, 2, 2, 2, new java.awt.Color(204, 204, 204)));

        jLabel6.setText("Mã màu:");

        lblMaMau.setText("23");

        jLabel8.setText("Tên màu:");

        txtTenMau.setText("Đỏ gạch");

        jLabel9.setText("Mã sản phẩm:");

        lblMaSP2.setText("32");

        btnThemMauMoi.setBackground(new java.awt.Color(12, 53, 106));
        btnThemMauMoi.setForeground(new java.awt.Color(255, 255, 255));
        btnThemMauMoi.setText("Thêm màu mới");
        btnThemMauMoi.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnThemMauMoiActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout pnelThemMauLayout = new javax.swing.GroupLayout(pnelThemMau);
        pnelThemMau.setLayout(pnelThemMauLayout);
        pnelThemMauLayout.setHorizontalGroup(
            pnelThemMauLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnelThemMauLayout.createSequentialGroup()
                .addGap(20, 20, 20)
                .addGroup(pnelThemMauLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(pnelThemMauLayout.createSequentialGroup()
                        .addGroup(pnelThemMauLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel6, javax.swing.GroupLayout.PREFERRED_SIZE, 87, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel8, javax.swing.GroupLayout.PREFERRED_SIZE, 87, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGroup(pnelThemMauLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(pnelThemMauLayout.createSequentialGroup()
                                .addGap(42, 42, 42)
                                .addComponent(lblMaMau, javax.swing.GroupLayout.PREFERRED_SIZE, 87, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(pnelThemMauLayout.createSequentialGroup()
                                .addGap(18, 18, 18)
                                .addGroup(pnelThemMauLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(btnThemMauMoi, javax.swing.GroupLayout.PREFERRED_SIZE, 152, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(txtTenMau, javax.swing.GroupLayout.PREFERRED_SIZE, 208, javax.swing.GroupLayout.PREFERRED_SIZE)))))
                    .addGroup(pnelThemMauLayout.createSequentialGroup()
                        .addComponent(jLabel9, javax.swing.GroupLayout.PREFERRED_SIZE, 87, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(42, 42, 42)
                        .addComponent(lblMaSP2, javax.swing.GroupLayout.PREFERRED_SIZE, 87, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(26, Short.MAX_VALUE))
        );
        pnelThemMauLayout.setVerticalGroup(
            pnelThemMauLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnelThemMauLayout.createSequentialGroup()
                .addGap(14, 14, 14)
                .addGroup(pnelThemMauLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel6)
                    .addComponent(lblMaMau))
                .addGap(18, 18, 18)
                .addGroup(pnelThemMauLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel8)
                    .addComponent(txtTenMau, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(pnelThemMauLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel9)
                    .addComponent(lblMaSP2))
                .addGap(27, 27, 27)
                .addComponent(btnThemMauMoi, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(22, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                    .addComponent(pnelThongTin, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(pnelBangMau, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(20, 20, 20)
                .addComponent(pnelThemMau, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGap(20, 20, 20))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addComponent(pnelThongTin, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(pnelBangMau, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(pnelThemMau, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnXoaMauActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnXoaMauActionPerformed
        this.delete();
    }//GEN-LAST:event_btnXoaMauActionPerformed

    private void btnInsertSPActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnInsertSPActionPerformed
        this.insertSP();
    }//GEN-LAST:event_btnInsertSPActionPerformed

    private void btnInsertMauMoiActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnInsertMauMoiActionPerformed
        pnelThemMau.setVisible(true);
        this.clearNewColor();
    }//GEN-LAST:event_btnInsertMauMoiActionPerformed

    private void btnThemMauMoiActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnThemMauMoiActionPerformed
        this.insertNewColor();
        this.clearNewColor();
    }//GEN-LAST:event_btnThemMauMoiActionPerformed

    private void tblBangMauMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tblBangMauMouseClicked
        int row = tblBangMau.getSelectedRow();
        maMau = (int) tblBangMau.getValueAt(row, 0);
//        System.out.println("Tên màu" + tenMau);
    }//GEN-LAST:event_tblBangMauMouseClicked

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
            java.util.logging.Logger.getLogger(BangMau.class
                    .getName()).log(java.util.logging.Level.SEVERE, null, ex);

        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(BangMau.class
                    .getName()).log(java.util.logging.Level.SEVERE, null, ex);

        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(BangMau.class
                    .getName()).log(java.util.logging.Level.SEVERE, null, ex);

        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(BangMau.class
                    .getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the dialog */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                BangMau dialog = new BangMau(new javax.swing.JFrame(), true);
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
    private javax.swing.JButton btnInsertMauMoi;
    private javax.swing.JButton btnInsertSP;
    private javax.swing.JButton btnThemMauMoi;
    private javax.swing.JButton btnXoaMau;
    private javax.swing.JComboBox<String> cbxMau;
    private javax.swing.JLabel hinh;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JLabel lblMaMau;
    private javax.swing.JLabel lblMaSP;
    private javax.swing.JLabel lblMaSP2;
    private javax.swing.JLabel lblTenSP;
    private javax.swing.JPanel pnelBangMau;
    private javax.swing.JPanel pnelThemMau;
    private javax.swing.JPanel pnelThongTin;
    private javax.swing.JTable tblBangMau;
    private javax.swing.JTextField txtTenMau;
    // End of variables declaration//GEN-END:variables
}
