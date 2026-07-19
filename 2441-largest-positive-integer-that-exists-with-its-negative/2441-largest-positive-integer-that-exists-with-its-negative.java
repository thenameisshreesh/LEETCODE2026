class Solution {
   public int findMaxK(int[] nums) {
        
        HashSet<Integer> hs=new HashSet<>();

        int var=0,max1=0,max2=0;
        for(int i=0;i<nums.length;i++)
        {
            
            
            hs.add(nums[i]);
            

        }

        int i=0;

        while (i<nums.length && !hs.isEmpty()) {
            
    
            max1=Collections.max(hs);
            var=max1-max1-max1;

            
                if(hs.contains(var))
                    return max1;
                else
                    hs.remove(max1);
        

            i++;
        }

       
        return -1;



    }

}