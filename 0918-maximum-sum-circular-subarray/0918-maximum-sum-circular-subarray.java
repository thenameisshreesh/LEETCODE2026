class Solution {
    public int maxSubarraySumCircular(int[] nums) {
        
        int cur=nums[0];
        int max=nums[0],min=nums[0],cm=nums[0],tot=nums[0];

        for(int i=1;i<nums.length;i++)
        {
            cur=Math.max(nums[i],nums[i]+cur);

            max=Math.max(cur,max);

            cm=Math.min(nums[i],nums[i]+cm);

            min=Math.min(cm,min);

            tot+=nums[i];

        }

        if(max<0)
            return max;

        int crSum=tot-min;

        return Math.max(max,crSum);


    }
}