class Solution {
    public void setZeroes(int[][] matrix) {
        HashSet<Integer>setrow=new HashSet<>();
        HashSet<Integer>setcol=new HashSet<>();
        int m=matrix.length;
        int n=matrix[0].length;

        for(int i=0;i<m;i++){
            for(int j=0;j<n;j++){
                if(matrix[i][j]==0){
                    setrow.add(i);
                    setcol.add(j);
                }
            }
        }

        for(int i:setrow){
            for(int j=0;j<n;j++){
                matrix[i][j]=0;
            }
        }

        for(int i:setcol){
            for(int j=0;j<m;j++){
                matrix[j][i]=0;
            }
        }
        
    }
}