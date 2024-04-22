package com.raven.form;

import java.awt.Color;
import java.io.BufferedInputStream;
import java.io.BufferedOutputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import javax.swing.JFileChooser;
import javax.swing.JOptionPane;
import javax.swing.event.TableModelEvent;
import javax.swing.event.TableModelListener;
import javax.swing.filechooser.FileNameExtensionFilter;
import javax.swing.table.DefaultTableModel;
import org.apache.poi.ss.usermodel.FormulaEvaluator;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.xssf.usermodel.XSSFCell;
import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import qlsmp.DAO.ChiTietKiemKeDAO;
import qlsmp.DAO.KetQuaXuLyDAO;
import qlsmp.DAO.KiemKeDAO;
import qlsmp.DAO.SanPhamDAO;
import qlsmp.DAO.SanPhamKiemKeDAO;
import qlsmp.Model.ChiTietKiemKe;
import qlsmp.Model.KetQuaXuLy;
import qlsmp.Model.KiemKe;
import qlsmp.Model.SanPham;
import qlsmp.Model.SanPhamKiemKe;

public class Form_NhapKiemKeHangHoa extends javax.swing.JFrame {

    int row = 0;
    KiemKeDAO daokk = new KiemKeDAO();
    List<KiemKe> listKK = new ArrayList<>();
    ChiTietKiemKeDAO daoCTKK = new ChiTietKiemKeDAO();
    List<ChiTietKiemKe> listCTKK = new ArrayList<>();
    KetQuaXuLyDAO daoKQ = new KetQuaXuLyDAO();
    List<KetQuaXuLy> listKQ = new ArrayList<>();
    SanPhamKiemKeDAO daoSPkk = new SanPhamKiemKeDAO();
    List<SanPhamKiemKe> listSPkk = new ArrayList<>();
    SanPhamDAO daoSP = new SanPhamDAO();
    List<SanPham> listSP = new ArrayList<>();

