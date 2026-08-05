class Solution {
    public int removeDuplicates(int[] nums) {

    int slow = 0, fast = 0;
        

    while (fast < nums.length) {

        if(slow>=2)
        {
                
            if(nums[fast]==nums[slow-2])
            {
                
                   
                fast++;
                continue;

            }

            

                

        }
        nums[slow]=nums[fast];
        slow++;
        fast++;
        

           

    }

        

    return slow;

}
}