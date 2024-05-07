// LEETCODE PROBLEM - 2816. Double a Number Represented as a Linked List

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
    public ListNode doubleIt(ListNode head) {
        int carry=rec(head);
        if(carry==1)
        {
            ListNode node=new ListNode(1);
            node.next=head;
            head=node;
        }
        return head;
    }
    public int rec(ListNode head)
    {
        if(head==null)
        return 0;
        int sum= rec(head.next) + head.val*2;
        head.val=sum%10;
        if(sum>9)
        return 1;
        else
        return 0;
    }
}