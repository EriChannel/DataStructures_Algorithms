public class _1672_Richest_Customer_Wealth {
    public static void main(String[] args) {
        int arr[][] = {{1,5}, {7,3}, {3,5}};

        // for (int i = 0; i < arr.length; i++) { //duyệt dòng
        //     for (int j = 0; j < arr[i].length; j++) { //duyệt cột
        //         System.out.print(arr[i][j] + "\t");
        //     }
        //     System.out.println();
        // }

        System.out.println(maximumWealth(arr));
    }

    public static int maximumWealth(int[][] accounts) {
        int customerNumber = accounts.length;
        int bankNumber = accounts[0].length;
        int max = 0;

        for (int i = 0; i < customerNumber; i++) {
            int sumRow = 0;
            for (int j = 0; j < bankNumber; j++) {
                sumRow += accounts[i][j];
            }
            if(sumRow > max){
                max = sumRow;
            }
            
        }
       return max; 
    }
}
