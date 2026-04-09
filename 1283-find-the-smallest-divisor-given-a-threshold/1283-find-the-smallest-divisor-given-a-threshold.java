class Solution {
    public int check(int mid, int [] nums){
        int sum=0;
        for(int i=0;i<nums.length;i++){
            sum+=nums[i]/mid;
            if(nums[i]%mid!=0){
                sum+=1;
            }
        }
        return sum;
    }
    public int smallestDivisor(int[] nums, int threshold) {
        int max=Integer.MIN_VALUE;
        for(int i:nums){
            max=Math.max(i,max);
        }

        int low=1;
        int high=max;
        int res=0;

        while(low<=high){
            int mid=low+(high-low)/2;
            int sum=check(mid,nums);
            if(sum<=threshold){
                res=mid;
                high=mid-1;
            }
            else{
                low=mid+1;
            }
        }
        return res;
    }
}