class Solution {
    public boolean isPerfectSquare(int num) {
        
       

        
       
        int l=1,r=num;
        int mid=l+(r-l)/2;

        while (l<=r) {
            
            mid=l+(r-l)/2;

            if((long)mid*mid==num)
                return true;
            else if(num>(long)mid*mid)
                l=mid+1;
            else
                r=mid-1;

        }

        return false;



    }

}