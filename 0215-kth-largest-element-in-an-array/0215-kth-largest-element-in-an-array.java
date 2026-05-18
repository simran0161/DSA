class Solution {
    public int findKthLargest(int[] nums, int k) {
        
        PriorityQueue<Integer>pq=new PriorityQueue<>(Collections.reverseOrder());

        for(int i:nums){
            pq.offer(i);
        }

        int c=0;
        while(!pq.isEmpty() && c!=k){
            c++;
            if(c==k){
                int ele=pq.poll();
                return ele;
            }
            pq.poll();
        }
        return -1;
    }
}