// LEETCODE PROBLEM - 86. Partition List

class Solution {
    public ListNode partition(ListNode head, int x) {
        ListNode first = new ListNode(0);
        ListNode second = new ListNode(0);

        ListNode Sp = first;
        ListNode Lp = second;

        while(head != null){
            if(head.val < x){
                Sp.next = new ListNode(head.val);
                Sp = Sp.next;
            }
            else{
                Lp.next = new ListNode(head.val);
                Lp = Lp.next;
            }
            head = head.next;
        }
        Sp.next = second.next;
        return first.next;
    }
}