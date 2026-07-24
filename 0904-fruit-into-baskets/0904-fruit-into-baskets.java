class Solution {

    public int totalFruit(int[] fruits) {
    
        HashMap<Integer,Integer> mp=new HashMap<>();

        int l=0,r=0,feq=0,c=0;

        for(r=0;r<fruits.length;r++)
        {
 
            mp.put(fruits[r],mp.getOrDefault(fruits[r], 0)+1);

            if(mp.size()>2){

                
                
                while(mp.size()>2)
                {
                    feq=mp.get(fruits[l]);
                    feq--;
                    if(feq>0)
                        mp.put(fruits[l], feq);
                    else{
                        mp.remove(fruits[l]);   
                        
                    }
                    l++;
                    
                }

            }

            if((r-l)+1>c)
                c=(r-l)+1;

        }
        
        
        return c;
    }
















}