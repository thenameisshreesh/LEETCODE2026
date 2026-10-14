/*
// Definition for a Node.
class Node {
    int val;
    Node next;
    Node random;

    public Node(int val) {
        this.val = val;
        this.next = null;
        this.random = null;
    }
}
*/

class Solution {
    public Node copyRandomList(Node head) {
        

        Node t=head;

        Node res=null,tmp;
        Node ch;

        Node head2=res;
        
        HashMap<Node,Node> hs=new HashMap<>();
       


        while (t!=null) {
            
            hs.put(t,new Node(t.val));

            t=t.next;

        }

    
        t=head;

        while (t!=null) {
            
            

            if(res==null)
            {
                res=hs.get(t);
                head2=res;
                

                res.random=hs.get(t.random);

            }


            res.next=hs.get(t.next);

            res.random=hs.get(t.random);
            
            res=res.next;
            

            t=t.next;
            
        }

        return head2;

    }
}