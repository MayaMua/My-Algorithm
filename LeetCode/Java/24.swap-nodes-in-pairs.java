import sun.net.TelnetInputStream;

/*
 * @lc app=leetcode id=24 lang=java
 *
 * [24] Swap Nodes in Pairs
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
    // public ListNode swapPairs(ListNode head) {
    //     ListNode cur = head;
    //     ListNode following = null;
    //     ListNode tmp = null;
        
    //     while(cur != null && cur.next != null) {

    //       int k = cur.val;
    //       cur.val = cur.next.val;
    //       cur.next.val = k;
    //       cur = cur.next.next;
    //     }
    //     return head;
    // }

     public ListNode swapPairs(ListNode head) {
        if(head == null) return null;
        ListNode dummy = new ListNode(0);
        ListNode cur = dummy;
        ListNode first = head;
        ListNode second = head.next;
        dummy.next = first; //防止[1]这种case
        
        while(second != null){
            ListNode temp = second.next;
            cur.next = second;
            second.next = first;
            
            cur = first;
            first.next = temp;
            first = first.next;
            second = first == null ? null : first.next;  
        }
        
        return dummy.next;
    }
}
// @lc code=end

