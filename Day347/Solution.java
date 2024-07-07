// LEETCODE PROBLEM - 83. Remove Duplicates from Sorted List

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
    public ListNode deleteDuplicates(ListNode head) {
        ListNode prev=head;
        ListNode ptr;
        if(head!=null && head.next!=null)
        ptr=head.next;
        else
        return head;
        while(ptr!=null)
        {
            if(ptr.val==prev.val)
            {
                prev.next=ptr.next;
                ptr=ptr.next;
            }
            else
            {
                prev=ptr;
                ptr=ptr.next;
            }
        }
        return head;
    }
}