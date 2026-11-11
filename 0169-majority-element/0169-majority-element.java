class Solution {
   public int majorityElement(int[] nums) {

        int ans=0,feq=0;

        for(int i=0;i<nums.length;i++)
        {

            if(feq==0)
                ans=nums[i];

            if(ans==nums[i])
                feq++;
            else
                feq--;
            


        }

        return ans;

    }
}