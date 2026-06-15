class Solution {
    public int numberOfSubarrays(int[] nums, int k) {
        int n=nums.length;
        int odd=0;
        int i=0;
        int j=0;
        int res=0;
        int c=0;

        while(j<n){
            if(nums[j]%2==1){
                odd++;
                c=0;
            }

            while(odd==k){
                c++;
                if(nums[i]%2==1){
                    odd--;
                }
                i++;
            }
            res+=c;
            j++;
        }
        return res;
    }
}