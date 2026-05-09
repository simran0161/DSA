class Solution {
    public String kthLargestNumber(String[] nums, int k) {
        //We must:
        //Keep numbers as strings
        //Compare based on:
        //1. Length
        //2. If same length → lexicographical comparison
        PriorityQueue<String> pq = new PriorityQueue<>((a, b) -> {
                if (a.length() != b.length()) {
                    return b.length() - a.length(); 
                }
                return b.compareTo(a);
            }
        );

        for (String num : nums) {
            pq.add(num);
        }

        // remove k-1 largest elements
        for (int i = 1; i < k; i++) {
            pq.poll();
        }

        return pq.peek();
    }
}