/**
 * Definition for a binary tree node.
 * public class TreeNode {
 *     int val;
 *     TreeNode left;
 *     TreeNode right;
 *     TreeNode() {}
 *     TreeNode(int val) { this.val = val; }
 *     TreeNode(int val, TreeNode left, TreeNode right) {
 *         this.val = val;
 *         this.left = left;
 *         this.right = right;
 *     }
 * }
 */
class Solution {
    public boolean isSubtree(TreeNode root, TreeNode subRoot) {
        TreeNode findnode= find(root,subRoot.val);
        return compare(findnode,subRoot);
    }
    TreeNode find(TreeNode root,int val){
        if(root.val==val) return root;
        find(root.left);
        find(root.right);
    }
    boolean compare(TreeNode root1, TreeNode root2){
        if((root1==null && root2!=null) || 
           (root2==null && root1!=null)) return true;
        
        if(root1.val!=root2.val) return false;
        compare(root1.left,root2.left);
        compare(root1.right,root2.right);
    }
}