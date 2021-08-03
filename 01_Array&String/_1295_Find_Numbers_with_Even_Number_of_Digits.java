public class _1295_Find_Numbers_with_Even_Number_of_Digits {
    public static void main(String[] args) {
        int array[] = {12, 345, 2, 6, 7896};

        System.out.println(findNumbers(array));
    }

    public static int findNumbers(int[] nums) {
        int count = 0; //Dùng để đếm số chữ số của một phần tử trong mảng
        for (int i : nums) {
            //Kiểm tra số chữ số của i
            //Nếu số chữ số là chẵn, tăng biến count
            if(countDigit(i) % 2 == 0){
                count++;
            }
        }
        return count;
    }

    private static int countDigit(int i) {
        //Sử dụng chia lấy nguyên
        int count = 0; //Đếm số lần lặp
        while (i != 0) {
            i = i / 10;
            count++; //Tăng biến đếm sau mỗi lần lặp
        }
        return count;
    }

}
