class Solution {
    public int longestConsecutive(int[] nums) {
        
        HashSet<Integer> hs=new HashSet<>();

        for (int i=0;i<nums.length;i++) {

            if(hs.contains(nums[i]))
                continue;
            else
                hs.add(nums[i]);
            
        }

        boolean b=false;

        int j=0,c=0,max=0;

            for (int i:hs) {


                
                if(!hs.contains(i-1))
                {
                    b=true;
                    j=i;
                    c=0;
                    
                    while(b)
                    {
                        if(hs.contains(j)){
                            c++;
                            j++;
                        }
                        else
                            b=false;
                    }

                    if(c>max){
                        max=c;
                    }

                    

                }

                
                
            }
            

        

        return max;


    }
}