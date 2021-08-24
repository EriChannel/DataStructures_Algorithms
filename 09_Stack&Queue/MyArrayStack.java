public class MyArrayStack implements IStackNQueue {

    private int[] arr;
    private int SIZE;
    private int topIndex;
    
    public MyArrayStack(int size) {
        SIZE = size;
        arr = new int[SIZE];
        topIndex = -1; //mảng đang rỗng, khi push tăng 1, khi pop giảm 1
    }

    @Override
    public boolean push(int value) {
        if(!isFull()){
            topIndex++;
            arr[topIndex] = value;
            return true;
        }
        return false;
    }

    @Override
    public int pop() {
        if(!isEmpty()){
            int value = arr[topIndex];
            topIndex--;
            return value;
        }
        return -1;
    }

    @Override
    public boolean isFull() {
        //Full khi topIndex chỏ vào phần tử cuối cùng
        return topIndex == SIZE - 1;
    }

    @Override
    public boolean isEmpty() {
        //topIndex == 0 => là phần tử đầu tiên
        return topIndex < 0;
    }

    @Override
    public void print() {
        if(isEmpty()){
            System.out.println("Stack is empty");
        }else{
            for (int i = 0; i <= topIndex; i++) {
                System.out.print(arr[i] + "\t");
            }
            System.out.println();
        }
        
    }
    
}
