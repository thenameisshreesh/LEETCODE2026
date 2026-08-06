class Solution {
    public boolean wordPattern(String pattern, String s) {
        
        HashMap<Character,String> hs=new HashMap<>();
        String hString="";

        String arr[]=s.trim().split("\\s+");
        HashSet<String> hashSet=new HashSet<>();

        if(pattern.length()!=arr.length)
            return false;




        for(int i=0;i<pattern.length();i++)
        {
            if(hs.containsKey(pattern.charAt(i)) )
            {
                hString=hs.get(pattern.charAt(i));

                if(!hString.equals(arr[i]))
                    return false;

               


            }else{

                if(hashSet.contains(arr[i]))
                    return false;

            }
            hs.put(pattern.charAt(i), arr[i]);
            hashSet.add(arr[i]);

        }

        return true;


    }


}