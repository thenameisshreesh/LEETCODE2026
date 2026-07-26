class Solution {
    public int equalSubstring(String s, String t, int maxCost) {
        
        List<Integer> costArray=new ArrayList<>();
        int r=0,l=0,lc=0,sum=0;

        

        for(int i=0;i<s.length();i++)
        {
            costArray.add(Math.abs(s.charAt(i)-t.charAt(i)));

        }

        final int len=costArray.size();
        while(r<len){

            sum+=costArray.get(r);

            if(sum>maxCost)
            {
                while (sum>maxCost) {

                    sum-=costArray.get(l);

                    l++;
                    
                }
            }

            if((r-l)+1 > lc)
                lc=(r-l)+1;
            
            r++;
        }
        
        return lc;

    } 
}