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
    ListNode hareAndTortoise(ListNode head){
        ListNode slow= head;
        ListNode fast=head.next;
        while(fast!=null && fast.next!=null){
            slow=slow.next;
            fast=fast.next.next;
        }
        return slow;
    }
    public ListNode sortList(ListNode head) {
        if(head==null || head.next==null) return head;
        ListNode middle= hareAndTortoise(head);
        ListNode firsthalf=head;
        ListNode secondhalf=middle.next;
        middle.next=null;
        ListNode left=sortList(firsthalf);
        ListNode right=sortList(secondhalf);
        return merge(left,right);
    }
    public ListNode merge(ListNode first,ListNode second){
        
        ListNode dummy = new ListNode(-1);
        ListNode temp= dummy;
        while(first!=null && second!=null){
            if(first.val<second.val){
                dummy.next=first;
                first=first.next;
            }
            else {
                dummy.next=second;
                second=second.next;
            }
            dummy=dummy.next;
        }
        if(first!=null) dummy.next=first;
        if(second!=null) dummy.next=second;
        return temp.next;
    }
}