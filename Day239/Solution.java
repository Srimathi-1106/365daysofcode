// LEETCODE PROBLEM - 206. Reverse Linked List

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
        if(head==null)
        return head;
        ListNode prev=new ListNode(head.val);
        while(head.next!=null)
        {
            head=head.next;
            ListNode current=new ListNode(head.val);
            current.next=prev;
            prev=current;
        }
        return prev;
    }
}