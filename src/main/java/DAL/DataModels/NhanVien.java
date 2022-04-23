package DAL.DataModels;

import java.sql.Date;
import java.sql.Timestamp;

public class NhanVien{
    private int maNV;
    private String tenNV;
    private boolean gioiTinh;
    private String cmnd;
    private Date ngaySinh;
    private String soDienThoai;
    private String email;
    private String diaChi;
    private Date ngayThamGia;
    private int maChucVu;
    private boolean isDeleted;

    public NhanVien(){
    }

    public NhanVien(int maNV, String tenNV, boolean gioiTinh, String cmnd, Date ngaySinh, String soDienThoai, String email, String diaChi, Date ngayThamGia, int maChucVu, boolean isDeleted) {
        this.maNV = maNV;
        this.tenNV = tenNV;
        this.gioiTinh = gioiTinh;
        this.cmnd = cmnd;
        this.ngaySinh = ngaySinh;
        this.soDienThoai = soDienThoai;
        this.email = email;
        this.diaChi = diaChi;
        this.ngayThamGia = ngayThamGia;
        this.maChucVu = maChucVu;
        this.isDeleted = isDeleted;
    }

    public int getMaNV() {
        return maNV;
    }

    public void setMaNV(int maNV) {
        this.maNV = maNV;
    }

    public String getTenNV() {
        return tenNV;
    }

    public void setTenNV(String tenNV) {
        this.tenNV = tenNV;
    }

    public boolean isGioiTinh() {
        return gioiTinh;
    }

    public void setGioiTinh(boolean gioiTinh) {
        this.gioiTinh = gioiTinh;
    }

    public String getCmnd() {
        return cmnd;
    }

    public void setCmnd(String cmnd) {
        this.cmnd = cmnd;
    }

    public Date getNgaySinh() {
        return ngaySinh;
    }

    public void setNgaySinh(Date ngaySinh) {
        this.ngaySinh = ngaySinh;
    }

    public String getSoDienThoai() {
        return soDienThoai;
    }

    public void setSoDienThoai(String soDienThoai) {
        this.soDienThoai = soDienThoai;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getDiaChi() {
        return diaChi;
    }

    public void setDiaChi(String diaChi) {
        this.diaChi = diaChi;
    }

    public Date getNgayThamGia() {
        return ngayThamGia;
    }

    public void setNgayThamGia(Date ngayThamGia) {
        this.ngayThamGia = ngayThamGia;
    }

    public int getMaChucVu() {
        return maChucVu;
    }

    public void setMaChucVu(int maChucVu) {
        this.maChucVu = maChucVu;
    }

    public boolean isDeleted() {
        return isDeleted;
    }

    public void setDeleted(boolean deleted) {
        isDeleted = deleted;
    }

    @Override
    public String toString() {
        return "NhanVien{" +
                "maNV=" + maNV +
                ", tenNV='" + tenNV + '\'' +
                ", gioiTinh=" + gioiTinh +
                ", cmnd='" + cmnd + '\'' +
                ", ngaySinh=" + ngaySinh +
                ", soDienThoai='" + soDienThoai + '\'' +
                ", email='" + email + '\'' +
                ", diaChi='" + diaChi + '\'' +
                ", ngayThamGia=" + ngayThamGia +
                ", maChucVu=" + maChucVu +
                ", isDeleted=" + isDeleted +
                '}';
    }
}
