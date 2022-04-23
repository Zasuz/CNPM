package DAL.DataModels;

import java.sql.Timestamp;

public class TaiKhoan {
    private int soTK;
    private String tenTK;
    private String matKhau;
    private int maNV;
    private int soLanSai;
    private Timestamp ngayTao;
    private boolean isDeleted;

    public TaiKhoan() {
    }

    public TaiKhoan(int soTK, String tenTK, String matKhau, int maNV, int soLanSai, Timestamp ngayTao, boolean isDeleted) {
        this.soTK = soTK;
        this.tenTK = tenTK;
        this.matKhau = matKhau;
        this.maNV = maNV;
        this.soLanSai = soLanSai;
        this.ngayTao = ngayTao;
        this.isDeleted = isDeleted;
    }

    public int getSoTK() {
        return soTK;
    }

    public void setSoTK(int soTK) {
        this.soTK = soTK;
    }

    public String getTenTK() {
        return tenTK;
    }

    public void setTenTK(String tenTK) {
        this.tenTK = tenTK;
    }

    public String getMatKhau() {
        return matKhau;
    }

    public void setMatKhau(String matKhau) {
        this.matKhau = matKhau;
    }

    public int getMaNV() {
        return maNV;
    }

    public void setMaNV(int maNV) {
        this.maNV = maNV;
    }

    public int getSoLanSai() {
        return soLanSai;
    }

    public void setSoLanSai(int soLanSai) {
        this.soLanSai = soLanSai;
    }

    public Timestamp getNgayTao() {
        return ngayTao;
    }

    public void setNgayTao(Timestamp ngayTao) {
        this.ngayTao = ngayTao;
    }

    public boolean isDeleted() {
        return isDeleted;
    }

    public void setDeleted(boolean deleted) {
        isDeleted = deleted;
    }

    @Override
    public String toString() {
        return "TaiKhoan{" +
                "soTK=" + soTK +
                ", tenTK='" + tenTK + '\'' +
                ", matKhau='" + matKhau + '\'' +
                ", maNV=" + maNV +
                ", soLanSai=" + soLanSai +
                ", ngayTao=" + ngayTao +
                ", isDeleted=" + isDeleted +
                '}';
    }
}
