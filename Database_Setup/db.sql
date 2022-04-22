create database SieuThiMini;
use SieuThiMini;

-- Duy
create table NHACUNGCAP(
                           MANCC int not null primary key auto_increment,
                           TENNCC varchar(50),
                           DIACHI varchar(100),
                           SDT varchar(11),
                           EMAIL varchar(50),
                           IS_DELETED boolean
);

create table LOAISANPHAM(
                            MALOAI int not null primary key auto_increment,
                            TENLOAI varchar(50),
                            MOTA varchar(100),
                            IS_DELETED boolean
);

create table SANPHAM(
                        MASP int not null auto_increment primary key,
                        TENSP varchar(50),
                        MOTA varchar(100),
                        SOLUONG int,
                        HINHANH varchar(100),
                        GIATIEN bigint,
                        MALOAI int,
                        MANCC int,
                        IS_DELETED boolean
);

create table VOUCHER(
                        SOVOUCHER int not null primary key auto_increment,
                        MAVOUCHER varchar(11) not null,
                        MOTA varchar(100),
                        NGAYBD datetime,
                        NGAYKT datetime,
                        GIATRITOITHIEU bigint,
                        KMTOITHIEU bigint,
                        KMTOIDA bigint,
                        PTGIAM int,
                        SOLUOTSD int,
                        IS_DELETED boolean
);

create table GIAMGIASP(
                          SOPHIEU int not null primary key auto_increment,
                          NGAYBD datetime,
                          NGAYKT datetime,
                          PTGIAM int,
                          MASP int,
                          IS_DELETED boolean
);

create table PHIEUHUY(
                         MAPHIEU int not null auto_increment primary key,
                         NGAYLAP datetime,
                         MANV int,
                         IS_DELETED boolean
);

create table CTPHIEUHUY(
                           MAPHIEU int not null,
                           MASP int not null,
                           SOLUONG int,
                           PRIMARY KEY (MAPHIEU, MASP)
);

create table PHIEUNHAP(
                          MAPHIEU int not null auto_increment primary key,
                          NGAYLAP datetime,
                          MANV int,
                          IS_DELETED boolean
);

create table CTPHIEUNHAP(
                            MAPHIEU int not null,
                            MASP int not null,
                            SOLUONG int,
                            PRIMARY KEY (MAPHIEU, MASP)
);

create table CTHOADON(
                         MAHD int not null,
                         MASP int not null,
                         SOLUONG int,
                         GIATIEN bigint,
                         PRIMARY KEY (MAHD, MASP)
);

-- Thay doi khoa cua MANV va MAKH thanh INT
-- Thay doi ma HD thanh INT
-- Thay doi maChucVu thanh INT

-- Tuan
CREATE TABLE HOADON (
                        MAHD int NOT NULL auto_increment PRIMARY KEY,
                        NGAYHD DATETIME,
                        HINHTHUC VARCHAR(20),
                        TONGTIEN bigint,
                        TIENGIAM bigint,
                        MANV INT,
                        MAKH INT,
                        SOVOUCHER INT,
                        IS_DELETED BOOLEAN
);

CREATE TABLE NHANVIEN (
                          MANV INT NOT NULL auto_increment PRIMARY KEY,
                          TENNV VARCHAR(50),
                          GIOITINH BOOLEAN,
                          CMND VARCHAR(15),
                          NGAYSINH DATE,
                          SODIENTHOAI INT(11),
                          EMAIL VARCHAR(50),
                          DIACHI VARCHAR(100),
                          NGAYTHAMGIA DATE,
                          MACHUCVU INT,
                          IS_DELETED BOOLEAN
);

CREATE TABLE KHACHHANG (
                           MAKH INT NOT NULL auto_increment PRIMARY KEY,
                           TENKH VARCHAR(50),
                           GIOITINH BOOLEAN,
                           SODIENTHOAI INT(11),
                           DIACHI VARCHAR(100),
                           EMAIL VARCHAR(50),
                           DIEMTHUONG BIGINT,
                           IS_DELETED BOOLEAN
);

CREATE TABLE TAIKHOAN (
                          SOTK INT NOT NULL auto_increment PRIMARY KEY,
                          TENTK VARCHAR(50),
                          MATKHAU VARCHAR(50),
                          MANV INT,
                          SOLANSAI INT,
                          NGAYTAO DATETIME,
                          IS_DELETED BOOLEAN
);

