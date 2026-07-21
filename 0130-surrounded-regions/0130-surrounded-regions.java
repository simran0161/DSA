class Pair{
    int row,col;
    Pair(int row,int col){
        this.row=row;
        this.col=col;
    }
}
class Solution {
    public boolean check(int i, int j, int m, int n) {
        return i >= 0 && i < m && j >= 0 && j < n;
    }
    public void solve(char[][] board) {
        int m=board.length;
        int n=board[0].length;
        int[][] directions=new int[][]{{-1,0},{0,-1},{0,1},{1,0}};

        Queue<Pair>queue=new LinkedList<>();
        
        for(int i=0;i<m;i++){
            for(int j=0;j<n;j++){
                if((i==0 || j==0 || i==m-1 || j==n-1) && board[i][j]=='O'){
                    queue.add(new Pair(i,j));
                    board[i][j]='V';
                }
            }
        }

        while(!queue.isEmpty()){
            Pair pair=queue.poll();
            for(int[] direction:directions){
                int newr=direction[0]+pair.row;
                int newc=direction[1]+pair.col;
                if(check(newr,newc,m,n) && board[newr][newc]=='O'){
                    queue.add(new Pair(newr,newc));
                    board[newr][newc]='V';
                }
            }
        }

        for(int i=0;i<m;i++){
            for(int j=0;j<n;j++){
                if(board[i][j]=='O'){
                    board[i][j]='X';
                }
                else if(board[i][j]=='V'){
                    board[i][j]='O';
                }
            }
        }

    }
}