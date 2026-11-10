class Solution {
    public int singleNonDuplicate(int[] nums) {

        
        int mid,l=0,r=nums.length-1;

        if(nums.length==1)
            return nums[0];

        while(l<=r)
        {

            mid=l+(r-l)/2;

            if(mid==0 && nums[0]!=nums[1])
                return nums[mid];

            if(mid==nums.length-1 && nums[nums.length-1]!=nums[nums.length-2])
                return nums[mid];

            if(nums[mid]!=nums[mid-1] && nums[mid]!=nums[mid+1])
            {
                return nums[mid];
            }

            if(mid%2==0)
            {

                if(nums[mid]==nums[mid-1])
                {
                    r=mid-1;
                }
                else
                    l=mid+1;

            }else
            {

                if(nums[mid]==nums[mid-1])
                    l=mid+1;
                else
                    r=mid-1;


            }
        }
        

        return 0;


    }
}