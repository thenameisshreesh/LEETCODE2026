class Solution {
    public boolean isPalindrome(String s) {
        

        
        if(s.equals(" "))
            return true;

        s=s.trim();
        s=s.toLowerCase();
        s=s.replaceAll(" ", "");
        s=s.replaceAll("[^a-zA-Z0-9]", "");
        
       

        int l=0,r=s.length()-1;

        

        l=0;
        System.out.println(s);

        while(l<=r)
        {

            

            if(s.charAt(l)==s.charAt(r) && (Character.isLetterOrDigit(s.charAt(r))) && (Character.isLetterOrDigit(s.charAt(l))))
            {
                l++;
                r--;
            }
            else
                return false;


        }

        return true;
        

    }
}