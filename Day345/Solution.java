// LEETCODE PROBLEM - 2058. Find the Minimum and Maximum Number of Nodes Between Critical Points

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
    public int[] nodesBetweenCriticalPoints(ListNode head) {
        ListNode prev=head;
        ListNode curr=head.next;
        ListNode next=curr.next;
        int currDist=1,prevDist=-1,firstDist=-1,min=Integer.MAX_VALUE,max=-1;
        while(next!=null)
        {
            if((curr.val<prev.val && curr.val<next.val) || (curr.val>prev.val && curr.val>next.val))
            {
                if(prevDist!=-1)
                {
                    if(min>currDist-prevDist)
                    {
                        min=currDist-prevDist;
                    }
                    prevDist=currDist;
                    max=currDist-firstDist;
                }
                else
                {
                    prevDist=currDist;
                    firstDist=currDist;
                }

            }
            currDist++;
            prev=curr;
            curr=next;
            next=next.next;
        }
        if(prevDist==-1 || max==-1)
        {
            return new int[]{-1,-1};
        }
        return new int[]{min,max};
    }
}