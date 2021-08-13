# Merge sort
## Giới thiệu
Thuật toán Merge Sort là một trong những thuật toán có độ phức tạp ở mức trung bình và cùng sử dùng phương pháp chia để trị giống thuật toán sắp xếp nhanh Quick Sort.  

Thuật toán này không chỉ áp dụng trong sắp xếp mà còn ở nhiều bài toán khác.  

Ý tưởng của giải thuật này bắt nguồn từ việc trộn 2 danh sách đã sắp xếp thành 1 danh sách mới cũng được sắp xếp.  

Giả sử có hai danh sách đã được sắp xếp a[1 ... m] và b[1 ... n].  

Ta có thể trộn chúng lại thành một danh sách mới c[1 ... m+n] được sắp xếp theo cách sau:  

- So sánh hai phần tử đứng đầu của hai danh sách, lấy phần tử nhỏ hơn cho vào danh sách mới. Tiếp tục như vậy cho tới khi một trong hai danh sách là rỗng.  
- Khi một trong hai danh sách là rỗng ta lấy phần còn lại của danh sách kia cho vào cuối danh sách mới.  

Độ  phức tạp thuật toán: O(nlog(n))  

## Ý tưởng
Ý tưởng để áp dụng cho merge sort đuọce mô tả như sau:

- Tìm chỉ số nằm ở giữa mảng để chia mảng thành hai phần  
- Gọi đệ quy cho hàm mergeSort cho nửa đầu tiên `mergeSort(arr, iLeft, iMid)`  
- Gọi đệ quy cho hàm mergeSort cho nửa thứ hai `mergeSort(arr, iMid+1, iRight)`  
- Gộp 2 mảng đã sắp xếp `merge(arr, 1, iMid, iRight)`

![](https://github.com/EriChannel/DataStructures_Algorithms_Techmaster/blob/c1650ce11e720faedb07f9650326acc5fc002522/images/so-do-minh-hoa-tien-trinh-cua-thuat-toan-merge-sort.jpg)

# Quick sort
## Giới thiệu
Ý tưởng của thuật toán này dựa trên phương pháp chia để trị, nghĩa là chia dãy cần sắp xếp thành 2 phần, sau đó thực hiện việc sắp xếp cho mỗi phần độc lập nhau.

Để làm việc này thì ta cần phải làm các bước sau:

**Bước 1:**

Chọn ngẫu nhiên một phần tử nào đó của dãy làm phần tử khóa (pivot).

Kĩ thuật chọn phần tử khóa rất quan trọng vì nếu không may bạn có thể bị rơi vào vòng lặp vô hạn đối với các trường hợp đặc biệt.

Tốt nhất là chọn phần tử ở vị trí trung tâm của dãy. Khi đó, sau log2(n) lần phân chia ta sẽ đạt tới kích thước danh sách bằng 1.

Tuy nhiên điều đó rất khó. Có các cách chọn phần tử khóa như sau:

- Chọn phần tử đứng đầu hoặc đứng cuối làm phần tử khóa.
- Chọn phần tử đứng giữa danh sách làm phần tử khóa.
- Chọn phần tử trung gian trong 3 phần tử đứng đầu, đứng giữa và đứng cuối làm phần tử khóa.
- Chọn phần tử ngẫu nhiên làm phần tử khóa. (Cách này có thể dẫn đến khả năng rơi vào các trường hợp đặc biệt)

**Bước 2:**

Xếp các phần tử nhỏ hơn phần tử chốt ở phía trước phần tử khóa.

**Bước 3:**

Xếp các phần tử lớn hơn phần tử chốt ở phía sau phần tử khóa.

Để có được sự phân loại này thì ở 2 bước trên, các phần tử sẽ được so sánh với khóa và hoán đổi vị trí cho nhau hoặc cho khóa nếu nó lớn hơn khóa mà lại nằm trước khóa, hoặc nhỏ hơn mà lại nằm sau khóa.

Áp dụng kĩ thuật như trên cho mỗi đoạn đó và tiếp tục làm vậy cho đến khi mỗi đoạn chỉ còn 2 phần tử. Khi đó toàn bộ dãy đã được sắp xếp.

Quick sort là một thuật toán dễ cài đặt, hiệu quả trong hầu hết các trường hợp và tiêu tốn ít tài nguyên hơn so với các thuật toán khác.

Độ phức tạp trung bình của giải thuật là O(NlogN).

