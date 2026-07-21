class Solution {
    public int findNumbers(int[] nums) {
        
        String s="";
        
        int i=0,c=0;

        while(i<nums.length)
        {

            s=Integer.toString(nums[i]);

            if(s.length()%2==0)
                c++;

            i++;

        }

        return c;

    }
}