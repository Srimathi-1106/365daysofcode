// LEETCODE PROBLEM - 2. Add Two Numbers

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
    public ListNode addTwoNumbers(ListNode l1, ListNode l2) {
        int carry=0;
        ListNode ans=new ListNode(0);
        ListNode head=ans;
        while(l1!=null && l2!=null)
        {
            ListNode node=new ListNode((l1.val+l2.val+carry)%10);
            ans.next=node;
            ans=ans.next;
            if(l1.val+l2.val+carry>9)
            carry=1;
            else
            carry=0;
            l1=l1.next;
            l2=l2.next;
        }
        while(l1!=null)
        {
            ListNode node=new ListNode((l1.val+carry)%10);
            ans.next=node;
            ans=ans.next;
            if(l1.val+carry>9)
            carry=1;
            else
            carry=0;
            l1=l1.next;
        }
        while(l2!=null)
        {
            ListNode node=new ListNode((l2.val+carry)%10);
            ans.next=node;
            ans=ans.next;
            if(l2.val+carry>9)
            carry=1;
            else
            carry=0;
            l2=l2.next;
        }
        if(carry==1)
        {
            ans.next=new ListNode(1);
        }
        return head.next;
    }
}