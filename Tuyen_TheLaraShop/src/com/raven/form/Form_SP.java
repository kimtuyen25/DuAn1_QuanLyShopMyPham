//TUYẾN - HOÀN THÀNH
package com.raven.form;

import com.raven.dialog.BangMau;
import com.raven.dialog.Confirm;
import com.raven.dialog.Jdialog_ThuongHieu;
import com.raven.dialog.Message;
import com.raven.dialog.jdialog_LoaiSP;
import com.raven.main.Main;
import java.awt.Image;
import java.awt.event.KeyEvent;
import java.io.File;
import java.text.DecimalFormat;
import java.text.ParseException;
import java.util.ArrayList;
import java.util.List;
import javax.swing.DefaultComboBoxModel;
import javax.swing.ImageIcon;
import javax.swing.JComponent;
import javax.swing.JFileChooser;
import javax.swing.JLabel;
import javax.swing.table.DefaultTableModel;
import qlsmp.DAO.CTHDDAO;
import qlsmp.DAO.CTMDao;
import qlsmp.DAO.CTPNDao;
import qlsmp.DAO.LoaiSPDAO;
import qlsmp.DAO.MauSacDAO;
import qlsmp.DAO.SanPhamDAO;
import qlsmp.DAO.ThuongHieuDAO;
import qlsmp.Model.CTHD;
import qlsmp.Model.CTMau;
import qlsmp.Model.CTPN;
import qlsmp.Model.LoaiSP;
import qlsmp.Model.MauSac;
import qlsmp.Model.SanPham;
import qlsmp.Model.ThuongHieu;
import qlsmp.utis.XImage;

public class Form_SP extends javax.swing.JPanel {

