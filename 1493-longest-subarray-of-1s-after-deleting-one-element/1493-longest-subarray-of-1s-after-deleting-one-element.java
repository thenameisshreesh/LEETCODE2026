class Solution {
    public int longestSubarray(int[] nums) {
        
        int r=0,l=0,zeroCount=0,longest=0;

        while(r<nums.length)
        {

            if(nums[r]==0)
                zeroCount++;

            if(zeroCount>1)
            {
                while(zeroCount>1)
                {
                    if(nums[l]==0)
                        zeroCount--;

                    l++;

                }

            }

            if(longest<((r-l)+1)-1)
                longest=((r-l)+1)-1;

            r++;
            
        }

        return longest;


    }
}