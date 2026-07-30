class Solution {
    public boolean isPalin(String s,int left,int right){

        while (left<right) {

            if(s.charAt(right)!=s.charAt(left)){
               return false;
            }

            left++;
            right--;

        }
        return true;

    }

    public boolean validPalindrome(String s) {

        int left=0,right=s.length()-1;


        boolean b=isPalin(s, left, right);

        if(b==false){
            while(left<right)
            {

                if(s.charAt(left)==s.charAt(right))
                {
                    right--;
                    left++;

                }else
                {
                    return isPalin(s,left+1, right) || isPalin(s,left, right-1);

                }



            }
        }
        else
            return true;

        return false;
        
    }


}