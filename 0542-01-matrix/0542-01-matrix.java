class Pair{
    int row,col;
    Pair(int row,int col){
        this.row=row;
        this.col=col;
    }
}
class Solution {
    public boolean check(int r, int c, int m, int n){
        return r >= 0 && r < m && c >= 0 && c < n;
    }
    public int[][] updateMatrix(int[][] mat) {
        int m=mat.length;
        int n=mat[0].length;
        int[][] res=new int[m][n];
        int[][] directions=new int[][]{{-1,0},{0,-1},{1,0},{0,1}};

        Queue<Pair>queue=new LinkedList<>();

        for(int i=0;i<m;i++){
            for(int j=0;j<n;j++){
                if(mat[i][j]==0){
                    queue.add(new Pair(i,j));
                }
                else{
                    mat[i][j]=-1;
                }
            }
        }

        while(!queue.isEmpty()){
            Pair pair=queue.poll();
            for(int[] direction:directions){
                int newr=direction[0]+pair.row;
                int newc=direction[1]+pair.col;
                if(check(newr,newc,m,n) && mat[newr][newc]==-1 ){
                    mat[newr][newc]=mat[pair.row][pair.col]+1;
                    queue.add(new Pair(newr,newc));
                }
            }
        }
        return mat;
    }
}