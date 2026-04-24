class Solution {
    public int solve(int i, int j, int[][] obstacleGrid,int[][] dp){

        if(i>=obstacleGrid.length || j>=obstacleGrid[0].length || obstacleGrid[i][j]==1){
            return 0;
        }
        
        if(i==obstacleGrid.length-1 && j==obstacleGrid[0].length-1){
            return 1;
        }

        if(dp[i][j]!=-1){
            return dp[i][j];
        }

        int right=solve(i,j+1,obstacleGrid,dp);
        int bottom=solve(i+1,j,obstacleGrid,dp);

        return dp[i][j]= right+bottom;
    }
    public int uniquePathsWithObstacles(int[][] obstacleGrid) {
        int[][]dp=new int [obstacleGrid.length][obstacleGrid[0].length];
        for(int[] a:dp){
            Arrays.fill(a,-1);
        }
        return solve(0,0,obstacleGrid,dp);
    }
}