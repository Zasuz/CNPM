package DAL.DataModels;

import java.sql.Timestamp;

public class PhieuHuy extends Phieu{
    public PhieuHuy() {
        super();
    }

    public PhieuHuy(int maPhieu, Timestamp ngayLap, int maNV, boolean isDeleted) {
        super(maPhieu, ngayLap, maNV, isDeleted);
    }

    @Override
    public String toString() {
        return "PhieuHuy{" +
                "maPhieu=" + getMaPhieu() +
                ", ngayLap=" + getNgayLap() +
                ", maNV=" + getMaNV() +
                ", isDeleted=" + isDeleted() +
                '}';
    }    
}
