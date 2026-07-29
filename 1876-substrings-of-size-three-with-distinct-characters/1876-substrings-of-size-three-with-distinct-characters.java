class Solution {
    public int countGoodSubstrings(String s) {
       
        HashMap<Character,Integer> hs=new HashMap<>();

        int l=0,cnt=0,feq=0,op=0;

        for(int i=0;i<s.length();i++)
        {

            cnt++;

            if(hs.containsKey(s.charAt(i)))
                hs.put(s.charAt(i), hs.getOrDefault(s.charAt(i), 0) + 1);
            else
                hs.put(s.charAt(i), hs.getOrDefault(s.charAt(i), 0)+1);


            
            if(cnt>3)
            {

                while(cnt>3)
                {
                    cnt--;
                    feq=hs.get(s.charAt(l));
                    feq--;
                    if(feq>0){
                        
                        hs.put(s.charAt(l), feq);
                    }
                    else
                        hs.remove(s.charAt(l));
                    
                    l++;

                }

            }

            if(hs.size()==3)
            {
                
                op++;
            }

        }
        return op;

    }
}