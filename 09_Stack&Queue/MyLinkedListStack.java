import java.util.ArrayList;

public class MyLinkedListStack implements IStackNQueue {
    
    MyNode topNode;

    MyLinkedListStack(){
        topNode = null;
    }


    @Override
    public boolean push(int value) {
        if(!isFull())
        {
            // Thêm một phần tử vào đầu của linked list
            MyNode newNode = new MyNode(value);
            newNode.next = topNode;
            topNode = newNode;
            return true;
        }
        return false;
    }

    @Override
    public int pop() {
        if(isEmpty())
            return -1;
        int value = topNode.value;
        topNode = topNode.next;
        return value;
    }

    @Override
    public boolean isFull() {
        //Tràn bộ nhớ, không cấp phát được nữa
        return true;
    }

    @Override
    public boolean isEmpty() {
        //topNode chỏ vào null
        return topNode == null;
    }

    @Override
    public void print() {
        if(isEmpty()){
            System.out.println("Stack is Empty!");
            return;
        }

        MyNode temp = topNode;
        ArrayList<Integer> tempList = new ArrayList<>();
        while(temp != null){
            // System.out.print(temp.value + " ");
            tempList.add(temp.value);
            temp = temp.next;
        }
        for (int i = tempList.size()-1; i >= 0; i--) {
            System.out.print(tempList.get(i)+ " ");
        }
        System.out.println();
    }
}
