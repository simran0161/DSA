class Solution {
    public boolean solve(int i, int sum, int[] nums, int target,Boolean[][] dp){
        if(i==nums.length || sum>target){
            return false;
        }
        if(sum==target) return true;

        if(dp[i][sum]!=null){
            return dp[i][sum];
        }

        boolean take=solve(i+1,sum+nums[i],nums,target,dp);
        boolean not_take=solve(i+1,sum,nums, target,dp);

        return dp[i][sum]= take||not_take;
    }
    public boolean canPartition(int[] nums) {
        int total=0;

        for(int i=0;i<nums.length;i++){
            total+=nums[i];
        }

        if(total%2==1) return false;

        int target=total/2;
        Boolean[][] dp=new Boolean[nums.length][target+1];
        return solve(0,0,nums,target,dp);
    }
}