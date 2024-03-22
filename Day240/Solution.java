// LEETCODE PROBLEM - 234. Palindrome Linked List

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
    public boolean isPalindrome(ListNode head) {
        ListNode temp=head;
        int n=0;
        while(temp!=null)
        {
            temp=temp.next;
            n++;
        }
        int arr[]=new int[n];
        int i=0;
        while(head!=null)
        {
            arr[i++]=head.val;
            head=head.next;
        }
        i=0;
        int j=n-1;
        while(i<j)
        {
            if(arr[i]!=arr[j])
            return false;
            i++;
            j--;
        }
        return true;
    }
}
