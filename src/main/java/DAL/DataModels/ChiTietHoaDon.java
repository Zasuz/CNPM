package DAL.DataModels;

public class ChiTietHoaDon {
    private int maSP;
    private int maHD;
    private int soLuong;
    private long giaTien;

    public ChiTietHoaDon() {
    }

    public ChiTietHoaDon(int maSP, int maHD, int soLuong, long giaTien) {
        this.maSP = maSP;
        this.maHD = maHD;
        this.soLuong = soLuong;
        this.giaTien = giaTien;
    }

    public int getMaSP() {
        return maSP;
    }

    public void setMaSP(int maSP) {
        this.maSP = maSP;
    }

    public int getMaHD() {
        return maHD;
    }

    public void setMaHD(int maHD) {
        this.maHD = maHD;
    }

    public int getSoLuong() {
        return soLuong;
    }

    public void setSoLuong(int soLuong) {
        this.soLuong = soLuong;
    }

    public long getGiaTien() {
        return giaTien;
    }

    public void setGiaTien(long giaTien) {
        this.giaTien = giaTien;
    }

    @Override
    public String toString() {
        return "ChiTietHoaDon{" +
                "maSP=" + maSP +
                ", maHD=" + maHD +
                ", soLuong=" + soLuong +
                ", giaTien=" + giaTien +
                '}';
    }
}
