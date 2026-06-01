class Solution {
    public int minimumCost(int[] cost) {
        Arrays.sort(cost);
        int mincost=0;
        int n=cost.length;
        int c=0;

        for(int i=n-1;i>=0;i--){
            if(c==2){
                c=0;
                continue;
            }
            mincost+=cost[i];
            c++;
        }
        return mincost;
    }
}