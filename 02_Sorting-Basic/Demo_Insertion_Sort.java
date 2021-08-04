public class Demo_Insertion_Sort {
    public static void main(String[] args) {
        int arr[] = { 4, 2, 1, 5, 3 };
        sortArray(arr);
        printArray(arr);
        System.out.println("Done");

    }

    private static int[] sortArray(int[] arr) {
        int n = arr.length;
        for (int i = 1; i < n; ++i) {
            int key = arr[i];
            int j = i - 1;

            // Di chuyển các phần tử của arr [0 ... i - 1], lớn hơn key
            // đến một vị trí trước vị trí hiện tại của chúng
            while (j >= 0 && arr[j] > key) {
                arr[j + 1] = arr[j];
                j = j - 1;
            }
            arr[j + 1] = key;
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
