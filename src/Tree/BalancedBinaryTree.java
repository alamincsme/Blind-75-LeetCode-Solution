package Tree;

class TreeNode {
    public int val;
    public TreeNode left;
    public TreeNode right;

    public TreeNode(int val) {
        this.val = val;
        this.left = this.right = null;
    }
}
public class BalancedBinaryTree {
    public int height(TreeNode root) {
        if (root == null) {
            return 0;
        }

        return 1 + Math.max(height(root.left), height(root.right));
    }

    public boolean isBalanced(TreeNode root) {
        if (root == null) {
            return true;
        }

        boolean leftBalanced = isBalanced(root.left);
        boolean rightBalanced = isBalanced(root.right);

        int leftHeight = height(root.left);
        int rightHeight = height(root.right);

        return (Math.abs(leftHeight - rightHeight) <= 1 && leftBalanced && rightBalanced);
    }
}

