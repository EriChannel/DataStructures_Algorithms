import java.util.Arrays;

public class MergeSortDemo{
    public static void main(String[] args) {
        int nums[] = {25,30,45,6,11,90,15};
        MergeSortDemo mDemo = new MergeSortDemo();
        // mDemo.sortArray(nums);
         System.out.println(Arrays.toString(mDemo.sortArray(nums)));

        // int nums1[] = {6,25,30,45};
        // int nums2[] = {11,15,90};
        // int result[] = mDemo.merge(nums1, nums2);
        // System.out.println(Arrays.toString(result));
        
    }


    public int[] sortArray(int[] nums) {
        return mergeSort(nums, 0, nums.length - 1);
    }

    public int[] mergeSort(int nums[], int iLeft, int iRight){

        //Điều kiện dừng
        if(iLeft == iRight){ //Mảng chỉ một phần tử
            int singleElement[] = {nums[iLeft]};
            return singleElement;
        }

        //Chia mảng
        int iMid = (iLeft + iRight)/2;
        int nums1[] = mergeSort(nums, iLeft, iMid);
        int nums2[] = mergeSort(nums, iMid + 1, iRight);

        //Gộp mảng
        int result[] = merge(nums1, nums2);
        return result;

    }

    //Gộp mảng
    public int[] merge(int nums1[], int nums2[]){
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
                }else{ //nums1[i1] > nums2[i2]
                    result[i] = nums2[i2];
                    i++;
                    i2++;
                }
            }else{ //nums1 hoặc nums2 khác rỗng
                if(i1 < nums1.length){ //nums1 khác rỗng, nums2 rỗng
                    result[i] = nums1[i1];
                    i++;
                    i1++;
                }else{  //nums1 rỗng, nums2 khác rỗng
                    result[i] = nums2[i2];
                    i++;
                    i2++;
                }
            }
        }

        return result;
    }
}