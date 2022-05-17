/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package GUI.SaleGroup.SellerGUI.BasicHandle;

import BUS.SaleServices.CheckInfoSale;
import DAL.DataModels.SanPham;
import GUI.SaleGroup.SellerGUI.Component.OrderPanel;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JOptionPane;

/**
 *
 * @author huykh
 */
public class HandleClickAddEvent implements ActionListener{
    private SanPham sp;
    private OrderPanel orderpanel;
    private final CheckInfoSale check = new CheckInfoSale();

    public HandleClickAddEvent(SanPham sp, OrderPanel orderpanel) {
        this.sp = sp;
        this.orderpanel = orderpanel;
    }
    
    @Override
    public void actionPerformed(ActionEvent e) {
        if(check.hasProduct(sp.getMaSP()))
            orderpanel.addOrderItemOrIncrementByOne(sp);
        else JOptionPane.showMessageDialog(orderpanel, "Hết hàng!", "Chú ý", JOptionPane.INFORMATION_MESSAGE);
    }
    
}
