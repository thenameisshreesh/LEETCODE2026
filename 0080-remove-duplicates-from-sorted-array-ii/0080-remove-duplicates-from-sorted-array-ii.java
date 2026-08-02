class Solution {
    public int removeDuplicates(int[] nums) {
        if (nums.length <= 2) {
            return nums.length;
        }
        
        int k = 2; // Start writing from index 2
        for (int i = 2; i < nums.length; i++) {
            // Check if the current element is different from nums[k-2]
            if (nums[i] != nums[k - 2]) {
                nums[k] = nums[i];
                k++;
            }
        }
        return k;
    }
}
