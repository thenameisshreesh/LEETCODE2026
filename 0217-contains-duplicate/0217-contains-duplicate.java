class Solution {
    public boolean containsDuplicate(int[] nums) {
        
        HashSet<Integer> s=new HashSet<>(0);

        for(int i=0;i<nums.length;i++)
        {
            if(s.contains(nums[i]))
                return true;

            s.add(nums[i]);

        }

        return false;

    }
}