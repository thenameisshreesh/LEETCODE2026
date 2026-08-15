class Solution {
    public int longestSubsequence(int[] nums) {
        
        int total=0;

        
        for (int i : nums) {
            
            total^=i;

        }

        if(total!=0)
        {
            return nums.length;

        }
        else
        {
            int cnt=1;
            for (int i : nums) {
                if(i!=0){
                        return nums.length-1;
                }
            }
        }

    return 0;

    }
    
}