class Solution {
    public int kConcatenationMaxSum(int[] arr, int k) {
        
        
        long max=0;
        long cur=0,sum=0;

        List<Integer> l=new ArrayList<>();

        for (int i:arr) {

            sum+=i;
            
        }

        if(k>=2)
        {
            for (int j : arr) {
                
                l.add(j);


            }

            for (int j : arr) {
                
                l.add(j);


            }



        for (int j : l) {
            
            cur+=j;

            max=Math.max(max, cur);

            if(cur<0)
                cur=0;

        }

        if(sum<0)
            return (int)(max % 1_000_000_007);

        return (int)((max + sum * (k - 2)) % 1_000_000_007);

        }
        else if(k==1 )
        {
            for (int j:arr) {
                
                cur+=j;

                max=Math.max(cur,max);

                if(cur<0)
                    cur=0;


            }

            return (int)(max % (Math.pow(10,9)+7));
        }


        return (int)(max % 1_000_000_007);
        
    }
}