class Pair{
    int row;
    int col;
    int time;
    public Pair(int row, int col, int time){
        this.row=row;
        this.col=col;
        this.time=time;
    }
}
class Solution {
    public boolean check(int i, int j, int[][] grid){
        if(i>=0 && j>=0 && i<grid.length && j<grid[0].length){
            return true;
        }
        return false;
    }
    public int orangesRotting(int[][] grid) {
        int[][] directions=new int[][]{{-1,0},{0,1},{0,-1},{1,0}};
        int m=grid.length;
        int n=grid[0].length;
        int time=0;
        int fresh=0;
        Queue<Pair>queue=new LinkedList<>();
        for(int i=0;i<m;i++){
            for(int j=0;j<n;j++){
                if(grid[i][j]==2){
                    queue.add(new Pair(i,j,0));
                }
                else if(grid[i][j]==1){
                    fresh++;
                }
            }
        }

        while(!queue.isEmpty()){
            Pair pair=queue.poll();
            for(int[] direction:directions){
                int new_row=pair.row + direction[0];
                int new_col=pair.col + direction[1];
                if(check(new_row,new_col,grid) && grid[new_row][new_col]==1){
                    grid[new_row][new_col]=2;
                    time=pair.time+1;
                    queue.add(new Pair(new_row,new_col,pair.time+1));
                    fresh--;
                }
            }
        }

        if(fresh==0){
            return time;
        }
        else{
            return -1;
        }
    }
}