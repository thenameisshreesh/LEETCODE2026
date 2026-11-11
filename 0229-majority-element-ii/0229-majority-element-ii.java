class Solution {
    public List<Integer> majorityElement(int[] nums) {
        

        List<Integer> ans=new ArrayList<>();

        HashMap<Integer,Integer> h=new HashMap<>();

        for (int i = 0; i < nums.length; i++) {
            
            h.put(nums[i],h.getOrDefault(nums[i], 0)+1);

        }

        for (int ele:h.keySet()) {
            
            if(h.get(ele)>nums.length/3)
                ans.add(ele);

        }

        return ans;
    }
}