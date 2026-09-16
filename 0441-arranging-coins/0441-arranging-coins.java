class Solution {
    public int arrangeCoins(int n) {

        if(n==1)
            return n;

        int mid=0;
        int l=0,r=n-1;
        long k=n/2;


        while (l<=r) {
            
            mid=l+(r-l)/2;

            k=(long)mid*(mid+1)/2;

            if(k>n)
                r=mid-1;
            else
                l=mid+1;


        }
        return r;


    }
}