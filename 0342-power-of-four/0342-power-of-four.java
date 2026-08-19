class Solution {
    public boolean isPowerOfFour(int n) {
        int no=n;


        if(no<=0)
            return false;

        while(no%4==0)
        {

            no/=4;

        }

        if(no==1)
            return true;
        else
            return false;

    }
}