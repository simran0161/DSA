class Solution {
    public int solve(int i, int sum, int [] nums, int target,int[][]dp,int total){
        
        if(i==nums.length){
            if(sum==target){
                return 1;
            }
            else{
                return 0;
            }
        }
        if(dp[i][sum+total]!=-1){
            return dp[i][sum+total];
        }

        int take=solve(i+1,sum+nums[i],nums,target,dp,total);
        int not_take=solve(i+1,sum-nums[i],nums,target,dp,total);

        return dp[i][sum+total]=take+not_take;
    }
    public int findTargetSumWays(int[] nums, int target) {
        int total=0;
        for(int i:nums){
            total+=i;
        }
        int[][] dp=new int[nums.length][2*total+1];

        for(int [] a:dp){
            Arrays.fill(a,-1);
        }
        return solve(0,0,nums,target,dp,total);
    }
}