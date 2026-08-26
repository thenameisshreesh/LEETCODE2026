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
        
        ListNode cur=head,tmp=head;

        ArrayList<Integer> s=new ArrayList<>();
        ArrayList<Integer> r=new ArrayList<>();


        while(tmp!=null)
        {

            s.add(tmp.val);
            tmp=tmp.next;

        }

        for (int i=s.size()-1;i>=0;i--) {

            r.add(s.get(i));

        }

        for(int i=0;i<s.size();i++)
        {
            if(s.get(i)==r.get(i))
            {
                continue;
            }
            else
                return false;
        }

        return true;

    }
}