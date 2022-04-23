package DAL.DataModels;

import java.sql.Timestamp;

public class Voucher {
    private int soVoucher;
    private String maVoucher;
    private String moTa;
    private Timestamp ngayBD;
    private Timestamp ngayKT;
    private long giaTriToiThieu;
    private long kmToiDa;
    private int ptGiam;
    private int soLuotSD;
    private boolean isDeleted;

    public Voucher() {
    }

    public Voucher(int soKM, String maKM, String moTa, int loaiKM, Timestamp ngayBD, Timestamp ngayKT, long giaTriToiThieu, long kmToiThieu, long kmToiDa, int ptGiam, int soLuotSD, boolean isDeleted) {
        this.soVoucher = soKM;
        this.maVoucher = maKM;
        this.moTa = moTa;
        this.ngayBD = ngayBD;
        this.ngayKT = ngayKT;
        this.giaTriToiThieu = giaTriToiThieu;
        this.kmToiDa = kmToiDa;
        this.ptGiam = ptGiam;
        this.soLuotSD = soLuotSD;
        this.isDeleted = isDeleted;
    }

    public int getSoVoucher() {
        return soVoucher;
    }

    public void setSoVoucher(int soVoucher) {
        this.soVoucher = soVoucher;
    }

    public String getMaVoucher() {
        return maVoucher;
    }

    public void setMaVoucher(String maVoucher) {
        this.maVoucher = maVoucher;
    }

    public String getMoTa() {
        return moTa;
    }

    public void setMoTa(String moTa) {
        this.moTa = moTa;
    }

    public Timestamp getNgayBD() {
        return ngayBD;
    }

    public void setNgayBD(Timestamp ngayBD) {
        this.ngayBD = ngayBD;
    }

    public Timestamp getNgayKT() {
        return ngayKT;
    }

    public void setNgayKT(Timestamp ngayKT) {
        this.ngayKT = ngayKT;
    }

    public long getGiaTriToiThieu() {
        return giaTriToiThieu;
    }

    public void setGiaTriToiThieu(long giaTriToiThieu) {
        this.giaTriToiThieu = giaTriToiThieu;
    }

    public long getKmToiDa() {
        return kmToiDa;
    }

    public void setKmToiDa(long kmToiDa) {
        this.kmToiDa = kmToiDa;
    }

    public int getPtGiam() {
        return ptGiam;
    }

    public void setPtGiam(int ptGiam) {
        this.ptGiam = ptGiam;
    }

    public int getSoLuotSD() {
        return soLuotSD;
    }

    public void setSoLuotSD(int soLuotSD) {
        this.soLuotSD = soLuotSD;
    }

    public boolean isDeleted() {
        return isDeleted;
    }

    public void setDeleted(boolean deleted) {
        isDeleted = deleted;
    }

    @Override
    public String toString() {
        return "MaKhuyenMai{" +
                "soKM=" + soVoucher +
                ", maKM='" + maVoucher + '\'' +
                ", moTa='" + moTa + '\'' +
                ", ngayDB=" + ngayBD +
                ", ngayKT=" + ngayKT +
                ", giaTriToiThieu=" + giaTriToiThieu +
                ", kmToiDa=" + kmToiDa +
                ", ptGiam=" + ptGiam +
                ", soLuotSD=" + soLuotSD +
                ", isDeleted=" + isDeleted +
                '}';
    }
}
