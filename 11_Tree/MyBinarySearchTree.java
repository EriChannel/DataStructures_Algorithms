import java.util.ArrayList;
import java.util.List;

public class MyBinarySearchTree {
    public TreeNode mRoot;

    public MyBinarySearchTree(){
        
    }

    public TreeNode insert(TreeNode root, int value)
    {
        TreeNode newNode = new TreeNode(value);
        // TH1: root == null
        if(root == null){
            root = newNode;
            return root;
        }else{
            TreeNode temp = root;
            while(true)
            {
                if(value > temp.value){
                    if(temp.right == null){
                        temp.right = newNode;
                        break;
                    }else{
                        temp = temp.right;
                    }
                }else{ // value < temp.val
                    if(temp.left == null){
                        temp.left = newNode;
                        break;
                    }else{
                        temp = temp.left;
                    }
                }
            }
            
            return root;
        }
    }

    //insertIntoBST: The value vao rootNode tree
    public TreeNode insertIntoBST(TreeNode rootNode, int value)
    {
        if(rootNode == null){
            return new TreeNode(value);
        }

        if(value < rootNode.value){
            if(rootNode.left == null){
                rootNode.left = new TreeNode(value);
            }else{
                insertIntoBST(rootNode.left, value);
            }
        }else{
            if(rootNode.right == null){
                rootNode.right = new TreeNode(value);
            }else{
                insertIntoBST(rootNode.right, value);
            }
        }

        return rootNode;
    }


    // Tim node con trai cung cua root
    public TreeNode findLeftModeNode(TreeNode root)
    {
        if(root == null) return null;
        TreeNode leftMostNode = root;
        while(leftMostNode.left != null)
            leftMostNode = leftMostNode.left;
        return leftMostNode;
    }

    // xoa node key trong cay root*
    // Return: Cay moi da duoc xoa node key
    public TreeNode deleteNode(TreeNode root, int key) {
        if(root == null)
            return null;
        
            // B1: tìm node cần xoá
        if(key < root.value){ //Đi về bên trái
           // System.out.println(deleteNode(root.left, key));
            root.left = deleteNode(root.left, key); //Nối bên trái của cha với node còn lại 
        }else if(key > root.value){ //Đi về bên phải
           // System.out.println(deleteNode(root.right, key));
            root.right = deleteNode(root.right, key);
        }else{ // root.val = key => xoa root | Xac dinh duoc node xoa
            // Buoc 2: Xoa node root

            // Th1: root la node la:
            if(root.left == null && root.right == null)
                return null;
            // Th2: Chi co 1 con: ben trai
            if(root.left != null && root.right == null)
                return root.left;
            // Th2: Chi co 1 con: ben phair
            if(root.left == null && root.right != null)
                return root.right;

            // TH3: Ton tai 2 con
            // Tim node trai cung cua cay con ben phair
            TreeNode leftModeNode = findLeftModeNode(root.right);
            root.value = leftModeNode.value;
            root.right = deleteNode(root.right, leftModeNode.value);
        }

        return root;
    }


    public TreeNode searchBST(TreeNode root, int key) {
        if(root == null)
            return null;

        if(key < root.value){
            return searchBST(root.left, key);
        }else if(key > root.value){
            return searchBST(root.right, key);
        }else{ // root.val = key
            return root;
        }
    }

    // Node - L - R
    public static void PreOder(TreeNode currentNode)
    {
        if(currentNode == null) return;
        // Duyet currentNode truoc
        System.out.print(currentNode.value + " ");

        // Duyet ben trai | Duyet ben phair
        PreOder(currentNode.left);
        PreOder(currentNode.right);
    }

        //  L - Node - R
    public static void InOder(TreeNode currentNode)
    {
        if(currentNode == null) return;

        // Duyet ben trai | Duyet ben phair
        InOder(currentNode.left);

        // Duyet currentNode truoc
        System.out.print(currentNode.value + " ");

        InOder(currentNode.right);
    }

    // L R Node
    public static void PostOder(TreeNode currentNode)
    {
        if(currentNode == null) return;

        // Duyet ben trai | Duyet ben phair
        PostOder(currentNode.left);
        PostOder(currentNode.right);

        // Duyet currentNode truoc
        System.out.print(currentNode.value + " ");
    }

    List<Integer> duyetOrder = new ArrayList<>();
    public List<Integer> preorderTraversal(TreeNode root) {
        if(root == null) 
            return duyetOrder;
        // Duyet currentNode truoc
        // System.out.print(currentNode.val + " ");
        duyetOrder.add(root.value);
        // Duyet ben trai | Duyet ben phair
        preorderTraversal(root.left);
        preorderTraversal(root.right);

        return duyetOrder;
    }
}
