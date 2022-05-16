/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package GUI.SaleGroup.SellerGUI.BasicHandle;

import GUI.SaleGroup.SellerGUI.Component.OrderPanel;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;

/**
 *
 * @author TUANMINH
 */
public class ClearAllAction extends MouseAdapter{
    private OrderPanel orderPanel;
    
    public ClearAllAction(OrderPanel orderPanel){
        this.orderPanel = orderPanel;
    }
    
    @Override
    public void mousePressed(MouseEvent e) {
        orderPanel.removeAllOrderItem();
    }
    
}
