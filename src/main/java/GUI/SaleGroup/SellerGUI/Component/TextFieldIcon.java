/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package GUI.SaleGroup.SellerGUI.Component;

import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.Image;
import javax.swing.Icon;
import javax.swing.ImageIcon;
import javax.swing.JTextField;

/**
 *
 * @author huykh
 */
public class TextFieldIcon extends JTextField{
    private ImageIcon textHeadIcon;
    private final int image_width = 30;
    private final int image_height = 30;
    
    {
        this.setOpaque(false);
    }

    public TextFieldIcon() {
    }

    public Icon getTextHeadIcon() {
        return textHeadIcon;
    }
    

    public void setTextHeadIcon(ImageIcon textHeadIcon) {
        this.textHeadIcon = textHeadIcon;
        if (textHeadIcon != null){
            Image icon =  textHeadIcon.getImage();
            Image scaleImage = icon.getScaledInstance(image_width, image_height,Image.SCALE_SMOOTH);
            ImageIcon myImage = new ImageIcon(scaleImage);
            this.putClientProperty("JTextField.leadingIcon", myImage);
            this.putClientProperty("JTextField.showClearButton", true);
            this.putClientProperty("JTextField.placeholderText", "Search anything ...");
        }
    }
    
    @Override
    protected void paintComponent(Graphics g){
        Graphics2D g2d = (Graphics2D) g.create();
        g2d.fillRoundRect(0, 0, getWidth(), getHeight(), getHeight(), getHeight());
        g2d.setRenderingHint(java.awt.RenderingHints.KEY_INTERPOLATION, java.awt.RenderingHints.VALUE_INTERPOLATION_BICUBIC);

        g2d.dispose();
        super.paintComponent(g);
    }
    
}
