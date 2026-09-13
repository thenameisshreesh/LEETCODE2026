class Solution {
    public char nextGreatestLetter(char[] letters, char target) {
        
       



        int l=0,r=letters.length-1,mid=l+(r-l)/2;

        while (l<=r) {
            
            mid=l+(r-l)/2;

            if(letters[mid]>target){
                r=mid-1;
                
            }
            else
                l=mid+1;
            

        }

       if(l==letters.length)
        return letters[0];
       else
        return letters[l];


    }
}