class Solution {
   public int lengthOfLongestSubstring(String s) {
    
        int c=0,l=0,r=0,feq=0;

        HashMap<Character,Integer> h=new HashMap<>();

        for(r=0;r<s.length();r++)
        {

            h.put(s.charAt(r),h.getOrDefault(s.charAt(r), 0)+1);


            while (h.size()!=r-l+1) {
                 
                feq=h.get(s.charAt(l));

                feq--;

                if(feq>0)
                {
                    h.put(s.charAt(l),feq);
                }else
                {
                    h.remove(s.charAt(l));

                }

                l++;

            }


            if(h.size()>c)
                c=h.size();


        }


        return c;

        
    }
}