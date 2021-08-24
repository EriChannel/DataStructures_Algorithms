public class MyArrayQueue implements IStackNQueue {
    private int[]arr;
    private int SIZE;
    private int head;
    private int tail;
    public MyArrayQueue(int size){
        SIZE = size;
        arr = new int[SIZE];
        head = tail = -1;
    }

    @Override
    public boolean push(int value) {
        if(!isFull()){
            if(isEmpty()){ //Khi mảng chưa có phần tử nào
                head++;
            }
            tail++;
            arr[tail] = value;
            return true;
        }
        return false;
    }

    @Override
    public int pop() {
        int value = -1;
        if(!isEmpty()){
            value = arr[head];
            head++;
            //Trong trường hợp mảng chỉ có 1 phần tử
            if(head > tail){
                head = tail = -1;
            }
        }
        return value;
    }

    @Override
    public boolean isFull() {
        
        return tail == SIZE-1;
    }

    @Override
    public boolean isEmpty() {
        //Khi không có phần tử nào

        return (head == -1) && (tail == -1);
    }

    @Override
    public void print() {
        if(isEmpty()){
            System.out.println("Queue is empty");
        }else{
            for (int i = head; i <= tail; i++) {
                System.out.print(arr[i] + "\t");
                
            }
            System.out.println();
        }
        
    }

    public int count(){
        if(isEmpty())
            return 0;
        return tail - head + 1;
    }
    
}
