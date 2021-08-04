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
**Đánh giá:**    
*Độ phức tạp:*    
- Trường hợp tốt: O(n)  
- Trung bình: O(n^2)  
- Trường hợp xấu: O(n^2)  
*Không gian sử dụng bộ nhớ:* O(1)  

## Insertion sort
Thuật toán chèn thực hiện sắp xếp dãy số theo cách duyệt từng phần tử và chèn từng phần tử đó vào đúng vị trí trong mảng con đã sắp xếp sap cho dãy số trong mảng đã xếp đó vẫn đảm bảo tính chất của một dãy số tăng dần.  
Trong thuật toán, để sắp xếp một mảng có kích thước n theo thứ tự tăng dần:  
1, Lặp lại từ `arr[1]` đến `arr[n]` trên mảng  
2, So sánh phần tử hiện tại với phần tử trước nó  
3, Nếu phần tử hiện tại lớn hơn phần tử trước nó, tiếp tục so sánh với các phần tử đứng trước. Di chuyển các phần tử lớn hơn lên một vị trí để tạo khoảng trống cho phần tử được hoán đổi  
![](https://github.com/EriChannel/DataStructures_Algorithms_Techmaster/blob/94bf5fcfdb60b33e8f79824fff0811b26ffe25f3/images/insertion_sort.png)  

Sắp xếp chèn được sử dụng khi số lượng phần tử nhỏ.  

Nó cũng có thể hữu ích khi mảng đầu vào gần như được sắp xếp, chỉ có một số phần tử bị đặt sai vị trí trong một mảng lớn hoàn chỉnh. 

## Selection sort
Thuật toán sắp xếp chọn là thuật toán sắp xếp đơn giản dựa trên so sánh tại chỗ, trong đó:  
- Danh sách được chia thành hai phần (Trái-Phải) (Vẫn cùng một mảng)
- Phần này được sắp xếp ở đầu bên trái và phần chưa được sắp xếp nằm ở đầu bên phải  
- Lúc đầu thì phần bên phải là toàn bộ danh sách (Vì phần bên trái chưa được sắp xếp)  
- Mỗi lần lặp chúng ta sẽ liên tục tìm giá trị nhỏ nhất ở phần bên phải, hoán đổi vị trí của nó cho phần tử ngoài cùng bên trái  
Quá trình này liên tục di chuyển qua lại mảng chưa được sắp xếp bởi một phần tử sang phải

![](https://github.com/EriChannel/DataStructures_Algorithms_Techmaster/blob/d522c47515cd279c4affaeff4b308ff2a710c5d3/images/selection_sort.PNG)  


## Sắp xếp mảng với Arrays.sort
`sort()` là phương thức trong class java.util.Arrays, được sử dụng để sắp xếp


### Comparable interface
Là một interface trong java, được sử dụng để sắp xếp các đối tượng của lớp do người dùng tự định nghĩa.    
interface này có duy nhất một phương thức compareTo(), có kiểu trả về là int. Nó có thể trả về một số nguyên âm nếu đối tượng đã cho nhỏ hơn đối tượng chỉ định, trả về 0 nếu bằng nhau hoặc trả về số nguyên dương nếu đối tượng đã cho lớp hơn đối tượng chỉ định
```java
public int compareTo(T o);
```
Chúng ta có thể sắp xếp các phần tử của:  

- Các đối tượng String.  
- Các đối tượng của lớp Wrapper.  
- Các đối tượng của lớp do người dùng định nghĩa (User-defined).  


### Comparator interface
Là một interface được sử dụng để sắp xếp các đối tượng của lớp do người dùng tự định nghĩa.  
Comparator có 2 phương thức là compare(Object obj1,Object obj2) và equals(Object element)  
```java
int compare(T o1, T o2);
```
```java
boolean equals(Object obj);
```

Chúng ta có thể sắp xếp các phần tử của:  

-  Các đối tượng String.  
-  Các đối tượng của lớp Wrapper.  
-  Các đối tượng của lớp do người dùng định nghĩa (User-defined).  

Tham khảo thêm tại đây: https://github.com/EriChannel/JavaCore/tree/main/JavaCore_3/Collections/Comparator%26Comparable