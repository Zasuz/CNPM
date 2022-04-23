package DAL.DataModels;

import java.sql.Timestamp;

public class HoaDon {
    private int maHD;
    private Timestamp ngayHD;
    private String hinhThuc;
    private long tongTien;
    private long tienGiam;
    private int maKH;
    private int maNV;
    private int soVoucher;
    private boolean isDeleted;

    public HoaDon() {
    }

    public HoaDon(int maHD, Timestamp ngayHD, String hinhThuc, long tongTien, long tienGiam, int maKH, int maNV, int soKM, boolean isDeleted) {
        this.maHD = maHD;
        this.ngayHD = ngayHD;
        this.hinhThuc = hinhThuc;
        this.tongTien = tongTien;
        this.tienGiam = tienGiam;
        this.maKH = maKH;
        this.maNV = maNV;
        this.soVoucher = soKM;
        this.isDeleted = isDeleted;
    }

    public int getMaHD() {
        return maHD;
    }

    public void setMaHD(int maHD) {
        this.maHD = maHD;
    }

    public Timestamp getNgayHD() {
        return ngayHD;
    }

    public void setNgayHD(Timestamp ngayHD) {
        this.ngayHD = ngayHD;
    }

    public String getHinhThuc() {
        return hinhThuc;
    }

    public void setHinhThuc(String hinhThuc) {
        this.hinhThuc = hinhThuc;
    }

    public long getTongTien() {
        return tongTien;
    }

    public void setTongTien(long tongTien) {
        this.tongTien = tongTien;
    }

    public long getTienGiam() {
        return tienGiam;
    }

    public void setTienGiam(long tienGiam) {
        this.tienGiam = tienGiam;
    }

    public int getMaKH() {
        return maKH;
    }

    public void setMaKH(int maKH) {
        this.maKH = maKH;
    }

    public int getMaNV() {
        return maNV;
    }

    public void setMaNV(int maNV) {
        this.maNV = maNV;
    }

    public int getSoVoucher() {
        return soVoucher;
    }

    public void setSoVoucher(int soVoucher) {
        this.soVoucher = soVoucher;
    }

    public boolean isDeleted() {
        return isDeleted;
    }

    public void setDeleted(boolean deleted) {
        isDeleted = deleted;
    }

    @Override
    public String toString() {
        return "HoaDon{" +
                "maHD=" + maHD +
                ", ngayHD=" + ngayHD +
                ", hinhThuc='" + hinhThuc + '\'' +
                ", tongTien=" + tongTien +
                ", tienGiam=" + tienGiam +
                ", maKH=" + maKH +
                ", maNV=" + maNV +
                ", soKM=" + soVoucher +
                ", isDeleted=" + isDeleted +
                '}';
    }
}
