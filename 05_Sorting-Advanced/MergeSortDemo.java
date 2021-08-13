import java.util.Arrays;

public class MergeSortDemo {

    public int[] merge(int []nums1, int []nums2){
        int n = nums1.length + nums2.length;
        int result[] = new int[n];

        int i = 0;
        int i1 = 0;
        int i2 = 0;
        while (i < n) {
            if(i1 < nums1.length && i2 < nums2.length){ //nums1 và nums2 khác rỗng
                if(nums1[i1] <= nums2[i2]){
                    result[i] = nums1[i1];
                    i++;
                    i1++;
                }else{
                    result[i] = nums2[i2];
                    i++;
                    i2++;
                }
            }else{  //nums1 rỗng hoặc nums2 rỗng
                if(i1 < nums1.length){  //nums1 không rỗng, nums2 rỗng
                    result[i] = nums1[i1];
                    i++;
                    i1++;
                }else{ //nums1 rỗng, nums2 không rỗng
                    result[i] = nums2[i2];
                    i++;
                    i2++;
                }

            }
        }

        return result;

    }

    public int[] mergeSort(int nums[], int iLeft, int iRight){
        
        //Điều kiện dừng
        if(iLeft > iRight){
            return new int[0]; //Trả về mảng rỗng
        }

        if(iLeft == iRight){ //Khi mảng chỉ có một phần tử
            int []singleElement = {nums[iLeft]};
            return singleElement;
        }

        //Chia mảng
        int iMid = (iLeft + iRight)/2;
        int nums1[] = mergeSort(nums, iLeft, iMid);
        int nums2[] = mergeSort(nums, iMid+1, iRight);

        //Gộp mảng
        int result[] = merge(nums1, nums2);
        return result;
        
    }
    public int[] sortArray(int[] nums) {
        int n = nums.length;
        return mergeSort(nums, 0, n-1);
    }

    public static void main(String[] args) {
        int nums[] = { 25, 30, 45, 6, 11, 90, 15 };
        MergeSortDemo s = new MergeSortDemo();
        System.out.println(Arrays.toString(s.sortArray(nums)));
    }
}
