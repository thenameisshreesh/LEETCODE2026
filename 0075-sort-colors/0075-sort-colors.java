class Solution {
    public void sortColors(int[] nums) {
        
        
        int l=0,m=0,h=nums.length-1;


        int s=0;

        while(m<=h)
        {


            if(nums[m]==0)
            {
                s=nums[m];
                nums[m]=nums[l];
                nums[l]=s;

                l++;
                m++;
            }else if(nums[m]==1)
                m++;
            else
            {
                
                s=nums[m];
                nums[m]=nums[h];
                nums[h]=s;

                h--;

            }


        }


    }
}