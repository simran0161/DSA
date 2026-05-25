class Pair{
    int row;
    int col;
    public Pair(int row, int col){
        this.row=row;
        this.col=col;
    }
}
class Solution {
    public boolean check(int i, int j, int[][] image){
        if(i>=0 && j>=0 && i<image.length && j<image[0].length){
            return true;
        }
        return false;
    }
    public int[][] floodFill(int[][] image, int sr, int sc, int color) {
        if(image[sr][sc]==color){
            return image;
        }

        int[][] directions=new int[][]{{-1,0},{0,-1},{1,0},{0,1}};
        int oldcolor=image[sr][sc];
        Queue<Pair>queue=new LinkedList<>();
        image[sr][sc] = color;
        queue.add(new Pair(sr,sc));
        
        while(!queue.isEmpty()){
            Pair pair=queue.poll();
            for(int [] direction:directions){
                int new_row=pair.row+direction[0];
                int new_col=pair.col+direction[1];

                if(check(new_row,new_col,image) && image[new_row][new_col]==oldcolor){
                    image[new_row][new_col]=color;
                    queue.add(new Pair(new_row,new_col));
                }
            }
        }
        return image;
    }
} 