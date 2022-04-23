package DAL.DataModels;

public class ChiTietPhieuNhap extends ChiTietPhieu {

    public ChiTietPhieuNhap() {
    }

    public ChiTietPhieuNhap(int maPhieu, int maSP, int soLuong) {
        super(maPhieu, maSP, soLuong);
    }

    @Override
    public String toString() {
        return "ChiTietPhieuNhap{" +
                "maPhieu=" + maPhieu +
                ", maSP=" + maSP +
                ", soLuong=" + soLuong +
                '}';
    }
}
