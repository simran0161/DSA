class Solution {
    public boolean solve(int idx,int prev,int[] stones,Map<Integer,Integer>mp,Boolean [][] dp){
        if(idx==stones.length-1){
            return true;
        }

        if(dp[idx][prev]!=null){
            return dp[idx][prev];
        }

        for(int i=prev-1;i<=prev+1;i++){
            if(i<=0) continue;
            int curr_stone=stones[idx]+i;
            if(mp.containsKey(curr_stone)){
                if(solve(mp.get(curr_stone),i,stones,mp,dp)){
                    return dp[idx][prev]= true;
                }
            }
        }
        return dp[idx][prev] =false;
    }
    public boolean canCross(int[] stones) {
        int n=stones.length;
        HashMap<Integer,Integer>mp=new HashMap<>();
        for(int i=0;i<stones.length;i++){
            mp.put(stones[i],i);
        }

        Boolean [][] dp=new Boolean[n][n+1];

        return solve(0,0,stones,mp,dp);
    }
}