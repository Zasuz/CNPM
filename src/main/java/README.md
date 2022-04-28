# Sơ đồ dự án:
- GUI (Graphics User Interface): Giao diện người dùng, sử dụng để thiết kế giao diện cho nhân viên bán hàng và quản lý, kiểm tra các logic đơn giản
- BUS (Business Layer): Xử lý các hành động tương tác với database và trả kết quả lại cho GUI
- DAL (Data Acess Layer): Thực hiện kết nối database, cài đặt các phương thức thêm, xóa, sửa database để BUS xử lý

VD: Khi thực hiện tạo đơn hàng:
- GUI sẽ thực hiện kiểm tra đơn hàng hợp lệ hay không, số lượng có bị âm hay không,... Sau đó khởi tạo 1 object: XuLyDonHang xly = new XuLyDonHang(thongtindonhang);
- BUS sẽ được GUI gọi thông qua việc tạo object. BUS sẽ thực hiện các chức năng như gửi yêu cầu đến DAL để lấy thông tin các sản phẩm, kiểm tra xem số lượng sản phẩm còn đủ để cung cấp hay không. Sau đó, yêu cầu DAL insert vào database đơn hàng đó.
- DAL thực hiện lấy thông tin các sản phẩm, insert dữ liệu vào database
