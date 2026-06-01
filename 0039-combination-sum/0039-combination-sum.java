class Solution {
    public void solve(int idx, int[] candidates,int target, List<List<Integer>> res,List<Integer> arr){
        if(idx==candidates.length){
            if(target==0){
                res.add(new ArrayList<>(arr));
            }
            return;    
        }

        if(candidates[idx]<=target){
            arr.add(candidates[idx]);
            solve(idx,candidates,target-candidates[idx],res,arr);
            arr.remove(arr.size()-1);
        }
        solve(idx+1,candidates,target,res,arr);
    }
    public List<List<Integer>> combinationSum(int[] candidates, int target) {
        List<List<Integer>> res=new ArrayList<>();
        solve(0,candidates,target,res,new ArrayList<>());
        return res;
    }
}