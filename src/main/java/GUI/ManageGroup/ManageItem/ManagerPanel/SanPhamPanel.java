
package GUI.ManageGroup.ManageItem.ManagerPanel;


import DAL.DataModels.SanPham;
import java.awt.Dimension;
import java.util.List;
import javax.swing.BorderFactory;
import javax.swing.SwingConstants;
import javax.swing.table.DefaultTableModel;

public class SanPhamPanel extends javax.swing.JPanel {


    public SanPhamPanel() {
        initComponents();
  
    }
   
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel81 = new javax.swing.JLabel();
        jPanel6 = new javax.swing.JPanel();
        button8 = new GUI.SaleGroup.LoginGui.Component.Button();
        button5 = new GUI.SaleGroup.LoginGui.Component.Button();
        jLabel47 = new javax.swing.JLabel();
        productDetailPanel1 = new GUI.ManageGroup.ComponentPanel.ProductDetailPanel();
        jLabel48 = new javax.swing.JLabel();
        button6 = new GUI.SaleGroup.LoginGui.Component.Button();
        jScrollPane2 = new javax.swing.JScrollPane();
        jTable1 = new javax.swing.JTable();

        setBackground(new java.awt.Color(255, 255, 255));
        setPreferredSize(new java.awt.Dimension(1020, 760));
        setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel81.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jLabel81.setForeground(new java.awt.Color(42, 148, 208));
        jLabel81.setText("QUẢN LÝ SẢN PHẨM");
        add(jLabel81, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 10, -1, 50));

        jPanel6.setBackground(new java.awt.Color(42, 148, 208));

        javax.swing.GroupLayout jPanel6Layout = new javax.swing.GroupLayout(jPanel6);
        jPanel6.setLayout(jPanel6Layout);
        jPanel6Layout.setHorizontalGroup(
            jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 10, Short.MAX_VALUE)
        );
        jPanel6Layout.setVerticalGroup(
            jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 30, Short.MAX_VALUE)
        );

        add(jPanel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 0, 10, 30));

        button8.setBackground(new java.awt.Color(118, 199, 150));
        button8.setForeground(new java.awt.Color(255, 255, 255));
        button8.setText("NHẬP EXCEL");
        button8.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        button8.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        add(button8, new org.netbeans.lib.awtextra.AbsoluteConstraints(760, 10, 110, 30));

        button5.setBackground(new java.awt.Color(118, 199, 150));
        button5.setForeground(new java.awt.Color(255, 255, 255));
        button5.setText("XUẤT EXCEL");
        button5.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        button5.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        add(button5, new org.netbeans.lib.awtextra.AbsoluteConstraints(880, 10, 110, 30));

        jLabel47.setFont(new java.awt.Font("Segoe UI", 1, 16)); // NOI18N
        jLabel47.setForeground(new java.awt.Color(42, 148, 208));
        jLabel47.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel47.setIcon(new javax.swing.ImageIcon(getClass().getResource("/GUI/ManageGroup/ManagerIcon/info.png"))); // NOI18N
        jLabel47.setText("Thông tin chi tiết");
        add(jLabel47, new org.netbeans.lib.awtextra.AbsoluteConstraints(430, 80, 170, -1));
        add(productDetailPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 130, 960, 230));

        jLabel48.setFont(new java.awt.Font("Segoe UI", 3, 18)); // NOI18N
        jLabel48.setForeground(new java.awt.Color(42, 148, 208));
        jLabel48.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel48.setIcon(new javax.swing.ImageIcon(getClass().getResource("/GUI/ManageGroup/ManagerIcon/list-icon.png"))); // NOI18N
        jLabel48.setText("Danh sách sản phẩm");
        add(jLabel48, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 410, -1, -1));

        button6.setBackground(new java.awt.Color(118, 199, 150));
        button6.setForeground(new java.awt.Color(255, 255, 255));
        button6.setText("+THÊM SẢN PHẨM");
        button6.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        button6.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        add(button6, new org.netbeans.lib.awtextra.AbsoluteConstraints(290, 410, -1, 30));

        jTable1.setBackground(new java.awt.Color(119, 176, 210));
        jTable1.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jTable1.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "Mã sản phẩm", "Tên sản phẩm", "Số lương", "Giá"
            }
        ));
        jTable1.setRowMargin(5);
        jScrollPane2.setViewportView(jTable1);

        add(jScrollPane2, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 460, 960, 270));
    }// </editor-fold>//GEN-END:initComponents


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private GUI.SaleGroup.LoginGui.Component.Button button5;
    private GUI.SaleGroup.LoginGui.Component.Button button6;
    private GUI.SaleGroup.LoginGui.Component.Button button8;
    private javax.swing.JLabel jLabel47;
    private javax.swing.JLabel jLabel48;
    private javax.swing.JLabel jLabel81;
    private javax.swing.JPanel jPanel6;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JTable jTable1;
    private GUI.ManageGroup.ComponentPanel.ProductDetailPanel productDetailPanel1;
    // End of variables declaration//GEN-END:variables
}
