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
    public ListNode deleteDuplicates(ListNode head) {

        
        
        if(head==null)
            return null;
        ListNode s=head,f=head.next;
        
        while(f!=null)
        {
            if(s.val==f.val){
                f=f.next;
            }
            else
            {
                
                s=s.next;
                s.val=f.val;

            }


        }

        s.next=null;

        return head;

        
    }

}