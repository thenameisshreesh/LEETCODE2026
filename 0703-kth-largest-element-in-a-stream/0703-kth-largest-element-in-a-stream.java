class KthLargest {

    PriorityQueue<Integer> p=new PriorityQueue<>();

    int kk=0;

    public KthLargest(int k, int[] nums) {
     
        
        kk=k;

        for (int i : nums) {
            p.add(i);

            if(p.size()>k)
                p.poll();
        }

    }
    

    public int add(int val) {
        
        

        p.add(val);

        if(p.size()>kk)
            p.poll();

        return p.peek();

    }
}

/**
 * Your KthLargest object will be instantiated and called as such:
 * KthLargest obj = new KthLargest(k, nums);
 * int param_1 = obj.add(val);
 */