class Solution {
    int minsum=Integer.MAX_VALUE;
    public int dfs(int i, int j, int[][]grid, int[][] dp){
        if(i<0 || j<0 ||i>= grid.length || j>= grid[0].length){
            return Integer.MAX_VALUE;
        }
        if(i==grid.length-1 && j==grid[0].length-1){
            return grid[i][j];
        }

        if(dp[i][j]!=-1){
            return dp[i][j];
        }

        return dp[i][j]= grid[i][j]+Math.min(dfs(i+1,j,grid,dp),dfs(i,j+1,grid,dp));
    }
    public int minPathSum(int[][] grid) {
        
        int m=grid.length;
        int n=grid[0].length;
        int[][] dp=new int[m][n];
        // for(int[] a:dp){
        //     Arrays.fill(a,-1);
        // }

        // return dfs(0,0,grid,dp);

        for(int i=m-1;i>=0;i--){
            for(int j=n-1;j>=0;j--){
                if(i==m-1 && j==n-1){
                    dp[i][j]=grid[i][j];
                    continue;
                }
                else if(i == m - 1){
                    dp[i][j] = grid[i][j] + dp[i][j + 1];
                }

                else if(j == n - 1){
                    dp[i][j] = grid[i][j] + dp[i + 1][j];
                }
                else{
                    dp[i][j]=grid[i][j]+Math.min(dp[i+1][j],dp[i][j+1]);
                }
            }
        }
        return dp[0][0];
    }
}