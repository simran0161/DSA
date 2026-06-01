class Solution {
    List<List<Integer>>res=new ArrayList<>();
    public void solve(int idx,int[] candidates,int target, List<List<Integer>>res, List<Integer> ds){

        if(target==0){
            res.add(new ArrayList<>(ds));
            return;
        }
        
        for(int i=idx;i<candidates.length;i++){
            if(i>idx && candidates[i]==candidates[i-1]) continue;
            if(candidates[i]>target) break;

            ds.add(candidates[i]);
            solve(i+1,candidates,target-candidates[i],res,ds);
            ds.remove(ds.size()-1);
        }
    }
    public List<List<Integer>> combinationSum2(int[] candidates, int target) {
        Arrays.sort(candidates);
        solve(0,candidates,target,res,new ArrayList<>());
        return res;
    }
}