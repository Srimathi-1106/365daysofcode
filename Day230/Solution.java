// LEETCODE PROBLEM - 1171. Remove Zero Sum Consecutive Nodes from Linked List

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
    public ListNode removeZeroSumSublists(ListNode head) {
        Map<Integer,ListNode> currentSum=new HashMap<>();
        ListNode dummy=new ListNode(0);
        dummy.next=head;
        int sum=0;
        for(ListNode current=dummy;current!=null;current=current.next)
        {
            sum+=current.val;
            currentSum.put(sum,current);
        }
        sum=0;
        for(ListNode current=dummy;current!=null;current=current.next)
        {
            sum+=current.val;
            current.next=currentSum.get(sum).next;
        }
        return dummy.next;
    }
}
