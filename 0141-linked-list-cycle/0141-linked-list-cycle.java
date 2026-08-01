/**
 * Definition for singly-linked list.
 * class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode(int x) {
 *         val = x;
 *         next = null;
 *     }
 * }
 */
public class Solution {
    public boolean hasCycle(ListNode head) {

        ListNode tmp=head;
        HashSet<ListNode> hs=new HashSet<>();
        
        while (tmp!=null) {
            
            if(hs.add(tmp)==false)
                return true;
            
            tmp=tmp.next;
            
        }

        return false;

    }
}