class Solution {
    public int maxProduct(int[] nums) {
        
        int m1=0,m2=0,indx=0,jndx=0;
        boolean flg=false;

        for(int i=0;i<nums.length;i++)
        {

            if(nums[i]>=m1){
                m1=nums[i];
                indx=i;
                
            }

            

        }


        
        for(int i=0;i<nums.length;i++)
        {

            

            if(nums[i]==m1 && indx!=i){
                jndx=i;
                break;
            }
            else if(nums[i]>m2 && nums[i]<m1){
                m2=nums[i];
                jndx=i;
            
            }
            

        }

        return (nums[indx]-1)*(nums[jndx]-1);

        

    }
}