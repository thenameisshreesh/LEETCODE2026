class Solution {
    public  List<Integer>  findAnagrams(String s, String p) {
        
        
        if(p.length()>s.length())
            return new ArrayList<>(0);
        
        int k=p.length();

        

        ArrayList<Integer> al=new ArrayList<>();

        HashMap<Character,Integer> hs=new HashMap<>();

        HashMap<Character,Integer> hs2=new HashMap<>();
        

        for(int i=0;i<k;i++)
        {
            hs.put(p.charAt(i),hs.getOrDefault(p.charAt(i),0)+1);

            hs2.put(s.charAt(i),hs2.getOrDefault(s.charAt(i),0)+1);
            
        }

        if(hs.equals(hs2))
            al.add(0);

        int feq=0;

        for(int i=k;i<s.length();i++)
        {
            
            hs2.put(s.charAt(i), hs2.getOrDefault(s.charAt(i), 0)+1);

            if(hs2.containsKey(s.charAt(i-k))){
                feq=hs2.get(s.charAt(i-k));
                feq--;
                hs2.put(s.charAt(i-k), feq);

                if(hs2.get(s.charAt(i-k))==0)
                    hs2.remove(s.charAt(i-k));
            }


            if(hs.equals(hs2))
                al.add(i-k+1);

        }


        return al;

    }

    

}