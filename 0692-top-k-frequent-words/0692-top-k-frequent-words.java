class Solution {
    
     public List<String> topKFrequent(String[] words, int k) {
        
        int i=0;
        HashMap<String,Integer> hs=new HashMap<>();

        while (i<words.length) {
            
           hs.put(words[i],hs.getOrDefault(words[i], 0)+1);
           i++;
            
        }

        PriorityQueue<String> q=new PriorityQueue<>((a,b)->{
          if(!hs.get(a).equals(hs.get(b)))
               return hs.get(a)-hs.get(b);
          return b.compareTo(a);
        });

        i=0;

       for (String var:hs.keySet()) {

          q.add(var);

          if(q.size()>k)
               q.poll();

       }

       List<String> l=new ArrayList<>();

       

       String ans[]=new String[k];
       
       for(i=k-1;i>=0;i--)
       {
          ans[i]=q.poll();
       }


       return Arrays.asList(ans);


    }
}