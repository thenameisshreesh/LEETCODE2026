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
    public ListNode removeNthFromEnd(ListNode head, int n) {


        ListNode tail=head,tmp=head;
        ListNode prev;
        int c=0,i=1,c2=1;


       




        while (tmp.next!=null) {

            tmp=tmp.next;
            c++;
            c2++;
            
        }

        if(c2==n)
            return head=head.next;

        
        if(n==1 && c==0)
        {
            
            return head=null;
        }

        

        prev=tmp=head;

        c=c-n;
        c++;
        while(i<=c)
        {
            prev=tmp;
            tmp=tmp.next;
            i++;
        }

        prev.next=tmp.next;



        
        
        return head;

        
    }
}