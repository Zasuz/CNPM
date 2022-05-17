/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package GUI.SaleGroup.SellerGUI.BasicHandle;

import BUS.SaleServices.PayAction;
import DAL.DataModels.ChiTietHoaDon;
import GUI.SaleGroup.SellerGUI.Component.OptionPaneBill;
import GUI.SaleGroup.SellerGUI.Component.OrderPanel;
import java.awt.event.ActionEvent;
import java.util.ArrayList;
import java.util.List;
import javax.swing.JLabel;
import javax.swing.JTextField;

/**
 *
 * @author TUANMINH
 */
public class PayActionListener implements java.awt.event.ActionListener{
    
    private int maNV;
    private JTextField txtVoucher;
    private JTextField txtPhoneNumber;
    private JLabel lbTotal;
    private JLabel lbDiscount;
    private JLabel lbMoney;
    private OrderPanel orderPanel;
    private final PayAction pay = new PayAction();
    
    public PayActionListener(int maNV, JTextField txtVoucher, JTextField txtPhoneNumber, JLabel lbTotal,JLabel lbDiscount,JLabel lbMoney, OrderPanel orderPanel){
        this.maNV = maNV;
        this.txtVoucher = txtVoucher;
        this.txtPhoneNumber = txtPhoneNumber;
        this.lbTotal = lbTotal;
        this.lbDiscount = lbDiscount;
        this.lbMoney = lbMoney;
        this.orderPanel = orderPanel;
    }

    @Override
    public void actionPerformed(ActionEvent e) {

        int size = orderPanel.getListChiTietHoaDon(0).size();
        long total = Long.valueOf(lbTotal.getText());
        long discount = Long.valueOf(lbDiscount.getText());
        long disVoucher = pay.discountBillByVoucher(txtVoucher.getText(), total);
        long disPoint;
        String tenKH;
        List<String> data = new ArrayList<>();
        String[][] datas = new String[size][];
        tenKH = pay.getNameFromPhoneNumber(txtPhoneNumber.getText());
        if(!txtPhoneNumber.isEnabled()){ 
            disPoint = pay.discountBillByPoint("", total);
            txtPhoneNumber.setEnabled(true);
        }else disPoint = pay.discountBillByPoint(txtPhoneNumber.getText(), total);
        
        
        if(pay.storeBill("Tiền mặt", total, disVoucher, disPoint, maNV, txtPhoneNumber.getText(), txtVoucher.getText()))
            if(pay.storeBillDetail(orderPanel.getListChiTietHoaDon(0))){
                
                //To show Bill
                int i = 0;
                for(ChiTietHoaDon item : orderPanel.getListChiTietHoaDon(pay.getMaHD())){
                    data.clear();
                    data.add(pay.getNameSPFromID(item.getMaSP()));
                    data.add(String.valueOf(item.getSoLuong()));
                    data.add(String.valueOf(item.getGiaTien()));
                    datas[i] = data.toArray(String[]::new);
                    i++;
                }
                
                OptionPaneBill.showBillPane("Tiền mặt", total, maNV, tenKH, discount, pay.getMaHD(), datas);
   
            }
    }
    
    public void setBackFirstStatus(){
        txtVoucher.setText("");
        txtPhoneNumber.setText("");
        txtPhoneNumber.setEnabled(true);
        lbTotal.setText("0");
        lbDiscount.setText("0");
        lbMoney.setText("0");
    }
}
