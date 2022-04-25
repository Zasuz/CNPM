/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JPanel.java to edit this template
 */
package GUI.ManageGroup.ComponentPanel;

import java.awt.Color;
import java.awt.Graphics;
import java.awt.Graphics2D;

/**
 *
 * @author ACER
 */
public class PanelAdd extends javax.swing.JPanel {

    /**
     * Creates new form PanelAdd
     */
    public PanelAdd() {
        initComponents();
    }
    {
              setOpaque(false);
    }
protected void paintComponent(Graphics g){
         setSize(858, 191);
        Graphics2D g2d = (Graphics2D) g.create();
        Color xanh = Color.decode("#66D9FF");
        Color xanhnhat = Color.decode("#D3F5FF");

        
        g2d.setRenderingHint(java.awt.RenderingHints.KEY_ANTIALIASING, java.awt.RenderingHints.VALUE_ANTIALIAS_ON);
         g2d.setColor(xanhnhat);
        g2d.fillRoundRect(getWidth()/7, 0, getWidth()-getWidth()/7, getHeight(), 80, 80);
        g2d.setColor(xanh);
        g2d.fillRoundRect(0, 0, getWidth()/5, getHeight(), 80, 80);
   
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
