class Solution {
    public int maxProfit(int[] prices) {

        int buy=prices[0],max=Integer.MIN_VALUE;

        for(int i=1;i<prices.length;i++)
        {

            buy=Math.min(buy,prices[i]);

            if(prices[i]>buy)
            {
                max=Math.max(max, Math.abs(prices[i]-buy));

            }

        }

        return max==Integer.MIN_VALUE?0:max;


    }
}