class Solution {
    public int[] resultArray(int[] nums) {
        
        List<Integer> l1=new ArrayList<>();
        List<Integer> l2=new ArrayList<>();
        int s1=1,s2=1;

        l1.add(nums[0]);
        l2.add(nums[1]);

        for(int i=2;i<nums.length;i++)
        {

            if(l1.get(s1-1)>l2.get(s2-1)){
                l1.add(nums[i]);
                s1++;
            }
            else{
                l2.add(nums[i]);
                s2++;
            }
            

        }

        for (int i:l2) {

            l1.add(i);
            
        } 

        int ra[]=new int[l1.size()];

        for(int i=0;i<l1.size();i++)
        {
            
            ra[i]=(int)l1.get(i);

        }

        return ra;
        

    }
}