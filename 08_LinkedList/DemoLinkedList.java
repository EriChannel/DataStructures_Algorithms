

public class DemoLinkedList {
    public static void main(String[] args) {
        Node n1 = new Node(1); // value = 1, next is null
        Node n2 = new Node(2);
        Node n3 = new Node(3);
        // Nối
        n1.next = n2; // Nối node n1 đến n2
        n2.next = n3; // Nối node n2 đến n3

        // Lúc này n1 là head
        printLinkedList(n1);

        n1 = addToHead(0, n1); //update lại n1
        printLinkedList(n1);

        n1 = addToTail(4, n1);
        printLinkedList(n1);

        n1 = addToIndex(5, n1, 2);
        printLinkedList(n1);

        n1 = addToIndex(6, n1, 0);
        printLinkedList(n1);

        n1 = addToIndex(9, n1, 9);
        printLinkedList(n1);

        n1 = removeAtHead(n1);
        printLinkedList(n1);

        n1 = removeAtTail(n1);
        printLinkedList(n1);

        n1 = removeAtIndex(n1, 0);
        printLinkedList(n1);

        n3 = removeAtIndex(n3, 0);
        printLinkedList(n3);
    }

    public static void printLinkedList(Node head) {
        if (head == null) { // nếu LinkedList = null
            System.out.println("List is empty");
        } else {
            Node temd = head;
            while (temd != null) {
                System.out.print(temd.val); // in ra giá trị của node hiện tại sau đó trỏ tới node tiếp theo
                temd = temd.next; // Node trước trỏ đến node sau
                if (temd != null) {
                    System.out.print("->");
                } else {
                    System.out.println();
                }
            }
        }

    }

    public static Node addToHead(int value, Node headNode) {
        Node newNode = new Node(value); // Tạo node mới
        if (headNode != null) {
            newNode.next = headNode; // Trỏ new vào head
        }
        return newNode; 
    }

    public static Node addToTail(int value, Node headNode) {
        Node newNode = new Node(value); // Tạo node mới
        if(headNode == null){
            return newNode;
        }else{
            //Bước 1 xác định node last (lastNode.next == null)
            Node lastNode = headNode;
            while(lastNode.next != null){
                lastNode = lastNode.next;
            }
            //Bước 2: Gán next cho lastNode = new Node
            lastNode.next = newNode;
        }
        

        return headNode;
    }

    public static Node addToIndex(int value, Node headNode, int index){
        if(index == 0){
            return addToHead(value, headNode); //) vị trí đàu tiên
        }else{
            //B1: Tìm vị trí cần thêm
            Node newNode = new Node(value); // Tạo node mới
            Node curNode = headNode;
            int count = 0;
            while(curNode.next != null){ //duyệt list
                count++;
                if(count == index){
                    //Thực hiện add
                    newNode.next = curNode.next;
                    curNode.next = newNode;
                    break;
                }
                curNode = curNode.next;
            }
        }
        return headNode;
    }

    public static Node removeAtHead(Node headNode){
        if(headNode != null){
            return headNode.next;
        }
        return headNode;
    }

    public static Node removeAtTail(Node headNode){
        if(headNode == null){
            return null;
        }
        //b1: xác định last và previous
        Node lastNode = headNode;
        Node prevNode = null;

        //Kỹ thuật hai con trỏ
        while(lastNode.next != null){ //lastnode.next = null
            prevNode = lastNode;
            lastNode = lastNode.next;
        }

        if(prevNode == null){
            return null;
        }else{
            prevNode.next = lastNode.next;
        }
        return headNode;
    }

    public static Node removeAtIndex(Node headNode, int index){
        if(headNode == null || index < 0){
            return null;
        }
        if(index == 0){
            return removeAtHead(headNode);
        }
        Node currNode = headNode;
        Node prevNode = null;

        int count = 0;
        boolean isFound = false;
        while(currNode != null){
            if (count == index) {
                isFound = true;
                break;
            }
            prevNode = currNode;
            currNode = currNode.next;
            count++;
        }
        if(isFound){
            if(prevNode == null){ //currNode là LastNode
                return null;
            }else{
                if(currNode != null){
                    prevNode.next = currNode.next;
                }
                
            }
        }

        return headNode;
    }
}
