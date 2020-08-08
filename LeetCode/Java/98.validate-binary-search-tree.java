/*
 * @lc app=leetcode id=98 lang=java
 *
 * [98] Validate Binary Search Tree
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
    // public boolean isValidBST(TreeNode root) {
    //     return isValid(root, Long.MIN_VALUE, Long.MAX_VALUE);
    // }
    // public boolean isValid(TreeNode root, long min, long max) {
    //     if(root==null) {
    //         return true;
    //     }
    //     if(root.val<=min || root.val>=max) {
    //         return false;
    //     }
    //     return isValid(root.left, min, root.val) && 
    //             isValid(root.right, root.val, max);

    // }

    ///////////////////////////////////////////////////////////

    // 设置lowerbound和upperbound
    public boolean isValidBST(TreeNode root) {
        return helper(root, null, null);
    }

    public boolean helper(TreeNode root, Integer lower, Integer upper) {

        if (root == null) return true;

        int val = root.val;

        if (lower != null && val <= lower) return false;
        if (upper != null && val >= upper) return false;

        if (!helper(root.right, val, upper)) return false;
        if (!helper(root.left, lower, val)) return false;


        return true;

    }

}
// @lc code=end

