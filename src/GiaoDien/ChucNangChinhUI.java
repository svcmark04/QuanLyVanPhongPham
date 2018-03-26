/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package GiaoDien;

import GiaoDien.ChiTietNhaCungCapUI;
import GiaoDien.QuanLyThuChiUI;
import GiaoDien.QuanLyThongKeUI;

import java.awt.BorderLayout;
import java.awt.Button;
import java.awt.Dimension;
import java.awt.FlowLayout;
import java.awt.Graphics;
import java.awt.GridLayout;
import java.awt.Point;
import javax.swing.BoxLayout;
import javax.swing.JButton;
import javax.swing.JPanel;
import javax.swing.JSplitPane;
import static support.SupportUIClass.changeJpanelContent;

/**
 *
 * @author Dell
 */
public class ChucNangChinhUI extends javax.swing.JPanel {

    /**
     * Creates new form mainUI
     */
    
    private QuanLyKhachHangUI quanLyKhachHangUI;
    private QuanLyNhanVienUI quanLyNhanVienUI;
    private QuanLyThuChiUI quanLyThuChiUI;
    private QuanLyThongKeUI quanLyThongKeUI;
    private QuanLyMuaHangUI quanLyMuaHangUI;
    private QuanLyBanHangUI quanLyBanHangUI;
    private QuanLySanPhamUI quanLySanPhamUI;
    public ChiTietNhaCungCapUI chiTietNhaCungCapUI;
    
    
    
    
    public ChucNangChinhUI() {
        initComponent();
        initComponents(); 
        addControls();
        addEvents();
    }

    private void initComponent()
    {
        quanLyKhachHangUI = new QuanLyKhachHangUI();
        quanLyNhanVienUI = new QuanLyNhanVienUI();
        quanLyThongKeUI = new QuanLyThongKeUI();
        quanLyThuChiUI = new QuanLyThuChiUI();
        quanLySanPhamUI = new QuanLySanPhamUI();
        quanLyBanHangUI = new QuanLyBanHangUI();
        quanLyMuaHangUI = new QuanLyMuaHangUI();
        chiTietNhaCungCapUI = new ChiTietNhaCungCapUI();
        
    }
    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        pnLeft = new javax.swing.JPanel();
        btbQuanLyBanHang = new javax.swing.JButton();
        btnQuanLyMuaHang = new javax.swing.JButton();
        btnQuanLySanPham = new javax.swing.JButton();
        btnQuanLyNhanVien = new javax.swing.JButton();
        btnQuanLyBaoCao = new javax.swing.JButton();
        btnQuanLyKhachHang = new javax.swing.JButton();
        btnQuanLyThuChi = new javax.swing.JButton();
        pnRight = new javax.swing.JPanel();

        setBorder(javax.swing.BorderFactory.createEtchedBorder());
        setPreferredSize(new java.awt.Dimension(1300, 700));

        pnLeft.setBorder(javax.swing.BorderFactory.createEtchedBorder());

