/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package GUI.SaleGroup.SellerGUI.BasicHandle;

import GUI.SaleGroup.SellerGUI.Component.OrderItem;
import GUI.SaleGroup.SellerGUI.Component.OrderPanel;
import javax.swing.event.DocumentEvent;

/**
 *
 * @author TuanMinh
 */
public class SpinQuantityAction implements javax.swing.event.DocumentListener{
    private OrderItem orderItem;
    private OrderPanel orderPanel;
    
    public SpinQuantityAction(){
        
    }
    
    public SpinQuantityAction(OrderItem orderItem, OrderPanel orderPanel){
        this.orderItem = orderItem;
        this.orderPanel = orderPanel;
    }

    @Override
    public void insertUpdate(DocumentEvent e) {
        orderItem.showUpdateTotalPrice();
        orderPanel.calculatePayment();
    }

    @Override
    public void removeUpdate(DocumentEvent e) {
        orderItem.showUpdateTotalPrice();
        orderPanel.calculatePayment();
    }

    @Override
    public void changedUpdate(DocumentEvent e) {
        orderItem.showUpdateTotalPrice();
        orderPanel.calculatePayment();
    }

//    protected void showUpdateTotalPrice(){
//        this.productOrderTotal.setText(Long.toString(this.sp.getGiaTien()*getQuantity()));
//        this.CTHD.setSoLuong((int)getQuantity());
////        System.out.println(this.sp.getGiaTien()*getQuantity());
//    }
//    
//    public long getQuantity(){
//        return Long.valueOf(this.productOrderQuantity.getValue()+"");
//    }
}
