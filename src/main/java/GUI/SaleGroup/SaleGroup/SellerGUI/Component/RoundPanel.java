package GUI.SaleGroup.SellerGUI.Component;


import java.awt.Graphics;
import java.awt.Graphics2D;
import javax.swing.JPanel;

/**
 *
 * @author huykh
 */
public class RoundPanel extends JPanel{

    {
        this.setOpaque(false);
    }
    
    public RoundPanel(){
    }
    
    public RoundPanel(int radius){
        this.radius = radius;
    }
    
    @Override
    protected void paintComponent(Graphics g){
        Graphics2D g2d = (Graphics2D) g.create();
        g2d.setRenderingHint(java.awt.RenderingHints.KEY_ANTIALIASING, java.awt.RenderingHints.VALUE_ANTIALIAS_ON);
        g2d.setColor(getBackground());
        g2d.fillRoundRect(0, 0, getWidth(), getHeight(), radius, radius);
        g2d.dispose();
        super.paintComponent(g);
    }
    
    protected int radius = 50;

    public int getRadius() {
        return radius;
    }

    public void setRadius(int radius) {
        this.radius = radius;
    }
    
}
