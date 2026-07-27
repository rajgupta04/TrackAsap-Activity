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
    public void flatten(TreeNode root) {
        TreeNode temp= new TreeNode(0,null,null);
        TreeNode temp2=temp;
        root=temp2.next;
    }
    void dfs(TreeNode root){
        if(root==null) return;
        temp.next=root;
        temp=temp.next;
        dfs(root.left);
        dfs(root.right);
    }
}