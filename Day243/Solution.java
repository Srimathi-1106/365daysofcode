// LEETCODE PROBLEM - 21. Merge Two Sorted Lists

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
    public ListNode mergeTwoLists(ListNode list1, ListNode list2) {
        ListNode mergedList;
        if(list1==null && list2==null)
        return null;
        if(list1==null)
        {
            mergedList=list2;
            list2=list2.next;
        }
        else if(list2==null)
        {
            mergedList=list1;
            list1=list1.next;
        }
        else
        {
            mergedList=list1.val<list2.val?list1:list2;
            if(list1.val<list2.val)
            list1=list1.next;
            else
            list2=list2.next;
        }
        ListNode mergedListHead=mergedList;
        while(list1!=null && list2!=null)
        {
            if(list1.val<list2.val)
            {
                ListNode temp=new ListNode(list1.val);
                mergedList.next=temp;
                mergedList=mergedList.next;
                list1=list1.next;
            }
            else
            {
                ListNode temp=new ListNode(list2.val);
                mergedList.next=temp;
                mergedList=mergedList.next;
                list2=list2.next;
            }
        }
        while(list1!=null)
        {
            ListNode temp=new ListNode(list1.val);
            mergedList.next=temp;
            mergedList=mergedList.next;
            list1=list1.next;
        }
        while(list2!=null)
        {
            ListNode temp=new ListNode(list2.val);
            mergedList.next=temp;
            mergedList=mergedList.next;
            list2=list2.next;
        }
        return mergedListHead;
    }
}