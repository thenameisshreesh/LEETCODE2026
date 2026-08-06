class Solution {
   public int[] intersect(int[] nums1, int[] nums2) {
        
        HashMap<Integer,Integer> hs=new HashMap<>();
       
        int feq=0;

        ArrayList<Integer> a=new ArrayList<>();
        
        for(int i=0;i<nums1.length;i++)
        {

            hs.put(nums1[i], hs.getOrDefault(nums1[i], 0)+1);

        }

        for(int i=0;i<nums2.length;i++)
        {

           

            if(hs.containsKey(nums2[i]))
            {

                feq=hs.get(nums2[i]);
                feq--;
                hs.put(nums2[i], feq);

                if(feq==0)
                    hs.remove(nums2[i]);

                a.add(nums2[i]);
                
               


            }

        }

        int ans[]=new int[a.size()];

        for(int i=0;i<ans.length;i++)
        {
            ans[i]=a.get(i);

        }

        return ans;
        

    }
}