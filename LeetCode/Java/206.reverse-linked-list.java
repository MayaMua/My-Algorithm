import java.util.List;

import javax.management.ListenerNotFoundException;

/*
 * @lc app=leetcode id=206 lang=java
 *
 * [206] Reverse Linked List
 */

// @lc code=start
/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode() {}
 *     ListNode(int val) { this.val = val; }
 *     ListNode(int val, ListNode next) { this.val = val; this.next = next; }
 * }
 */
class Solution {
    public ListNode reverseList(ListNode head) {
        // ListNode prev = null; 
        // ListNode current = head; 
        // ListNode next = null; 
        // while (current != null) { 
        //     next = current.next; 
        //     current.next = prev; 
        //     prev = current; 
        //     current = next; 
        // } 
        // head = prev; 
        // return head; 

        ListNode pre = null;
        ListNode cur = head;
        ListNode next = null;
        ListNode tmp = null;
        while (cur != null) {
            tmp = cur.next;
            cur.next = pre;
            pre = cur;
            cur = tmp;
        }
        return pre;

    }
}
// @lc code=end

