class Solution {
    public List<List<Integer>> threeSum(int[] nums) {
        


        Arrays.sort(nums);

        List<List<Integer>> res=new ArrayList<>();

        int j=0,sum=0,k=nums.length-1;

        List<Integer> l=new ArrayList<>();

        for (int i=0;i<nums.length-2;i++) {
            
            
            if(i>0 && nums[i]==nums[i-1])
                continue;

            j=i+1;
            k = nums.length - 1;

            while (j<k) {

                sum=nums[i]+nums[j]+nums[k];

                if(sum<0)
                    j++;
                else if(sum>0)
                    k--;
                else
                {

                    
                    res.add(Arrays.asList(nums[i],nums[j],nums[k]));

                    j++;
                    k--;

                    while (j<k && nums[j]==nums[j-1]) 
                    j++;

                while (j < k && nums[k] == nums[k + 1])
                    k--;


                }

                

                
            }



        }



        return res;

    }
}