class Solution {
    public int solve(int i,int last, int[] nums,int[] dp){
        if(i>last){
            return 0;
        }

        if(dp[i]!=-1){
            return dp[i];
        }
        
        int take=nums[i]+solve(i+2,last,nums,dp);
        int not_take=solve(i+1,last,nums,dp);

        return dp[i]=Math.max(take,not_take);
    }
    public int rob(int[] nums) {
        int n=nums.length;
        if(n==1){
            return nums[0];
        }
        if(n==2){
            return Math.max(nums[0],nums[1]);
        }
        int[]dp1=new int[n+1];
        int[]dp2=new int[n+1];
        Arrays.fill(dp1,-1);
        Arrays.fill(dp2,-1);
        return Math.max(solve(0,n-2,nums,dp1),solve(1,n-1,nums,dp2));
    }
}