package DAL.DataModels;

public class KhachHang {
    private int maKH;
    private String tenKH;
    private boolean gioiTinh;
    private String soDienThoai;
    private String diaChi;
    private String email;
    private long diemThuong;
    private boolean isDeleted;

    public KhachHang() {
    }

    public KhachHang(int maKH, String tenKH, boolean gioiTinh, String soDienThoai, String diaChi, String email, long diemThuong, boolean isDeleted) {
        this.maKH = maKH;
        this.tenKH = tenKH;
        this.gioiTinh = gioiTinh;
        this.soDienThoai = soDienThoai;
        this.diaChi = diaChi;
        this.email = email;
        this.diemThuong = diemThuong;
        this.isDeleted = isDeleted;
    }

    public int getMaKH() {
        return maKH;
    }

    public void setMaKH(int maKH) {
        this.maKH = maKH;
    }

    public String getTenKH() {
        return tenKH;
    }

    public void setTenKH(String tenKH) {
        this.tenKH = tenKH;
    }

    public boolean isGioiTinh() {
        return gioiTinh;
    }

    public void setGioiTinh(boolean gioiTinh) {
        this.gioiTinh = gioiTinh;
    }

    public String getSoDienThoai() {
        return soDienThoai;
    }

    public void setSoDienThoai(String soDienThoai) {
        this.soDienThoai = soDienThoai;
    }

    public String getDiaChi() {
        return diaChi;
    }

    public void setDiaChi(String diaChi) {
        this.diaChi = diaChi;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public long getDiemThuong() {
        return diemThuong;
    }

    public void setDiemThuong(long diemThuong) {
        this.diemThuong = diemThuong;
    }

    public boolean isDeleted() {
        return isDeleted;
    }

    public void setDeleted(boolean deleted) {
        isDeleted = deleted;
    }

    @Override
    public String toString() {
        return "KhachHang{" +
                "maKH=" + maKH +
                ", tenKH='" + tenKH + '\'' +
                ", gioiTinh=" + gioiTinh +
                ", soDienThoai='" + soDienThoai + '\'' +
                ", diaChi='" + diaChi + '\'' +
                ", email='" + email + '\'' +
                ", diemThuong=" + diemThuong +
                ", isDeleted=" + isDeleted +
                '}';
    }
}
