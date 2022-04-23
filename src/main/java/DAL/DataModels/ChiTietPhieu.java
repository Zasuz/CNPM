package DAL.DataModels;

public abstract class ChiTietPhieu {
    protected int maPhieu;
    protected int maSP;
    protected int soLuong;

    public ChiTietPhieu() {
    }

    public ChiTietPhieu(int maPhieu, int maSP, int soLuong) {
        this.maPhieu = maPhieu;
        this.maSP = maSP;
        this.soLuong = soLuong;
    }

    public int getMaPhieu() {
        return maPhieu;
    }

    public void setMaPhieu(int maPhieu) {
        this.maPhieu = maPhieu;
    }

    public int getMaSP() {
        return maSP;
    }

    public void setMaSP(int maSP) {
        this.maSP = maSP;
    }

    public int getSoLuong() {
        return soLuong;
    }

    public void setSoLuong(int soLuong) {
        this.soLuong = soLuong;
    }

    public abstract String toString();
}
