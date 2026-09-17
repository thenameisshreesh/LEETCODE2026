class Solution {
   public int[] fairCandySwap(int[] aliceSizes, int[] bobSizes) {
        

        HashSet<Integer> hs=new HashSet<>();

        for (int i:bobSizes) {
            hs.add(i);
        }

        int sum=0,sum2=0;

        for (int i:aliceSizes) {
            
            sum+=i;                

        }

        
        for (int i:bobSizes) {
            
            sum2+=i;                

        }

        int res=(sum-sum2)/2;

        for(int i=0;i<aliceSizes.length;i++)
        {

            if(hs.contains(aliceSizes[i]-res))
                return new int[]{aliceSizes[i],aliceSizes[i]-res};

        }

        return new int[]{};


    }
}