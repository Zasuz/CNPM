package DAL.DataModels;

import java.sql.Timestamp;

public class PhieuNhap extends Phieu {
    public PhieuNhap() {
        super();
    }

    public PhieuNhap(int maPhieu, Timestamp ngayLap, int maNV, boolean isDeleted) {
        super(maPhieu, ngayLap, maNV, isDeleted);
    }

    @Override
    public String toString() {
        return "PhieuNhap{" +
                "maPhieu=" + getMaPhieu() +
                ", ngayLap=" + getNgayLap() +
                ", maNV=" + getMaNV() +
                ", isDeleted=" + isDeleted() +
                "}";
    }
    
}
