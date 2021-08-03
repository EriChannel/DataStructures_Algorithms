## Mảng là gì?
Mảng là tập hợp nhiều phần tử có cùng tên, cùng kiểu dữ liệu và mỗi phần tử trong mảng được truy xuất thông qua các chỉ số của nó trong mảng  
Mảng trong java lưu các phần tử theo chỉ số, chỉ số của phần tử đầu tiên là 0  

## Các loại mảng
Mảng được chia thành 2 loại:  
- Mảng một chiều  
- Mảng đa chiều  

### Mảng một chiều
Là mảng chỉ có một chiều duy nhất.  
![](https://github.com/EriChannel/DataStructures-Algorithms/blob/bec22deaf51d323a32068c2e29eca54fc0230022/images/array-img.png)

***Cú pháp khai báo:***  
`<Kiểu dữ liệu> <Tên mảng>[];`  
*hoặc*    
`<Kiểu dữ liệu> []<Tên mảng>;`  
*Ví dụ:*  
`int array[];  \\Khai báo mảng array có kiểu dữ liệu là int`  
`String [] str; \\Khai báo mảng str có kiểu dữ liệu là String`  
***Cú pháp cấp phát bộ nhớ cho mảng***  
`<Tên mảng> = new <Kiểu dữ liệu>[<Kích thước mảng>];`  
*Ví dụ:*  
`array = new int[5]; \\mảng array có kích thước là 5, có thể chứa được 5 phần tử là các số nguyên`   


### Mảng đa chiều
Mảng đa chiều chỉ tăng số chiều lưu trữ nhiều chiều hơn, hay còn gọi là ma trận. Thông thường ta hay sử dụng mảng 2 chiều.  
Đối với mảng 2 chiều, dữ liệu được lưu trữ theo hai chiều. Chiều thứ nhất được gọi là hàng và chiều thứ hai được gọi là cột  
![](https://github.com/EriChannel/DataStructures-Algorithms/blob/12994650701ce03ce7144d1361395bb1f1204bbc/images/array2-img.png)

***Cú pháp khai báo:***  
`<Kiểu dữ liệu> <Tên mảng>[][];`  
*hoặc*  
`<Kiểu dữ liệu>[][]<Tên mảng>`    
*Ví dụ:*  
`int array[][];`  
`String [][]str;`  
***Cú pháp cấp phát bộ nhớ cho mảng:***  
`<Tên mảng> = new <Kiểu dữ liệu>[<Số dòng>][<Số cột>];`  
*Ví dụ:*  
`array = new int[3][4]; \\mảng array là mảng hai chiều với số dòng là 3 và số cột là 4`


## Các thao tác với mảng
- Duyệt mảng  
- Thêm phần tử  
- Sửa phần tử  
- Xoá phần tử