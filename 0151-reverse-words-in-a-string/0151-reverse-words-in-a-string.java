class Solution {
    
    public String reverseWords(String s) {
        
        s=s.trim();
        s=new StringBuilder(s).reverse().toString();
        String s2[]=s.split("\\s+");

        s="";

        for(int i=0;i<s2.length;i++)
        {

            s2[i]=new StringBuilder(s2[i]).reverse().toString();
           

        }
        
        s=String.join(" ",s2);
        

        return s;

    }
}