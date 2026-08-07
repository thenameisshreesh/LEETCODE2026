class Solution {
   public int majorityElement(int[] nums) {
        
        HashMap<Integer,Integer> hs=new HashMap<>();

        for(int i=0;i<nums.length;i++)
        {

            hs.put(nums[i], hs.getOrDefault(nums[i], 0)+1);

        }

        int feq=0,max=0,ele=0;

        for(int i=0;i<nums.length;i++)
        {

           feq=hs.get(nums[i]);
            
           if(feq>max){
            max=feq;
            ele=nums[i];
           }
        


        }

        return ele;


    }
}