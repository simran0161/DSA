class Solution {
    public int earliestFinishTime(int[] landStartTime, int[] landDuration, int[] waterStartTime, int[] waterDuration) {
        int m=landStartTime.length;
        int n=waterStartTime.length;
        int res=Integer.MAX_VALUE;

        for(int i=0;i<m;i++){
            for(int j=0;j<n;j++){
                int land=Math.max(landStartTime[i]+landDuration[i],waterStartTime[j])+waterDuration[j];
                res=Math.min(res,land);

                int water=Math.max(waterStartTime[j]+waterDuration[j],landStartTime[i])+landDuration[i];
                res=Math.min(res,water);
            }
        }
        return res;
    }
}