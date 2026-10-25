class Solution {
    public long maximumSubarraySum(int[] nums, int k) {

        long maxSum = Long.MIN_VALUE;
        long sum = 0;

        HashMap<Integer, Long> hs = new HashMap<>();

        for (int i = 0; i < nums.length; i++) {

            if (hs.containsKey(nums[i] - k)) {
                maxSum = Math.max(maxSum,
                        sum + nums[i] - hs.get(nums[i] - k));
            }

            if (hs.containsKey(nums[i] + k)) {
                maxSum = Math.max(maxSum,
                        sum + nums[i] - hs.get(nums[i] + k));
            }

            hs.put(nums[i], Math.min(
                    hs.getOrDefault(nums[i], Long.MAX_VALUE), sum));

            sum += nums[i];
        }

        return maxSum == Long.MIN_VALUE ? 0 : maxSum;
    }
}