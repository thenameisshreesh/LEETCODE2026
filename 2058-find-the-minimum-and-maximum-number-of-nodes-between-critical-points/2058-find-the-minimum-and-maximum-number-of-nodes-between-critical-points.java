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
    public int[] nodesBetweenCriticalPoints(ListNode head) {
        
        



        ListNode cur=head,prev=head;
        int c=0;

        while (cur!=null) {
            cur=cur.next;
            c++;
        }
        
        if(c<=2)
            return new int[]{-1,-1};


        cur=head.next;

        int ci=2,li=1,d=0,fi=0,mind=Integer.MAX_VALUE,maxd=-1;
        boolean f=true,f2=false;

        while (cur.next!=null) {

            if(cur.val> prev.val && cur.val> cur.next.val)
            {
                
                if(f2)
                {
                    d=(int)Math.abs(ci-li);
                    mind=Math.min(d, mind);

                }

                if(f)
                {
                    f=false;
                    fi=ci;
                }

                li=ci;
                f2=true;
                
            }
            else if(cur.val< prev.val && cur.val< cur.next.val)
            {
                if(f2)
                {
                    d=(int)Math.abs(ci-li);
                    mind=Math.min(d, mind);

                }

                if(f)
                {
                    f=false;
                    fi=ci;
                }

                li=ci;
                f2=true;
                
            }

            prev=cur;
            cur=cur.next;

            
            ci++;
              
        }


        if (mind == Integer.MAX_VALUE)
            return new int[]{-1, -1};

        maxd=(int)Math.abs(li-fi);
             
        return new int[]{mind,maxd};

    }
}