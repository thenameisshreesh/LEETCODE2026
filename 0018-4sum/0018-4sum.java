class Solution {
    public List<List<Integer>> fourSum(int[] nums, int target) {
        

        Arrays.sort(nums);


        int i=0,j=0,k=0,l=0;
        long sum=0L;

        List<List<Integer>> res=new ArrayList<>();

        List<Integer> ll=new ArrayList<>();


        for(i=0;i<nums.length;i++)
        {   

            if(i>0 && nums[i]==nums[i-1])
                continue;

            for(j=i+1;j<nums.length;)
            {

               


                k=j+1;
                l=nums.length-1;

                while (k<l) {

                    sum=(long)nums[i]+nums[j]+nums[k]+nums[l];

                    if(sum>target)
                        l--;
                    else if(sum<target)
                        k++;
                    else
                    {

                        res.add(Arrays.asList(nums[i],nums[j],nums[k],nums[l]));

                        k++;
                        l--;

                        while(k<l && nums[k]==nums[k-1]) k++;   

                        while(k<l && nums[l]==nums[l+1]) l--;


                    }

                 
                    
                }

                j++;
                while(j<nums.length && nums[j]==nums[j-1])
                    j++;

            }


        }

        return res;

    }
}