    public Form_NhapKiemKeHangHoa() {
        initComponents();
        init();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jTabbedPane1 = new javax.swing.JTabbedPane();
        jPanel2 = new javax.swing.JPanel();
        jPanel5 = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        txtMucDich = new javax.swing.JTextField();
        jPanel6 = new javax.swing.JPanel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        txtMaKK = new javax.swing.JTextField();
        jLabel7 = new javax.swing.JLabel();
        txtKyKiemKe = new javax.swing.JTextField();
        txtNgayKiemKe = new javax.swing.JTextField();
        jPanel3 = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        tblNhanVienKiemKe = new javax.swing.JTable();
        jPanel4 = new javax.swing.JPanel();
        jLabel8 = new javax.swing.JLabel();
        txtKetLuan = new javax.swing.JTextField();
        cboxXuLy = new javax.swing.JCheckBox();
        jLabel1 = new javax.swing.JLabel();
        jTabbedPane2 = new javax.swing.JTabbedPane();
        jPanel8 = new javax.swing.JPanel();
        jScrollPane2 = new javax.swing.JScrollPane();
        tblKiemKeChiTiet = new javax.swing.JTable();
        jLabel4 = new javax.swing.JLabel();
        lblStatus = new javax.swing.JLabel();
        btnPhieuXuat = new javax.swing.JButton();
        btnPhieuNhap = new javax.swing.JButton();
        btnXuatKhauVTHH = new javax.swing.JButton();
        btnNhapKhauVTHH = new javax.swing.JButton();
        btnThêm = new javax.swing.JButton();
        btnXoa = new javax.swing.JButton();
        btnLuu = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));

        jTabbedPane1.setBackground(new java.awt.Color(255, 255, 255));
        jTabbedPane1.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(234, 234, 234)));
        jTabbedPane1.setForeground(new java.awt.Color(11, 52, 106));
        jTabbedPane1.setOpaque(true);

        jPanel2.setBackground(new java.awt.Color(255, 255, 255));
        jPanel2.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(234, 234, 234)));

        jPanel5.setBackground(new java.awt.Color(255, 255, 255));
        jPanel5.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Thông tin chung", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Segoe UI", 0, 12), new java.awt.Color(11, 52, 106))); // NOI18N

        jLabel2.setText("Mục đích");

        javax.swing.GroupLayout jPanel5Layout = new javax.swing.GroupLayout(jPanel5);
        jPanel5.setLayout(jPanel5Layout);
        jPanel5Layout.setHorizontalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel5Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 54, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(txtMucDich, javax.swing.GroupLayout.DEFAULT_SIZE, 496, Short.MAX_VALUE)
                .addContainerGap())
        );
        jPanel5Layout.setVerticalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel5Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel2)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(jPanel5Layout.createSequentialGroup()
                .addComponent(txtMucDich)
                .addContainerGap())
        );

        jPanel6.setBackground(new java.awt.Color(255, 255, 255));
        jPanel6.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Thông tin chung", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Segoe UI", 0, 12), new java.awt.Color(11, 52, 106))); // NOI18N

        jLabel5.setText("Mã KK");

        jLabel6.setText("Ngày");

        txtMaKK.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtMaKKActionPerformed(evt);
            }
        });

        jLabel7.setText("Kỳ KK:");

        javax.swing.GroupLayout jPanel6Layout = new javax.swing.GroupLayout(jPanel6);
        jPanel6.setLayout(jPanel6Layout);
        jPanel6Layout.setHorizontalGroup(
            jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel6Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel6Layout.createSequentialGroup()
                        .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(txtMaKK, javax.swing.GroupLayout.DEFAULT_SIZE, 172, Short.MAX_VALUE))
                    .addGroup(jPanel6Layout.createSequentialGroup()
                        .addComponent(jLabel6, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(txtNgayKiemKe))
                    .addGroup(jPanel6Layout.createSequentialGroup()
                        .addComponent(jLabel7, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(txtKyKiemKe))))
        );
        jPanel6Layout.setVerticalGroup(
            jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel6Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel5)
                    .addComponent(txtMaKK, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel7)
                    .addComponent(txtKyKiemKe, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel6)
                    .addComponent(txtNgayKiemKe, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap())
        );

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel5, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel6, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(22, 22, 22))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                .addGap(12, 12, 12)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jPanel5, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jPanel6, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
        );

        jTabbedPane1.addTab("Kiểm kê", jPanel2);

        jPanel3.setBackground(new java.awt.Color(255, 255, 255));

        tblNhanVienKiemKe.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Tên NV 1", "Tên NV 2", "Tên NV 3"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.String.class, java.lang.String.class, java.lang.String.class
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }
        });
        tblNhanVienKiemKe.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tblNhanVienKiemKeMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(tblNhanVienKiemKe);

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 839, Short.MAX_VALUE)
                .addContainerGap())
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 134, Short.MAX_VALUE)
                .addContainerGap())
        );

        jTabbedPane1.addTab("Nhân viên kiểm kê", jPanel3);

        jPanel4.setBackground(new java.awt.Color(255, 255, 255));

        jLabel8.setText("Kết luận");

        cboxXuLy.setText("Đã xử lý chênh lệch");

        javax.swing.GroupLayout jPanel4Layout = new javax.swing.GroupLayout(jPanel4);
        jPanel4.setLayout(jPanel4Layout);
        jPanel4Layout.setHorizontalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel8)
                .addGap(18, 18, 18)
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(txtKetLuan)
                    .addGroup(jPanel4Layout.createSequentialGroup()
                        .addComponent(cboxXuLy, javax.swing.GroupLayout.PREFERRED_SIZE, 139, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 639, Short.MAX_VALUE)))
                .addContainerGap())
        );
        jPanel4Layout.setVerticalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel4Layout.createSequentialGroup()
                        .addComponent(jLabel8)
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addComponent(txtKetLuan, javax.swing.GroupLayout.DEFAULT_SIZE, 85, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(cboxXuLy)
                .addGap(17, 17, 17))
        );

        jTabbedPane1.addTab("Kết quả xử lý", jPanel4);

        jLabel1.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(11, 52, 106));
        jLabel1.setText("Bảng kiểm kê hàng hóa");

        jTabbedPane2.setBackground(new java.awt.Color(255, 255, 255));
        jTabbedPane2.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(204, 204, 204)));
        jTabbedPane2.setOpaque(true);

        jPanel8.setBackground(new java.awt.Color(255, 255, 255));

        tblKiemKeChiTiet.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Mã hàng hóa", "Tên hàng hóa", "Màu sắc", "Thống kê kế toán", "Thống kê thực tế", "Chênh lệch", "Loại xử lý"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.Integer.class, java.lang.String.class, java.lang.String.class, java.lang.Integer.class, java.lang.Integer.class, java.lang.Integer.class, java.lang.String.class
            };
            boolean[] canEdit = new boolean [] {
                true, false, true, false, true, false, false
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        tblKiemKeChiTiet.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tblKiemKeChiTietMouseClicked(evt);
            }
        });
        tblKiemKeChiTiet.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                tblKiemKeChiTietKeyPressed(evt);
            }
            public void keyReleased(java.awt.event.KeyEvent evt) {
                tblKiemKeChiTietKeyReleased(evt);
            }
        });
        jScrollPane2.setViewportView(tblKiemKeChiTiet);

        jLabel4.setForeground(new java.awt.Color(153, 0, 51));
        jLabel4.setText("Status:");

        lblStatus.setForeground(new java.awt.Color(153, 0, 51));

        javax.swing.GroupLayout jPanel8Layout = new javax.swing.GroupLayout(jPanel8);
        jPanel8.setLayout(jPanel8Layout);
        jPanel8Layout.setHorizontalGroup(
            jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jScrollPane2, javax.swing.GroupLayout.DEFAULT_SIZE, 851, Short.MAX_VALUE)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel8Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 54, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(lblStatus, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );
        jPanel8Layout.setVerticalGroup(
            jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel8Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 170, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(5, 5, 5)
                .addGroup(jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(lblStatus, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jLabel4, javax.swing.GroupLayout.DEFAULT_SIZE, 19, Short.MAX_VALUE))
                .addContainerGap())
        );

        jTabbedPane2.addTab("Vật tư hàng hóa cần điều chỉnh", jPanel8);

        btnPhieuXuat.setBackground(new java.awt.Color(11, 52, 106));
        btnPhieuXuat.setForeground(new java.awt.Color(255, 255, 255));
        btnPhieuXuat.setText("Lập phiếu xuất kho");
        btnPhieuXuat.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnPhieuXuatActionPerformed(evt);
            }
        });

        btnPhieuNhap.setBackground(new java.awt.Color(11, 52, 106));
        btnPhieuNhap.setForeground(new java.awt.Color(255, 255, 255));
        btnPhieuNhap.setText("Lập phiếu nhập kho");
        btnPhieuNhap.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnPhieuNhapActionPerformed(evt);
            }
        });

        btnXuatKhauVTHH.setBackground(new java.awt.Color(11, 52, 106));
        btnXuatKhauVTHH.setForeground(new java.awt.Color(255, 255, 255));
        btnXuatKhauVTHH.setText("Xuất excel danh sách sản phẩm");
        btnXuatKhauVTHH.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnXuatKhauVTHHActionPerformed(evt);
            }
        });

        btnNhapKhauVTHH.setBackground(new java.awt.Color(11, 52, 106));
        btnNhapKhauVTHH.setForeground(new java.awt.Color(255, 255, 255));
        btnNhapKhauVTHH.setText("Nhập kiểm kê từ excel");
        btnNhapKhauVTHH.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnNhapKhauVTHHActionPerformed(evt);
            }
        });

        btnThêm.setBackground(new java.awt.Color(11, 52, 106));
        btnThêm.setForeground(new java.awt.Color(255, 255, 255));
        btnThêm.setText("Thêm");
        btnThêm.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnThêmActionPerformed(evt);
            }
        });

        btnXoa.setBackground(new java.awt.Color(11, 52, 106));
        btnXoa.setForeground(new java.awt.Color(255, 255, 255));
        btnXoa.setText("Xóa");
        btnXoa.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnXoaActionPerformed(evt);
            }
        });

        btnLuu.setBackground(new java.awt.Color(11, 52, 106));
        btnLuu.setForeground(new java.awt.Color(255, 255, 255));
        btnLuu.setText("Lưu");
        btnLuu.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnLuuActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(btnXuatKhauVTHH)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(btnNhapKhauVTHH))
                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                        .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel1Layout.createSequentialGroup()
                            .addGap(12, 12, 12)
                            .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 281, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel1Layout.createSequentialGroup()
                            .addContainerGap()
                            .addComponent(jTabbedPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 853, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel1Layout.createSequentialGroup()
                            .addContainerGap()
                            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel1Layout.createSequentialGroup()
                                    .addComponent(btnPhieuXuat)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                    .addComponent(btnPhieuNhap)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(btnThêm, javax.swing.GroupLayout.PREFERRED_SIZE, 69, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                    .addComponent(btnXoa)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                    .addComponent(btnLuu))
                                .addComponent(jTabbedPane2, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.PREFERRED_SIZE, 853, javax.swing.GroupLayout.PREFERRED_SIZE)))))
                .addGap(11, 11, 11))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(btnXoa, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(btnThêm)
                            .addComponent(btnLuu, javax.swing.GroupLayout.Alignment.TRAILING)))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(12, 12, 12)
                        .addComponent(jLabel1)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jTabbedPane1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(btnXuatKhauVTHH, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(btnNhapKhauVTHH, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addGap(7, 7, 7)
                        .addComponent(jTabbedPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 239, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(btnPhieuXuat)
                            .addComponent(btnPhieuNhap))))
                .addGap(20, 20, 20))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(0, 0, 0)
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void txtMaKKActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtMaKKActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtMaKKActionPerformed

    private void tblNhanVienKiemKeMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tblNhanVienKiemKeMouseClicked

    }//GEN-LAST:event_tblNhanVienKiemKeMouseClicked

    private void tblKiemKeChiTietMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tblKiemKeChiTietMouseClicked

    }//GEN-LAST:event_tblKiemKeChiTietMouseClicked

    private void tblKiemKeChiTietKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_tblKiemKeChiTietKeyPressed
       
    }//GEN-LAST:event_tblKiemKeChiTietKeyPressed

    private void tblKiemKeChiTietKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_tblKiemKeChiTietKeyReleased
        DefaultTableModel model = (DefaultTableModel) tblKiemKeChiTiet.getModel();

        if (checkChangeTable() == true) {
            if (tblKiemKeChiTiet.getRowCount() == 1) {
                if (checkTonTaiSP() == true) {
                    addSPByIDSanPham();
                    tableChange();
                    System.out.println("TH Rowcount = 1 checktontai true");
                    if (addSPByIDSanPham() == null) {
                        lblStatus.setText("Sản phẩm không tồn tại trong kho");
                    }
                    lblStatus.setText("Hệ thống đã tải thành công");
                } else {
                    System.out.println("TH Rowcount = 1 checktontai false");
                    lblStatus.setText("Sản phẩm đã tồn tại trong bảng, vui lòng kiểm tra lại");
                    return;
                }
            } else {
                if (checkTonTaiSP() == true) {
                    System.out.println("TH Rowcount != 1 checktontai true");
                    addSPByIDSanPham();
                    tableChange();
                    if (addSPByIDSanPham() == null) {
                        lblStatus.setText("Sản phẩm không tồn tại trong kho");
                    }
                    lblStatus.setText("Hệ thống đã tải thành công");
                } else {
                    System.out.println("TH Rowcount != 1 checktontai false");
                    lblStatus.setText("Sản phẩm đã tồn tại trong bảng, vui lòng kiểm tra lại");
                    return;
                }
            }
        }
    }//GEN-LAST:event_tblKiemKeChiTietKeyReleased

    private void btnPhieuXuatActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnPhieuXuatActionPerformed
        openPhieuXuatKho();
    }//GEN-LAST:event_btnPhieuXuatActionPerformed

    private void btnPhieuNhapActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnPhieuNhapActionPerformed
        openPhieuNhapKho();
    }//GEN-LAST:event_btnPhieuNhapActionPerformed

    private void btnXuatKhauVTHHActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnXuatKhauVTHHActionPerformed
        printExcel();
    }//GEN-LAST:event_btnXuatKhauVTHHActionPerformed

    private void btnNhapKhauVTHHActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnNhapKhauVTHHActionPerformed
        importFormExcel();
    }//GEN-LAST:event_btnNhapKhauVTHHActionPerformed

    private void btnThêmActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnThêmActionPerformed
        addRowsKiemKeChiTiet();
    }//GEN-LAST:event_btnThêmActionPerformed

    private void btnXoaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnXoaActionPerformed
        int option = JOptionPane.showConfirmDialog(this, "Bạn có chắc chắn muốn xóa kiểm kê sản phẩm này?", "Xác nhận", JOptionPane.YES_NO_OPTION);
        if (option == JOptionPane.YES_OPTION) {
            deleteRowKiemKeChiTiet();
        } else {
            return;
        }
    }//GEN-LAST:event_btnXoaActionPerformed

    private void btnLuuActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnLuuActionPerformed
        int option = JOptionPane.showConfirmDialog(this, "Hãy kiểm tra kỹ thông tin trước khi lưu?", "Xác nhận lưu", JOptionPane.YES_NO_OPTION);
        if (option == JOptionPane.YES_OPTION) {
            Save();
            editButtonAffterSave();
        }
        return;
    }//GEN-LAST:event_btnLuuActionPerformed

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
            java.util.logging.Logger.getLogger(Form_NhapKiemKeHangHoa.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Form_NhapKiemKeHangHoa.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Form_NhapKiemKeHangHoa.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Form_NhapKiemKeHangHoa.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Form_NhapKiemKeHangHoa().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnLuu;
    private javax.swing.JButton btnNhapKhauVTHH;
    private javax.swing.JButton btnPhieuNhap;
    private javax.swing.JButton btnPhieuXuat;
    private javax.swing.JButton btnThêm;
    private javax.swing.JButton btnXoa;
    private javax.swing.JButton btnXuatKhauVTHH;
    private javax.swing.JCheckBox cboxXuLy;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JPanel jPanel5;
    private javax.swing.JPanel jPanel6;
    private javax.swing.JPanel jPanel8;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JTabbedPane jTabbedPane1;
    private javax.swing.JTabbedPane jTabbedPane2;
    private javax.swing.JLabel lblStatus;
    private javax.swing.JTable tblKiemKeChiTiet;
    private javax.swing.JTable tblNhanVienKiemKe;
    private javax.swing.JTextField txtKetLuan;
    private javax.swing.JTextField txtKyKiemKe;
    private javax.swing.JTextField txtMaKK;
    private javax.swing.JTextField txtMucDich;
    private javax.swing.JTextField txtNgayKiemKe;
    // End of variables declaration//GEN-END:variables

    private void init() {
        setLocationRelativeTo(null);
        addRowsKiemKeChiTiet();
    }

    public void fillToTable(int id) {
        editButtonBeforeSave();
        fillToForm(id);
        fillToTableCTKK(id);
        fillToTableNhanVien(id);

    }

    private void fillToForm(int id) {
        listKK = daokk.selectAll();

        long millis = System.currentTimeMillis();
        java.sql.Date date = new java.sql.Date(millis);

        for (KiemKe kk : listKK) {
            if (kk.getMaKiemKe() == id) {
                updateFormFields(kk);
                return;
            }
        }

        txtKyKiemKe.setText(String.valueOf(id));
        txtMaKK.setText(String.valueOf(id));
        txtNgayKiemKe.setText(date.toString());

    }

    private void updateFormFields(KiemKe kk) {
        txtKyKiemKe.setText(String.valueOf(kk.getKyKiemKe()));
        txtMaKK.setText(String.valueOf(kk.getMaKiemKe()));
        txtMucDich.setText(kk.getMucDich());
        txtKetLuan.setText(kk.getKetLuan());
        txtNgayKiemKe.setText(kk.getNgayTaoKiemKe());

        if (kk.isDaXuLy() == true) {
            ediButtonDaXuLy();
        } else {
            ediButtonChuaXuLy();
        }
    }

    private void ediButtonDaXuLy() {
        cboxXuLy.setSelected(true);
        cboxXuLy.setEnabled(false);
        btnLuu.setEnabled(false);
        btnThêm.setEnabled(false);
        btnXoa.setEnabled(false);
        txtKetLuan.setEditable(false);
        txtKyKiemKe.setEditable(false);
        txtMaKK.setEditable(false);
        txtMucDich.setEditable(false);
        txtNgayKiemKe.setEditable(false);
        btnXuatKhauVTHH.setEnabled(false);
        btnNhapKhauVTHH.setEnabled(false);
        tblKiemKeChiTiet.setEnabled(false);
        tblNhanVienKiemKe.setEnabled(false);
    }

    private void ediButtonChuaXuLy() {
        cboxXuLy.setSelected(false);
        btnLuu.setEnabled(true);
        btnThêm.setEnabled(true);
        btnXoa.setEnabled(true);
        btnXuatKhauVTHH.setEnabled(true);
        btnNhapKhauVTHH.setEnabled(true);
    }

    private void addRowsKiemKeChiTiet() {
        int rowCount = tblKiemKeChiTiet.getRowCount();
        for (int i = rowCount - 1; i < rowCount; i++) {
            DefaultTableModel model = (DefaultTableModel) tblKiemKeChiTiet.getModel();
            model.addRow(new Object[]{"Thêm sản phẩm...", "", "", "", "", "", ""});
        }
    }

    private void addRowsNhanVienKiemKe() {
        DefaultTableModel model = (DefaultTableModel) tblNhanVienKiemKe.getModel();
        if (tblNhanVienKiemKe.getRowCount() < 1) {
            model.addRow(new Object[]{"", "", ""});
        } else {
            return;
        }

    }

    private void deleteRowKiemKeChiTiet() {
        int rowCount = tblKiemKeChiTiet.getRowCount();
        for (int i = rowCount - 1; i < rowCount; i++) {
            DefaultTableModel model = (DefaultTableModel) tblKiemKeChiTiet.getModel();
            int row = tblKiemKeChiTiet.getSelectedRow();
            if (row != -1) {
                model.removeRow(row);
            }
        }
    }

//    private void addToTable(ChiTietKiemKe newProduct) {
//        DefaultTableModel model = (DefaultTableModel) tblKiemKeChiTiet.getModel();
//        Object[] rows = {
//            newProduct.getMaSP(),
//            newProduct.getTenSP(),
//            newProduct.getMauSac(),
//            newProduct.getSlKeToan()
//        };
//        model.addRow(rows);
//    }
    boolean isExists(List<ChiTietKiemKe> listExists, ChiTietKiemKe newProduct) {
        for (ChiTietKiemKe existingProduct : listExists) {
            if (existingProduct.getMaSP() == newProduct.getMaSP()) {
                return true;
            }
        }
        return false;
    }

    boolean isExists(List<ChiTietKiemKe> listExists) {
        List<ChiTietKiemKe> newProduct = getForm();
        for (ChiTietKiemKe existingProduct : listExists) {
            for (ChiTietKiemKe newPro : newProduct) {
                if (existingProduct.getMaSP() == newPro.getMaSP()) {
                    return true;
                }
            }
        }
        return false;
    }

    private List<ChiTietKiemKe> getForm() {
        List<ChiTietKiemKe> listKK = new ArrayList<>();
        int maKK = daoCTKK.selectIdKK(Integer.parseInt(txtMaKK.getText()));

        Integer idSP = null;
        String tenSP = null;
        String mauSacSP = null;
        Integer slKeToan = null;
        Integer slThucTe = null;
        Integer chenhLech = null;
        String loaiXuLy = null;
        String NV1 = null;
        String NV2 = null;
        String NV3 = null;
        Integer idSanPham_MauSac = null;

        for (int i = 0; i < tblKiemKeChiTiet.getRowCount(); i++) {
            ChiTietKiemKe ctkk = new ChiTietKiemKe();

            String nv1Value = String.valueOf(tblNhanVienKiemKe.getValueAt(0, 0));
            String nv2Value = String.valueOf(tblNhanVienKiemKe.getValueAt(0, 1));
            String nv3Value = String.valueOf(tblNhanVienKiemKe.getValueAt(0, 2));

            idSP = Integer.parseInt(String.valueOf(tblKiemKeChiTiet.getValueAt(i, 0)));
            mauSacSP = (String) tblKiemKeChiTiet.getValueAt(i, 2);
            idSanPham_MauSac = daoCTKK.selectIdSanPhamMauSac(idSP, mauSacSP);

            List<ChiTietKiemKe> list = daoCTKK.selectSPByIDSanPhamMauSacAndMauSac(idSanPham_MauSac, mauSacSP);

            ctkk.setMaKK(maKK);
            ctkk.setTenSP((String) tblKiemKeChiTiet.getValueAt(i, 1));
            ctkk.setMauSac((String) tblKiemKeChiTiet.getValueAt(i, 2));
            ctkk.setSlKeToan(parseIntegerValue(tblKiemKeChiTiet.getValueAt(i, 3)));
            ctkk.setSlThucTe(parseIntegerValue(tblKiemKeChiTiet.getValueAt(i, 4)));
            ctkk.setChenhLech(parseIntegerValue(tblKiemKeChiTiet.getValueAt(i, 5)));
            ctkk.setLoaiXuLy((String) tblKiemKeChiTiet.getValueAt(i, 6));
            ctkk.setMucDich(txtMucDich.getText());
            ctkk.setKetLuan(txtKetLuan.getText());
            ctkk.setNhanVien1(nv1Value);
            ctkk.setNhanVien2(nv2Value);
            ctkk.setNhanVien3(nv3Value);
            ctkk.setMaSPham_MSac(idSanPham_MauSac);

            listKK.add(ctkk);
        }
        return listKK;
    }

    private Integer parseIntegerValue(Object value) {
        return (value != null && !value.toString().isEmpty()) ? Integer.parseInt(value.toString()) : 0;
    }

    List<String> checkForm() {
        List<String> check = new ArrayList<>();
        String nv1 = (String) tblNhanVienKiemKe.getValueAt(0, 0);
        String nv2 = (String) tblNhanVienKiemKe.getValueAt(0, 1);
        String nv3 = (String) tblNhanVienKiemKe.getValueAt(0, 2);

        if (nv1.equalsIgnoreCase("") && nv2.equalsIgnoreCase("") && nv3.equalsIgnoreCase("")) {
            check.add("Vui lòng nhập tên nhân viên");
        }

        if (txtMucDich.getText().isBlank()) {
            check.add("Vui lòng nhập mục đích kiểm kê");
        }

        if (txtKetLuan.getText().isBlank()) {
            check.add("Vui lòng nhập kết luận kiểm kê");
        }
        return check;
    }

    private void Save() {
        clearForm();
        List<ChiTietKiemKe> model = getForm();
        List<ChiTietKiemKe> modelExists = daoCTKK.selectAll();

        Form_KiemKe kkForm = new Form_KiemKe();
        List<String> formChecks = checkForm();

        if (!checkForm().isEmpty()) {
            for (String message : formChecks) {
                JOptionPane.showMessageDialog(this, message);
            }
            return;
        }

        try {
            for (ChiTietKiemKe list : model) {
                if (isExists(modelExists, list)) {
                    daoCTKK.updateByIdKiemKe(list);
                } else {
                    daoCTKK.insert(list);
                }
                kkForm.updateMD_KK(Integer.valueOf(txtMaKK.getText()), txtMucDich.getText(), txtKetLuan.getText());
            }
            JOptionPane.showMessageDialog(this, "Lưu thành công");
        } catch (Exception e) {
            e.printStackTrace();
//            JOptionPane.showMessageDialog(this, "Lưu thất bại");
        }

    }

    private void clearForm() {
        List<ChiTietKiemKe> model = daoCTKK.selectAll();
        daoCTKK.deleteByIDKiemKe(Integer.parseInt(txtMaKK.getText()));
    }

    private List<ChiTietKiemKe> addSPByIDSanPham() {
        DefaultTableModel model = (DefaultTableModel) tblKiemKeChiTiet.getModel();
        int selectedRow = tblKiemKeChiTiet.getSelectedRow();
        List<ChiTietKiemKe> listExists = null;

        if (selectedRow != -1) {
            Object valueID = tblKiemKeChiTiet.getValueAt(selectedRow, 0);
            String idSPString = String.valueOf(valueID);
            int idSP = Integer.parseInt(idSPString);

            model.removeRow(selectedRow);

            if (!idSPString.matches("\\d+")) {
                JOptionPane.showMessageDialog(this, "Vui lòng nhập mã sản phẩm dưới dạng số để kiểm kê");
            }

            // Kiểm tra và xóa dòng trước khi thêm dữ liệu mới
            try {
                // Truy vấn danh sách tồn tại một lần
                listExists = daoCTKK.selectAll(idSP);

                for (SanPhamKiemKe ADD : daoSPkk.selectSPByIDSanPham(idSP)) {
                    if (!isExists(listExists)) {
                        Object[] rows = {
                            ADD.getMaSP(),
                            ADD.getTenSP(),
                            ADD.getMauSac(),
                            ADD.getSoLuongKeToan()
                        };
                        model.addRow(rows);
                        tableChange();
                    } else {
                        JOptionPane.showMessageDialog(this, "Sản phẩm đã tồn tại trong danh sách kiểm kê");
                    }
                }
            } catch (Exception e) {
                JOptionPane.showMessageDialog(this, "Lỗi truy vấn dữ liệu");
                e.printStackTrace();
            }
        } else {
//             Không có hàng nào được chọn, xử lý tương ứng
            System.out.println("No row selected");
        }
        return listExists;
    }

    private void addSPByIDSanPhamAndMauSac() {
        DefaultTableModel model = (DefaultTableModel) tblKiemKeChiTiet.getModel();
        int selectedRow = tblKiemKeChiTiet.getSelectedRow();
        if (selectedRow != -1) {
            Object valueID = tblKiemKeChiTiet.getValueAt(selectedRow, 0);
            String idSPString = String.valueOf(valueID);
            int idSP = Integer.parseInt(idSPString);

            Object valueMau = tblKiemKeChiTiet.getValueAt(selectedRow, 2);
            String mauSac = String.valueOf(valueMau);

            model.removeRow(selectedRow);

            if (!idSPString.matches("\\d+")) {
                JOptionPane.showMessageDialog(this, "Vui lòng nhập mã sản phẩm dưới dạng số để kiểm kê");
                return;
            }

            // Kiểm tra và xóa dòng trước khi thêm dữ liệu mới
            try {
                // Truy vấn danh sách tồn tại một lần
                List<ChiTietKiemKe> listExists = daoCTKK.selectAll(idSP);

                for (SanPhamKiemKe ADD : daoSPkk.selectSPByIDSanPhamAndMauSac(idSP, mauSac)) {
                    if (!isExists(listExists)) {
                        Object[] rows = {
                            ADD.getMaSP(),
                            ADD.getTenSP(),
                            ADD.getMauSac(),
                            ADD.getSoLuongKeToan()
                        };
                        model.addRow(rows);
                        tableChange();
                    } else {
                        JOptionPane.showMessageDialog(this, "Sản phẩm đã tồn tại trong danh sách kiểm kê");
                    }
                }
            } catch (Exception e) {
                JOptionPane.showMessageDialog(this, "Lỗi truy vấn dữ liệu");
                e.printStackTrace();
            }
        } else {
//             Không có hàng nào được chọn, xử lý tương ứng
            System.out.println("No row selected");
        }
    }

    public void fillToTableCTKK(int id) {
        listKK = daokk.selectAll();
        for (KiemKe kk : listKK) {
            if (kk.getMaKiemKe() == id) {
                fillToTableKiemKeChiTiet(id);
            }
        }
    }

    private void fillToTableKiemKeChiTiet(int id) {
        DefaultTableModel model = (DefaultTableModel) tblKiemKeChiTiet.getModel();
        model.setRowCount(0);

        if (row >= 0) {
            try {
                List<ChiTietKiemKe> listCTKK = daoCTKK.getChiTietKiemKe(id);
                for (ChiTietKiemKe ctkk : listCTKK) {
                    Object[] rowCTKK = {
                        ctkk.getMaSP(),
                        ctkk.getTenSP(),
                        ctkk.getMauSac(),
                        ctkk.getSlKeToan(),
                        ctkk.getSlThucTe(),
                        ctkk.getChenhLech(),
                        ctkk.getLoaiXuLy()
                    };
                    model.addRow(rowCTKK);
                }
            } catch (Exception e) {
                e.printStackTrace();
            }

        }

        System.out.println("Row fill to table kiem ke chi tiet: " + model.getRowCount());
    }

    void editButtonAffterSave() {
        DefaultTableModel model = (DefaultTableModel) tblKiemKeChiTiet.getModel();

        boolean enablePhieuXuat = false;
        boolean enablePhieuNhap = false;

        for (int i = 0; i < tblKiemKeChiTiet.getRowCount(); i++) {
            Object valueLoaiXuLy = tblKiemKeChiTiet.getValueAt(i, tblNhanVienKiemKe.convertRowIndexToModel(6));
            String loaiXuLy = valueLoaiXuLy.toString();

            // Kiểm tra và cập nhật trạng thái của nút PhieuXuat
            if (loaiXuLy.contains("Xuất kho")) {
                enablePhieuXuat = true;
            }

            // Kiểm tra và cập nhật trạng thái của nút PhieuNhap
            if (loaiXuLy.contains("Nhập kho")) {
                enablePhieuNhap = true;
            }
        }

        // Kích hoạt hoặc vô hiệu hóa các nút tùy thuộc vào trạng thái
        btnPhieuXuat.setEnabled(enablePhieuXuat);
        btnPhieuNhap.setEnabled(enablePhieuNhap);
    }

    void editButtonBeforeSave() {
        btnPhieuXuat.setEnabled(false);
        btnPhieuNhap.setEnabled(false);
    }

    private void updateChenhLech(int row) {
        DefaultTableModel model = (DefaultTableModel) tblKiemKeChiTiet.getModel();

        int slKeToan = (int) model.getValueAt(row, 3);
        int slThucTe = (int) model.getValueAt(row, 4);
        int chenhLech = slThucTe - slKeToan;

        // Cập nhật giá trị mới vào cột chênh lệch
        model.setValueAt(chenhLech, row, 5);
    }

    private void updateLoaiXuLy(int row) {
        DefaultTableModel model = (DefaultTableModel) tblKiemKeChiTiet.getModel();

        int chenhLech = (int) model.getValueAt(row, 5);
        String loaiXuLy = null;
        if (chenhLech > 0) {
            loaiXuLy = "Nhập kho";
        } else if (chenhLech == 0) {
            loaiXuLy = "Kiểm đủ";
        } else {
            loaiXuLy = "Xuất kho";
        }

        // Cập nhật giá trị mới vào cột LoaiXuLy
        model.setValueAt(loaiXuLy, row, 6);
    }

    private boolean isMaSPExists(Object maSP, int currentRow) {
        DefaultTableModel model = (DefaultTableModel) tblKiemKeChiTiet.getModel();

        for (int row = 0; row < model.getRowCount(); row++) {
            if (row != currentRow) {
                Object currentMaSP = model.getValueAt(row, 0);
                if (maSP.equals(currentMaSP)) {
                    return true; // Mã sản phẩm đã tồn tại
                }
            }
        }
        return false; // Mã sản phẩm chưa tồn tại
    }

    private ChiTietKiemKe getNewProduct() {
        ChiTietKiemKe newProduct = new ChiTietKiemKe();

        Integer maKK = daoCTKK.selectIdKK(Integer.parseInt(txtMaKK.getText()));
        for (int i = 0; i < tblKiemKeChiTiet.getRowCount(); i++) {
            int idSP = (int) tblKiemKeChiTiet.getValueAt(i, 0);
            String tenSP = (String) tblKiemKeChiTiet.getValueAt(i, 1);
            newProduct.setTenSP(tenSP);
            newProduct.setMaKK(maKK);
        }
        return newProduct;
    }

    private void openPhieuXuatKho() {
        DefaultTableModel model = (DefaultTableModel) tblKiemKeChiTiet.getModel();

        Form_KiemKe_XuLyXuatKho xuatKho = new Form_KiemKe_XuLyXuatKho(this);
        xuatKho.setVisible(true);

//        System.out.println("Row - open phieu xuat kho: " + model.getRowCount());
        for (int rowIndex = 0; rowIndex < model.getRowCount(); rowIndex++) {
            xuatKho.fillToTableCTKK(Integer.parseInt(txtMaKK.getText()));
        }

    }

    private void openPhieuNhapKho() {
        DefaultTableModel model = (DefaultTableModel) tblKiemKeChiTiet.getModel();

        Form_KiemKe_XuLyNhapKho nhapKho = new Form_KiemKe_XuLyNhapKho(this);
        nhapKho.setVisible(true);

//        System.out.println("Row - open phieu nhap kho: " + model.getRowCount());
        for (int rowIndex = 0; rowIndex < model.getRowCount(); rowIndex++) {
            nhapKho.fillToTableCTKK(Integer.parseInt(txtMaKK.getText()));
        }

    }

    void editButtonAfterUpdate(boolean nhapKho, boolean xuatKho) {
        DefaultTableModel model = (DefaultTableModel) tblKiemKeChiTiet.getModel();

//        System.out.println("Received value from Form nhapKho: " + nhapKho);
//        System.out.println("Received value from Form xuatKho: " + xuatKho);
        boolean checkNhapKho = false;
        boolean checkXuatKho = false;

        for (int i = 0; i < tblKiemKeChiTiet.getRowCount(); i++) {
            Object valueLoaiXuLy = tblKiemKeChiTiet.getValueAt(i, tblNhanVienKiemKe.convertRowIndexToModel(6));
            if (valueLoaiXuLy == null) {
                continue;
            }

            String loaiXuLy = valueLoaiXuLy.toString().trim();
            if (loaiXuLy.equalsIgnoreCase("Xuất kho")) {
                checkXuatKho = true;
            } else if (loaiXuLy.equalsIgnoreCase("Nhập kho")) {
                checkNhapKho = true;
            }
        }

        //Các trường hợp sẽ check box: Vừa có nhập kho + xuất kho, chỉ có xuất kho hoặc chỉ có nhập kho
        boolean xuLyNhap = checkNhapKho && nhapKho;
        boolean xuLyXuat = checkXuatKho && xuatKho;

        //Nếu không xử lý nhập và cũng không xử lý xuất thì dừng phương thức
        if (!xuLyNhap && !xuLyXuat) {
            return;
        }

        cboxXuLy.setSelected(true);
        cboxXuLy.setForeground(Color.GREEN);
        daokk.updateIsXuLy(txtMaKK.getText());
    }

    private void checkAddSanPham() {
//        for (int i = 0; i < 10; i++) {
//            
//        }
//       if((int)tblKiemKeChiTiet.getValueAt(i, 0)){
//           
//       }
    }

    private void printExcel() {
        List<ChiTietKiemKe> sanPhams = daoCTKK.selectAll();
        FileOutputStream excelFOS = null;
        BufferedOutputStream excelBOU = null;
        XSSFWorkbook excelJTableExporter = null;

        //Chọn vị trí lưu file excel
        JFileChooser excelFileChooser = new JFileChooser("C:\\KiemKeExcel");
        //Thay đổi tiêu đề Dialog
        excelFileChooser.setDialogTitle("Save as");
        // Chỉ xuất file có các đuôi xlsm, xlsx, xls 
        FileNameExtensionFilter fnef = new FileNameExtensionFilter("EXCEL FILES", "xls", "xlsx", "xlsm");
        excelFileChooser.setFileFilter(fnef);
        int excelChooser = excelFileChooser.showSaveDialog(null);

        if (excelChooser == JFileChooser.APPROVE_OPTION) {

            try {
                // Nhập thư viện poi excel vào netbeans
                excelJTableExporter = new XSSFWorkbook();

                //Tạo trang
                Workbook wb = new XSSFWorkbook();
                XSSFSheet excelSheet = excelJTableExporter.createSheet("Danh sách SP");
                XSSFRow rowcol = excelSheet.createRow(0);

                //Tạo column
                XSSFCell cell0 = rowcol.createCell(0);
                cell0.setCellValue("Mã sản phẩm");
                XSSFCell cell1 = rowcol.createCell(1);
                cell1.setCellValue("Tên sản phẩm");
                XSSFCell cell2 = rowcol.createCell(2);
                cell2.setCellValue("Màu sắc");
                XSSFCell cell3 = rowcol.createCell(3);
                cell3.setCellValue("Thống kê kiểm toán");
                XSSFCell cell4 = rowcol.createCell(4);
                cell4.setCellValue("Thống kê thực tế");
                XSSFCell cell5 = rowcol.createCell(5);
                cell5.setCellValue("Chênh lệch");
                XSSFCell cell6 = rowcol.createCell(6);
                cell6.setCellValue("Loại xử lý");

                //Vòng lặp set dữ liệu vào row
                int rowNum = 1;
                for (ChiTietKiemKe SP : sanPhams) {
                    //Tạo row theo số lượng sp
                    XSSFRow row = excelSheet.createRow(rowNum++);
                    //Tạo ô cho cell
                    XSSFCell cell = row.createCell(0);
                    //Set value cho ô của cell 0
                    cell.setCellValue(SP.getMaSP());

                    cell = row.createCell(1);
                    cell.setCellValue(SP.getTenSP());

                    cell = row.createCell(2);
                    cell.setCellValue(SP.getMauSac());

                    cell = row.createCell(3);
                    cell.setCellValue(SP.getSlKeToan());

                    cell = row.createCell(4);
                    cell.setCellValue("");

                    cell = row.createCell(5);
                    String formula = "E" + rowNum + "-D" + rowNum;
                    cell.setCellFormula(formula);

                    cell = row.createCell(6);
                    // Tạo công thức IF dựa vào giá trị của cell 4 và cell 3
                    String formulaIF = "IF(F" + rowNum + ">0, \"Nhập kho\", \"Xuất kho\")";
                    cell.setCellFormula(formulaIF);
                }

                //Append xlsx file extesions to selected files. To create unqiue file
                excelFOS = new FileOutputStream(excelFileChooser.getSelectedFile() + ".xlsx");
                excelBOU = new BufferedOutputStream(excelFOS);
                excelJTableExporter.write(excelBOU);
                JOptionPane.showMessageDialog(null, "Exported successfully...");
            } catch (FileNotFoundException ex) {
                ex.printStackTrace();
            } catch (IOException ex) {
                ex.printStackTrace();
            } finally {
                try {
                    if (excelBOU != null) {
                        excelBOU.close();
                    }
                    if (excelFOS != null) {
                        excelFOS.close();
                    }

                    if (excelJTableExporter != null) {
                        excelJTableExporter.close();
                    }
                } catch (IOException ex) {
                    ex.printStackTrace();
                }
            }
        }
    }

    private void importFormExcel() {
        File excelFile;
        FileInputStream excelFIS = null;
        BufferedInputStream excelBIS = null;
        XSSFWorkbook excelJTableImport = null;
        DefaultTableModel model = (DefaultTableModel) tblKiemKeChiTiet.getModel();
        //chọn đường dẫn mặc định
        String defaultCurrentDirectoryPath = "C:\\KiemKeExcel";
        JFileChooser excelFileChooser = new JFileChooser(defaultCurrentDirectoryPath);

        int excelChooser = excelFileChooser.showOpenDialog(null);
        //điều kiện khi click button
        if (excelChooser == JFileChooser.APPROVE_OPTION) {
            try {
                excelFile = excelFileChooser.getSelectedFile();
                excelFIS = new FileInputStream(excelFile);
                excelBIS = new BufferedInputStream(excelFIS);

                excelJTableImport = new XSSFWorkbook(excelBIS);
                XSSFSheet sheet = excelJTableImport.getSheet("Danh sách SP");

                if (sheet == null) {
                    JOptionPane.showMessageDialog(this, "Không tìm thấy sheet");
                    return;
                }

//              Vòng lặp cột và dòng của excel
                Iterator<Row> iterator = sheet.iterator();

                for (int row = 1; row <= sheet.getLastRowNum(); row++) {
                    XSSFRow excelRow = sheet.getRow(row);
                    FormulaEvaluator formulaEvaluator = excelJTableImport.getCreationHelper().createFormulaEvaluator();

                    XSSFCell excelID = excelRow.getCell(0);
                    XSSFCell excelName = excelRow.getCell(1);
                    XSSFCell excelColor = excelRow.getCell(2);
                    XSSFCell excelSLKiemToan = excelRow.getCell(3);
                    XSSFCell excelSLThucTe = excelRow.getCell(4);
                    XSSFCell excelChenhLech = excelRow.getCell(5);
                    XSSFCell excelLoaiXuLy = excelRow.getCell(6);

                    int ID = (int) formulaEvaluator.evaluate(excelID).getNumberValue();
                    String name = formulaEvaluator.evaluate(excelName).getStringValue();
                    String mauSac = formulaEvaluator.evaluate(excelColor).getStringValue();
                    int slKiemToan = (int) formulaEvaluator.evaluate(excelSLKiemToan).getNumberValue();
                    int slThucTe = (int) formulaEvaluator.evaluate(excelSLThucTe).getNumberValue();
                    int chenhLech = (int) formulaEvaluator.evaluate(excelChenhLech).getNumberValue();
                    String loaiXuLy = String.valueOf(formulaEvaluator.evaluate(excelLoaiXuLy).getStringValue());

                    model.addRow(new Object[]{ID, name, mauSac, slKiemToan, slThucTe, chenhLech, loaiXuLy});
                }
            } catch (FileNotFoundException ex) {
                JOptionPane.showMessageDialog(null, ex.getMessage());
            } catch (IOException ex) {
                JOptionPane.showMessageDialog(null, ex.getMessage());
            } finally {
                // Đóng luồng
                try {
                    if (excelBIS != null) {
                        excelBIS.close();
                    }
                    if (excelFIS != null) {
                        excelFIS.close();
                    }
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }
        }
    }

    private void tableChange() {
        DefaultTableModel model = (DefaultTableModel) tblKiemKeChiTiet.getModel();

        model.addTableModelListener(new TableModelListener() {
            @Override
            public void tableChanged(TableModelEvent e) {
                if (e.getType() == TableModelEvent.UPDATE) {
                    int row = e.getFirstRow();
                    int col = e.getColumn();

                    // Chỉ xử lý sự kiện khi cột slThucTe được cập nhật
                    if (col == 4) {
                        updateChenhLech(row);
                    }
                }

                if (e.getType() == TableModelEvent.UPDATE) {
                    int row = e.getFirstRow();
                    int col = e.getColumn();

                    // Chỉ xử lý sự kiện khi cột ChenhLech được cập nhật
                    if (col == 5) {
                        updateLoaiXuLy(row);
                    }
                }
            }
        }
        );
    }

    private boolean checkChangeTable() {
        boolean check = true;
        int CheckExistSanPham = 0;
        try {
            row = 0;
            int idSelectedRow = (int) tblKiemKeChiTiet.getValueAt(tblKiemKeChiTiet.getSelectedRow(), 0);

            if (idSelectedRow <= 0) {
                JOptionPane.showMessageDialog(this, "Vui lòng điền mã sản phẩm");
                check = false;
            }
            for (SanPham sp : daoSP.selectAll()) {
                if (idSelectedRow != sp.getMaSP()) {
                    CheckExistSanPham++;

                }
            }
            if (CheckExistSanPham <= 0) {
                lblStatus.setText("Mã sản phẩm không tồn tại");
                check = false;
            }

        } catch (NumberFormatException e) {
//            e.printStackTrace();
            JOptionPane.showMessageDialog(this, "Vui lòng nhập mã sản phẩm chính xác");
            check = false;
        }
        return check;
    }

    boolean checkTonTaiSP() {
        boolean check = true;
        for (int i = 0; i < tblKiemKeChiTiet.getRowCount() - 1; i++) {
            if (tblKiemKeChiTiet.getRowCount() == 1) {
                return true;
            }
            if (((int) (tblKiemKeChiTiet.getValueAt(i, 0)) == (int) (tblKiemKeChiTiet.getValueAt(tblKiemKeChiTiet.getSelectedRow(), 0)))) {
                lblStatus.setText("Sản phẩm " + tblKiemKeChiTiet.getValueAt(i, 1) + " đã tồn tại trong bảng, vui lòng kiểm tra lại");
                check = false;
            }
        }
        return check;
    }

    List<ChiTietKiemKe> selectListSP() {
        List<ChiTietKiemKe> listSP = new ArrayList<>();
        for (int i = 0; i < tblKiemKeChiTiet.getRowCount(); i++) {
            int maSP = (int) tblKiemKeChiTiet.getValueAt(i, 0);
            String mauSac = (String) tblKiemKeChiTiet.getValueAt(i, 2);
            List<ChiTietKiemKe> chiTietList = daoCTKK.selectSPByIDSanPhamMauSacAndMauSac(maSP, mauSac);
            if (chiTietList != null && !chiTietList.isEmpty()) {
                // Assuming you want to add all elements from chiTietList to the result list
                listSP.addAll(chiTietList);

//                System.out.println("sanPham.getMaSP(): " + maSP + "=== tblKiemKeChiTiet.getValueAt: " + mauSac);
            }
        }
        return listSP;
    }

    void fillToTableNhanVien(int ID) {
        DefaultTableModel model = (DefaultTableModel) tblNhanVienKiemKe.getModel();

        try {
            List<ChiTietKiemKe> listNV = daoCTKK.getNhanVienKKByIDKK(ID);
            for (ChiTietKiemKe nv : listNV) {
                Object[] rowCTKK = {
                    nv.getNhanVien1(),
                    nv.getNhanVien2(),
                    nv.getNhanVien3()
                };
                model.addRow(rowCTKK);
            }
        } catch (Exception e) {
        }

        if (tblNhanVienKiemKe.getRowCount() == 0) {
            addRowsNhanVienKiemKe();
        }
    }

}
