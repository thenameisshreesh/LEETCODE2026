class Solution {
   public int numSubarrayProductLessThanK(int[] nums, int k) {
        
        long pro=1;
        int r=0,l=0,c=0,count=0;



        if(k==1 && nums.length==1 && nums[0]>1)
        {
            return 0;
        }

        while(r<nums.length)
        {
            
            pro*=nums[r];
            if(pro>=k)
            {

                while (pro>=k) {

                    pro/=nums[l];
                    l++;
                }

            }


            
            count+=(r-l)+1;
            r++;

        }

        


        return count;

    }

}