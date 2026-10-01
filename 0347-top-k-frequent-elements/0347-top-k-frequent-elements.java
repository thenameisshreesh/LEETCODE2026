class Solution {
    public int[] topKFrequent(int[] nums, int k) {
        

        HashMap<Integer,Integer> hs=new HashMap<>();

        int feq=0,i=0;

        for ( i=0;i<nums.length;i++) {
            
        

            hs.put(nums[i], hs.getOrDefault(nums[i], 0)+1);

        }

        i=0;
        PriorityQueue<Integer> p=new PriorityQueue<>((a,b)->hs.get(a)-hs.get(b));
        
       for (int b:hs.keySet()) {

            p.add(b);


       }

        i=0;

        while(i<hs.size()-k)
        {
            p.poll();
            i++;
        }

        int ans[]=new int[k];

        i=0;

        while (i<k) {
            
            ans[i]=p.poll();
            i++;
        }

        return ans;




    }
}