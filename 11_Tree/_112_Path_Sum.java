public class _112_Path_Sum {
    
    public boolean isLeaf(TreeNode node){
        return node.left == null && node.right == null;
    }

    public boolean duyet(TreeNode curNode, int curSum, int targetSum) //traversal
    {
        //B1: Dieu kien dung | Bai toan co so
        if(curNode == null) return false;

        curSum += curNode.value;
        if(curNode.left == null && curNode.right == null){
            return curSum == targetSum;
        }

        // Duyet sang 2 cay con ben de kiem tra
        boolean kqBenTrai = duyet(curNode.left, curSum, targetSum);
        boolean kqBenPhai = duyet(curNode.right, curSum, targetSum);

        return kqBenPhai || kqBenTrai;
    }

    public boolean hasPathSum(TreeNode root, int targetSum) {
        return duyet(root, 0, targetSum);
    }
}
