class KthLargest {
    PriorityQueue<Integer>pq;
    int target;
    public KthLargest(int k, int[] nums) {
        pq=new PriorityQueue<>();
        target=k;
        for(int i : nums) {
            pq.add(i);

            if(pq.size() > target) {
                pq.poll();
            }
        }
    }
    
    public int add(int val) {
        pq.add(val);

        if(pq.size()>target){
            pq.poll();
        }

        return pq.peek();
    }
}

/**
 * Your KthLargest object will be instantiated and called as such:
 * KthLargest obj = new KthLargest(k, nums);
 * int param_1 = obj.add(val);
 */