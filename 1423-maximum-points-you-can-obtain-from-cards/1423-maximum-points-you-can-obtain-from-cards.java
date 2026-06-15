class Solution {
    public int maxScore(int[] cardPoints, int k) {
        int res=0;
        int lsum=0;
        int rsum=0;

        for(int i=0;i<k;i++){
            lsum+=cardPoints[i];
        }
        res=lsum;

        int j=cardPoints.length-1;
        for(int i=k-1;i>=0;i--){
            lsum=lsum-cardPoints[i];
            rsum+=cardPoints[j];
            if(lsum+rsum>res){
                res=lsum+rsum;
            }
            j--;
        }
        return res;
    }
}