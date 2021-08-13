import java.util.Arrays;

public class QuickSortDemo {

    public static void main(String[] args) {
        QuickSortDemo qDemo = new QuickSortDemo();
        int nums[] = { 25, 30, 45, 6, 11, 90, 15 };
        qDemo.sortArray(nums, 0, nums.length-1);
        System.out.println(Arrays.toString(nums));
    }
    public void sortArray(int nums[], int iLeft, int iRight){

        //Điều kiện dừng
        if(iLeft >= iRight){
            return;
        }
        //Chọn khoá, ưu tiên chọn phần tử ở trung tâm
        int iMid = (iLeft+iRight)/2;
        int key = nums[iMid];


        //Phân bố lại mảng theo khoá key, lấy giá trị chốt
        int pivot = partition(nums, iLeft, iRight, key);

        //Chia đôi mảng sử dụng đệ quy
        sortArray(nums, iLeft, pivot - 1);
        sortArray(nums, pivot, iRight);

    }

    // returrn pivot
    private int partition(int[] nums, int iLeft, int iRight, int key) {
        int iL = iLeft;
        int iR = iRight;

        while(iL <= iR){
            while(nums[iL] < key){
                iL++;
            }

            while(nums[iR] > key){
                iR--;
            }

            //Đổi chỗ hai phần tử không đúng vị trí
            if(iL <= iR){
                int temp = nums[iL];
                nums[iL] = nums[iR];
                nums[iR] = temp;
                iL++;
                iR--;
            }


        }
        return iL;
    }
}
