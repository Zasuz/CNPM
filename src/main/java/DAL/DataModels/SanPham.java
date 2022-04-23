package DAL.DataModels;

public class SanPham {
    private int maSP;
    private String tenSP;
    private String moTa;
    private int soLuong;
    private String hinhAnh;
    private long giaTien;
    private int maLoai;
    private int maNCC;
    private boolean isDeleted;

    public SanPham() {
    }

    public SanPham(int maSP, String tenSP, String moTa, String hinhAnh, long giaTien, int soLuong, int maLoai, int maNCC, boolean isDeleted) {
        this.maSP = maSP;
        this.tenSP = tenSP;
        this.moTa = moTa;
        this.hinhAnh = hinhAnh;
        this.giaTien = giaTien;
        this.soLuong = soLuong;
        this.maLoai = maLoai;
        this.maNCC = maNCC;
        this.isDeleted = isDeleted;
    }

    public int getMaSP() {
        return this.maSP;
    }

    public void setMaSP(int maSP) {
        this.maSP = maSP;
    }

    public String getTenSP() {
        return this.tenSP;
    }

    public void setTenSP(String tenSP) {
        this.tenSP = tenSP;
    }

    public String getMoTa() {
        return this.moTa;
    }

    public void setMoTa(String moTa) {
        this.moTa = moTa;
    }

    public String getHinhAnh() {
        return this.hinhAnh;
    }

    public void setHinhAnh(String hinhAnh) {
        this.hinhAnh = hinhAnh;
    }

    public long getGiaTien() {
        return this.giaTien;
    }

    public void setGiaTien(long giaTien) {
        this.giaTien = giaTien;
    }

    public int getSoLuong() {
        return this.soLuong;
    }

    public void setSoLuong(int soLuong) {
        this.soLuong = soLuong;
    }

    public int getMaLoai() {
        return maLoai;
    }

    public void setMaLoai(int maLoai) {
        this.maLoai = maLoai;
    }

    public int getMaNCC() {
        return maNCC;
    }

    public void setMaNCC(int maNCC) {
        this.maNCC = maNCC;
    }

    public boolean isDeleted() {
        return this.isDeleted;
    }

    public void setDeleted(boolean isDeleted) {
        this.isDeleted = isDeleted;
    }

    @Override
    public String toString() {
        return "SanPham{" +
                "maSP=" + maSP +
                ", tenSP='" + tenSP + '\'' +
                ", moTa='" + moTa + '\'' +
                ", hinhAnh='" + hinhAnh + '\'' +
                ", giaTien=" + giaTien +
                ", soLuong=" + soLuong +
                ", maLoai=" + maLoai +
                ", maNCC=" + maNCC +
                ", isDeleted=" + isDeleted +
                '}';
    }
}
