
public class _88_Merge_Sorted_Array {
    public static void main(String[] args) {
        int nums1[] = { 1, 2, 3, 0, 0, 0 };
        int nums2[] = { 2, 5, 6 };
        merge(nums1, 3, nums2, 3);

        for (int i : nums1) {
            System.out.println(i);
        }

    }
    // public static void merge(int[] nums1, int m, int[] nums2, int n) {
    // for (int i : nums2) {
    // insert(i, nums1, m);
    // m++;
    // }
    // }
    // private static void insert(int x, int[] nums1, int m) {
    // boolean isFound = false;
    // for (int i = 0; i < m; i++) {
    // if(nums1[i] > x){
    // isFound = true;
    // int k = i;
    // for (int j = m-1; j >= k; j--) {
    // nums1[j + 1] = nums1[j];
    // }

    // nums1[k] = x;
    // break;
    // }
    // }

    // if(isFound == false){
    // nums1[m] = x;
    // }
    // }

    public static void merge(int[] nums1, int m, int[] nums2, int n) {
        int i = m - 1;
        int j = n - 1;
        int k = (m + n) - 1;

        while (k >= 0) {
            if (j < 0) {
                nums1[k] = nums1[i];
                i--;
            } else if (i < 0) {
                nums1[k] = nums2[j];
                j--;
            } else if (nums1[i] > nums2[j]) {
                nums1[k] = nums1[i];
                i--;
            } else{
                nums1[k] = nums2[j];
                j--;
            }

            k--;

        }
    }

}
