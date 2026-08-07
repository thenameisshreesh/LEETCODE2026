class Solution {
      public int sumOfUnique(int[] nums) {
        
        HashMap<Integer,Integer> hs=new HashMap<>();

        int sum=0,feq=0;

        for(int i=0;i<nums.length;i++)
        {
            
            if(hs.containsKey(nums[i]))
            {
                hs.put(nums[i],hs.getOrDefault(nums[i],0)+1);

            }

            hs.put(nums[i],hs.getOrDefault(nums[i],0)+1);

        }

        for(int i=0;i<nums.length;i++)
        {
            
            feq=hs.get(nums[i]);
            if(!(feq>=2))
                sum+=nums[i];

        }

        return sum;

    }
}