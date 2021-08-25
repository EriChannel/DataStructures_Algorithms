## Hash table
Trong khoa học máy tính, bảng băm là một cấu trúc dữ liệu sử dụng hàm băm để ánh xạ từ giá trị xác định, được gọi là khóa (ví dụ như tên của một người), đến giá trị tương ứng (ví dụ như số điện thoại của họ). Do đó, bảng băm là một mảng kết hợp. Hàm băm được sử dụng để chuyển đổi từ khóa thành chỉ số (giá trị băm) trong mảng lưu trữ các giá trị tìm kiếm.
![](https://upload.wikimedia.org/wikipedia/commons/thumb/7/7d/Hash_table_3_1_1_0_1_0_0_SP.svg/1280px-Hash_table_3_1_1_0_1_0_0_SP.svg.png)

Trong trường hợp lý tưởng, hàm băm luôn chuyển đổi các khóa khác nhau đến các chỉ số khác nhau. Tuy nhiên trong thực tế, điều này hiếm khi xảy ra (trừ khi các khóa là cố định: không có thêm khóa mới nào được bổ sung vào bảng sau khi tạo bảng). Thay vào đó, hầu hết các thiết kế bảng băm đều giả sử các khóa khác nhau có thể được băm vào cùng một giá trị (gọi là va chạm băm), và cung cấp cách giải quyết va chạm.

Trong một bảng băm có kích thước đủ lớn, thời gian trung bình cho mỗi lần tra cứu là độc lập với số lượng phần tử trong bảng. Nhiều thiết kế bảng băm cũng cho phép chèn thêm và xóa bỏ tùy ý của cặp khóa-giá trị trong thời gian trung bình (hoặc trừ dần) không đổi cho mỗi thao tác.  

Trong nhiều trường hợp, bảng băm có hiệu quả hơn so với cây tìm kiếm hoặc bất kỳ cấu trúc dữ liệu tìm kiếm nào. Vì lý do này, chúng được sử dụng rộng rãi trong nhiều loại phần mềm máy tính, đặc biệt là cho mảng kết hợp, lập chỉ mục cơ sở dữ liệu, tổ chức bộ nhớ đệm, và cấu trúc dữ liệu tập hợp.

