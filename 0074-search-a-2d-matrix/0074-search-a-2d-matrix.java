class Solution {
    public boolean searchMatrix(int[][] matrix, int target) {
        int m=matrix.length;
        int n=matrix[0].length;

        for(int i=0;i<m;i++){
            int low=0;
            int high=n-1;
            System.out.println(low);
            System.out.println(high);
            if(matrix[i][low] <=target && matrix[i][high] >=target){
                while(low<=high){
                    int mid=low+(high-low)/2;
                    System.out.println(mid);
                    if(matrix[i][mid]==target){
                        return true;
                    }
                    else if(matrix[i][mid]<target){
                        low=mid+1;
                    }
                    else{
                        high=mid-1;
                    }
                }
            }
        }
        return false;
    }
}