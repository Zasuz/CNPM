/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package GUI.SaleGroup.SellerGUI.BasicHandle;

import DAL.DataModels.LoaiSanPham;
import GUI.SaleGroup.SellerGUI.Component.MenuPanel;
import GUI.SaleGroup.SellerGUI.Component.MyLoaiSPComboBox;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JComboBox;
import javax.swing.JTextField;

/**
 *
 * @author huykh
 */
public class ComboBoxLoaiSPAction implements ActionListener{
    private MenuPanel menu;
    private JTextField searchField;
    private MyLoaiSPComboBox bx;

    public ComboBoxLoaiSPAction(MyLoaiSPComboBox bx, MenuPanel menu, JTextField searchField) {
        this.menu = menu;
        this.bx = bx;
        this.searchField = searchField;
    }
    
    @Override
    public void actionPerformed(ActionEvent e) {
//        System.out.println("Click value: "+ bx.getSelectedMaLoai());
        int maLoaiHienTai = bx.getSelectedMaLoai();
        menu.removeAll();
        menu.getProductByNameAndType(maLoaiHienTai, searchField.getText());
    }
    
}
