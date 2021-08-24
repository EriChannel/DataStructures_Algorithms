public class MyArrayQueue implements IStackQueue {

    private int[]arr;
    private int SIZE;
    private int head;
    private int tail;

    

    public MyArrayQueue(int size) {
        SIZE = size;
        arr = new int[SIZE];
        head = tail = -1;
    }

    @Override
    public boolean push(int value) {
        if(!isFull()){
            if(isEmpty()){ //Trong trường hợp queue rỗng
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
            if(head > tail){
                head = tail = -1;
            }
        }
        
        return value;
    }

    @Override
    public boolean isFull() {
        // TODO Auto-generated method stub
        return tail == SIZE - 1;
    }

    @Override
    public boolean isEmpty() {
        // TODO Auto-generated method stub
        return (head == -1) && (tail == -1);
    }

    @Override
    public void print() {
        if(isEmpty()){
            System.out.println("Queue is empty");
        }else{
            for(int i = head; i <= tail; i++){
                System.out.print(arr[i] + "\t");
            }
            System.out.println();
        }
        
    }
    
}
