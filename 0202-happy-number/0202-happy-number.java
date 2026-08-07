class Solution {
    public boolean isHappy(int n) {
        
        int len,no=n,squareSum=0,dig;

        HashSet<Integer> hs=new HashSet<>();

        while(true){


            if(no<=0)
            {
                
                if(squareSum==1)
                {

                    return true;
                }
                
                
                
                
                if(hs.add(squareSum)==false)
                    return false;

                no=squareSum;
                squareSum=0;
                continue;

            }

            dig=no%10;
            dig=dig*dig;
            squareSum+=dig;

            no/=10;

        }


    }
}