class Solution {
   public int[] nextGreaterElement(int[] nums1, int[] nums2) {
    
        
        List<Integer> l=new ArrayList<>();
        
        
        int j=0;
        
        
        for(int i=0;i<nums1.length;i++)
        {

            j=0;
            
            while (nums1[i]!=nums2[j]) {
                j++;
            }

            while (j<nums2.length ) {

               if(nums2[j]>nums1[i])
               {
                    l.add(nums2[j]);
                    break;
               }else
                    j++;


            }

            if(j==nums2.length)
                l.add(-1);


        }

        return l.stream().mapToInt(Integer::intValue).toArray();


    }
}