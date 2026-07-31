class Solution {
    public int numberOfSubarrays(int[] nums, int k) {
        int n=nums.length;
        int l=0;
        int r=0;
        int odd=0;
        int count=0;
        int res=0;

        while(r<n){
            if(nums[r]%2==1){
                odd++;
                count=0;
            }
            
            while(odd==k){
                count++;
                if(nums[l]%2==1){
                    odd--;
                }
                l++;
            }
            res+=count;
            r++;
        }
        return res;
    }
}