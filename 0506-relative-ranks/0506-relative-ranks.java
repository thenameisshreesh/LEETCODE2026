class Solution {
   public String[] findRelativeRanks(int[] score) {
        
        PriorityQueue<Integer> p=new PriorityQueue<>((a,b)->score[b]-score[a]);

        String ans[]=new String[score.length];

        for(int i=0;i<score.length;i++)
        {

            p.add(i);

        }


        int idx=0;

        for (int i=0;i<score.length;i++) {

            idx=p.poll();


            if(i==0)
                ans[idx]="Gold Medal";
            else if(i==1)
                ans[idx]="Silver Medal";
            else if(i==2)
                ans[idx]="Bronze Medal";
            else
                ans[idx]=String.valueOf(i+1);

    
        }

        return ans;

    }
}