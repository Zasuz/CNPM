/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JPanel.java to edit this template
 */
package GUI.ManageGroup.ManageItem.FrameAdd.ComponentFrameAdd;

import javax.swing.JLabel;

/**
 *
 * @author ACER
 */
public class PanelAddManageNhanvien extends javax.swing.JPanel {

    /**
     * Creates new form PanelAddManageNhanvien
     */
    public PanelAddManageNhanvien() {
        initComponents();
    }

    public JLabel getDonGia() {
        return donGia;
    }

    public void setDonGia(JLabel donGia) {
        this.donGia = donGia;
    }

    public JLabel getMaSanPham() {
        return maSanPham;
    }

    public void setMaSanPham(int maSanPham) {
         this.maSanPham.setText(Integer.toString(maSanPham));
    }

    public JLabel getSoLuong() {
        return soLuong;
    }

    public void setSoLuong(JLabel soLuong) {
        this.soLuong = soLuong;
    }

    public JLabel getTenSanPham() {
        return tenSanPham;
    }

    public void setTenSanPham(JLabel tenSanPham) {
        this.tenSanPham = tenSanPham;
    }

  
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        shape1 = new GUI.ManageGroup.BackgroundShape.Shape();
        shape2 = new GUI.ManageGroup.BackgroundShape.Shape();
        maSanPham = new javax.swing.JLabel();
        tenSanPham = new javax.swing.JLabel();
        donGia = new javax.swing.JLabel();
        soLuong = new javax.swing.JLabel();

        javax.swing.GroupLayout shape1Layout = new javax.swing.GroupLayout(shape1);
        shape1.setLayout(shape1Layout);
        shape1Layout.setHorizontalGroup(
            shape1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 100, Short.MAX_VALUE)
        );
        shape1Layout.setVerticalGroup(
            shape1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 100, Short.MAX_VALUE)
        );

        setOpaque(false);
        setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        shape2.setLayout(new java.awt.GridLayout());

        maSanPham.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        maSanPham.setText("jLabel1");
        shape2.add(maSanPham);

        tenSanPham.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        tenSanPham.setText("jLabel2");
        shape2.add(tenSanPham);

        donGia.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        donGia.setText("jLabel4");
        shape2.add(donGia);

        soLuong.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        soLuong.setText("jLabel3");
        shape2.add(soLuong);

        add(shape2, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 950, 34));
    }// </editor-fold>//GEN-END:initComponents


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel donGia;
    private javax.swing.JLabel maSanPham;
    private GUI.ManageGroup.BackgroundShape.Shape shape1;
    private GUI.ManageGroup.BackgroundShape.Shape shape2;
    private javax.swing.JLabel soLuong;
    private javax.swing.JLabel tenSanPham;
    // End of variables declaration//GEN-END:variables
}
