class Solution {
    
    public int maxScore(int[] cardPoints, int k) {

        int window=cardPoints.length-k,sum=0,minSum=0,cardSum=0;

        for(int i=0;i<cardPoints.length;i++)
        {

            cardSum+=cardPoints[i];


        }

        for(int i=0;i<window;i++)
        {

            sum+=cardPoints[i];


        }

        minSum=sum;

        for(int i=window;i<cardPoints.length;i++)
        {

            sum+=cardPoints[i];
            sum-=cardPoints[i-window];

            if(sum<minSum)
                minSum=sum;

        }

        return cardSum-minSum;

    }
}