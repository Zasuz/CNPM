/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package GUI.SaleGroup.SellerGUI.BasicHandle;

import BUS.SaleServices.CheckInfoSale;
import GUI.SaleGroup.AddCustomerGUI.AdditionCustomerFrame;
import GUI.SaleGroup.SellerGUI.Component.OrderPanel;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JOptionPane;
import javax.swing.JTextField;

/**
 *
 * @author TUANMINH
 */
public class AddCustomerAction implements ActionListener{
    private final CheckInfoSale check = new CheckInfoSale();
    private OrderPanel orderPanel;
    private JTextField txtPhoneNumber;
    
    public AddCustomerAction(OrderPanel orderPanel, JTextField txtPhoneNumber){
        this.orderPanel = orderPanel;
        this.txtPhoneNumber = txtPhoneNumber;
    }
    
    @Override
    public void actionPerformed(ActionEvent e) {
        if(check.isPassengerExist(txtPhoneNumber.getText())){
            if(check.canUsePoint(txtPhoneNumber.getText())){
                
                int option = JOptionPane.showConfirmDialog(txtPhoneNumber, "Bạn có muốn sử dụng điểm tích lũy không?", "Question",JOptionPane.YES_NO_OPTION);
                if(option == JOptionPane.OK_OPTION)
                    txtPhoneNumber.setEnabled(true);
                else txtPhoneNumber.setEnabled(false);
                
            }else JOptionPane.showConfirmDialog(txtPhoneNumber, "Điểm tích lũy chưa đủ", "Thông báo",JOptionPane.OK_OPTION);
        orderPanel.calculatePayment();
        }else{
            int option = JOptionPane.showConfirmDialog(txtPhoneNumber, "Bạn có muốn trở thành khách hàng thân thiết?", "Question",JOptionPane.YES_NO_OPTION);
                if(option == JOptionPane.OK_OPTION)
                    new AdditionCustomerFrame().setVisible(true);
        orderPanel.calculatePayment();
        }
    }
    
}
