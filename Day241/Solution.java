// LEETCODE PROBLEM - 143. Reorder List

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
    public void reorderList(ListNode temp) {
        ListNode head=temp;
        int n=0;
        while(temp!=null)
        {
            n++;
            temp=temp.next;
        }
        temp=head;
        int arr[]=new int[n];
        int index=0;
        while(temp!=null)
        {
            arr[index++]=temp.val;
            temp=temp.next;
        }
        temp=head;
        boolean flag=true;
        int i=1,j=n-1;
        while(i<=j)
        {
            ListNode t;
            if(flag)
            {
                t=new ListNode(arr[j--]);
                flag=false;
            }
            else
            {
                t=new ListNode(arr[i++]);
                flag=true;
            }
            head.next=t;
            head=head.next;
        }
    }
}