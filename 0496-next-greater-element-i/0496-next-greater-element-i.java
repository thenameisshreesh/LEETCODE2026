class Solution {
   public int[] nextGreaterElement(int[] nums1, int[] nums2) {


       int ans[]=new int[nums1.length];


        Stack<Integer> s=new Stack();


        HashMap<Integer,Integer> check =new HashMap<>();

        

        for(int i=nums2.length-1; i>=0 ;i--)
        {

            

            while (!s.isEmpty() && s.peek()<=nums2[i]) {

                s.pop();
                

            }
            
            if(s.isEmpty()){
                
                check.put(nums2[i],-1);
            }
            else
            {
               
                check.put(nums2[i],s.peek());
            }

            s.add(nums2[i]); 

            

        }


        for (int i=0;i<nums1.length;i++) {
            
            ans[i]=check.get(nums1[i]);

        }

        return ans;

    }
}