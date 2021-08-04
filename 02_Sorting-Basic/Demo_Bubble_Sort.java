public class Demo_Bubble_Sort {

    public static void main(String[] args) {
        int arr[] = { 4, 2, 1, 5, 3 };
        sortArray(arr);
        System.out.println("Done");

    }

    public static int[] sortArray(int[] nums) {
        int n = nums.length;
         for (int i = 0; i < n; i++) {
             for (int j = 0; j < n-i-1; j++) {
                 if(nums[j] > nums[j+1]){
                     int temp = nums[j];
                     nums[j] = nums[j+1];
                     nums[j+1] = temp; 
                 }
             }
             printArray(nums);
             
         }
         return nums; 
     }

    // public static int[] sortArray(int[] nums) { //Tối ưu hoá hơn
    //     boolean sorted = false;
    //     while (!sorted) {
    //         sorted = true;
    //         for (int i = 0; i < nums.length - 1; i++) {
    //             if (nums[i] > nums[i + 1]) {
    //                 int temp = nums[i];
    //                 nums[i] = nums[i + 1];
    //                 nums[i + 1] = temp;
    //                 sorted = false;
    //             }
                
    //         }
    //         printArray(nums);
  
            
    //     }
    //     return nums;
    // }

    public static void printArray(int[] arr) {
        for (int i = 0; i < arr.length; i++) {
            System.out.printf("%d\t", arr[i]);
        }
        System.out.println();
    }

}
