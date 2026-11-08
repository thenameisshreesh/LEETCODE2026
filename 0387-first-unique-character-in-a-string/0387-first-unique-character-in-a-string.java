class Solution {
    public int firstUniqChar(String s) {
    
        Queue<Character> q=new LinkedList<>();


        HashMap<Character,Integer> hs=new HashMap<>();

        for (char c:s.toCharArray()) {
            
            hs.put(c,hs.getOrDefault(c, 0)+1);


        }


        for (char c:s.toCharArray()) {
            
            q.add(c);

        }


        int idx=0;
        for (char c:s.toCharArray()) {
            
            if(hs.get(c)>1){
                q.poll();
                idx++;
            }
            else
                break;


        }

        return idx>=s.length()?-1:idx;
        
    }
}