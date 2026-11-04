class Solution {
     public int maxSubArray(int[] nums) {

        int curS=0,max=Integer.MIN_VALUE;

        for(int i=0;i<nums.length;i++)
        {

            curS+=nums[i];
            max=Math.max(max, curS);
            
            if(curS<0)
                curS=0;

           

           
        }

        return max==Integer.MIN_VALUE?0:max;


    }
}