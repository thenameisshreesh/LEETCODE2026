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
        
        if(head==null)
            return head;

        if(head.val==val && head.next==null)
        {
            head=null;
        }else if(head.val==val)
            head=head.next;

        while (head!=null && head.val==val) {
            head=head.next;
            
        }

        ListNode cur=head,prev=head;

        while (cur!=null) {

            
            
            if(cur.val==val)
            {
                prev.next=cur.next;
                cur=cur.next;
            }
            else{
            
                prev=cur;
                cur=cur.next;
            }

            
        }

        return head;

    }

}