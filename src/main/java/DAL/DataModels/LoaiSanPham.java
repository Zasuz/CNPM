package DAL.DataModels;

public class LoaiSanPham {
    private int maLoai;
    private String tenLoai;
    private String moTa;
    private boolean isDeleted;

    public LoaiSanPham() {
    }

    public LoaiSanPham(int maLoai, String tenLoai, String moTa, boolean isDeleted) {
        this.maLoai = maLoai;
        this.tenLoai = tenLoai;
        this.moTa = moTa;
        this.isDeleted = isDeleted;
    }

    public int getMaLoai() {
        return this.maLoai;
    }

    public void setMaLoai(int maLoai) {
        this.maLoai = maLoai;
    }

    public String getTenLoai() {
        return this.tenLoai;
    }

    public void setTenLoai(String tenLoai) {
        this.tenLoai = tenLoai;
    }

    public String getMoTa() {
        return this.moTa;
    }

    public void setMoTa(String moTa) {
        this.moTa = moTa;
    }

    public boolean isDeleted() {
        return isDeleted;
    }

    public void setDeleted(boolean deleted) {
        isDeleted = deleted;
    }

    @Override
    public String toString() {
        return "LoaiSanPham{" +
                "maLoai=" + maLoai +
                ", tenLoai='" + tenLoai + '\'' +
                ", moTa='" + moTa + '\'' +
                ", isDeleted=" + isDeleted +
                '}';
    }
}