CREATE TABLE CHUCVU (
                        MACHUCVU INT NOT NULL auto_increment PRIMARY KEY,
                        TENCHUCVU VARCHAR(50),
                        MOTA VARCHAR(100),
                        IS_DELETED boolean
);

CREATE TABLE LOGIN_DETAIL (
                              LOGIN_ID INT NOT NULL auto_increment PRIMARY KEY,
                              AUTH_KEY VARCHAR(50),
                              IP_ADDRESS VARCHAR(20),
                              MAC_ADDRESS VARCHAR(20),
                              LOGIN_TIME DATETIME,
                              LOGOUT_TIME DATETIME,
                              SOTK INT
);

-- Duy
ALTER TABLE SANPHAM ADD CONSTRAINT FK_SANPHAM_LOAISANPHAM FOREIGN KEY (MALOAI) REFERENCES LOAISANPHAM(MALOAI);
ALTER TABLE SANPHAM ADD CONSTRAINT FK_SANPHAM_NHACUNGCAP FOREIGN KEY (MANCC) REFERENCES NHACUNGCAP(MANCC);

ALTER TABLE GIAMGIASP ADD CONSTRAINT FK_GIAMGIASP_SANPHAM FOREIGN KEY (MASP) REFERENCES SANPHAM(MASP);

ALTER TABLE CTPHIEUNHAP ADD CONSTRAINT FK_CHITIETPHIEUNHAP_SP_MASP FOREIGN KEY (MASP) REFERENCES SANPHAM(MASP);
ALTER TABLE CTPHIEUNHAP ADD CONSTRAINT FK_CHITIETPHIEUNHAP_SP_PHIEUNHAP FOREIGN KEY (MAPHIEU) REFERENCES PHIEUNHAP(MAPHIEU);

ALTER TABLE CTPHIEUHUY ADD CONSTRAINT FK_CHITIETPHIEUHUY_SP_PHIEUHUY FOREIGN KEY (MAPHIEU) REFERENCES PHIEUHUY(MAPHIEU);
ALTER TABLE CTPHIEUHUY ADD CONSTRAINT FK_CHITIETPHIEUHUY_SP_MASP FOREIGN KEY (MASP) REFERENCES SANPHAM(MASP);

ALTER TABLE PHIEUNHAP ADD CONSTRAINT FK_PHIEUNHAP_MANV FOREIGN KEY (MANV) REFERENCES NHANVIEN(MANV);
ALTER TABLE PHIEUHUY ADD CONSTRAINT FK_PHIEUHUY_MANV FOREIGN KEY (MANV) REFERENCES NHANVIEN(MANV);

-- Tuan
ALTER TABLE hoadon ADD CONSTRAINT FK_HOADON_NHANVIEN FOREIGN KEY (MANV) REFERENCES nhanvien(MANV);
ALTER TABLE hoadon ADD CONSTRAINT FK_HOADON_KHACHHANG FOREIGN KEY (MAKH) REFERENCES khachhang(MAKH);
ALTER TABLE hoadon ADD CONSTRAINT FK_HOADON_VOUCHER FOREIGN KEY (SOVOUCHER) REFERENCES voucher(SOVOUCHER);

ALTER TABLE CTHOADON ADD CONSTRAINT FK_CTHOADON_HOADON FOREIGN KEY (MAHD) REFERENCES hoadon(MAHD);
ALTER TABLE CTHOADON ADD CONSTRAINT FK_CTHOADON_SANPHAM FOREIGN KEY (MASP) REFERENCES sanpham(MASP);

ALTER TABLE nhanvien ADD CONSTRAINT FK_NHANVIEN_CHUCVU FOREIGN KEY (MACHUCVU) REFERENCES chucvu(MACHUCVU);
ALTER TABLE TAIKHOAN ADD CONSTRAINT FK_TAIKHOAN_NHANVIEN FOREIGN KEY (MANV) REFERENCES NHANVIEN(MANV);

ALTER TABLE login_detail ADD CONSTRAINT FK_LOGIN_TAIKHOAN FOREIGN KEY (SOTK) REFERENCES taikhoan(SOTK);