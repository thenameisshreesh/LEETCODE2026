class Solution {
    public boolean isIsomorphic(String s, String t) {

        if(s.length()!=t.length())
            return false;

        int l=s.length(),c=0;
        HashMap<Character,Character> hs=new HashMap<>();
        char k,v;
        boolean flg=true;

        for(int i=0;i<l;i++)
        {

           
            
            if(hs.containsKey(s.charAt(i)) )
            {
                
                
                
                v=hs.get(s.charAt(i));
                if(v==t.charAt(i)){
                    
                    c++;
                    continue;
                   
                }
                else
                    return false;
            }else
            {
                if(hs.containsValue(t.charAt(i)))
                    return false;


            }
            hs.put(s.charAt(i),t.charAt(i));
        }

        

        return true;
        
    }
}