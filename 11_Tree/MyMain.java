public class MyMain {
    public static void main(String[] args) {
        TreeNode n0 = new TreeNode(0);
        TreeNode n1 = new TreeNode(1);
        TreeNode n2 = new TreeNode(2);
        TreeNode n3 = new TreeNode(3);
        TreeNode n4 = new TreeNode(4);
        TreeNode n5 = new TreeNode(5);
        TreeNode n6 = new TreeNode(6);
        TreeNode n7 = new TreeNode(7);
        TreeNode n9 = new TreeNode(9);
        TreeNode n10 = new TreeNode(10);


        n6.left = n2; n6.right = n9;
        n2.left = n1; n2.right = n4;
        n1.left = n0;
        n4.left = n3; n4.right = n5;
        n9.left = n7; n9.right = n10;

        
        MyBinarySearchTree mTree = new MyBinarySearchTree();
        mTree.mRoot = n6;
        
        mTree.deleteNode(n6, 2);
        //MyBinarySearchTree.PostOder(n0);

        System.out.println("DONE");
    }
}
