So sánh giữa cách tiếp cận cũ (if-else) và cách tiếp cận mới (Kế thừa + Đa hình):

1) Dễ đọc:
- Cũ: Hàm `calculateSalary()` chứa nhiều nhánh `if-else` làm cho logic bị phân mảnh và khó theo dõi. Khi số loại nhân viên tăng lên, hàm trở nên rối.
- Mới: Mỗi loại nhân viên có lớp riêng triển khai `calculateSalary()`. Mã nguồn có cấu trúc rõ ràng, dễ đọc và phân tách trách nhiệm.

2) Rủi ro sinh lỗi khi thêm tính năng mới:
- Cũ: Thêm loại nhân viên mới bắt buộc phải sửa hàm trung tâm, dễ gây lỗi không mong muốn cho các nhánh khác.
- Mới: Chỉ cần thêm một lớp con mới; không thay đổi mã đã tồn tại (OCP được tôn trọng). Rủi ro thấp hơn nhiều.

3) Số dòng code phải sửa:
- Cũ: Sửa trực tiếp vào hàm trung tâm (thêm nhánh, cập nhật kiểm tra). Có thể phải bổ sung kiểm thử rộng.
- Mới: Thêm lớp mới và kiểm thử riêng; vòng lặp xử lý vẫn giữ nguyên.

Kết luận: Việc dùng Abstract Class và Polymorphism giúp phẳng hoá cấu trúc, giảm coupling, cải thiện khả năng mở rộng và giảm rủi ro khi thay đổi yêu cầu.
