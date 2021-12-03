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

//Swap the left and right node
//Recursively call for right and left nodes
class Solution {
    
    public TreeNode invertTree(TreeNode root) {
        if(root==null){
            return null;
        }
        
        TreeNode temp = root.right;
        root.right = root.left;
        root.left = temp;
        
        invertTree(root.right);
        invertTree(root.left);
        return root;
    }
}
