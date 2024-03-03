// LEETCODE PROBLEM - 19. Remove Nth Node From End of List

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
    public ListNode removeNthFromEnd(ListNode head, int n) {
        if(n==1 && head.next==null)
        return null;
        ListNode ptr=head,ctr=head,prev=head;
        int i=1;
        while(ptr.next!=null)
        {
            ptr=ptr.next;
            i++;
            if(i>n)
            {
                prev=ctr;
                ctr=ctr.next;
            }
        }
        if(ctr==head)
        {
            head=ctr.next;
        }
        else
        {
            prev.next=ctr.next;
        }
        return head;
    }
}