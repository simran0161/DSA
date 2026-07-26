class Solution {
    public long maxProduct(int[] nums) {
        int n=nums.length;
        long res=0;
        Arrays.sort(nums);
        long product1=(long)nums[0]*(long)nums[1]*100000L;
        long product2=(long)nums[n-1]*(long)nums[n-2]*100000L;
        long product3=(long)nums[0]*(long)nums[n-1]*-100000L;
        res=Math.max(product1,Math.max(product2,product3));

        return res;
    }
}