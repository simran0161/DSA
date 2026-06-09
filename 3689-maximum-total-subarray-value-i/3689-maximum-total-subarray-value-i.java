class Solution {
    public long maxTotalValue(int[] nums, int k) {
        long max=Long.MIN_VALUE;
        long min=Long.MAX_VALUE;
        long res=0;

        for(int i:nums){
            max=Math.max(i,max);
            min=Math.min(i,min);
        }

        res=k*(max-min);
        return res;
    }
}