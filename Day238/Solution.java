// LEETCODE PROBLEM - 1669. Merge In Between Linked Lists

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
    public ListNode mergeInBetween(ListNode list1, int a, int b, ListNode list2) {
        ListNode aNode=list1;
        int i=0;
        while(i!=a-1)
        {
            aNode=aNode.next;
            i++;
        }
        i=0;
        ListNode bNode=list1;
        while(i!=b+1)
        {
            bNode=bNode.next;
            i++;
        }
        aNode.next=list2;
        while(list2.next!=null)
        {
            list2=list2.next;
        }
        list2.next=bNode;
        return list1;
    }
}