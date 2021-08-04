## Giới thiệu
Giải thuật sắp xếp là sắp xếp dữ liệu theo một định dạng cụ thể như theo thứ tự alphabet tăng/giảm dần, theo thứ tự số tăng/giảm dần. Thường được sử dựng trong một cấu trúc dữ liệu ví dụ như mảng, ArrayList, ...  
Có nhiều thuật toán khác nhau để tiến hành sắp xếp. Trong nội dung này, chúng ta sẽ cùng tìm hiểu các thuật toán cơ bản trước:
- Sắp xếp nổi bọt (Bubble sort)  
- Sắp xếp chèn (Insertion sort)
- Sắp xếp chọn (Selection sort)

## Bubble sort
**Nguyên lý hoạt động**  
Sắp xếp nổi bọt hoạt động bằng cách hoán đổi các phần tử liền kề nếu chúng không theo thứ tự mong muốn. Quá trình này lặp lại từ đầu mảng đến cuối mảng.  
Dưới đây là các bước để sắp xếp một mảng theo thứ tự tăng dần  
Giả sử ta có mảng sau:  
![image](https://user-images.githubusercontent.com/70504465/128118532-d7f6c31f-1e0c-48b1-a534-5dcee7f0e519.png)  

Trên thực tế số lần lặp có nhiều hơn. Bằng cách sắp xếp này, cho đến khi không còn hoán đổi nào nữa, chúng ta sẽ được một mảng đã sắp xếp  

