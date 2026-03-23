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
    public ListNode rotateRight(ListNode head, int k) {
        if (head == null || head.next == null) return head;
        int l=0;
        ListNode temp = head;
        while (temp != null) {
            l++;
            temp = temp.next;
        }
        k=k%l;
        for(int i=0;i<k;i++){
        ListNode prev=null;
        ListNode cur=head;
        while(cur.next!=null){
            prev=cur;
            cur=cur.next;
        }
        prev.next=null;
        cur.next=head;
        head=cur;
        }
        return head;
    }
}