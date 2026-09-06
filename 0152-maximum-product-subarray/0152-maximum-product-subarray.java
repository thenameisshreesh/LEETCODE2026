class Solution {
    public int maxProduct(int[] nums) {
        
        int max=nums[0];
        int cur=nums[0];
        int minCur=nums[0];
        int oldCur=nums[0];

        for(int i=1;i<nums.length;i++)
        {
            oldCur=cur;
            
            cur=Math.max(nums[i],Math.max(nums[i]*cur,nums[i]*minCur));

            minCur=Math.min(nums[i],Math.min(nums[i]*minCur,nums[i]*oldCur));

            max=Math.max(max,cur);

        }

        return max;

    }
}