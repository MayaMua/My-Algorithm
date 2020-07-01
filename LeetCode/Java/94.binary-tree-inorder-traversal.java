import java.util.ArrayList;
import java.util.Stack;

import javax.swing.tree.TreeNode;

/*
 * @lc app=leetcode id=94 lang=java
 *
 * [94] Binary Tree Inorder Traversal
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

// def inorder(self, root): 
//     if root:
//         self.inorder(root.left)
//         self.traverse_path.append(root.val)
//         self.inorder(root.right)


class Solution {
    // 迭代法
    public List<Integer> inorderTraversal(TreeNode root) {
        List<Integer> ret = new ArrayList<>();
        if(root == null) {
            return ret;
        }

    
        // 栈
        Stack<TreeNode> stack = new Stack<>();        
        // 定义指针遍历
        TreeNode cur = root;
        // 指针不能和栈同时为空
        while(!stack.isEmpty() || cur!=null) {
            // 找到树的最左边的叶子
            while(cur != null) {
                stack.push(cur);
                cur = cur.left;
            }

            // 如果此时指针指向的是最左边的叶子，则先输出
            // 如果不是，则说明找到了之前经历过的中间的root的位置，同样将其输出
            // 并进一步把指针指向root的右子树
            TreeNode node = stack.pop();
            ret.add(node.val);
            cur = node.right;


        }

        return ret;
    }
}
// @lc code=end

