class Solution {
    public int lengthOfLongestSubstring(String s) {
        
        HashMap<Character,Integer> mp=new HashMap<>();
        
        int c=0,l=0,feq=0,r=0;

       
        for(r=0;r<s.length();r++)
        {
            
            
            
            mp.put(s.charAt(r),mp.getOrDefault(s.charAt(r), 0)+1);

            
                while(mp.size()!=(r-l+1))
                {
                    feq=mp.get(s.charAt(l));
                    feq--;
                    if(feq>0)
                    {
                        
                        mp.put(s.charAt(l), feq);
                    }else
                    {
                        mp.remove(s.charAt(l));
                    }
                    l++;

                }

                if(mp.size()>c)
                    c=mp.size();

        }

        return c;

        
 


    }
}