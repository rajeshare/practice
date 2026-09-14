package Blind75.binarytree;

public class InvertBinaryyTree {

    public TreeNode invertBinaryTree(TreeNode root){
        if(root == null){
            return null;
        }
        TreeNode left=invertBinaryTree(root.left);
        TreeNode right=invertBinaryTree(root.right);
        root.left=right;
        root.right=left;
        return root;
    }
    public static void main(String[] args) {
        TreeNode root = new TreeNode(3);
        root.left = new TreeNode(9);
        root.right = new TreeNode(20);
        root.right.left = new TreeNode(15);
        root.right.right = new TreeNode(7);

    }
}
