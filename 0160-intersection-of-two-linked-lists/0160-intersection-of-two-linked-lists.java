/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode(int x) {
 *         val = x;
 *         next = null;
 *     }
 * }
 */
public class Solution {
    
    
   public ListNode getIntersectionNode(ListNode headA, ListNode headB) {
        
        ListNode t1=headA,t2=headB;
        
        int l1=0,l2=0,diff=0;

        while(t1!=null)
        {
            t1=t1.next;
            l1++;
        }

        
        while(t2!=null)
        {
            t2=t2.next;
            l2++;
        }

        t1=headA;
        t2=headB;

        diff=(int)Math.abs(l1-l2);

        ListNode nd=l2>l1 ? headB :headA;
        ListNode nd2=null;

        if(nd==headA)
        {
            nd2=headB;
        }
        else
            nd2=headA;

        while (diff!=0) {
            nd=nd.next;
            diff--;
        }

        while (nd!=nd2) {
            
            nd=nd.next;
            nd2=nd2.next;
        }

        if(nd==null || nd2==null)
            return null;
        else
            return nd;

    }


}