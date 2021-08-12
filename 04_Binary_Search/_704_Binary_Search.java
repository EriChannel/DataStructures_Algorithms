

public class _704_Binary_Search {
    public static void main(String[] args) {
        int nums[] = {1, 1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 11};
        

        long start, end, timeElapse;
        start = System.nanoTime();
        System.out.println(search1(nums, 8));
        end = System.nanoTime();
        timeElapse = end - start;
        System.out.println("Tìm kiếm tuần tự: " + timeElapse);

        start = System.nanoTime();
        System.out.println(search(nums, 8));
        end = System.nanoTime();
        timeElapse = end - start;
        System.out.println("Tìm kiếm nhị phân: " + timeElapse);

        System.out.println("Sử dụng đệ quy: " + search2(nums, 8));

       
    }

    public static int search1(int array[], int key){
        for (int i = 0; i < array.length; i++) {
            if(array[i] == key){
                return i;
            }
        }
        return -1;
    }

    public static int search(int[] nums, int target) {
        int n = nums.length;
        int iLeft = 0;
        int iRight = n - 1;
        while(iLeft <= iRight){
            int iMid = (iLeft + iRight)/2;
           // System.out.println("["+iLeft+" : " +iRight + "]" + "  " + iMid);
            if(target == nums[iMid]){
                return iMid;
            }else if(target > nums[iMid]){
                iLeft = iMid + 1;
            }else{  //target < nums[iMid]
                iRight = iMid - 1;
            }
        }

        return -1;
    }

    public static int search2(int[] nums, int target){
        int n = nums.length;
        return search2(nums, target, 0, n-1);
    }


    public static int search2(int[] nums, int target, int iLeft, int iRight){
        if(iLeft > iRight){ //ĐIều kiện dừng
            return -1;
        }
        int iMid = (iLeft + iRight)/2;
        if(target == nums[iMid]){
            return iMid;
        }else if(target > nums[iMid]){
            return search2(nums, target, iMid + 1, iRight);
        }else{ //target < nums[iMid]
            return search2(nums, target, iLeft, iMid - 1);
        }
    }
}
