class Solution {
   public String[] findRestaurant(String[] list1, String[] list2) {
        
        HashMap<String,Integer> hs=new HashMap<>();

        HashMap<String,Integer> hs2=new HashMap<>();
        
        List<String> l=new ArrayList<>();

        int min=Integer.MAX_VALUE;

        for(int i=0;i<list1.length;i++)
        {

            hs.put(list1[i],i);

        }

        

        for(int i=0;i<list2.length;i++)
        {
            hs2.put(list2[i], i);
           
        }



        for(int i=0;i<list2.length;i++)
        {
            

            if(hs.containsKey(list2[i]))
            {
                
                if(hs.get(list2[i])+hs2.get(list2[i])<min)
                {
                    min=hs.get(list2[i])+hs2.get(list2[i]);
                    l.clear();
                    l.add(list2[i]);
                }else if(hs.get(list2[i])+hs2.get(list2[i])==min){
                    l.add(list2[i]);

                }
            }

        }

        return l.toArray(new String[0]);

    }
}