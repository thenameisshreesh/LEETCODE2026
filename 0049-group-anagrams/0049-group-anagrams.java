import java.util.Collection;
class Solution {
    public List<List<String>> groupAnagrams(String[] strs) {
        
        HashMap<String,List<String>> hs=new HashMap<>();

        
        String s="";
        
        int arr[],pos=0;

        List<String> l,get;
        


        for(int i=0;i<strs.length;i++)
        {

            arr=new int[26];
            s=strs[i];
            for (char c:s.toCharArray()) {

               pos=Character.toUpperCase(c)-'A';

               arr[pos]++;

                
            }

            StringBuilder sb = new StringBuilder();

            for(int j=0;j<26;j++)
            {

                sb.append(arr[j]).append('#');
            }

            s=sb.toString();

        
            if(hs.containsKey(s))
            {

                get=hs.get(s);
                get.add(strs[i]);

            }else
            {

                l=new ArrayList<>();
                l.add(strs[i]);
                hs.put(s,l);

            }
            

        }    
        
        
       List<List<String>> result;
       Collection<List<String>> c=hs.values();
       return result=new ArrayList<>(c);

    }

}