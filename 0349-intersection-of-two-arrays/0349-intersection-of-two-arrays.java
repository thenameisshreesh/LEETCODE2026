class Solution {
    public int[] intersection(int[] nums1, int[] nums2) {
     
        HashSet<Integer> hs=new HashSet<>();

        HashSet<Integer> ans=new HashSet<>();

        List<Integer> ls=new ArrayList<>();
        

        for(int i=0;i<nums1.length;i++)
        {

            hs.add(nums1[i]);

        }
        int j=0;
        

        for(int i=0;i<nums2.length;i++)
        {
            if(hs.contains(nums2[i]))
                ans.add(nums2[i]);

        }

        
        int ansA[]=new int[ans.size()];

        

        for (Integer i : ans) {
            ansA[j++]=i;
        }

        return ansA;
    }
}