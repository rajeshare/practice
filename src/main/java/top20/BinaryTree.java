package top20;

import java.util.LinkedList;
import java.util.Queue;

public class BinaryTree {
    public static void main(String[] args) {
    }

    //TC  O(N) SC (N)
    public static  int treeSize(TreeNode root){
        if(root == null) return  0;
        int lsize=treeSize(root.left);
        int rsize=treeSize(root.right);
        return lsize+rsize+1;
    }


    public  static  int treeSize1(TreeNode root) {
        Queue<TreeNode> q = new LinkedList();
        q.add(root);
        int size = 0;
        while (!q.isEmpty()){
            root = q.remove();
        ++size;
        if (root.left != null) q.add(root.left);
        if (root.right != null) q.add(root.right);
        }
        return  size;
    }



    public  static  int longestLeafPath2(TreeNode root) {
        int ld=longestLeafPath2(root.left);
        int rd=longestLeafPath2((root.left));
        return  Math.max(ld,rd)+1;
    }

    public  static  int longestLeafPath3(TreeNode root) {
        Integer depth=0;
        Queue<TreeNode> q = new LinkedList();
        q.add(root);
        q.add(null);
        int nlevels = 0;
        while (!q.isEmpty()){
            root = q.remove();
            if(root == null){
                ++nlevels;
                if(!q.isEmpty()){
                    q.add(null);
                }
            }else {
                if (root.left != null) q.add(root.left);
                if (root.right != null) q.add(root.right);
            }
        }
        return  nlevels;
    }

    //recursole like above
    public  static boolean treeSearch(){


        return  true;
    }

    //lvel order traverse
    public  static boolean treeSearch1(TreeNode root,int x){
        Queue<TreeNode> q = new LinkedList();
        q.add(root);
        while (!q.isEmpty()){
            root = q.remove();
            if(root.data == x){
                return true;
            }
            if (root.left != null) q.add(root.left);
            if (root.right != null) q.add(root.right);
        }
        return  false;
    }



}
