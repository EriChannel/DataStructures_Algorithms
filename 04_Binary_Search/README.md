## Giới thiệu
Thuật toán binary search (Tìm kiếm nhị phân) la thuật toán tìm kiếm tuyến tính cao cấp hơn với thời gian chạy là O(logN)  
Đối với danh sách lớn, thuật toán này tốt hơn hẳn tìm kiếm tuyến tính, nhưng nó đòi hỏi danh sách phải được sắp xếp từ trước và đòi hỏi khả năng truy cập ngẫu nhiên  
Ví dụ:  
Bạn có thể tìm kiếm số điện thoại của mội người theo tên người đó trong danh bạ điện thoại   
Thuật toán tìm kiếm nhị phân chạy nhanh hơn tìm kiếm tuần tự nhưng cũng có một số nhược điểm. Nó chậm hơn bảng băm.  
Nếu nội dung danh sách bị thay đổi thì danh sách phải được sắp xếp lại trước khi sử dụng tìm kiếm nhị phân.  
Mà thao tác này thường tốn nhiều thời gian.  

## Mô tả thuật toán
Vì thuật toán Binary Search yêu cầu mảng đã được sắp xếp. Thế nên, đầu vào của chúng ta là một mảng đã được sắp xếp.  
Do đó, thuật toán tìm kiếm nhị phân sẽ so sánh giá trị đích với phần tử ở giữa của mảng (mảng được chia mảng ra làm 2 phần bên trái và bên phải phần tử đó)  
Nếu chúng không bằng nhau thì dĩ nhiên một nửa không chứa mục tiêu sẽ bị bỏ đi.  
Và việc tìm kiếm tiếp tục ở nửa còn lại, một lần nữa lấy phần tử ở giữa được chọn để so sánh với giá trị đích và lặp lại điều này cho đến khi tìm thấy giá trị đích.  
Nếu tìm kiếm kết thúc với nửa còn lại trống, mục tiêu không nằm trong mảng.  
Mặc dù ý tưởng rất đơn giản, nhưng việc thực hiện tìm kiếm nhị phân chính xác đòi hỏi phải chú ý đến một số điểm tinh tế về điều kiện thoát và tính toán điểm giữa của nó.  
Về cơ bản, các bước thực hiện tìm kiếm nhị x trong mảng như sau:  
- So sánh x với phần tử ở giữa  
- Nếu x khớp với phần tử ở giữa, chúng ta trả về chỉ số giữa  
- Nếu x lớn hơn phần tử giữa, thì x chỉ có thể nằm trong nửa phân đoạn bên phải sau phần tử mid. Vì vậy, chúng ta chỉ tìm kiếm ở nữa phải của mảng  
- Nếu x nhỏ hơn phần tử giữa tiếp tục tìm ở nửa bên trái  
- Lặp lại đến khi tìm ra x hoặc trả về null khi x không nằm trong mảng  

## Nhiệm vụ
Thực hiện bài 704