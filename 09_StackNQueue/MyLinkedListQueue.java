public class MyLinkedListQueue implements IStackQueue{

    MyNode headNode, tailNode;

    

    public MyLinkedListQueue() {
        headNode = tailNode = null;
    }

    @Override
    public boolean push(int value) {
        if(!isFull()){
            MyNode newNode = new MyNode(value);
            if(isEmpty()){
                headNode = tailNode = newNode;
            }else{
                tailNode.next = newNode;
                tailNode = newNode;
            }
            return true;
        }
        return false;
    }

    @Override
    public int pop() {
        int value = -1;
        if(!isEmpty()){
            value = headNode.value;
            if(headNode == tailNode){
                headNode = tailNode = null;
            }else{
                headNode = headNode.next;
            }
        }
        return value;
    }

    @Override
    public boolean isFull() {
        return false;
    }

    @Override
    public boolean isEmpty() {
        // TODO Auto-generated method stub
        return (headNode == null && tailNode == null);
    }

    @Override
    public void print() {
        if(isEmpty()){
            System.out.println("Queue is empty");
        }else{
            MyNode temp = headNode;
            while(temp != null){
                System.out.print(temp.value + "\t");
                temp = temp.next;
            }
            System.out.println();
        }
        
    }
    
}
