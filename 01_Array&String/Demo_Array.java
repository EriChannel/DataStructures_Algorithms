public class Demo_Array {
    public static void main(String[] args) {
        int arr[] = new int[5]; //Khởi tạo mảng arr là mảng số nguyên, có kích thước là 5
        arr[0] = 12;
        arr[1] = 345;
        arr[2] = 2;
        arr[3] = 6;
        arr[4] = 7896;
        //hoặc 
        int array[] = {12, 345, 2, 6, 7896};

        //Duyệt mảng bằng foreach
        System.out.println("Sử dụng foreach: ");
        for (int i : arr) {
            System.out.println(i);
        }

        //duyệt mảng bằng for
        System.out.println("Sử dụng for: ");
        for (int i = 0; i < arr.length; i++) {
            System.out.printf("arr[%d] = %d\n", i, arr[i]);
        }
    }
    
}
