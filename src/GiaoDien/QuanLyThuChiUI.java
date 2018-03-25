/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package GiaoDien;

import static support.SupportUIClass.createNewJFrame;

/**
 *
 * @author Dell
 */
public class QuanLyThuChiUI extends javax.swing.JPanel {

    /**
     * Creates new form QuanLyThuChi
     */
   
    private DanhSachPhieuChiUI danhSachPhieuChiUI;
   // private 
    public QuanLyThuChiUI() {
        initComponents();
        danhSachPhieuChiUI = new DanhSachPhieuChiUI();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        btnDanhSachPhieuChi = new javax.swing.JButton();
        btnThemPhieuChi = new javax.swing.JButton();
        btnPhieuThu = new javax.swing.JButton();
        btnDanhSachPhieuThu = new javax.swing.JButton();

        btnDanhSachPhieuChi.setBackground(new java.awt.Color(0, 204, 255));
        btnDanhSachPhieuChi.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        btnDanhSachPhieuChi.setForeground(new java.awt.Color(255, 255, 255));
        btnDanhSachPhieuChi.setText("Danh sách phiếu chi");
        btnDanhSachPhieuChi.setBorderPainted(false);
        btnDanhSachPhieuChi.setFocusPainted(false);
        btnDanhSachPhieuChi.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnDanhSachPhieuChiActionPerformed(evt);
            }
        });

        btnThemPhieuChi.setBackground(new java.awt.Color(0, 204, 255));
        btnThemPhieuChi.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        btnThemPhieuChi.setForeground(new java.awt.Color(255, 255, 255));
        btnThemPhieuChi.setText("Thêm phiếu chi");
        btnThemPhieuChi.setBorderPainted(false);
        btnThemPhieuChi.setFocusPainted(false);
        btnThemPhieuChi.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnThemPhieuChiActionPerformed(evt);
            }
        });

        btnPhieuThu.setBackground(new java.awt.Color(0, 204, 255));
        btnPhieuThu.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        btnPhieuThu.setForeground(new java.awt.Color(255, 255, 255));
        btnPhieuThu.setText("Thêm phiếu thu");
        btnPhieuThu.setBorderPainted(false);
        btnPhieuThu.setFocusPainted(false);
        btnPhieuThu.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnPhieuThuActionPerformed(evt);
            }
        });

        btnDanhSachPhieuThu.setBackground(new java.awt.Color(0, 204, 255));
        btnDanhSachPhieuThu.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        btnDanhSachPhieuThu.setForeground(new java.awt.Color(255, 255, 255));
        btnDanhSachPhieuThu.setText("Danh sách phiếu thu");
        btnDanhSachPhieuThu.setBorderPainted(false);
        btnDanhSachPhieuThu.setFocusPainted(false);
        btnDanhSachPhieuThu.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnDanhSachPhieuThuActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                    .addComponent(btnDanhSachPhieuChi, javax.swing.GroupLayout.DEFAULT_SIZE, 215, Short.MAX_VALUE)
                    .addComponent(btnThemPhieuChi, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(10, 10, 10)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(btnPhieuThu, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(btnDanhSachPhieuThu, javax.swing.GroupLayout.DEFAULT_SIZE, 226, Short.MAX_VALUE))
                .addContainerGap(166, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnPhieuThu, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnThemPhieuChi, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnDanhSachPhieuThu, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnDanhSachPhieuChi, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(183, Short.MAX_VALUE))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void btnThemPhieuChiActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnThemPhieuChiActionPerformed
        // TODO add your handling code here:
         createNewJFrame(danhSachPhieuChiUI, "Thêm phiếu chi");
    }//GEN-LAST:event_btnThemPhieuChiActionPerformed

    private void btnDanhSachPhieuChiActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnDanhSachPhieuChiActionPerformed
        // TODO add your handling code here:
        createNewJFrame(danhSachPhieuChiUI, "Danh sách phiếu chi");
    }//GEN-LAST:event_btnDanhSachPhieuChiActionPerformed

    private void btnDanhSachPhieuThuActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnDanhSachPhieuThuActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_btnDanhSachPhieuThuActionPerformed

    private void btnPhieuThuActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnPhieuThuActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_btnPhieuThuActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnDanhSachPhieuChi;
    private javax.swing.JButton btnDanhSachPhieuThu;
    private javax.swing.JButton btnPhieuThu;
    private javax.swing.JButton btnThemPhieuChi;
    // End of variables declaration//GEN-END:variables
}