        btbQuanLyBanHang.setBackground(new java.awt.Color(0, 153, 204));
        btbQuanLyBanHang.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        btbQuanLyBanHang.setForeground(new java.awt.Color(255, 255, 255));
        btbQuanLyBanHang.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/sale.png"))); // NOI18N
        btbQuanLyBanHang.setText("Quản lý bán hàng");
        btbQuanLyBanHang.setBorder(null);
        btbQuanLyBanHang.setBorderPainted(false);
        btbQuanLyBanHang.setFocusPainted(false);
        btbQuanLyBanHang.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        btbQuanLyBanHang.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        btbQuanLyBanHang.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        btbQuanLyBanHang.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btbQuanLyBanHangActionPerformed(evt);
            }
        });

        btnQuanLyMuaHang.setBackground(new java.awt.Color(153, 0, 153));
        btnQuanLyMuaHang.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        btnQuanLyMuaHang.setForeground(new java.awt.Color(255, 255, 255));
        btnQuanLyMuaHang.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/buy.png"))); // NOI18N
        btnQuanLyMuaHang.setText("Quản lý mua hàng");
        btnQuanLyMuaHang.setBorder(null);
        btnQuanLyMuaHang.setBorderPainted(false);
        btnQuanLyMuaHang.setFocusPainted(false);
        btnQuanLyMuaHang.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        btnQuanLyMuaHang.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        btnQuanLyMuaHang.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        btnQuanLyMuaHang.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnQuanLyMuaHangActionPerformed(evt);
            }
        });

        btnQuanLySanPham.setBackground(new java.awt.Color(51, 102, 0));
        btnQuanLySanPham.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        btnQuanLySanPham.setForeground(new java.awt.Color(255, 255, 255));
        btnQuanLySanPham.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/base.png"))); // NOI18N
        btnQuanLySanPham.setText("Quản lý sản phẩm");
        btnQuanLySanPham.setBorder(null);
        btnQuanLySanPham.setBorderPainted(false);
        btnQuanLySanPham.setFocusPainted(false);
        btnQuanLySanPham.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        btnQuanLySanPham.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        btnQuanLySanPham.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        btnQuanLySanPham.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnQuanLySanPhamActionPerformed(evt);
            }
        });

        btnQuanLyNhanVien.setBackground(new java.awt.Color(0, 153, 255));
        btnQuanLyNhanVien.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        btnQuanLyNhanVien.setForeground(new java.awt.Color(255, 255, 255));
        btnQuanLyNhanVien.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/staff.png"))); // NOI18N
        btnQuanLyNhanVien.setText("Quản lý nhân viên");
        btnQuanLyNhanVien.setBorder(null);
        btnQuanLyNhanVien.setBorderPainted(false);
        btnQuanLyNhanVien.setFocusPainted(false);
        btnQuanLyNhanVien.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        btnQuanLyNhanVien.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        btnQuanLyNhanVien.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        btnQuanLyNhanVien.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnQuanLyNhanVienActionPerformed(evt);
            }
        });

        btnQuanLyBaoCao.setBackground(new java.awt.Color(0, 102, 51));
        btnQuanLyBaoCao.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        btnQuanLyBaoCao.setForeground(new java.awt.Color(255, 255, 255));
        btnQuanLyBaoCao.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/report2.png"))); // NOI18N
        btnQuanLyBaoCao.setText("Quản lý báo cáo");
        btnQuanLyBaoCao.setBorder(null);
        btnQuanLyBaoCao.setBorderPainted(false);
        btnQuanLyBaoCao.setFocusPainted(false);
        btnQuanLyBaoCao.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        btnQuanLyBaoCao.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        btnQuanLyBaoCao.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        btnQuanLyBaoCao.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnQuanLyBaoCaoActionPerformed(evt);
            }
        });

        btnQuanLyKhachHang.setBackground(new java.awt.Color(153, 0, 51));
        btnQuanLyKhachHang.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        btnQuanLyKhachHang.setForeground(new java.awt.Color(255, 255, 255));
        btnQuanLyKhachHang.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/custemer.png"))); // NOI18N
        btnQuanLyKhachHang.setText("Khách hàng");
        btnQuanLyKhachHang.setBorder(null);
        btnQuanLyKhachHang.setBorderPainted(false);
        btnQuanLyKhachHang.setFocusPainted(false);
        btnQuanLyKhachHang.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        btnQuanLyKhachHang.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        btnQuanLyKhachHang.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        btnQuanLyKhachHang.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnQuanLyKhachHangActionPerformed(evt);
            }
        });

        btnQuanLyThuChi.setBackground(new java.awt.Color(255, 102, 0));
        btnQuanLyThuChi.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        btnQuanLyThuChi.setForeground(new java.awt.Color(255, 255, 255));
        btnQuanLyThuChi.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/casher.png"))); // NOI18N
        btnQuanLyThuChi.setText("Quản lý thu chi");
        btnQuanLyThuChi.setBorder(null);
        btnQuanLyThuChi.setBorderPainted(false);
        btnQuanLyThuChi.setFocusPainted(false);
        btnQuanLyThuChi.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        btnQuanLyThuChi.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        btnQuanLyThuChi.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        btnQuanLyThuChi.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnQuanLyThuChiActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout pnLeftLayout = new javax.swing.GroupLayout(pnLeft);
        pnLeft.setLayout(pnLeftLayout);
        pnLeftLayout.setHorizontalGroup(
            pnLeftLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnLeftLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(pnLeftLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(btnQuanLyKhachHang, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnQuanLySanPham, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnQuanLyNhanVien, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnQuanLyThuChi, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btbQuanLyBanHang, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnQuanLyMuaHang, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, pnLeftLayout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(btnQuanLyBaoCao, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );
        pnLeftLayout.setVerticalGroup(
            pnLeftLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnLeftLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(btbQuanLyBanHang, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(btnQuanLyMuaHang, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(11, 11, 11)
                .addComponent(btnQuanLySanPham, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(11, 11, 11)
                .addComponent(btnQuanLyNhanVien, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(btnQuanLyKhachHang, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(btnQuanLyThuChi, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(btnQuanLyBaoCao, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(36, Short.MAX_VALUE))
        );

        pnRight.setBorder(javax.swing.BorderFactory.createEtchedBorder());

        javax.swing.GroupLayout pnRightLayout = new javax.swing.GroupLayout(pnRight);
        pnRight.setLayout(pnRightLayout);
        pnRightLayout.setHorizontalGroup(
            pnRightLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 655, Short.MAX_VALUE)
        );
        pnRightLayout.setVerticalGroup(
            pnRightLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 0, Short.MAX_VALUE)
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(16, 16, 16)
                .addComponent(pnLeft, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(pnRight, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 17, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(pnRight, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(pnLeft, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void btbQuanLyBanHangActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btbQuanLyBanHangActionPerformed
        // TODO add your handling code here:
       changeJpanelContent(pnRight, quanLyBanHangUI);
       pnRight.repaint();
     
    
    }//GEN-LAST:event_btbQuanLyBanHangActionPerformed

    private void btnQuanLyMuaHangActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnQuanLyMuaHangActionPerformed
        // TODO add your handling code here:
       changeJpanelContent(pnRight, quanLyMuaHangUI);
       pnRight.repaint();
    }//GEN-LAST:event_btnQuanLyMuaHangActionPerformed

    private void btnQuanLySanPhamActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnQuanLySanPhamActionPerformed
        // TODO add your handling code here:
       changeJpanelContent(pnRight, quanLySanPhamUI);
       pnRight.repaint();
    }//GEN-LAST:event_btnQuanLySanPhamActionPerformed

    private void btnQuanLyNhanVienActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnQuanLyNhanVienActionPerformed
        // TODO add your handling code here:
       changeJpanelContent(pnRight, quanLyNhanVienUI);
       pnRight.repaint();
    }//GEN-LAST:event_btnQuanLyNhanVienActionPerformed

    private void btnQuanLyBaoCaoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnQuanLyBaoCaoActionPerformed
        // TODO add your handling code here:
       changeJpanelContent(pnRight, quanLyThongKeUI); 
       pnRight.repaint();
    }//GEN-LAST:event_btnQuanLyBaoCaoActionPerformed

    private void btnQuanLyKhachHangActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnQuanLyKhachHangActionPerformed
        // TODO add your handling code here:
      changeJpanelContent(pnRight, quanLyKhachHangUI); 
       pnRight.repaint();
    }//GEN-LAST:event_btnQuanLyKhachHangActionPerformed

    private void btnQuanLyThuChiActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnQuanLyThuChiActionPerformed
        // TODO add your handling code here:
      changeJpanelContent(pnRight, quanLyThuChiUI);
       pnRight.repaint();
    }//GEN-LAST:event_btnQuanLyThuChiActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btbQuanLyBanHang;
    private javax.swing.JButton btnQuanLyBaoCao;
    private javax.swing.JButton btnQuanLyKhachHang;
    private javax.swing.JButton btnQuanLyMuaHang;
    private javax.swing.JButton btnQuanLyNhanVien;
    private javax.swing.JButton btnQuanLySanPham;
    private javax.swing.JButton btnQuanLyThuChi;
    private javax.swing.JPanel pnLeft;
    private javax.swing.JPanel pnRight;
    // End of variables declaration//GEN-END:variables

    private void addControls() {
       
         pnRight.setPreferredSize(new Dimension(1150,680));
    }

    private void addEvents() {
  
    }
}
