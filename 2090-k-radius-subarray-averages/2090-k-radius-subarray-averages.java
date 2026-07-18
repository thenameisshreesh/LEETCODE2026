class Solution {

public int[] getAverages(int[] nums, int k) {
     
        
        int avg[]=new int[nums.length];
        long sum=0;

        int j=k;
        
        for (int i = 0; i < nums.length; i++) {
            avg[i] = -1;
        }

        
        if(nums.length==1 && k==0)
        {
            avg[j]=nums[0];
            return avg;

        }

        if (k == 0) {               // Simpler special case
            return nums;
        }

        
       

        if((2*k)+1>nums.length)
        {
            
            return avg;
        }

        for(int i=0;i<(2*k)+1;i++)
            {
                sum+=nums[i];
            
            }

        avg[j++] = (int) (sum / (2 * k + 1)); 
        
        for(int i=k;i<nums.length-k-1;i++)
        {
                sum+=nums[k+i+1];
                sum-=nums[i-k];
                
                if(j<nums.length){
                    avg[j++]=(int)((sum/(2*k+1)));
                    
                }
                else
                    break;
            

        }

       
        return avg;

    }

}