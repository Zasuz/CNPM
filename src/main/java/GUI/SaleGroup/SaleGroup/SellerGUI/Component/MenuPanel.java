/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package GUI.SaleGroup.SellerGUI.Component;

import DAL.DataAcessObject.SanPhamDAO;
import DAL.DataModels.SanPham;
import GUI.SaleGroup.SellerGUI.BasicHandle.HandleClickAddEvent;
import java.awt.Component;
import java.awt.Dimension;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author huykh
 */
public class MenuPanel extends ScrollPanel{
    private final SanPhamDAO spDAO = new SanPhamDAO();
    private List<SanPham> listData;
    private final OrderPanel orderpanel;
    
    public MenuPanel(int width, int height, OrderPanel orderPanel){
        super(width, height);
        this.orderpanel = orderPanel;
        listData = new ArrayList<>();
    }
    
    public void getAllProduct(){
        List<SanPham> list = spDAO.selectAll();
        addToPanel(list);
    }
    
    public void getProductByType(int maLoai){
        List<SanPham> list = spDAO.selectByLoaiSP(maLoai);
        addToPanel(list);
    }
    
    public void getProductByName(String name){
        List<SanPham> list = spDAO.selectByTenSP(name);
        addToPanel(list);
    }
    
    public void getProductByNameAndType(int maLoai, String name){
        if (maLoai == 0){
            List<SanPham> list = spDAO.selectByTenSP(name);
            addToPanel(list);
            return;
        }
        List<SanPham> list = spDAO.selectByTenSPAndLoaiSP(maLoai, name);
        addToPanel(list);
    }

    public void addToPanel(SanPham sp) {
        MenuItem item = new MenuItem(sp);
        item.getButtonAdd().addActionListener(new HandleClickAddEvent(sp, orderpanel));
        this.panel.add(item);
        this.panel.revalidate();
        this.panel.repaint();
//        System.out.println("Call add");
        this.panel.setPreferredSize(new Dimension((int)this.panel.getPreferredSize().getWidth(),calculateHeight()));
    }
    
    public void addToPanel(List<SanPham> list) {
        this.listData = list;
        for (SanPham sp: list){
            addToPanel(sp);
        }
    }
    
    public void removeAll(){
        this.panel.removeAll();
        this.panel.revalidate();
        this.panel.repaint();
//        System.out.println("Call remove");
        this.panel.setPreferredSize(new Dimension((int)this.panel.getPreferredSize().getWidth(),calculateHeight()));
    }

    public List<SanPham> getListData() {
       return this.listData;
    }

   
    
}
