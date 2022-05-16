/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package GUI.SaleGroup.SellerGUI.BasicHandle;

import BUS.SaleServices.PayAction;
import GUI.SaleGroup.SellerGUI.Component.OrderPanel;
import javax.swing.event.DocumentEvent;
import javax.swing.event.DocumentListener;

/**
 *
 * @author USER
 */
public class DiscountTextFieldListener implements DocumentListener{
    private PayAction pay = new PayAction();
    private OrderPanel orderPanel;

    public DiscountTextFieldListener(OrderPanel orderPanel) {
        this.orderPanel = orderPanel;
    }
    

    @Override
    public void insertUpdate(DocumentEvent e) {
        orderPanel.calculatePayment();
    }

    @Override
    public void removeUpdate(DocumentEvent e) {
        orderPanel.calculatePayment();  
    }

    @Override
    public void changedUpdate(DocumentEvent e) {
        orderPanel.calculatePayment();
    }
    
}
