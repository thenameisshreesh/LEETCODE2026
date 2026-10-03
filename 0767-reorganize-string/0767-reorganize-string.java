class Solution {
    public String reorganizeString(String s) {
        
        HashMap<Character,Integer> hs=new HashMap<>();
        
        String ans=new String("");

        for (char c:s.toCharArray()) {

            hs.put(c,hs.getOrDefault(c, 0)+1);

        }

        int mf=0;

        for (int i:hs.values()) {
            
            if(i>mf)
                mf=i;

        }

        if(mf>(s.length()+1)/2)
            return "";

        

        PriorityQueue<Character> pq=new PriorityQueue<>((a,b)->hs.get(b)-hs.get(a));

        pq.addAll(hs.keySet());

        char p='\0',c='\0';

        while(!pq.isEmpty()) {

            c=pq.poll();

            ans+=c;

            hs.put(c, hs.get(c)-1);

            if(p!='\0' && hs.get(p)>0)
            {
                pq.add(p);

            }

            p=c;

            
        }

        return ans;


    }
}