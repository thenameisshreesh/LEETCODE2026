class Solution {
    public int findLHS(int[] nums) {
        
        HashMap<Integer,Integer> fq=new HashMap<>();

        int feq=0,ans=0;

        for(int i=0;i<nums.length;i++)
        {

            fq.put(nums[i], fq.getOrDefault(nums[i], 0)+1);


        }

       
        
        for(int i=0;i<nums.length;i++)
        {

            if(fq.containsKey(nums[i]+1))
            {
               if(fq.get(nums[i]) + fq.get(nums[i]+1)>ans)
                ans=fq.get(nums[i]) + fq.get(nums[i]+1);
            }

        }

        
        return ans;


    }

    
}