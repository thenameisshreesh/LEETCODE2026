class Solution {
    public int maxVowels(String s, int k) {
        
        
        int c=0,max=0,feq=0,vc=0;

        

        
        for(int i=0;i<k;i++)
        {
            if(s.charAt(i)=='a' || s.charAt(i)=='e' ||s.charAt(i)=='o' || s.charAt(i)=='u' ||s.charAt(i)=='i')
                c++;

            
        }




        max=c;

        for(int i=k;i<s.length();i++)
        {
            if(s.charAt(i)=='a' || s.charAt(i)=='e' ||s.charAt(i)=='o' || s.charAt(i)=='u' ||s.charAt(i)=='i')
                c++;

            if(s.charAt(i-k)=='a' || s.charAt(i-k)=='e' ||s.charAt(i-k)=='o' || s.charAt(i-k)=='u' ||s.charAt(i-k)=='i')
                c--;

            if(c>max)
                max=c;                
        }
        

        return max;
        

        



}
}