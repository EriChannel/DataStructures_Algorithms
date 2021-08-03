public class _27_Remove_Element {
    public static void main(String[] args) {
        int nums[] = {3,2,2,3};
        System.out.println(removeElement(nums, 2));
        System.out.println("Done");
    }

    public static int removeElement(int[] nums, int val) {
        int n = nums.length;
        for (int i = 0; i < n; ) {
            if(nums[i] == val){
                for (int j = i; j < n-1; j++) {
                    nums[j] = nums[j+1];
                }
                n--;
            }else{
                i++;
            }
            
        }
        return n;
    }

    //Áp dụng kỹ thuật hai con trỏ
    // public static int removeElement(int[] nums, int val){
    //     int i = 0;
    //     for (int j = 0; j < nums.length; j++) {
    //         if (nums[j] != val) {
    //             nums[i] = nums[j];
    //             i++;
    //         }
    //     }
    //     return i;
    // }
}
