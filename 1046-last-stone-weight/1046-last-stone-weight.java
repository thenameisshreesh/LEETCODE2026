class Solution {
    public int lastStoneWeight(int[] stones) {
    
        
        PriorityQueue<Integer> p=new PriorityQueue<>(Collections.reverseOrder());


        for (int i:stones) {
               
            p.add(i);

        }

        int l=0,sl=0;

        while(p.size()>1)
        {

            

            l=p.poll();
            sl=p.peek();

            if(l==sl)
                p.poll();
            else
                p.poll();

            if(l!=sl){
                sl=l-sl;
                p.add(sl);
            }


        }

       if(p.size()==1)
        return p.peek();
       else
        return 0;


    }
}