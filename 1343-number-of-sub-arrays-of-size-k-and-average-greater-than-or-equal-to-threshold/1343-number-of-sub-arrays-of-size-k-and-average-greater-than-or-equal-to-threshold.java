class Solution {
    public int numOfSubarrays(int[] arr, int k, int threshold) {
        

        int sum=0,tc=0;

        for(int i=0;i<k;i++)
        {
            sum+=arr[i];
        }

        if((sum/k)>=threshold)
            tc++;


        for(int i=k;i<arr.length;i++)
        {
            sum+=arr[i];
            sum-=arr[i-k];

            if((sum/k)>=threshold)
                tc++;


        }

        return tc;

    
    }
}