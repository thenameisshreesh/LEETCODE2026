class Solution {
     public List<Integer> majorityElement(int[] nums) {
     

        int c1=0,c2=0,feq1=0,feq2=0;

        for(int i=0;i<nums.length;i++)
        {


            

            if(c1==nums[i])
                feq1++;
            else if(c2==nums[i])
                feq2++;
            else if(feq1==0){
                c1=nums[i];
                feq1=1;
            }
            else if(feq2==0){
                c2=nums[i];
                feq2=1;
            }
            else
            {
                feq1--;
                feq2--;
            }



        }

        List<Integer> l=new ArrayList<>();
        
        feq1=0;
        feq2=0;

        for (int ele:nums) {
            
            if(ele==c1)
                feq1++;

            if(ele==c2)
                feq2++;
        }


        if(c1==0 && c2==0)
            l.add(0);
        else
        {
            if(feq1>nums.length/3)
                l.add(c1);

            if(feq2>nums.length/3)
                l.add(c2);


        }

        

        return l;

    }

}