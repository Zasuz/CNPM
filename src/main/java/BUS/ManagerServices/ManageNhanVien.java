/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package BUS.ManagerServices;

import DAL.DataAcessObject.LoginDetailDAO;
import DAL.DataAcessObject.NhanVienDAO;
import DAL.DataAcessObject.TaiKhoanDAO;
import DAL.DataModels.NhanVien;

/**
 *
 * @author ACER
 */
public class ManageNhanVien {
         private final NhanVienDAO nhanVienDAO;
         public ManageNhanVien(){
         nhanVienDAO = new NhanVienDAO();
}
}
