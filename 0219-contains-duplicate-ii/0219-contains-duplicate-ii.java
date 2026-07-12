class Solution {
    public boolean containsNearbyDuplicate(int[] nums, int k) {

        HashMap<Integer,Integer>m =new HashMap<>();
        int prevI=0,index=0;

        for(int i=0;i<nums.length;i++)
        {
            
            index=0;
            if(m.containsKey(nums[i]))
            {
                index=m.get(nums[i]);
                

                if(i-index<=k)
                    return true;
            }
            m.put(nums[i],i);

        }

        return false;


    }
}