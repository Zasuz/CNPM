# Folder này sẽ chứa các thư mục liên quan đến xử lý đăng nhập, đăng xuất
Các hành động chính bao gồm:
- Đăng nhập
- Lưu dữ liệu đăng nhập để không cần phải đăng nhập lại (lưu authKey)
- Tạo authKey mới có thời hạn để lưu vào máy người dùng
  (Nếu lưu tài khoản vào mật khẩu vào file nào đó sẽ không an toàn và dễ bị lộ.
  AuthKey sinh ra như thành phần trung gian để lưu vào máy tránh bị lộ thông 
  đăng nhập, cho dù lộ thì sau 1 khoảng thời gian nhất định thì authKey sẽ hết 
  hạn - phương thức này có phần giống với cookie based ở website)
- Xóa dữ liệu authKey khi chọn đăng xuất

Các trường hợp sẽ xảy ra:
- TH1: Chưa đăng nhập tài khoản hay chưa có files lưu authKey hoặc authKey hết hạn.
Với trường hợp này, sẽ hiện ra khung đăng nhập như bình thường
- TH2: Đăng nhập thành công và có files lưu authKey trong thời hạn. Với
trường hợp này, ta phải tìm loại tài khoản để hiển thị JFrame tương ứng.

