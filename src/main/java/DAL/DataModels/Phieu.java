package DAL.DataModels;

import java.sql.Timestamp;

public abstract class Phieu {
    protected int maPhieu;
    protected Timestamp ngayLap;
    protected int maNV;
    protected boolean isDeleted;

    public Phieu() {
     
    }

    public Phieu(int maPhieu, Timestamp ngayLap, int maNV, boolean isDeleted) {
        this.maPhieu = maPhieu;
        this.ngayLap = ngayLap;
        this.maNV = maNV;
        this.isDeleted = isDeleted;
    }

    public int getMaPhieu() {
        return this.maPhieu;
    }

    public void setMaPhieu(int maPhieu) {
        this.maPhieu = maPhieu;
    }

    public Timestamp getNgayLap() {
        return this.ngayLap;
    }

    public void setNgayLap(Timestamp ngayLap) {
        this.ngayLap = ngayLap;
    }

    public int getMaNV() {
        return this.maNV;
    }

    public void setMaNV(int maNV) {
        this.maNV = maNV;
    }

    public boolean isDeleted() {
        return this.isDeleted;
    }

    public void setDeleted(boolean isDeleted) {
        this.isDeleted = isDeleted;
    }

    public abstract String toString();
}
