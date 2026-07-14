// Last updated: 14/07/2026, 14:16:28
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
    public ListNode removeElements(ListNode head, int val) {
        ListNode ret=new ListNode(0,head);
        ListNode current=ret;
        while(current!=null){
            while(current.next!=null&&current.next.val==val){
                current.next=current.next.next;
            }
            current=current.next;
        }
        return ret.next;
    }
}