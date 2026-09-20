class Solution {
   public int reverseDegree(String s) {
        
        HashMap<Character,Integer> hs=new HashMap<>();

        int i=26,res=0,v=1;

        for (char c: "abcdefghijklmnopqrstuvwxyz".toCharArray()) {
            
            hs.put(c,i);
            i--;
            
        }

        i=1;

        for (char ch:s.toCharArray()) {
        
            res+=hs.get(ch)*i;
            i++;


        }

        return res;


    }
}