## Graph
Đồ thị là một cấu trúc dữ liệu lưu trữ dữ liệu được kết nối. Nói cách khác, đồ thị là tập các đỉnh và các cạnh nối nối các đỉnh.  
Ví dụ điển hình mà ta hay gặp: social media network, computer network, Google map,...         
Mỗi đồ thị sẽ gồm các cạnh và các đỉnh (còn gọi là node). Mỗi đỉnh và cạnh có một mối quan hệ. Trong đó đỉnh đại diện cho dữ liệu và cạnh đại diện cho mối quan hệ giữa chúng    

## Các loại đồ thị

### Đồ thị có trọng số
Trong đồ thị có trọng số, mỗi cạnh chứa một số dữ liệu (trọng số) như khoảng cách, trọng lượng, chiều cao,... Nó được sử dụng để tính toán chi phí di chuyển từ đỉnh này sang đỉnh khác.
![](https://static.javatpoint.com/core/images/java-graph.png)

### Đồ thị không có trọng số
Một đồ thị trong đó các cạnh không được liên kết với bất kỳ giá trị nào được gọi là đồ thị không có trọng số
![](https://static.javatpoint.com/core/images/java-graph2.png)

### Đồ thị có hướng 
Một đồ thị trong đó các cạnh biểu diễn hướng được gọi là đồ thị có hướng. Trong một đồ thị có hướng , ta sử dụng các mũi tên thay vì các cạnh. Hướng biểu thị cách đi đến từ nút này đến nút khác
![](https://static.javatpoint.com/core/images/java-graph3.png)

### Đồ thị vô hướng
Một đồ thị trong đó các cạnh là hai chiều được gọi là đồ thị vô hướng. Trong một đồ thị vô hướng, chúng ta có thể di chuyển theo bất kỳ hướng nào. 
![](https://static.javatpoint.com/core/images/java-graph4.png)

### đồ thị được kết nối
Một đồ thị được cho là kết nối nếu tồn tại ít nhất một đường đi giữa mọi cặp đỉnh. Lưu ý đồ thị chỉ có 1 đỉnh là một đồ thị liên thông
![](https://static.javatpoint.com/core/images/java-graph5.png)
Có hai loại đồ thị được kết nối:
- Liên thông yếu: Một đồ thị trong đó các node không thể được truy cập bằng một đường dẫn duy nhất được gọi là liên thông yếu (Biểu đồ kết nối yếu)
![](https://static.javatpoint.com/core/images/java-graph6.png)
- Liên thông mạnh: Một đò thị trong đó các nút có thể được truy cập bằng một con đường duy nhất được gọi là đồ thị liên thông mạnh 
![](https://static.javatpoint.com/core/images/java-graph7.png)

### Đồ thị bị ngắt kết nối
Một đồ thị được cho là bị ngắt kết nối nếu không có đường đi giữa một cặp đỉnh được gọi là đồ thị bị ngắt kết nối. Một đồ thị bị ngắt kết nối có thể bao gồm hai hoặc nhiều đồ thị được kết nối với nhau.
![](https://static.javatpoint.com/core/images/java-graph8.png)

### Đa đồ thị
Một đồ thị có nhiều cạnh nối cùng một cặp node. Hình dưới đây biểu diễn một đồ thị đa.
![](https://static.javatpoint.com/core/images/java-graph9.png)

### Đồ thị dày đặc
Là đồ thị trong đó số cạnh gần bằng số cạnh cực đại, đồ thị được gọi là đồ thị đặc. Hình sau biểu diễn một đồ thị dày đặc.
![](https://static.javatpoint.com/core/images/java-graph10.png)

### Đồ thị thưa thớt
Một đồ thị trong đó số cạnh gần bằng số cạnh tối thiểu, đồ thị được gọi là đồ thị thưa thớt. Nó có thể là một đồ thị bị ngắt kết nối. Hình sau biểu diễn một đồ thị thưa thớt.
![](https://static.javatpoint.com/core/images/java-graph11.png)