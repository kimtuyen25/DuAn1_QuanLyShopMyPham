package com.raven.form;

import com.raven.chart.Chart;
import com.raven.chart.ModelChart;
import com.raven.model.ModelCard;
import com.raven.swing.icon.GoogleMaterialDesignIcons;
import com.raven.swing.icon.IconFontSwing;
import java.awt.Color;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import java.util.Properties;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.activation.DataHandler;
import javax.activation.DataSource;
import javax.activation.FileDataSource;
import javax.mail.Authenticator;
import javax.mail.BodyPart;
import javax.mail.Message;
import javax.mail.MessagingException;
import javax.mail.Multipart;
import javax.mail.PasswordAuthentication;
import javax.mail.Session;
import javax.mail.Transport;
import javax.mail.internet.InternetAddress;
import javax.mail.internet.MimeBodyPart;
import javax.mail.internet.MimeMessage;
import javax.mail.internet.MimeMultipart;
import javax.swing.Icon;
import javax.swing.JOptionPane;
import qlsmp.DAO.NhanVienDAO;
import qlsmp.DAO.ThongKeDao;
import qlsmp.Model.ChartThongKe;
import qlsmp.Model.NhanVien;

public class Form_Home extends javax.swing.JPanel {

//    ChartThongKe enity = new ChartThongKe();
    ThongKeDao tkdao = new ThongKeDao();
    List<ChartThongKe> list = new ArrayList<>();
    int thang = 11;

    public Form_Home(){
        initComponents();
        setOpaque(false);
        initData();
        lblSoThang.setVisible(false);
        lblThang.setVisible(false);
        btnGiam.setVisible(false);
        btnTang.setVisible(false);
//        Gmail();
    }


    private void initData() {
        chart.addLegend("Doanh thu", new Color(12, 84, 175), new Color(0, 108, 247)); //mau
        chart.addLegend("Chi tiêu", new Color(211,28,215), new Color(112,69,246));
        chart.addLegend("Lợi nhuận", new Color(5, 125, 0), new Color(95, 209, 69));
        initCardData();
        initChart();
    }

    private void initCardData() {
        int slbill = tkdao.selectBillDate();
        int slPN = tkdao.selectPhieuNhapDate();
        int sssl = tkdao.selectSSbill();
        double loinhuan = tkdao.selectLoiNhuanDate();
        int PTBill = slbill * 100 / 100;
        int PTPN = slPN * 100 / 100;
        int PTLoiNhuan = (int) (loinhuan * 100 / 10000000);
        Icon icon1 = IconFontSwing.buildIcon(GoogleMaterialDesignIcons.PEOPLE, 60, new Color(255, 255, 255, 100), new Color(255, 255, 255, 15));
        card1.setData(new ModelCard("Hóa Đơn", slbill, PTBill, icon1));
        Icon icon2 = IconFontSwing.buildIcon(GoogleMaterialDesignIcons.MONETIZATION_ON, 60, new Color(255, 255, 255, 100), new Color(255, 255, 255, 15));
        card2.setData(new ModelCard("Phiếu Nhập", slPN, PTPN, icon2));
        Icon icon3 = IconFontSwing.buildIcon(GoogleMaterialDesignIcons.SHOPPING_BASKET, 60, new Color(255, 255, 255, 100), new Color(255, 255, 255, 15));
        card3.setData(new ModelCard("Tổng tiền hôm nay", loinhuan, PTLoiNhuan, icon3));
        Icon icon4 = IconFontSwing.buildIcon(GoogleMaterialDesignIcons.SHOPPING_BASKET, 60, new Color(255, 255, 255, 100), new Color(255, 255, 255, 15));
//        card4.setData(new ModelCard("So với hôm trước", sssl, 0, icon4));
    }

