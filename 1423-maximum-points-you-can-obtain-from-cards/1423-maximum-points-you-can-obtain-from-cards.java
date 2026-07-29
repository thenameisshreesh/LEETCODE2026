class Solution {
    public int maxScore(int[] cardPoints, int k) {
        int n = cardPoints.length;
        int lsum = 0, rsum = 0, maxSum = 0;

        // Calculate sum of first k cards from the left
        for (int i = 0; i < k; i++) {
            lsum += cardPoints[i];
        }

        maxSum = lsum;

        // Slide the window: remove a card from the left sum and add one from the right sum
        for (int i = 0; i < k; i++) {
            lsum -= cardPoints[k - 1 - i];
            rsum += cardPoints[n - 1 - i];
            maxSum = Math.max(maxSum, lsum + rsum);
        }

        return maxSum;
    }
}