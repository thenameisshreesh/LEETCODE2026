class Solution {
 public boolean canConstruct(String ransomNote, String magazine) {
        
        HashMap<Character,Integer> hs=new HashMap<>();
        int j=0,hashSize=0;

        if(ransomNote.length()>magazine.length())
            return false;

        for(int i=0;i<magazine.length();i++)
        {

            hs.put(magazine.charAt(i),hs.getOrDefault(magazine.charAt(i),0)+1);

        }

        
        int feq=0;
        ArrayList<Integer> b=new ArrayList<>(hs.values());
        

        for(int i=0;i<b.size();i++)
        {
            hashSize+=b.get(i);
        }



        while(j<ransomNote.length()){

            if (hs.containsKey(ransomNote.charAt(j))) {

                
                feq=hs.get(ransomNote.charAt(j));
                feq--;
                if(feq>0)
                    hs.put(ransomNote.charAt(j), feq);
        
                else
                    hs.remove(ransomNote.charAt(j));
  
                j++;
             
            }else
            {
                return false;
            }

        }

        ArrayList<Integer> a=new ArrayList<>(hs.values());
        int sum=0;

        for(int i=0;i<a.size();i++)
        {
            sum+=a.get(i);
        }

        if(hashSize-sum==j)
            return true;
        else
            return false;

        
    }
}