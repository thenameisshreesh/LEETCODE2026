class Solution {
    public int[] searchRange(int[] nums, int target) {
        
        int ri=-1,li=-1;  

        int mid=0,l=0,r=nums.length-1;

        while (l<=r) {

            mid=l+(r-l)/2;

            if(nums[mid]==target)
            {
                li = mid;
                r = mid - 1;

            }else if(target > nums[mid])
                l=mid+1;
            else
                r=mid-1;

        }

        l = 0;
        r = nums.length - 1;

        while (l<=r) {

            mid=l+(r-l)/2;

            if(nums[mid]==target)
            {
                ri = mid;
                l = mid + 1;

            }else if(target > nums[mid])
                l=mid+1;
            else
                r=mid-1;

        }

        return new int[]{li,ri};

    }

}