## Đệ quy là gì?
Đệ quy (Recursion) là một hàm tự gọi đến chính nó.  
![](https://github.com/EriChannel/DataStructures_Algorithms_Techmaster/blob/bbdcd9681d845d694d09e8415d757feecff10324/images/recursion.jpeg)  

```java
public void methodA(){
    methodA();
}
```

## Đặc điểm của đệ quy
Để có thể tiến hành một phương thức đệ quy, ta cần có hai yếu tố:  
- Có điều kiện dừng: Xác định quy luật của một phương thức và tìm giá trị cụ thể khi thoả mãn một điều kiện nhất định, ở bước này vẫn chưa có phương thức đệ quy nào được gọi.  
- Phương thức đệ quy: Phương thức đệ quy sẽ gọi lại chính nó cho đến khi nó trả về điều kiện dừng ở bước 1.

## Áp dụng đệ uy tính giai thừa
Với tính giai thừa của n ta có:   
- Điều kiện dừng: 0! = 1  
- Phương thức đệ quy: n! = n*(n-1)!  

## Đệ quy đuôi và đệ quy đầu
- Đệ quy đuôi là khi phương thức đệ quy được đặt ở cuối , sau khi chương trình chạy qua điều kiện dừng  
- Đệ quy đầu ngược lại  
Với phương thức đệ quy đuôi, phương thức đệ quy sẽ được chương trình ưu tiên xử lý dứt điểm. Chương trình sẽ không phải chạy nhiều vòng xử lý điều kiện như phương thức đệ quy đầu, nên theo logic, nguy cơ tràn bộ nhớ Stack sẽ được giảm thiểu.  
*Xem ví dụ bài tính luỹ tiến*  

## Ưu điểm và nhược điểm của đệ quy
**Ưu điểm:**  
- Ngắn gọn, dễ hình dung  
- Dễ triển khai  

**Nhược điểm:**  
- Nếu không được xử lý triệt để dễ gây tràn bộ nhớ stack  
- Tốn hiệu năng về mặt thời gian và không gian bộ nhớ  
