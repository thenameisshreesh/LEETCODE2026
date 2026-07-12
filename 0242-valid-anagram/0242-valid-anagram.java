class Solution {
   public boolean isAnagram(String s,String t)
    {


        if(s.length()!=t.length())
            return false;

        HashMap<Character,Integer> hs=new HashMap<>();
        int feq=1;

        for(int i=0;i<s.length();i++)
        {
            if(hs.containsKey(s.charAt(i)))
            {
                feq=hs.get(s.charAt(i));
                feq++;
                hs.put(s.charAt(i),feq);

            }else
            {
                feq=1;
                hs.put(s.charAt(i),feq);

            }

        }

        feq=0;

        for(int i=0;i<t.length();i++)
        {

            if(hs.containsKey(t.charAt(i)))
            {
                feq=hs.get(t.charAt(i));
                feq--;
                hs.put(t.charAt(i), feq);

            }else
                return false;

            if(feq==0)
                hs.remove(t.charAt(i));


        }

        if(hs.isEmpty())
            return true;
        else
            return false;



    }
}