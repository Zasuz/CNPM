package DAL.DataModels;

public class ChucVu {
    private int maChucVu;
    private String tenChucVu;
    private String moTa;
    private boolean isDeleted;
    public static final int NHANVIENBANHANG = 1;
    public static final int NHANVIENQUANLY = 2;
    
    public ChucVu() {
    }

    public ChucVu(int maChucVu, String tenChucVu, String moTa) {
        this.maChucVu = maChucVu;
        this.tenChucVu = tenChucVu;
        this.moTa = moTa;
    }


    public int getMaChucVu() {
        return this.maChucVu;
    }

    public void setMaChucVu(int maChucVu) {
        this.maChucVu = maChucVu;
    }

    public String getTenChucVu() {
        return this.tenChucVu;
    }

    public void setTenChucVu(String tenChucVu) {
        this.tenChucVu = tenChucVu;
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
        return "ChucVu{" +
                "maChucVu=" + maChucVu +
                ", tenChucVu='" + tenChucVu + '\'' +
                ", moTa='" + moTa + '\'' +
                ", isDeleted=" + isDeleted +
                '}';
    }
}
