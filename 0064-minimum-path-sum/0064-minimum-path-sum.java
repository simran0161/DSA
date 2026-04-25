class Solution {
    public int solve(int i, int j, int [][] grid,int[][] dp){
        if(i>=grid.length || j>=grid[0].length){
            return Integer.MAX_VALUE;
        }

        if(i==grid.length-1 && j==grid[0].length-1){
            return grid[i][j];
        }

        if(dp[i][j]!=-1){
            return dp[i][j];
        }

        int right=solve(i,j+1,grid,dp);
        int down=solve(i+1,j,grid,dp);

        return dp[i][j]=grid[i][j]+Math.min(right,down);
    }
    public int minPathSum(int[][] grid) {
        int m=grid.length;
        int n=grid[0].length;
        int[][] dp=new int[m+1][n+1];

        for(int []a:dp){
            Arrays.fill(a,-1);
        }
        return solve(0,0,grid,dp);
    }
}