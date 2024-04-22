/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.raven.form;

import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import java.util.Properties;
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
import javax.swing.JOptionPane;
import qlsmp.DAO.NhanVienDAO;
import qlsmp.Model.NhanVien;

/**
 *
 * @author My Laptop
 */
public class Mail {
        public String setNgay() {
        String ngay;
        Date date = new Date();
        SimpleDateFormat fomat = new SimpleDateFormat("%H:%M:%S");
        return ngay = fomat.format(date);
    }

    public void Send() throws MessagingException {
        final String from = "tranngocanhthu23@gmail.com";
        final String pass = "dxsl sfmm umaz hdxd";

        //khai báo các thuộc tính
        Properties p = new Properties();
        p.put("mail.smtp.auth", "true");
        p.put("mail.smtp.starttls.enable", "true");
        p.put("mail.smtp.host", "smtp.gmail.com");
        p.put("mail.smtp.port", "587");
        p.put("mail.smtp.socketFactory.port", "587");
        p.put("mail.smtp.socketFactory.class", "javax.net.ssl.SSLSocketFactory");
        p.put("mail.smtp.ssl.protocols", "TLSv1.2");

        // lấy authenticator để đăng nhập vào gmail
        Authenticator auth = new Authenticator() {
            @Override
            protected PasswordAuthentication getPasswordAuthentication() {
                return new PasswordAuthentication(from, pass);
            }
        };
        // Phiên làm việc
        //THông qua tài khoản để đăng nhập vào
        Session session = Session.getInstance(p, auth);
        //Gửi email
        List<NhanVien> list = new ArrayList<>();
        NhanVienDAO nvdao = new NhanVienDAO();
        list = nvdao.selectAllTruongPhong();
        for (NhanVien enity : list) {
            final String to = enity.getEmail();
            // tạo 1 tin nhắn mới
            MimeMessage msg = new MimeMessage(session);
            msg.addHeader("DOANH THU TRONG NGÀY", "charset=UTF-8");
            // msg.setFrom(from);
            //tạo 1 địa chỉ nhận email kiểm tra thông tin có phù hợp k...
            msg.setRecipients(Message.RecipientType.TO, InternetAddress.parse(to, false));
            // Tiêu đề
            msg.setSubject("DOANH THU HÔM NAY");
            msg.setSentDate(new Date());
            //Nội dung
            BodyPart msg1 = new MimeBodyPart();
            msg1.setText("Hóa đơn bán hàng");
            // gửi ảnh chưa làm
            MimeBodyPart msg2= new MimeBodyPart();
            //đường dẫn đến file
            String imagePath = "C:\\Users\\My Laptop\\Downloads\\logo.jpg";
            DataSource source = new FileDataSource(imagePath);
            msg2.setDataHandler(new DataHandler(source));
            msg2.setFileName(imagePath);
            //
            BodyPart msg3 = new MimeBodyPart();
            msg3.setText("Hóa đơn nhập hàng");
            // gửi ảnh chưa làm
            MimeBodyPart msg4= new MimeBodyPart();
            //đường dẫn đến file
            String imagePath2 = "C:\\Users\\My Laptop\\Downloads\\test.xlsx";
            DataSource source2 = new FileDataSource(imagePath2);
            msg4.setDataHandler(new DataHandler(source2));
            msg4.setFileName(imagePath2);
            
            Multipart multipart = new MimeMultipart();
            multipart.addBodyPart(msg1);
            multipart.addBodyPart(msg2);
            multipart.addBodyPart(msg3);
            multipart.addBodyPart(msg4);
            msg.setContent(multipart);
            //gửi mail
            Transport.send(msg);
//            JOptionPane.showMessageDialog(this, "Gửi mail thành công");
        }
    }

    public void Gmail() {
        new Thread(new Runnable() {
            @Override
            public void run() {
                if (setNgay().equals("01:11:00")) {
                    try {
                        Send();
                        Thread.sleep(86400000); // 24h
                    } catch (InterruptedException ex) {
                        System.out.println(ex);
                    } catch (MessagingException ex) {
                        ex.printStackTrace();
                    }
                }
            }
        }).start();
    }
}
