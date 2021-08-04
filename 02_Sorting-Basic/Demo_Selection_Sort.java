public class Demo_Selection_Sort {
    public static void main(String[] args) {
        int arr[] = { 4, 2, 1, 5, 3 };
        sortArray(arr);
        printArray(arr);
        System.out.println("Done");

    }

    private static int[] sortArray(int[] arr) {
        int n = arr.length;

        // Duyệt qua từng phần tử của mảng
        for (int i = 0; i < n - 1; i++) {

            // Tìm phần tử nhỏ nhất trong mảng chưa được sắp xếp
            int min = i;
            for (int j = i + 1; j < n; j++){
                if (arr[j] < arr[min]){
                    min = j;
                }
                
            }
                

            // Hoán đổi phần tử nhỏ nhất và phần tử đầu tiên
            int temp = arr[min];
            arr[min] = arr[i];
            arr[i] = temp;
            
        }
        return arr;
    }

    public static void printArray(int arr[]) {
        int n = arr.length;
        for (int i = 0; i < n; ++i){
            System.out.print(arr[i] + "\t");
        }
            

        System.out.println();
    }
}
