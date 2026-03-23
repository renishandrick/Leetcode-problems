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
        ListNode sl=head,fs=head;
        while(fs!=null && fs.next!=null){
            sl=sl.next;
            fs=fs.next.next;
        }
        ListNode fh=head;
        ListNode sh=sl;
        ListNode cur=sh;
        ListNode prev=null;
        ListNode next=null;
        while(cur!=null){
            next=cur.next;
            cur.next=prev;
            prev=cur;
            cur=next;
        }
        sh=prev;
        while(sh!=null)
        {
            if(fh.val!=sh.val)
            return false;
            fh=fh.next;
            sh=sh.next;
        }
           return true;
    }
}