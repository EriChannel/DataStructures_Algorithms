import java.util.ArrayList;

public class MyLinkedListStack implements IStackQueue {

    MyNode topNode;

    

    public MyLinkedListStack() {
        topNode = null;
    }

    @Override
    public boolean push(int value) {
        if(!isFull()){
            MyNode newNode = new MyNode(value);
            newNode.next = topNode;
            topNode = newNode;
            return true;
        }
        return false;
    }

    @Override
    public int pop() {
        if(!isEmpty()){
            int value = topNode.value;
            topNode = topNode.next;
            return value;
        }
        return -1;
    }

    @Override
    public boolean isFull() {
        // TODO Auto-generated method stub
        return false;
    }

    @Override
    public boolean isEmpty() {
        // TODO Auto-generated method stub
        return topNode == null;
    }

    @Override
    public void print() {
        if(isEmpty()){
            System.out.println("Stack is empty");
        }else{
            MyNode temp = topNode;
            ArrayList<Integer> list = new ArrayList<>();
            while(temp != null){
                list.add(temp.value);
                temp = temp.next;
            }

            for (int i = list.size()-1; i >= 0; i--) {
                System.out.print(list.get(i) + "\t");
            }
            System.out.println();
        }
        
    }
    
}
