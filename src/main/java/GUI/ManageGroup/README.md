# Folder này sẽ chứa các thư mục liên quan đến quản lý
Các thành phần của frame chính bao gồm: 
- Thanh tác chức năng /tác vụ thực hiện
- Các tác vụ thực hiện bao gồm: thêm, xóa, sửa sản phẩm, khuyến mãi, nhập xuất kho, khách hàng, nhân viên...


Cấu trúc của 1 Frame quản lý:
- LeftMenu: chứa các tác vụ thực hiện (quản lý sản phẩm, khuyến mãi, nhập xuất kho, khách hàng, nhân viên...)
- RightPanel: dùng để hiện ra nội dung của tác vụ tương ứng khi click vào
- Ngoài ra còn có, Frame dùng để, xem/sửa thông tin sản phẩm


Chi tiết quản lý:
- Quản lý sản phẩm gồm:
    + 1 bảng để quản lý các thông tin sản phẩm
      (ảnh sp, tên sp, mô tả, số lượng, giá tiền, loại, nhà cung cấp)
    + 1 button để nhập dữ liệu từ excel, 1 button để xuất dữ liệu ra excel
    + Các button: thêm, sửa, xóa sản phẩm
    + Các frame hiện lên khi nhấn thêm/sửa , JOptionPane hiện ra hỏi yes/no khi xóa sản phẩm, Toast hiện ra để thông báo thực hiện thành công, thất bại.
    + Các ô hiện thông tin tổng quát như: tổng sản phẩm, số sản phẩm đã bán, số sản phẩm hết hàng

- Quản lý khuyến mãi gồm: 
    + 1 bảng để quản lý các thông tin khuyến mãi
      (tên khuyến mãi, thời gian bắt đầu, thời gian kết thúc, giá trị khuyến mãi)

