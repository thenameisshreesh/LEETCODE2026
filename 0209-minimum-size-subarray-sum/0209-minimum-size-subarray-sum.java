class Solution {
    public int minSubArrayLen(int target, int[] nums) {
        
        int l=0,r=0,sum=0;

        int resultLen=0,minlen=0;

       

        while(r<nums.length || sum>=target)
        {
            

            if(sum>=target)
            {
                
                if(minlen==0)
                    minlen=r-l;
                else{
                    if((r-l)<minlen)
                        minlen=r-l;
                }   

                sum-=nums[l];
                l++;

                

            }else
            {

                sum+=nums[r];
                r++;

                
            }
  
            

        }

        return minlen;



    }
}