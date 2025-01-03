/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package com.qlbh.app;

import ConnectDtb.DatabaseConnection;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

/**
 *
 * @author MINH TUNG
 */
public class FormDangKy extends javax.swing.JFrame {

    /**
     * Creates new form FormDangKy
     */
    public FormDangKy() {
        initComponents();

    }
    
    

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        btnThoat = new javax.swing.JButton();
        btnDangKy = new javax.swing.JButton();
        txtPassWordDK2 = new javax.swing.JPasswordField();
        jLabel2 = new javax.swing.JLabel();
        txtUserNameDK = new javax.swing.JTextField();
        txtPassWordDK = new javax.swing.JPasswordField();
        txtMaNV = new javax.swing.JTextField();
        jLabel7 = new javax.swing.JLabel();

        jLabel1.setFont(new java.awt.Font("Segoe UI", 0, 16)); // NOI18N
        jLabel1.setText("Đăng nhập");

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Quản Lý Bán Hàng Siêu Thị WinMart-Đăng ký");

        jLabel3.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        jLabel3.setText("Đăng ký");

        jLabel4.setText("Nhập Mã Nhân Viên");

        jLabel5.setText("Nhập lại Password");

        jLabel6.setText("Nhập PassWord");

        btnThoat.setText("Thoát");
        btnThoat.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnThoat.setName("btnThoat"); // NOI18N
        btnThoat.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnThoatActionPerformed(evt);
            }
        });

        btnDangKy.setText("Đăng Ký");
        btnDangKy.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnDangKy.setName("btnDangky"); // NOI18N
        btnDangKy.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnDangKyActionPerformed(evt);
            }
        });

        txtPassWordDK2.setToolTipText("");
        txtPassWordDK2.setName("txtPassWordDKNhapLai"); // NOI18N
        txtPassWordDK2.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                txtPassWordDK2KeyReleased(evt);
            }
        });

        jLabel2.setForeground(new java.awt.Color(255, 51, 51));
        jLabel2.setToolTipText("");
        jLabel2.setName("lbThongbao"); // NOI18N

        txtUserNameDK.setName("txtUNDangKy"); // NOI18N
        txtUserNameDK.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtUserNameDKActionPerformed(evt);
            }
        });

        txtPassWordDK.setToolTipText("");
        txtPassWordDK.setName("txtPassWordDK"); // NOI18N
        txtPassWordDK.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                txtPassWordDKKeyReleased(evt);
            }
        });

        txtMaNV.setName("txtMaNv"); // NOI18N
        txtMaNV.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtMaNVActionPerformed(evt);
            }
        });

        jLabel7.setText("Nhập UserName:");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(102, 102, 102)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addGap(133, 133, 133)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(txtPassWordDK2, javax.swing.GroupLayout.DEFAULT_SIZE, 189, Short.MAX_VALUE)
                            .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 119, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(txtPassWordDK, javax.swing.GroupLayout.DEFAULT_SIZE, 189, Short.MAX_VALUE)
                            .addComponent(txtUserNameDK, javax.swing.GroupLayout.DEFAULT_SIZE, 189, Short.MAX_VALUE)
                            .addComponent(txtMaNV, javax.swing.GroupLayout.DEFAULT_SIZE, 189, Short.MAX_VALUE)
                            .addComponent(jLabel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(24, 24, 24)
                                .addComponent(btnDangKy, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(74, 74, 74)
                                .addComponent(btnThoat, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addComponent(jLabel5)
                            .addComponent(jLabel4)
                            .addComponent(jLabel7)
                            .addComponent(jLabel6))
                        .addGap(24, 24, 24)))
                .addContainerGap(131, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 54, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(14, 14, 14)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtMaNV, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtUserNameDK, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel7, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(8, 8, 8)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtPassWordDK, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel6, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtPassWordDK2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 11, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(15, 15, 15)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnDangKy, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnThoat, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(26, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnThoatActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnThoatActionPerformed
        int confirm = JOptionPane.showConfirmDialog(this, "Bạn có chắc muốn thoát?", "Xác nhận", JOptionPane.YES_NO_OPTION);
        if (confirm == JOptionPane.YES_OPTION) {
            // Ẩn form Đăng Ký
            this.setVisible(false);

            // Tạo và hiển thị form đăng nhập
            FormDangNhap formDangNhap = new FormDangNhap();
            formDangNhap.setVisible(true);
        } 
    }//GEN-LAST:event_btnThoatActionPerformed

    private void btnDangKyActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnDangKyActionPerformed
         // Lấy mã nhân viên, tên người dùng và mật khẩu từ các trường văn bản
        String maNhanVien = txtMaNV.getText().trim();
        String userName = txtUserNameDK.getText().trim();
        String passWord1 = txtPassWordDK.getText();
        String passWord2 = txtPassWordDK2.getText();

        try {
            // Kết nối đến cơ sở dữ liệu
            Connection conn = DatabaseConnection.getConnection();

            // Kiểm tra xem mã nhân viên đã tồn tại trong bảng NHANVIEN hay không
            String checkNhanVienSql = "SELECT * FROM NHANVIEN WHERE MaNv = ?";
            PreparedStatement checkNhanVienStatement = conn.prepareStatement(checkNhanVienSql);
            checkNhanVienStatement.setString(1, maNhanVien);
            ResultSet resultSetNhanVien = checkNhanVienStatement.executeQuery();

            if (!resultSetNhanVien.next()) {
                // Nếu mã nhân viên không tồn tại trong bảng NHANVIEN, hiển thị thông báo và thoát
                JOptionPane.showMessageDialog(this, "Mã nhân viên không tồn tại. Vui lòng kiểm tra lại.");
            } else {
                // Kiểm tra xem mã nhân viên đã có tài khoản trong bảng TAIKHOAN hay chưa
                String checkUserSql = "SELECT * FROM TAIKHOAN WHERE MaNv = ?";
                PreparedStatement checkUserStatement = conn.prepareStatement(checkUserSql);
                checkUserStatement.setString(1, maNhanVien);
                ResultSet resultSet = checkUserStatement.executeQuery();

                if (resultSet.next()) {
                    // Nếu đã có tài khoản cho mã nhân viên này, hiển thị thông báo lỗi
                    JOptionPane.showMessageDialog(this, "Đã tồn tại tài khoản cho mã nhân viên này. Vui lòng chọn mã nhân viên khác.");
                } else {
                    // Kiểm tra xem tên người dùng đã tồn tại trong cơ sở dữ liệu hay chưa
                    String checkUserNameSql = "SELECT COUNT(*) FROM TAIKHOAN WHERE UserName = ?";
                    PreparedStatement checkUserNameStatement = conn.prepareStatement(checkUserNameSql);
                    checkUserNameStatement.setString(1, userName);
                    ResultSet resultSetUser = checkUserNameStatement.executeQuery();
                    resultSetUser.next();
                    int userCount = resultSetUser.getInt(1);

                    if (userCount > 0) {
                        // Nếu tên người dùng đã tồn tại, hiển thị thông báo lỗi
                        JOptionPane.showMessageDialog(this, "Tên đăng nhập đã tồn tại. Vui lòng chọn tên đăng nhập khác.");
                    } else if (!passWord1.equals(passWord2)) {
                        // Nếu mật khẩu nhập lại không khớp với mật khẩu ban đầu, hiển thị thông báo lỗi
                        JOptionPane.showMessageDialog(this, "Mật khẩu nhập lại không chính xác!");
                    } else {
                        // Tạo truy vấn SQL INSERT để thêm tài khoản mới vào bảng TAIKHOAN
                        String insertUserSql = "INSERT INTO TAIKHOAN (UserName, PassWord, MaNv) VALUES (?, ?, ?)";
                        PreparedStatement insertUserStatement = conn.prepareStatement(insertUserSql);
                        insertUserStatement.setString(1, userName);
                        insertUserStatement.setString(2, passWord1);
                        insertUserStatement.setString(3, maNhanVien);

                        // Thực hiện truy vấn INSERT
                        int rowsInserted = insertUserStatement.executeUpdate();

                        if (rowsInserted > 0) {
                            // Đăng ký thành công, hiển thị thông báo
                            JOptionPane.showMessageDialog(this, "Đăng ký tài khoản thành công!");
                        } else {
                            // Đăng ký không thành công, hiển thị thông báo lỗi
                            JOptionPane.showMessageDialog(this, "Đăng ký tài khoản không thành công. Vui lòng thử lại.");
                        }
                    }
                }
            }

            // Đóng các kết nối và tuyển tập
            resultSetNhanVien.close();
            checkNhanVienStatement.close();
//            conn.close();
        } catch (SQLException ex) {
            // Xử lý ngoại lệ SQL
            Logger.getLogger(FormDangKy.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_btnDangKyActionPerformed

    private void txtPassWordDK2KeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtPassWordDK2KeyReleased
        // Lấy mật khẩu từ cả hai trường văn bản
        String passWord1 = txtPassWordDK.getText();
        String passWord2 = txtPassWordDK2.getText();

        // So sánh mật khẩu
        if (passWord1.equals(passWord2)) {
            // Mật khẩu trùng khớp, hiển thị thông báo phù hợp
            jLabel2.setText("");
        } else {
            // Mật khẩu không trùng khớp, hiển thị thông báo phù hợp
            jLabel2.setText("Mật khẩu nhập lại không chính xác!");
        }
    }//GEN-LAST:event_txtPassWordDK2KeyReleased

    private void txtUserNameDKActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtUserNameDKActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtUserNameDKActionPerformed

    private void txtPassWordDKKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtPassWordDKKeyReleased
        // TODO add your handling code here:
    }//GEN-LAST:event_txtPassWordDKKeyReleased

    private void txtMaNVActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtMaNVActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtMaNVActionPerformed

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
            java.util.logging.Logger.getLogger(FormDangKy.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(FormDangKy.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(FormDangKy.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(FormDangKy.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new FormDangKy().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnDangKy;
    private javax.swing.JButton btnThoat;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JTextField txtMaNV;
    private javax.swing.JPasswordField txtPassWordDK;
    private javax.swing.JPasswordField txtPassWordDK2;
    private javax.swing.JTextField txtUserNameDK;
    // End of variables declaration//GEN-END:variables
}
