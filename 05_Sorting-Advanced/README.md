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