    private void initChart() {
        chart.removeAllData();
        lblSoThang.setText(thang + "");
        list = tkdao.selectAll();
        int vitri = 2;
        for (ChartThongKe enity : list) {
            String thu = "";
            if (enity.getLoiNhuan() < 0) {
                enity.setLoiNhuan(0);
            }
            if (vitri == 2) {
                thu = "Thứ 2";
            } else if (vitri == 3) {
                thu = "Thứ 3";
            } else if (vitri == 4) {
                thu = "Thứ 4";
            } else if (vitri == 5) {
                thu = "Thứ 5";
            } else if (vitri == 6) {
                thu = "Thứ 6";
            } else if (vitri == 7) {
                thu = "Thứ 7";
            } else if (vitri == 8) {
                thu = "Chủ nhật";
            }
            chart.addData(new ModelChart(thu, new double[]{enity.getDoanhThu(), enity.getChiPhi(), enity.getLoiNhuan()}));
            vitri++;
        }
        chart.start();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        card1 = new com.raven.component.Card();
        card2 = new com.raven.component.Card();
        card3 = new com.raven.component.Card();
        jPanel1 = new javax.swing.JPanel();
        roundPanel1 = new com.raven.swing.RoundPanel();
        chart = new com.raven.chart.Chart();
        lblThang = new javax.swing.JLabel();
        lblSoThang = new javax.swing.JLabel();
        jPanel2 = new javax.swing.JPanel();
        btnGiam = new javax.swing.JLabel();
        jPanel3 = new javax.swing.JPanel();
        btnTang = new javax.swing.JLabel();

        card1.setBackground(new java.awt.Color(10, 30, 214));
        card1.setColorGradient(new java.awt.Color(72, 111, 252));

        card2.setColorGradient(new java.awt.Color(211, 28, 215));

        card3.setBackground(new java.awt.Color(0, 102, 0));
        card3.setColorGradient(new java.awt.Color(51, 255, 51));

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));

        roundPanel1.setBackground(new java.awt.Color(255, 255, 255));
        roundPanel1.setForeground(new java.awt.Color(51, 51, 51));

        javax.swing.GroupLayout roundPanel1Layout = new javax.swing.GroupLayout(roundPanel1);
        roundPanel1.setLayout(roundPanel1Layout);
        roundPanel1Layout.setHorizontalGroup(
            roundPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(roundPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(chart, javax.swing.GroupLayout.DEFAULT_SIZE, 1225, Short.MAX_VALUE)
                .addContainerGap())
        );
        roundPanel1Layout.setVerticalGroup(
            roundPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(roundPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(chart, javax.swing.GroupLayout.PREFERRED_SIZE, 494, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(47, Short.MAX_VALUE))
        );

        lblThang.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        lblThang.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        lblThang.setText("Tháng");

        lblSoThang.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        lblSoThang.setForeground(new java.awt.Color(0, 0, 102));
        lblSoThang.setText("1");

        jPanel2.setBackground(new java.awt.Color(255, 255, 255));

        btnGiam.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/arrow-down-sign-to-navigate.png"))); // NOI18N
        btnGiam.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btnGiamMouseClicked(evt);
            }
        });

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(0, 0, 0)
                .addComponent(btnGiam)
                .addContainerGap(58, Short.MAX_VALUE))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addComponent(btnGiam)
                .addGap(0, 6, Short.MAX_VALUE))
        );

        jPanel3.setBackground(new java.awt.Color(255, 255, 255));

        btnTang.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/up-arrow.png"))); // NOI18N
        btnTang.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btnTangMouseClicked(evt);
            }
        });

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addComponent(btnTang)
                .addGap(0, 0, Short.MAX_VALUE))
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel3Layout.createSequentialGroup()
                .addGap(0, 16, Short.MAX_VALUE)
                .addComponent(btnTang, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE))
        );

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(roundPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(6, 6, 6)
                        .addComponent(lblThang, javax.swing.GroupLayout.PREFERRED_SIZE, 74, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(lblSoThang, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(jPanel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(0, 0, Short.MAX_VALUE)))
                .addContainerGap())
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(2, 2, 2)
                        .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(lblSoThang)
                            .addComponent(lblThang))
                        .addGap(11, 11, 11)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(roundPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(card1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGap(18, 18, 18)
                .addComponent(card2, javax.swing.GroupLayout.PREFERRED_SIZE, 429, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(card3, javax.swing.GroupLayout.PREFERRED_SIZE, 395, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
            .addComponent(jPanel1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(31, 31, 31)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(card1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(card2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(card3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );
    }// </editor-fold>//GEN-END:initComponents

    private void btnGiamMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnGiamMouseClicked
        if (thang == 1) {
            thang = 13;
            lblSoThang.setText(thang + "");
        }
        thang--;
        lblSoThang.setText(thang + "");
        System.out.println("THÁNG: " + thang);
        this.initChart();
    }//GEN-LAST:event_btnGiamMouseClicked

    private void btnTangMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnTangMouseClicked
        if (thang == 12) {
            thang = 0;
            lblSoThang.setText(thang + "");
        }
        thang++;
        lblSoThang.setText(thang + "");
        System.out.println("THÁNG: " + thang);
        this.initChart();
    }//GEN-LAST:event_btnTangMouseClicked

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel btnGiam;
    private javax.swing.JLabel btnTang;
    private com.raven.component.Card card1;
    private com.raven.component.Card card2;
    private com.raven.component.Card card3;
    private com.raven.chart.Chart chart;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JLabel lblSoThang;
    private javax.swing.JLabel lblThang;
    private com.raven.swing.RoundPanel roundPanel1;
    // End of variables declaration//GEN-END:variables

}
