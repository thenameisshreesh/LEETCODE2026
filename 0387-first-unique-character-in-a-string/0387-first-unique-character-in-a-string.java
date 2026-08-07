class Solution {
    public int firstUniqChar(String s) {
        
        HashMap<Character,Integer> hs=new HashMap<>();

        for(int i=0;i<s.length();i++)
        {

            hs.put(s.charAt(i), hs.getOrDefault(s.charAt(i),0)+1);



        }
        int feq=0;

        for(int i=0;i<s.length();i++)
        {

            feq=hs.get(s.charAt(i));
            if(feq==1)
                return i;

        }

        return -1;


    }
}