class Solution {
    public void merge(int[] nums1, int m, int[] nums2, int n) {
        

        int i=m-1,j=n-1;

        int idx=m+n-1;


        if(nums1.length==1 && nums2.length==1)
        {

            if(nums1[0]>=nums2[0])
                nums1[0]=nums2[0];
            else
                nums1[0]=nums2[0];

            return;


        }

        while(i>=0 && j>=0)
        {

            if(nums1[i]>=nums2[j]){
                nums1[idx]=nums1[i];
                idx--;
                i--;
            }else
            {

                nums1[idx]=nums2[j];
                idx--;
                j--;

            }


        }

       
        while (j>=0) {
            nums1[idx]=nums2[j];
            idx--;
            j--;
        }
            
        

    }
}