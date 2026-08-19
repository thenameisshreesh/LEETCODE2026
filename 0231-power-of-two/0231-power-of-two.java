class Solution {
    public boolean isPowerOfTwo(int n) {
        
        int no=n;

        if(n==1 )
            return true;

        if(n==0)
            return false;

        while(no%2==0)
        {
            no/=2;

            
        }

        if(no==1)
              return true;
        else
            return false;

        
    }
}