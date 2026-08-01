class Solution {
     public int[] sortedSquares(int[] nums) {

        int ans[]=new int[nums.length];

        int left=0,right=nums.length-1,index=nums.length-1;
        int max=0,j=nums.length-1;

        
        
        
        
        
        while(left<=right)
        {

            if(Math.abs((int)Math.pow(nums[left], 2)) > Math.abs((int)Math.pow(nums[right], 2)))
            {
                ans[index]=Math.abs((int)Math.pow(nums[left],2));
                left++;
                index--;
            }
            else
            {
                ans[index]=Math.abs((int)Math.pow(nums[right],2));
                right--;
                index--;

            }

        }
        return ans;
        
    }
}