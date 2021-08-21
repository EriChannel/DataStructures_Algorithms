public class LinkedListDemo {
    public static void main(String[] args) {
        Node n1 = new Node(1); // val = 1, next = null
        Node n2 = new Node(2);
        Node n3 = new Node(3);

        n1.next = n2; // Nối n1 đến n2 // val = 1, next = n2
        n2.next = n3; // Nối n2 đến n3
        print(n1);
        //print(n2);
        print(n2);
        n2 = removeAtIndex(n2, 0);
        print(n2);

        // n1 = addToHead(0, n1);
        // print(n1);

        // // n1 = addToHead(4, n1);
        // // print(n1);

        // n1 = addToTail(4, n1);
        // print(n1);

        // n1 = addToIndex(5, n1, 0);
        // print(n1);

        // n1 = addToIndex(6, n1, 2);
        // print(n1);

        // n1 = removeAtHead(n1);
        // print(n1);

        // n1 = removeAtTail(n1);
        // print(n1);

        // n1 = removeAtTail(n1);
        // print(n1);

        // print(n3);
        // n3 = removeAtTail(n3);
        // print(n3);

        n1 = removeAtIndex(n1, 0);
        print(n1);

        n1 = removeAtIndex(n1, 1);
        print(n1);

         print(n3);

        // n3 = removeAtIndex(n3, 0);
        // print(n3);

        print(n2);
        

    }

    public static void print(Node head) {
        if (head == null) { // list rỗng
            System.out.println("List is empty");
        } else {
            Node temd = head;
            while (temd != null) {
                System.out.print(temd.val); // in ra giá trị của node hiện tại
                temd = temd.next;
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
            newNode.next = headNode; //Trỏ newwNode vào headNode
        }
        return newNode;
    }

    public static Node addToTail(int value, Node headNode){
        Node newNode = new Node(value);
        if(headNode == null){
            return newNode;
        }else{
            Node lastNode = headNode;
            while(lastNode.next != null){
                lastNode = lastNode.next;
            }

            lastNode.next = newNode;
        }

        return headNode;
    }

    public static Node addToIndex(int value, Node headNode, int index){
        if(index == 0){
            return addToHead(value, headNode);
        }else{
            Node newNode = new Node(value);
            Node currNode = headNode;
            int count = 0;
            while (currNode.next != null){
                count++;
                if(count == index){
                    //Thực hiện add
                    newNode.next = currNode.next;
                    currNode.next = newNode;
                    break;
                }

                currNode = currNode.next;
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

        //Xác định lastNode và prevNode
        Node lastNode = headNode;
        Node prevNode = null;

        //Kỹ thuật hai con trỏ
        while(lastNode.next != null){
            prevNode = lastNode;
            lastNode = lastNode.next;
        }

        if(prevNode == null) {
            return null;
        }else{
            prevNode.next = lastNode.next;
        }
        
        return headNode;
    }

    public static Node removeAtIndex(Node headNode, int index){
        if(headNode == null){
            return null;
        }

        if(index == 0){
            return removeAtHead(headNode);
        }

        Node currNode = headNode;
        Node prevNode = null;

        int count = 0;
        boolean ifFound = false;

        while (currNode != null) {

            if(count == index){
                ifFound = true;
                break;
            }
            count++;
            prevNode = currNode;
            currNode = currNode.next;
            
        }
        if(ifFound){
            prevNode.next = currNode.next;
        }

        return headNode;
    }
}
