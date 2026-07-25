class Solution {
    public int longestOnes(int[] nums, int k) {

        int l=0,r=l,zeroCount=0,maxOnes=0,c=0,max=0,feq=0;
        HashMap<Integer,Integer> hs=new HashMap<>();
        int sum=0,ele=0;

        while(r<nums.length)
        {
            
            ele=nums[r];

            if(ele==0)
                zeroCount++;
            

            if(zeroCount>k)
            {
                while (zeroCount>k) {

                    if(nums[l]==0)
                        zeroCount--;

                    

                    l++;

                    
                }

            }
            
            if((r-l)+1>max)
                max=(r-l)+1;
            
            r++;

        }


        return max;
        
    }
}