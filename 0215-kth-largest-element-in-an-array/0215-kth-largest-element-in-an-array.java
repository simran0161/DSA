class Solution {
    public int findKthLargest(int[] nums, int k) {
        PriorityQueue<Integer>pq=new PriorityQueue<>(Collections.reverseOrder());

        for(int i:nums){
            pq.add(i);
        }

        int c=1;
        while(!pq.isEmpty() && c!=k){
            c++;
            pq.poll();
        }
        return pq.peek();
    }
}