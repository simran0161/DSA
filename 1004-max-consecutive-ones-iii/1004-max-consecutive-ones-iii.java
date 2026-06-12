class Solution {
    public int longestOnes(int[] nums, int k) {
        int n=nums.length;
        int l=0;
        int r=0;
        int maxlen=0;
        int zeroes=0;

        if(n<=k)return n;

        while(r<n){
            if(nums[r]==0){
                zeroes++;
            }
 
            while(zeroes>k){
                if(nums[l]==0){
                    zeroes--;
                }
                l++;
            }
            
            int len=r-l+1;
            maxlen=Math.max(len,maxlen);

            r++;
        }
        return maxlen;
    }
}