/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package GUI.SaleGroup.SellerGUI.BasicHandle;

import GUI.SaleGroup.SellerGUI.Component.MenuPanel;
import GUI.SaleGroup.SellerGUI.Component.MyLoaiSPComboBox;
import javax.swing.JTextField;
import javax.swing.event.DocumentEvent;
import javax.swing.event.DocumentListener;

/**
 *
 * @author huykh
 */
public class SearchMenuListener implements DocumentListener{
    private MenuPanel menu;
    private MyLoaiSPComboBox bx;
    private JTextField searchField;

    public SearchMenuListener(MenuPanel menu, MyLoaiSPComboBox bx, JTextField searchField) {
        this.menu = menu;
        this.bx = bx;
        this.searchField = searchField;
    }
    
    @Override
    public void insertUpdate(DocumentEvent e) {
        changeOnText();
    }

    @Override
    public void removeUpdate(DocumentEvent e) {
        changeOnText();
    }

    @Override
    public void changedUpdate(DocumentEvent e) {
        changeOnText();
    }
    
    public void changeOnText(){
        int maLoaiHienTai = bx.getSelectedMaLoai();
        menu.removeAll();
        menu.getProductByNameAndType(maLoaiHienTai, searchField.getText());
    }
    
}
