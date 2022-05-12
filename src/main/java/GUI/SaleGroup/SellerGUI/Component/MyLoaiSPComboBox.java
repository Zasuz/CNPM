/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package GUI.SaleGroup.SellerGUI.Component;

import DAL.DataAcessObject.LoaiSanPhamDAO;
import DAL.DataModels.LoaiSanPham;
import GUI.SaleGroup.SellerGUI.BasicHandle.ComboBoxLoaiSPAction;
import GUI.SaleGroup.SellerGUI.BasicHandle.ComboboxLoaiSanPhamRender;
import java.util.List;
import javax.swing.JComboBox;
import javax.swing.JTextField;

/**
 *
 * @author huykh
 */
public class MyLoaiSPComboBox extends JComboBox<LoaiSanPham>{
    private final LoaiSanPhamDAO loaispdao = new LoaiSanPhamDAO();
    
    public MyLoaiSPComboBox() {
        this.setRenderer(new ComboboxLoaiSanPhamRender());
//        getLoaiSPFromDatabase();
    }
    
    @Override
    public LoaiSanPham getSelectedItem(){
        return ((LoaiSanPham) super.getSelectedItem());
    }
    
    public int getSelectedMaLoai(){
        return this.getSelectedItem().getMaLoai();
    }

    public void getLoaiSPFromDatabase(){
        List<LoaiSanPham> list = loaispdao.selectAll();
        for (LoaiSanPham loaisp:list){
            this.addItem(loaisp);
        }
    }
    
}
