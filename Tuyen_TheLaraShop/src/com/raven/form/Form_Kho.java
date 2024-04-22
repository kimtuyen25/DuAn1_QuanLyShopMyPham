//TUYẾN - HOÀN THÀNH
package com.raven.form;

import java.awt.event.KeyEvent;
import java.text.DecimalFormat;
import java.util.ArrayList;
import java.util.List;
import javax.swing.table.DefaultTableModel;
import qlsmp.DAO.CTMDao;
import qlsmp.DAO.KhoDAO;
import qlsmp.DAO.LoaiSPDAO;
import qlsmp.DAO.MauSacDAO;
import qlsmp.DAO.SanPhamDAO;
import qlsmp.DAO.ThuongHieuDAO;
import qlsmp.Model.CTMau;
import qlsmp.Model.LoaiSP;
import qlsmp.Model.MauSac;
import qlsmp.Model.SanPham;
import qlsmp.Model.ThuongHieu;

public class Form_Kho extends javax.swing.JPanel {

    public Form_Kho() {
        initComponents();
        init();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        txtSearch = new javax.swing.JTextField();
        btnSearch = new javax.swing.JButton();
        tabs = new javax.swing.JTabbedPane();
        jPanel2 = new javax.swing.JPanel();
        jScrollPane7 = new javax.swing.JScrollPane();
        tblDS = new javax.swing.JTable();
        jPanel3 = new javax.swing.JPanel();
        jScrollPane8 = new javax.swing.JScrollPane();
        tblSapHet = new javax.swing.JTable();
        jPanel4 = new javax.swing.JPanel();
        jScrollPane9 = new javax.swing.JScrollPane();
        tblHet = new javax.swing.JTable();
        jScrollPane1 = new javax.swing.JScrollPane();
        tblCT = new javax.swing.JTable();
        jLabel1 = new javax.swing.JLabel();

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));

        txtSearch.setText("Tên sán phẩm");
        txtSearch.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                txtSearchKeyReleased(evt);
            }
        });

        btnSearch.setBackground(new java.awt.Color(0, 0, 102));
        btnSearch.setForeground(new java.awt.Color(255, 255, 255));
        btnSearch.setText("Tìm kiếm");
        btnSearch.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSearchActionPerformed(evt);
            }
        });

        tabs.setBackground(new java.awt.Color(255, 255, 255));
        tabs.setOpaque(true);

        jPanel2.setBackground(new java.awt.Color(255, 255, 255));

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

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 1227, Short.MAX_VALUE)
            .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(jPanel2Layout.createSequentialGroup()
                    .addContainerGap()
                    .addComponent(jScrollPane7, javax.swing.GroupLayout.DEFAULT_SIZE, 1215, Short.MAX_VALUE)
                    .addContainerGap()))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 482, Short.MAX_VALUE)
            .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                    .addContainerGap()
                    .addComponent(jScrollPane7, javax.swing.GroupLayout.DEFAULT_SIZE, 470, Short.MAX_VALUE)
                    .addContainerGap()))
        );

        tabs.addTab("Danh sách", jPanel2);

        jPanel3.setBackground(new java.awt.Color(255, 255, 255));

        tblSapHet.setModel(new javax.swing.table.DefaultTableModel(
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
        tblSapHet.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tblSapHetMouseClicked(evt);
            }
        });
        jScrollPane8.setViewportView(tblSapHet);

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 1227, Short.MAX_VALUE)
            .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(jPanel3Layout.createSequentialGroup()
                    .addContainerGap()
                    .addComponent(jScrollPane8, javax.swing.GroupLayout.DEFAULT_SIZE, 1215, Short.MAX_VALUE)
                    .addContainerGap()))
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 482, Short.MAX_VALUE)
            .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel3Layout.createSequentialGroup()
                    .addContainerGap()
                    .addComponent(jScrollPane8, javax.swing.GroupLayout.DEFAULT_SIZE, 470, Short.MAX_VALUE)
                    .addContainerGap()))
        );

        tabs.addTab("Sắp hết", jPanel3);

        jPanel4.setBackground(new java.awt.Color(255, 255, 255));

        tblHet.setModel(new javax.swing.table.DefaultTableModel(
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
        tblHet.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tblHetMouseClicked(evt);
            }
        });
        jScrollPane9.setViewportView(tblHet);

        javax.swing.GroupLayout jPanel4Layout = new javax.swing.GroupLayout(jPanel4);
        jPanel4.setLayout(jPanel4Layout);
        jPanel4Layout.setHorizontalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 1227, Short.MAX_VALUE)
            .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(jPanel4Layout.createSequentialGroup()
                    .addContainerGap()
                    .addComponent(jScrollPane9, javax.swing.GroupLayout.DEFAULT_SIZE, 1215, Short.MAX_VALUE)
                    .addContainerGap()))
        );
        jPanel4Layout.setVerticalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 482, Short.MAX_VALUE)
            .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel4Layout.createSequentialGroup()
                    .addContainerGap()
                    .addComponent(jScrollPane9, javax.swing.GroupLayout.DEFAULT_SIZE, 470, Short.MAX_VALUE)
                    .addContainerGap()))
        );

        tabs.addTab("Hết hàng", jPanel4);

        tblCT.setModel(new javax.swing.table.DefaultTableModel(
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
        jScrollPane1.setViewportView(tblCT);

        jLabel1.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(0, 0, 102));
        jLabel1.setText("Chi tiết số lượng sản phẩm");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(301, 301, 301)
                        .addComponent(txtSearch, javax.swing.GroupLayout.PREFERRED_SIZE, 499, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(btnSearch, javax.swing.GroupLayout.PREFERRED_SIZE, 102, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addContainerGap()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jScrollPane1, javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(tabs))))
                .addContainerGap())
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 238, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addGap(19, 19, 19)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtSearch, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnSearch, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addComponent(tabs)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, 0)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 179, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 1239, Short.MAX_VALUE)
            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 803, Short.MAX_VALUE)
            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void btnSearchActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSearchActionPerformed
        search();
    }//GEN-LAST:event_btnSearchActionPerformed

    private void tblDSMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tblDSMouseClicked
        masp = (int) tblDS.getValueAt(tblDS.getSelectedRow(), 0);
        fillTheoMau();
    }//GEN-LAST:event_tblDSMouseClicked

    private void tblSapHetMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tblSapHetMouseClicked
        masp = (int) tblSapHet.getValueAt(tblSapHet.getSelectedRow(), 0);
        fillTheoMau();
    }//GEN-LAST:event_tblSapHetMouseClicked

    private void tblHetMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tblHetMouseClicked
        masp = (int) tblHet.getValueAt(tblHet.getSelectedRow(), 0);
        fillTheoMau();
    }//GEN-LAST:event_tblHetMouseClicked

    private void txtSearchKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtSearchKeyReleased
        if(evt.getKeyCode()==KeyEvent.VK_ENTER){
            search();
        }
    }//GEN-LAST:event_txtSearchKeyReleased


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnSearch;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane7;
    private javax.swing.JScrollPane jScrollPane8;
    private javax.swing.JScrollPane jScrollPane9;
    private javax.swing.JTabbedPane tabs;
    private javax.swing.JTable tblCT;
    private javax.swing.JTable tblDS;
    private javax.swing.JTable tblHet;
    private javax.swing.JTable tblSapHet;
    private javax.swing.JTextField txtSearch;
    // End of variables declaration//GEN-END:variables

    public List<SanPham> list = new ArrayList<>();
    KhoDAO Khodao = new KhoDAO();
    SanPhamDAO SPdao = new SanPhamDAO();
    String[] colums = {"Mã sản phẩm", "Tên sản phẩm", "Số lượng", "Giá bán", "Giá nhập", "Tên loại", "Tên thương hiệu", "Hinh"};
    DefaultTableModel modelDS = new DefaultTableModel(colums, 0);
    int masp = -1;

    void init() {
        tblDS.setDefaultEditor(Object.class, null);
        tblSapHet.setDefaultEditor(Object.class, null);
        tblCT.setDefaultEditor(Object.class, null);
        this.fillTable();
        this.fillTableSapHet();
        this.fillTableHet();
        clearForm();
        fillTheoMau();
    }

    void clearForm() {
        txtSearch.setText(null);
    }

    void fillTheoMau() {
        String[] colums = {"Mã sản phẩm", "Tên sản phẩm", "Mã màu", "Tên Màu", "Số lượng"};
        DefaultTableModel modelCT = new DefaultTableModel(colums, 0);
        modelCT.setRowCount(0);
        CTMDao ctdao = new CTMDao();
        List<CTMau> listmau = new ArrayList<>();
        if (masp >= 0) {
            listmau = ctdao.selectByMaSP(masp);
        }
        for (CTMau enity : listmau) {
            MauSacDAO maudao = new MauSacDAO();
            MauSac mau = maudao.selectByMaMau(enity.getMaMau());
            SanPham sp = SPdao.selecteByID(enity.getMaSP());
            modelCT.addRow(new Object[]{enity.getMaSP(), sp.getTenSP(), enity.getMaMau(), mau.getTenMau(), enity.getSl()});
        }
        tblCT.setModel(modelCT);
    }

    void fillTable() {
        LoaiSPDAO loaidao = new LoaiSPDAO();
        ThuongHieuDAO thdao = new ThuongHieuDAO();

        modelDS.setRowCount(0);
        list = Khodao.selectAll();
        for (SanPham sp : list) {
            DecimalFormat decimalFormat = new DecimalFormat("#,###,##0.0");
            String gia1 = decimalFormat.format(sp.getGiaBan());
            String gia2 = decimalFormat.format(sp.getGiaNhap());
            LoaiSP loai = loaidao.selectByID(sp.getMaLoai());
            ThuongHieu th = thdao.selecteByID(sp.getMaThuongHieu());
            modelDS.addRow(new Object[]{sp.getMaSP(), sp.getTenSP(), sp.getSl(), gia1, gia2, loai.getTenLoai(), th.getTenTH(), sp.getHinh()});
        }
        tblDS.setModel(modelDS);
    }

    void fillTableSapHet() {
        String[] colums = {"Mã sản phẩm", "Tên sản phẩm", "Số lượng", "Giá bán", "Giá nhập", "Mã loại", "Mã thương hiệu", "Hinh"};
        DefaultTableModel model = new DefaultTableModel(colums, 0);
        model.setRowCount(0);
        list = Khodao.selectSapHet();
        LoaiSPDAO loaidao = new LoaiSPDAO();
        ThuongHieuDAO thdao = new ThuongHieuDAO();
        for (SanPham sp : list) {
            DecimalFormat decimalFormat = new DecimalFormat("#,###,##0.0");
            String gia1 = decimalFormat.format(sp.getGiaBan());
            String gia2 = decimalFormat.format(sp.getGiaNhap());
            LoaiSP loai = loaidao.selectByID(sp.getMaLoai());
            ThuongHieu th = thdao.selecteByID(sp.getMaThuongHieu());
            model.addRow(new Object[]{sp.getMaSP(), sp.getTenSP(), sp.getSl(), gia1, gia2, loai.getTenLoai(), th.getTenTH(), sp.getHinh()});
        }
        tblSapHet.setModel(model);
    }

    void fillTableHet() {
        String[] colums = {"Mã sản phẩm", "Tên sản phẩm", "Số lượng", "Giá bán", "Giá nhập", "Mã loại", "Mã thương hiệu", "Hinh"};
        DefaultTableModel model = new DefaultTableModel(colums, 0);
        model.setRowCount(0);
        list = Khodao.selectSPHet();
        LoaiSPDAO loaidao = new LoaiSPDAO();
        ThuongHieuDAO thdao = new ThuongHieuDAO();
        for (SanPham sp : list) {
            DecimalFormat decimalFormat = new DecimalFormat("#,###,##0.0");
            String gia1 = decimalFormat.format(sp.getGiaBan());
            String gia2 = decimalFormat.format(sp.getGiaNhap());
            LoaiSP loai = loaidao.selectByID(sp.getMaLoai());
            ThuongHieu th = thdao.selecteByID(sp.getMaThuongHieu());
            model.addRow(new Object[]{sp.getMaSP(), sp.getTenSP(), sp.getSl(), gia1, gia2, loai.getTenLoai(), th.getTenTH(), sp.getHinh()});
        }
        tblHet.setModel(model);
    }

    void search() {
        tabs.setSelectedIndex(0);
        list = Khodao.selectByKeyword(txtSearch.getText().trim());
        modelDS.setRowCount(0);
        tblDS.setModel(modelDS);
        LoaiSPDAO loaidao = new LoaiSPDAO();
        ThuongHieuDAO thdao = new ThuongHieuDAO();
        for (SanPham sp : list) {
            DecimalFormat decimalFormat = new DecimalFormat("#,###,##0.0");
            String gia1 = decimalFormat.format(sp.getGiaBan());
            String gia2 = decimalFormat.format(sp.getGiaNhap());
            LoaiSP loai = loaidao.selectByID(sp.getMaLoai());
            ThuongHieu th = thdao.selecteByID(sp.getMaThuongHieu());
            modelDS.addRow(new Object[]{sp.getMaSP(), sp.getTenSP(), sp.getSl(), gia1, gia2, loai.getTenLoai(), th.getTenTH(), sp.getHinh()});
        }
        tblDS.setModel(modelDS);
    }

}
