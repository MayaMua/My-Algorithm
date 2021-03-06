/*
 * @lc app=leetcode id=141 lang=java
 *
 * [141] Linked List Cycle
 */

// @lc code=start
/**
 * Definition for singly-linked list.
 * class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode(int x) {
 *         val = x;
 *         next = null;
 *     }
 * }
 */
public class Solution {
    // public boolean hasCycle(ListNode head) {
    //     if (head == null || head.next == null) {
    //         return false;
    //     }
    //     ListNode slow = head;
    //     ListNode fast = head.next;
    //     while (slow != fast) {
    //         if (fast == null || fast.next == null) {
    //             return false;
    //         }
    //         slow = slow.next;
    //         fast = fast.next.next;    
    //     }

    //     return true;
    // }


    public boolean hasCycle(ListNode head) {
        Set<ListNode> set = new LinkedHashSet<>();
        while (head != null) {
            if (set.contains(head)) {
                return true;
            }
            set.add(head);
            head = head.next;
        }
        return false;

    }

    
}
// @lc code=end

