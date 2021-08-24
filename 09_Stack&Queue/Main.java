/**
 * Main
 */
public class Main {

    public static void main(String[] args) {
        // MyArrayStack mStack = new MyArrayStack(3);
        // System.out.println(mStack.push(1));
        // System.out.println(mStack.push(2));
        // System.out.println(mStack.push(3));
        // System.out.println(mStack.push(4));
        // mStack.print();

        // System.out.println("Phần tử sẽ bị xoá: " +mStack.pop());
        // mStack.print();

        // System.out.println("Phần tử sẽ bị xoá: " +mStack.pop());
        // mStack.print();

        MyArrayQueue mQueue = new MyArrayQueue(3);
        System.out.println(mQueue.push(1));
        mQueue.print();
        System.out.println(mQueue.push(2));
        mQueue.print();
        System.out.println(mQueue.push(3));
        mQueue.print();
        System.out.println(mQueue.push(4));

        mQueue.print();

        System.out.println("Phần tử sẽ bị xoá là: " + mQueue.pop());
        mQueue.print();

        System.out.println("Phần tử sẽ bị xoá là: " + mQueue.pop());
        mQueue.print();

    }
}