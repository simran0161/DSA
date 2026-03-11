class Solution {

    public boolean dfs(int i, int j, int idx, char[][] board,String word){
        if(idx==word.length()){
            return true;
        }

        if(i<0 || j<0 || i>=board.length || j>=board[0].length || board[i][j]!=word.charAt(idx)){
            return false;
        }

        char ch=board[i][j];
        board[i][j]='#';

        
        boolean res= dfs(i+1,j,idx+1,board,word)||
                dfs(i,j+1,idx+1,board,word)||
                dfs(i-1,j,idx+1,board,word)||
                dfs(i,j-1,idx+1,board,word);
        

        board[i][j]=ch;

        return res;
    }
    public boolean exist(char[][] board, String word) {
        int m=board.length;
        int n=board[0].length;

        for(int i=0;i<m;i++){
            for(int j=0;j<n;j++){
                if(word.charAt(0)==board[i][j]){
                    if(dfs(i,j,0,board,word)){
                        return true;
                    }
                }
            }
        }
        return false;
    }
}