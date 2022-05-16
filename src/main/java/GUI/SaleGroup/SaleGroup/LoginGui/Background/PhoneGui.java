/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JPanel.java to edit this template
 */
package GUI.SaleGroup.LoginGui.Background;

import java.awt.Color;
import java.awt.Graphics;
import java.awt.Graphics2D;

/**
 *
 * @author ACER
 */
public class PhoneGui extends javax.swing.JPanel {

    {
        setOpaque(false);
    }

    public PhoneGui() {
        initComponents(); 
    }

    protected void paintComponent(Graphics g) {
        Graphics2D g2d = (Graphics2D) g.create();
        g2d.setRenderingHint(java.awt.RenderingHints.KEY_ANTIALIASING, java.awt.RenderingHints.VALUE_ANTIALIAS_ON);
        Color xanhdam = Color.decode("#60bfbe");
        Color trang = Color.decode("#FFFFFF");
        g2d.setColor(xanhdam);
        g2d.fillRoundRect(0, 0, getWidth()-getWidth()/50, getHeight()-getHeight()/50, 80, 80);
        g2d.setColor(trang);
        g2d.fillRoundRect(getWidth() / 15, 0, getWidth() - getWidth() / 15 , getHeight() - getHeight() / 25, 80, 80);
        g2d.dispose();
       
        super.paintComponent(g);
    
    }
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 400, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 300, Short.MAX_VALUE)
        );
    }// </editor-fold>//GEN-END:initComponents


    // Variables declaration - do not modify//GEN-BEGIN:variables
    // End of variables declaration//GEN-END:variables
}
