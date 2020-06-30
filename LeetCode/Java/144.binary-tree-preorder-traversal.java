/*
 * @lc app=leetcode id=144 lang=java
 *
 * [144] Binary Tree Preorder Traversal
 */

// @lc code=start
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
    public List<Integer> preorderTraversal(TreeNode root) {
        List<Integer> res = new ArrayList();
        if(root == null) {
            return res;

        }

        res.add(root.val);
        preorder(root.left, res);
        preorder(root.right, res);
        return res;
    }

    public void preorder(TreeNode root, List<Integer>res) {
        if(root==null)
            return;

        res.add(root.val);
        preorder(root.left, res);
        preorder(root.right, res);
    }
}



// %10
// @lc code=end

