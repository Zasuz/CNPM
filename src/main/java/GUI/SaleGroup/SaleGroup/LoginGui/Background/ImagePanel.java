/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package GUI.SaleGroup.LoginGui.Background;

import java.awt.AlphaComposite;
import java.awt.Color;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.Image;
import java.awt.image.BufferedImage;
import javax.swing.Icon;
import javax.swing.ImageIcon;
import javax.swing.JPanel;
import org.imgscalr.Scalr;


public class ImagePanel extends JPanel{
    private ImageIcon image;

    public Icon getImage() {
        return image;
    }

    public void setImage(ImageIcon image) {
        this.image = image;
    }
    
    @Override
    protected void paintComponent(Graphics g){
        super.paintComponent(g);
        if (this.image != null){
            Graphics2D g2d = (Graphics2D) g.create();
            g2d.setRenderingHint(java.awt.RenderingHints.KEY_INTERPOLATION, java.awt.RenderingHints.VALUE_INTERPOLATION_BICUBIC);
            BufferedImage imageBuffer = getImgBuffer(this.image);
            BufferedImage buff = Scalr.resize(imageBuffer, getWidth());
            g2d.drawImage(buff,0,0,null);
            g2d.dispose();
        }
    }
    
    private BufferedImage getImgBuffer(ImageIcon icon){
        BufferedImage bi = new BufferedImage(
                icon.getIconWidth(),
                icon.getIconHeight(),
                BufferedImage.TYPE_INT_ARGB);
        Graphics2D g2d = (Graphics2D) bi.createGraphics();
        icon.paintIcon(null, g2d, 0, 0);
        g2d.dispose();
        return bi;
    }
    
}
