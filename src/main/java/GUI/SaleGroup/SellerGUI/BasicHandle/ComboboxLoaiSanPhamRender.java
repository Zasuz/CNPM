/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package GUI.SaleGroup.SellerGUI.BasicHandle;

import DAL.DataModels.LoaiSanPham;
import java.awt.Component;
import javax.swing.DefaultListCellRenderer;
import javax.swing.JList;

/**
 *
 * @author huykh
 */
public class ComboboxLoaiSanPhamRender extends DefaultListCellRenderer{

    public ComboboxLoaiSanPhamRender() {
    }
    
    @Override
    public Component getListCellRendererComponent(JList list, Object value, int index, boolean isSelected, boolean cellHasFocus) {
        if (value instanceof LoaiSanPham loaiSanPham) {
            value = loaiSanPham.getTenLoai();
            list.setToolTipText(loaiSanPham.getMoTa());
        }
        super.getListCellRendererComponent(list, value, index, isSelected, cellHasFocus);
        return this;
    }
    
    
}
