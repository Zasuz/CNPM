package DAL.DataModels;

import java.sql.Timestamp;


public class GiamGiaSP {
    private int soPhieu;
    private Timestamp ngayBD;
    private Timestamp ngayKT;
    private int ptGiam;
    private int maSP;
    private boolean isDeleted;
    
    public GiamGiaSP(){
        
    }

    public GiamGiaSP(int soPhieu, Timestamp ngayBD, Timestamp ngayKT, int ptGiam, int maSP, boolean isDeleted) {
        this.soPhieu = soPhieu;
        this.ngayBD = ngayBD;
        this.ngayKT = ngayKT;
        this.ptGiam = ptGiam;
        this.maSP = maSP;
        this.isDeleted = isDeleted;
    }
    

    public int getSoPhieu() {
        return soPhieu;
    }

    public void setSoPhieu(int soPhieu) {
        this.soPhieu = soPhieu;
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

    public int getPtGiam() {
        return ptGiam;
    }

    public void setPtGiam(int ptGiam) {
        this.ptGiam = ptGiam;
    }

    public int getMaSP() {
        return maSP;
    }

    public void setMaSP(int maSP) {
        this.maSP = maSP;
    }

    public boolean IsDeleted() {
        return isDeleted;
    }

    public void setIsDeleted(boolean isDeleted) {
        this.isDeleted = isDeleted;
    }
    
    
    public String toString(){
        return "GiamGiaSP {" +
                "soPhieu = " + soPhieu +
                ", ngayBD = " + ngayBD +
                ", ngayKT = " + ngayKT +
                ", ptGiam = " + ptGiam +
                ", maSP = " + maSP +
                ", isDeleted = " + isDeleted +
                "}";
    }
}
