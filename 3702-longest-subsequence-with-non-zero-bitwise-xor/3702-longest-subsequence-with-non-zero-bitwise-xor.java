class Solution {
    public int longestSubsequence(int[] nums) {
        
        int total=0;
        boolean flg=false;

        
        for (int i : nums) {
            
            total^=i;
            if(i!=0)
                flg=true;


        }

        if(total!=0)
        {
            return nums.length;

        }
        else
        {
            if(flg)
                return nums.length-1;
        }

    return 0;

    }
    
}