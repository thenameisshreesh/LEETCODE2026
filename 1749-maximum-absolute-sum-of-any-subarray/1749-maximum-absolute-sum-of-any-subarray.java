class Solution {
   public int maxAbsoluteSum(int[] nums) {
        
        int curMin=nums[0];
        int curMax=nums[0];
        int maxSum=nums[0];
        int minSum=nums[0];

        


        for(int i=1;i<nums.length;i++)
        {

            curMax=Math.max(nums[i],curMax+nums[i]);

            curMin=Math.min(nums[i],curMin+nums[i]);

            maxSum=Math.max(curMax,maxSum);

            minSum=Math.min(curMin,minSum);

            Math.max(maxSum,(int)Math.abs(minSum));

        }

        return Math.max(maxSum,(int)Math.abs(minSum));


    }
}