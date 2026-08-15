class Solution {
   public String[] uncommonFromSentences(String s1, String s2) {
     
        
        int feq=0;
        HashMap<String,Integer> hm=new HashMap<>();

        HashMap<String,Integer> hm2=new HashMap<>();

        List<String> l=new ArrayList<>();
        
        String arr1[]=s1.split(" ");
        String arr2[]=s2.split(" ");
       
        

        for(int i=0;i<arr2.length;i++)
        {

           hm2.put(arr2[i], hm2.getOrDefault(arr2[i], 0)+1);

           
        }

        String[] com=new String[arr1.length+arr2.length];

        int i=0;
        for(i=0;i<arr1.length;i++)
        {
            com[i]=arr1[i];

        }

        int j=0;
        while (j<arr2.length) {

            com[i]=arr2[j];
            i++;
            j++;
            
        }


        for(int k=0;k<com.length;k++)
        {

           hm.put(com[k], hm.getOrDefault(com[k], 0)+1);


        }

        for(int k=0;k<com.length;k++)
        {
            if(hm.get(com[k])==1)
            {
                l.add(com[k]);
            }

        }

        
        return l.toArray(new String[0]);

    }
}