    public Form_SP() {
        initComponents();
        setOpaque(false);
        init();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        FileChooser = new javax.swing.JFileChooser();
        jPanel2 = new javax.swing.JPanel();
        jPanel1 = new javax.swing.JPanel();
        jScrollPane7 = new javax.swing.JScrollPane();
        tblDS = new javax.swing.JTable();
        jLabel22 = new javax.swing.JLabel();
        jPanel15 = new javax.swing.JPanel();
        txtSearch = new javax.swing.JTextField();
        btnSearch = new javax.swing.JButton();
        jPanel6 = new javax.swing.JPanel();
        hinh = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        txtGiaBan = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        cbxLoaiSP = new javax.swing.JComboBox<>();
        btnThem = new javax.swing.JButton();
        btnSua = new javax.swing.JButton();
        btnXoa = new javax.swing.JButton();
        btnLamMoi = new javax.swing.JButton();
        lblMaSP = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        txtTen = new javax.swing.JTextField();
        cbxThuongHieu = new javax.swing.JComboBox<>();
        lblErrorGiaBan = new javax.swing.JLabel();
        lblErrorGiaNhap = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        txtGiaNhap = new javax.swing.JTextField();
        lblErrorTenSP = new javax.swing.JLabel();
        pnelMau = new javax.swing.JPanel();
        btnThemMau = new javax.swing.JButton();
        cbxMau = new javax.swing.JComboBox<>();
        jLabel8 = new javax.swing.JLabel();
        btnLoaiSP = new javax.swing.JButton();
        btnThuongHieu = new javax.swing.JButton();

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));

        tblDS.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "Title 1", "Title 2", "Title 3", "Title 4"
            }
        ));
        tblDS.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tblDSMouseClicked(evt);
            }
        });
        jScrollPane7.setViewportView(tblDS);

        jLabel22.setBackground(new java.awt.Color(11, 52, 106));
        jLabel22.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jLabel22.setForeground(new java.awt.Color(11, 52, 106));
        jLabel22.setText("Tìm kiếm");

        jPanel15.setBackground(new java.awt.Color(255, 255, 255));
        jPanel15.setBorder(javax.swing.BorderFactory.createEtchedBorder(new java.awt.Color(226, 232, 240), null));

        txtSearch.setBackground(new java.awt.Color(226, 232, 240));
        txtSearch.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtSearchActionPerformed(evt);
            }
        });

        btnSearch.setBackground(new java.awt.Color(11, 52, 106));
        btnSearch.setForeground(new java.awt.Color(255, 255, 255));
        btnSearch.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/kinh_lup.png"))); // NOI18N
        btnSearch.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSearchActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel15Layout = new javax.swing.GroupLayout(jPanel15);
        jPanel15.setLayout(jPanel15Layout);
        jPanel15Layout.setHorizontalGroup(
            jPanel15Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel15Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(txtSearch)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(btnSearch, javax.swing.GroupLayout.PREFERRED_SIZE, 67, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );
        jPanel15Layout.setVerticalGroup(
            jPanel15Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel15Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel15Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(txtSearch, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnSearch))
                .addGap(5, 5, 5))
        );

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane7, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 668, Short.MAX_VALUE)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jLabel22, javax.swing.GroupLayout.PREFERRED_SIZE, 74, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addComponent(jPanel15, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel22)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel15, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jScrollPane7, javax.swing.GroupLayout.DEFAULT_SIZE, 519, Short.MAX_VALUE)
                .addContainerGap())
        );

        jPanel6.setBackground(new java.awt.Color(255, 255, 255));

        hinh.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(204, 204, 204)));
        hinh.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                hinhMouseClicked(evt);
            }
        });

        jLabel2.setText("Giá bán:");

        jLabel3.setText("Thương hiệu:");

        txtGiaBan.setText("1200000");
        txtGiaBan.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                txtGiaBanKeyReleased(evt);
            }
        });

        jLabel4.setText("Loại sản phẩm:");

        cbxLoaiSP.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Trang điểm", "Chăm sóc da", "Nước hoa" }));

        btnThem.setBackground(new java.awt.Color(0, 0, 102));
        btnThem.setForeground(new java.awt.Color(255, 255, 255));
        btnThem.setText("Thêm");
        btnThem.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnThemActionPerformed(evt);
            }
        });

        btnSua.setBackground(new java.awt.Color(0, 0, 102));
        btnSua.setForeground(new java.awt.Color(255, 255, 255));
        btnSua.setText("Cập nhật");
        btnSua.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSuaActionPerformed(evt);
            }
        });

        btnXoa.setBackground(new java.awt.Color(0, 0, 102));
        btnXoa.setForeground(new java.awt.Color(255, 255, 255));
        btnXoa.setText("Xóa");
        btnXoa.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnXoaActionPerformed(evt);
            }
        });

        btnLamMoi.setBackground(new java.awt.Color(0, 0, 102));
        btnLamMoi.setForeground(new java.awt.Color(255, 255, 255));
        btnLamMoi.setText("Làm mới");
        btnLamMoi.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnLamMoiActionPerformed(evt);
            }
        });

        lblMaSP.setText("112");
        lblMaSP.setEnabled(false);

        jLabel6.setText("Mã sản phẩm:");

        jLabel7.setText("Tên sản phẩm:");

        txtTen.setText("SON MÔI ROUGE PUR COUTURE THE SLIM VELVET RADICAL");
        txtTen.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                txtTenKeyReleased(evt);
            }
        });

        cbxThuongHieu.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Trang điểm", "Chăm sóc da", "Nước hoa" }));

        lblErrorGiaBan.setForeground(new java.awt.Color(255, 0, 51));
        lblErrorGiaBan.setText("Giá phải lớn hơn 1000");

        lblErrorGiaNhap.setForeground(new java.awt.Color(255, 0, 51));
        lblErrorGiaNhap.setText("Giá phải lớn hơn 1000");

        jLabel5.setText("Giá nhập:");

        txtGiaNhap.setText("1200000");

        lblErrorTenSP.setForeground(new java.awt.Color(255, 0, 51));
        lblErrorTenSP.setText("Tên sản phẩm đang trống");

        pnelMau.setBackground(new java.awt.Color(255, 255, 255));

        btnThemMau.setBackground(new java.awt.Color(0, 0, 102));
        btnThemMau.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        btnThemMau.setForeground(new java.awt.Color(255, 255, 255));
        btnThemMau.setText("+");
        btnThemMau.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnThemMauActionPerformed(evt);
            }
        });

        cbxMau.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Trang điểm", "Chăm sóc da", "Nước hoa" }));

        jLabel8.setText("Màu sắc:");

        javax.swing.GroupLayout pnelMauLayout = new javax.swing.GroupLayout(pnelMau);
        pnelMau.setLayout(pnelMauLayout);
        pnelMauLayout.setHorizontalGroup(
            pnelMauLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnelMauLayout.createSequentialGroup()
                .addComponent(jLabel8, javax.swing.GroupLayout.PREFERRED_SIZE, 89, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(cbxMau, javax.swing.GroupLayout.PREFERRED_SIZE, 107, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(btnThemMau, javax.swing.GroupLayout.PREFERRED_SIZE, 52, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );
        pnelMauLayout.setVerticalGroup(
            pnelMauLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnelMauLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(pnelMauLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel8)
                    .addComponent(btnThemMau, javax.swing.GroupLayout.PREFERRED_SIZE, 22, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(cbxMau, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        btnLoaiSP.setBackground(new java.awt.Color(0, 0, 102));
        btnLoaiSP.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        btnLoaiSP.setForeground(new java.awt.Color(255, 255, 255));
        btnLoaiSP.setText("+");
        btnLoaiSP.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnLoaiSPActionPerformed(evt);
            }
        });

        btnThuongHieu.setBackground(new java.awt.Color(0, 0, 102));
        btnThuongHieu.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        btnThuongHieu.setForeground(new java.awt.Color(255, 255, 255));
        btnThuongHieu.setText("+");
        btnThuongHieu.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnThuongHieuActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel6Layout = new javax.swing.GroupLayout(jPanel6);
        jPanel6.setLayout(jPanel6Layout);
        jPanel6Layout.setHorizontalGroup(
            jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel6Layout.createSequentialGroup()
                .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel6Layout.createSequentialGroup()
                        .addGap(195, 195, 195)
                        .addComponent(hinh, javax.swing.GroupLayout.PREFERRED_SIZE, 114, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel6Layout.createSequentialGroup()
                        .addGap(20, 20, 20)
                        .addComponent(btnThem, javax.swing.GroupLayout.PREFERRED_SIZE, 102, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(btnSua, javax.swing.GroupLayout.PREFERRED_SIZE, 102, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(btnXoa, javax.swing.GroupLayout.PREFERRED_SIZE, 102, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(btnLamMoi, javax.swing.GroupLayout.PREFERRED_SIZE, 102, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(0, 0, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel6Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(lblErrorGiaBan, javax.swing.GroupLayout.PREFERRED_SIZE, 408, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(75, 75, 75))
            .addGroup(jPanel6Layout.createSequentialGroup()
                .addGap(37, 37, 37)
                .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel6Layout.createSequentialGroup()
                        .addComponent(pnelMau, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addContainerGap())
                    .addGroup(jPanel6Layout.createSequentialGroup()
                        .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel6Layout.createSequentialGroup()
                                .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 89, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jLabel7, javax.swing.GroupLayout.PREFERRED_SIZE, 89, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(18, 18, 18)
                                .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(txtGiaBan, javax.swing.GroupLayout.PREFERRED_SIZE, 107, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(txtTen, javax.swing.GroupLayout.DEFAULT_SIZE, 391, Short.MAX_VALUE)))
                            .addGroup(jPanel6Layout.createSequentialGroup()
                                .addComponent(jLabel6, javax.swing.GroupLayout.PREFERRED_SIZE, 89, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(lblMaSP, javax.swing.GroupLayout.PREFERRED_SIZE, 89, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(0, 0, Short.MAX_VALUE)))
                        .addGap(22, 22, 22))
                    .addGroup(jPanel6Layout.createSequentialGroup()
                        .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 89, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(cbxThuongHieu, javax.swing.GroupLayout.PREFERRED_SIZE, 107, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(btnThuongHieu, javax.swing.GroupLayout.PREFERRED_SIZE, 52, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addGroup(jPanel6Layout.createSequentialGroup()
                        .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addGroup(jPanel6Layout.createSequentialGroup()
                                    .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 89, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addGap(18, 18, 18)
                                    .addComponent(txtGiaNhap, javax.swing.GroupLayout.PREFERRED_SIZE, 107, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel6Layout.createSequentialGroup()
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 6, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(lblErrorGiaNhap, javax.swing.GroupLayout.PREFERRED_SIZE, 408, javax.swing.GroupLayout.PREFERRED_SIZE)))
                            .addGroup(jPanel6Layout.createSequentialGroup()
                                .addGap(6, 6, 6)
                                .addComponent(lblErrorTenSP, javax.swing.GroupLayout.PREFERRED_SIZE, 408, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(jPanel6Layout.createSequentialGroup()
                                .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 89, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(cbxLoaiSP, javax.swing.GroupLayout.PREFERRED_SIZE, 107, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(btnLoaiSP, javax.swing.GroupLayout.PREFERRED_SIZE, 52, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
        );
        jPanel6Layout.setVerticalGroup(
            jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel6Layout.createSequentialGroup()
                .addGap(15, 15, 15)
                .addComponent(hinh, javax.swing.GroupLayout.PREFERRED_SIZE, 128, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblMaSP)
                    .addComponent(jLabel6))
                .addGap(18, 18, 18)
                .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel7)
                    .addComponent(txtTen, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(lblErrorTenSP)
                .addGap(4, 4, 4)
                .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(txtGiaBan, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(lblErrorGiaBan)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel5)
                    .addComponent(txtGiaNhap, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addComponent(lblErrorGiaNhap)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 7, Short.MAX_VALUE)
                .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel4)
                    .addComponent(cbxLoaiSP, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnLoaiSP, javax.swing.GroupLayout.PREFERRED_SIZE, 22, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3)
                    .addComponent(cbxThuongHieu, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnThuongHieu, javax.swing.GroupLayout.PREFERRED_SIZE, 22, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addComponent(pnelMau, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 95, Short.MAX_VALUE)
                .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnThem, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnSua, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnXoa, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnLamMoi, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(21, 21, 21))
        );

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGap(2, 2, 2)
                .addComponent(jPanel6, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(jPanel6, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 1239, Short.MAX_VALUE)
            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(layout.createSequentialGroup()
                    .addGap(0, 0, Short.MAX_VALUE)
                    .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGap(0, 0, Short.MAX_VALUE)))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 611, Short.MAX_VALUE)
            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(layout.createSequentialGroup()
                    .addGap(0, 0, Short.MAX_VALUE)
                    .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGap(0, 0, Short.MAX_VALUE)))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void tblDSMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tblDSMouseClicked
        int row = tblDS.getSelectedRow();
        maSPClick = (int) tblDS.getValueAt(row, 0);
        System.out.println("mã sản phẩm:" + maSPClick);
        SanPham sp = SPdao.selecteByID(maSPClick);
        this.setForm(sp);
        indexInsert = false;
        updateStatus();
    }//GEN-LAST:event_tblDSMouseClicked

    private void hinhMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_hinhMouseClicked
        chonAnh();
    }//GEN-LAST:event_hinhMouseClicked

    private void btnThemActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnThemActionPerformed
        insert();
    }//GEN-LAST:event_btnThemActionPerformed

    private void btnSuaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSuaActionPerformed
        update();
    }//GEN-LAST:event_btnSuaActionPerformed

    private void btnXoaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnXoaActionPerformed
        delete();
    }//GEN-LAST:event_btnXoaActionPerformed

    private void btnLamMoiActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnLamMoiActionPerformed
        maSPClick = 0;
        clearForm();
    }//GEN-LAST:event_btnLamMoiActionPerformed

    private void btnThemMauActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnThemMauActionPerformed
        this.showColor();
        fillComboboxByID();
    }//GEN-LAST:event_btnThemMauActionPerformed

    private void btnLoaiSPActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnLoaiSPActionPerformed
        this.showLoaiSP();
        fillComboboxAll();
    }//GEN-LAST:event_btnLoaiSPActionPerformed

    private void btnThuongHieuActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnThuongHieuActionPerformed
        this.showThuongHieu();
        fillComboboxAll();
    }//GEN-LAST:event_btnThuongHieuActionPerformed

    private void txtSearchActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtSearchActionPerformed
        search();
    }//GEN-LAST:event_txtSearchActionPerformed

    private void btnSearchActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSearchActionPerformed
        search();
    }//GEN-LAST:event_btnSearchActionPerformed

    private void txtTenKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtTenKeyReleased
        if (evt.getKeyCode() == KeyEvent.VK_ENTER) {
            ///di chuyển chuột xuống giá bán
            txtGiaBan.setText(null);
            txtGiaBan.requestFocus();
        }
    }//GEN-LAST:event_txtTenKeyReleased

    private void txtGiaBanKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtGiaBanKeyReleased
        if (evt.getKeyCode() == KeyEvent.VK_ENTER) {
            ///di chuyển chuột xuống giá bán
            txtGiaNhap.setText(null);
            txtGiaNhap.requestFocus();
        }
    }//GEN-LAST:event_txtGiaBanKeyReleased

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JFileChooser FileChooser;
    private javax.swing.JButton btnLamMoi;
    private javax.swing.JButton btnLoaiSP;
    private javax.swing.JButton btnSearch;
    private javax.swing.JButton btnSua;
    private javax.swing.JButton btnThem;
    private javax.swing.JButton btnThemMau;
    private javax.swing.JButton btnThuongHieu;
    private javax.swing.JButton btnXoa;
    private javax.swing.JComboBox<String> cbxLoaiSP;
    private javax.swing.JComboBox<String> cbxMau;
    private javax.swing.JComboBox<String> cbxThuongHieu;
    private javax.swing.JLabel hinh;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel22;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel15;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel6;
    private javax.swing.JScrollPane jScrollPane7;
    private javax.swing.JLabel lblErrorGiaBan;
    private javax.swing.JLabel lblErrorGiaNhap;
    private javax.swing.JLabel lblErrorTenSP;
    private javax.swing.JLabel lblMaSP;
    private javax.swing.JPanel pnelMau;
    private javax.swing.JTable tblDS;
    private javax.swing.JTextField txtGiaBan;
    private javax.swing.JTextField txtGiaNhap;
    private javax.swing.JTextField txtSearch;
    private javax.swing.JTextField txtTen;
    // End of variables declaration//GEN-END:variables

    public List<SanPham> list = new ArrayList<>();
    SanPhamDAO SPdao = new SanPhamDAO();
    String[] colums = {"Mã sản phẩm", "Tên sản phẩm", "Giá bán", "Giá nhập", "Mã Vạch", "Mã loại", "Mã thương hiệu", "Hinh"};
    DefaultTableModel modelDS = new DefaultTableModel(colums, 0);
    private boolean indexInsert = false;
    private int maSPClick = 0;

    void init() {
        tblDS.setDefaultEditor(Object.class, null);
//        this.setIconImage(XImage.getApplcon());
        this.clearForm();
        this.fillTable();
    }

    private void updateStatus() {
        btnThem.setEnabled(indexInsert);
        pnelMau.setVisible(!indexInsert);
        btnLamMoi.setEnabled(!indexInsert);
        btnSua.setEnabled(!indexInsert);
        btnXoa.setEnabled(!indexInsert);
    }

    private void showThuongHieu() {
        Jdialog_ThuongHieu form = new Jdialog_ThuongHieu(Main.getFrames()[0], true);
        form.showThuongHieu();
    }

    private void showLoaiSP() {
        jdialog_LoaiSP form = new jdialog_LoaiSP(Main.getFrames()[0], true);
        form.showLoaiSP();
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

    private void showColor() {
        BangMau bangmau = new BangMau(Main.getFrames()[0], true);

        SanPham sp = SPdao.selecteByID(maSPClick);
        bangmau.setFormSP(sp);
        bangmau.showColor();
    }

    public void setHinhAnh(String path, JLabel hinh) {
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

    private void chonAnh() {
        if (FileChooser.showOpenDialog(this) == JFileChooser.APPROVE_OPTION) {
            File file = FileChooser.getSelectedFile();
            XImage.save(file); // lưu hình và thư mục logos
            ImageIcon icon = XImage.read(file.getName());
            Image image = icon.getImage(); //trả về hình cho icon
            Image newImg = image.getScaledInstance(190, 152, java.awt.Image.SCALE_SMOOTH); //TẠO MỘT PHIÊN BẢN THU NHỎ, CÓ THỂ ĐIỀU CHỈNH KÍCH THƯỚC
            icon = new ImageIcon(newImg);
            hinh.setIcon(icon);
            hinh.setToolTipText(file.getName());
        }
    }

    public void clearForm() {
        //setHinhAnh(null, hinh);
        hinh.setToolTipText("");
        txtSearch.setText(null);
        hinh.setIcon(null);
        SanPham sp = new SanPham();
        SanPham spmax = SPdao.selectByIDMax();
        sp.setMaSP(spmax.getMaSP() + 1);
        sp.setHinh(null);
        this.setForm(sp);
        indexInsert = true;
        this.updateStatus();
    }

    void fillTable() {
        modelDS.setRowCount(0);
        list = SPdao.selectAll();
        for (SanPham sp : list) {
            DecimalFormat decimalFormat = new DecimalFormat("#,###,##0.0");
            String gia1 = decimalFormat.format(sp.getGiaBan());
            String gia2 = decimalFormat.format(sp.getGiaNhap());
            modelDS.addRow(new Object[]{sp.getMaSP(), sp.getTenSP(), gia1, gia2, sp.getMaVach(), sp.getMaLoai(), sp.getMaThuongHieu(), sp.getHinh()});
        }
        tblDS.setModel(modelDS);
    }

    void fillComboboxByID() {
        DefaultComboBoxModel modelLoai = new DefaultComboBoxModel();
        modelLoai.removeAllElements();
        DefaultComboBoxModel modelTH = new DefaultComboBoxModel();
        modelTH.removeAllElements();
        DefaultComboBoxModel modelMS = new DefaultComboBoxModel();
        modelMS.removeAllElements();
        SanPham sanPham = SPdao.selecteByID(maSPClick);
        if (sanPham != null) {
            //Loại sp
            List<LoaiSP> listLSP = new ArrayList<>();
            LoaiSPDAO loaiDAO = new LoaiSPDAO();
            listLSP = loaiDAO.selectAll();
            for (LoaiSP sp : listLSP) {
                modelLoai.addElement(sp.getTenLoai());
            }
            cbxLoaiSP.setModel(modelLoai);
            int maLoai = sanPham.getMaLoai();
            LoaiSP enity = loaiDAO.selectByID(maLoai);
            cbxLoaiSP.setSelectedItem(enity.getTenLoai());

            List<ThuongHieu> listTH = new ArrayList<>();
            ThuongHieuDAO THDAO = new ThuongHieuDAO();
            listTH = THDAO.selectAll();
            for (ThuongHieu sp : listTH) {
                modelTH.addElement(sp.getTenTH());
            }
            cbxThuongHieu.setModel(modelTH);
            int maTH = sanPham.getMaThuongHieu();
            ThuongHieu th = THDAO.selecteByID(maTH);
            cbxThuongHieu.setSelectedItem(th.getTenTH());

            List<MauSac> listMau = new ArrayList<>();
            List<CTMau> listctm = new ArrayList<>();
            CTMDao ctmdao = new CTMDao();
            MauSacDAO MauDAO = new MauSacDAO();
            listctm = ctmdao.selectByMaSP(maSPClick);
            for (CTMau cTMau : listctm) {
                MauSac mau = MauDAO.selectByMaMau(cTMau.getMaMau());
                listMau.add(mau);
            }

            for (MauSac sp : listMau) {
                modelMS.addElement(sp.getTenMau());
            }
            cbxMau.setModel(modelMS);
        } else {
            fillComboboxAll();
        }
    }

    void fillComboboxAll() {
        DefaultComboBoxModel modelLoai = new DefaultComboBoxModel();
        modelLoai.removeAllElements();
        DefaultComboBoxModel modelTH = new DefaultComboBoxModel();
        modelTH.removeAllElements();
        DefaultComboBoxModel modelMS = new DefaultComboBoxModel();
        modelMS.removeAllElements();

        //Loại sp
        List<LoaiSP> listLSP = new ArrayList<>();
        LoaiSPDAO loaiDAO = new LoaiSPDAO();
        listLSP = loaiDAO.selectAll();
        for (LoaiSP sp : listLSP) {
            modelLoai.addElement(sp.getTenLoai());
        }
        cbxLoaiSP.setModel(modelLoai);

        //Thương hiệu sp
        List<ThuongHieu> listTH = new ArrayList<>();
        ThuongHieuDAO THDAO = new ThuongHieuDAO();
        listTH = THDAO.selectAll();
        for (ThuongHieu sp : listTH) {
            modelTH.addElement(sp.getTenTH());
        }
        cbxThuongHieu.setModel(modelTH);
        cbxMau.setModel(modelMS);
    }

    void setForm(SanPham sp) {
        lblMaSP.setText(sp.getMaSP() + "");
        txtTen.setText(sp.getTenSP());
        lblErrorTenSP.setVisible(false);
        DecimalFormat decimalFormat = new DecimalFormat("#,###,##0.0");
        String formatted = decimalFormat.format(sp.getGiaBan());
        txtGiaBan.setText(formatted);
        lblErrorGiaBan.setVisible(false);

        String formatted2 = decimalFormat.format(sp.getGiaNhap());
        txtGiaNhap.setText(formatted2);
        lblErrorGiaNhap.setVisible(false);
        fillComboboxByID();
        if (sp.getHinh() != null) {
            setHinhAnh(sp.getHinh(), hinh);
        } else {
            hinh.setIcon(null);
        }
    }

    SanPham getForm() {
        hinh.setIcon(null);
        SanPham sp = new SanPham();
        sp.setMaSP(Integer.parseInt(lblMaSP.getText()));
        sp.setTenSP(txtTen.getText());
        DecimalFormat decimalFormat = new DecimalFormat("#,###,##0.0");

        try {
            Number giaBan = decimalFormat.parse(txtGiaBan.getText());
            double result1 = giaBan.floatValue();

            Number giaNhap = decimalFormat.parse(txtGiaNhap.getText());
            double result2 = giaNhap.floatValue();
            sp.setGiaBan(result1);
            sp.setGiaNhap(result2);
        } catch (Exception e) {
            return null;
        }
        String tenLoai = (String) cbxLoaiSP.getSelectedItem();
        LoaiSPDAO loaiDao = new LoaiSPDAO();
        LoaiSP loaisp = loaiDao.selectByTen(tenLoai);
        sp.setMaLoai(loaisp.getMaLoai());

        String tenthuonghieu = (String) cbxThuongHieu.getSelectedItem();
        ThuongHieuDAO thdao = new ThuongHieuDAO();
        ThuongHieu th = thdao.selecteByTen(tenthuonghieu);
        sp.setMaThuongHieu(th.getMaTH());
        sp.setHinh(hinh.getToolTipText());
        System.out.println(sp.getHinh());
        if (sp.getHinh() == null) {
            sp.setHinh("");
        }
        return sp;
    }

    boolean ExitMaSP(int id
    ) {
        list = SPdao.selectAll();
        for (SanPham enity : list) {
            if (enity.getMaSP() == id) {
                return true;
            }
        }
        return false;
    }

    boolean check() {
        if (txtTen.getText().isBlank()) {
            txtTen.requestFocus();
            lblErrorTenSP.setText("Vui lòng nhập tên sản phẩm.");
            lblErrorTenSP.setVisible(true);
            return false;
        } else {
            lblErrorTenSP.setVisible(false);
        }
        if (txtGiaBan.getText().isBlank()) {
            txtGiaBan.requestFocus();
            lblErrorGiaBan.setText("Vui lòng nhập giá bán.");
            lblErrorGiaBan.setVisible(true);
            return false;
        } else {
            lblErrorGiaBan.setVisible(false);
        }
        if (txtGiaNhap.getText().isBlank()) {
            txtGiaNhap.requestFocus();
            lblErrorGiaNhap.setText("Vui lòng nhập giá nhập.");
            lblErrorGiaNhap.setVisible(true);
            return false;
        } else {
            lblErrorGiaNhap.setVisible(false);
        }
        DecimalFormat decimalFormat = new DecimalFormat("#,###,##0.0");
        try {
            Number parsedNumber = decimalFormat.parse(txtGiaBan.getText());
            double result = parsedNumber.doubleValue();
            lblErrorGiaBan.setVisible(false);
            if (result < 1000) {
                txtGiaBan.requestFocus();
                lblErrorGiaBan.setText("Giá bán phải lớn hơn 1000.");
                lblErrorGiaBan.setVisible(true);
                return false;
            }
        } catch (ParseException e) {
            txtGiaBan.requestFocus();
            lblErrorGiaBan.setText("Giá bán không đúng định dạng.");
            lblErrorGiaBan.setVisible(true);
//            e.printStackTrace();
            return false;
        }
        try {
            Number parsedNumber = decimalFormat.parse(txtGiaNhap.getText());
            double result = parsedNumber.doubleValue();
            lblErrorGiaNhap.setVisible(false);
            if (result < 1000) {
                txtGiaNhap.requestFocus();
                lblErrorGiaNhap.setText("Giá bán phải lớn hơn 1000.");
                lblErrorGiaNhap.setVisible(true);
                return false;
            }
        } catch (ParseException e) {
            txtGiaNhap.requestFocus();
            lblErrorGiaNhap.setText("Giá bán không đúng định dạng.");
            lblErrorGiaNhap.setVisible(true);
//            e.printStackTrace();
            return false;
        }
        return true;
    }

    void insert() {
        if (check()) {
            SanPham sp = getForm();
            if (getForm() == null) {
                this.showMessage("Thêm thất bại!");
            } else {
                SPdao.insert(sp);
                this.showMessage("Thêm thành công!");
                SanPham enity = SPdao.selectByIDMax();
                setForm(enity);
                maSPClick = enity.getMaSP();
                fillTable();
                fillComboboxByID();
                indexInsert = false;
                this.updateStatus();
            }
        }
    }

    void update() {
        if (check()) {
            SanPham sp = getForm();
            if (getForm() == null) {
                this.showMessage("Update thất bại!");
            } else {
                SPdao.update(sp);
                this.showMessage("Upate thành công!");
                fillTable();
                fillComboboxByID();
                clearForm();
            }
        }
    }

    boolean checkSL() {
        int id = Integer.parseInt(lblMaSP.getText());
        CTMDao ctmdao = new CTMDao();
        List<CTMau> listmau = new ArrayList<>();
        listmau = ctmdao.selectByMaSP(id);
        List<CTHD> listHD = new ArrayList<>();
        List<CTPN> listPN = new ArrayList<>();
        CTHDDAO hddao = new CTHDDAO();
        CTPNDao pndao = new CTPNDao();
        listHD = hddao.selectAll();
        listPN = pndao.selectAll();
        for (CTHD ctpn : listHD) {
            if(ctpn.getMaSP()==id){
                return true;
            }
        }
        for (CTPN ctpn : listPN) {
            if(ctpn.getMaSP()==id){
                return true;
            }
        }
        for (CTMau ctm : listmau) {
            if (ctm.getSl() > 0) {
                return true;
            }
        }
        return false;
    }

    void delete() {
        int id = Integer.parseInt(lblMaSP.getText());
        if (ExitMaSP(id)) {
            try {
                if (this.showConfirm("Bạn thật sự muốn xóa?")) {
                    CTMDao ctmdao = new CTMDao();
                    if (checkSL()) {
                        this.showMessage("Sản phẩm đang hoạt động");
                    } else {
                        ctmdao.DeleteByMaSP(id);
                        SPdao.delete(id);
                        this.showMessage("Xóa thành công.");
                        fillTable();
                        fillComboboxByID();
                        clearForm();
                    }
                }
            } catch (Exception e) {
                e.printStackTrace();
                this.showMessage("Sản phẩm đang hoạt động");
            }
        } else {
            this.showMessage("Mã không tồn tại!");
        }
    }

    void search() {
        list = SPdao.selectByKeyword(txtSearch.getText().trim());
        modelDS.setRowCount(0);
        tblDS.setModel(modelDS);
        for (SanPham sp : list) {
            DecimalFormat decimalFormat = new DecimalFormat("#,###,##0.0");
            String gia1 = decimalFormat.format(sp.getGiaBan());
            String gia2 = decimalFormat.format(sp.getGiaNhap());
            modelDS.addRow(new Object[]{sp.getMaSP(), sp.getTenSP(), gia1, gia2, sp.getMaVach(), sp.getMaLoai(), sp.getMaThuongHieu(), sp.getHinh()});
        }
        tblDS.setModel(modelDS);
    }
}
