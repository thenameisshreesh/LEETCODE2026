class Solution {
   public long maximumSubarraySum(int[] nums, int k) {
     
        long sum=0,max=0;
        HashMap<Integer,Integer> hs=new HashMap<>();
        boolean flg=false;

        for(int i=0;i<k;i++)
        {
            

            if(hs.containsKey(nums[i]))
            {
                hs.put(nums[i], hs.getOrDefault(nums[i],0)+1);   
                sum+=nums[i];
            }else
            {
                hs.put(nums[i], hs.getOrDefault(nums[i],0)+1);  
                sum+=nums[i];

            }
            
        }
 
        if(hs.size()==k)
        {
            max=sum;
        }

        for(int i=k;i<nums.length;i++)
        {
            

            
            hs.put(nums[i], hs.getOrDefault(nums[i], 0)+1);

            if(hs.containsKey(nums[i-k]))
            {
                if(hs.get(nums[i-k])>1)
                    hs.put(nums[i-k],hs.getOrDefault(nums[i-k], 0)-1);
                else
                    hs.remove(nums[i-k]);
                        
            }


                if(hs.size()==k)
                    flg=true;
                else
                    flg=false;
                    
                sum+=nums[i];
                sum-=nums[i-k];
                if(sum>max && flg==true)
                    max=sum;
            
                
            
            

            
        }

        return max;

    }
}