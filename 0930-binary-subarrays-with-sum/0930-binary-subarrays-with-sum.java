class Solution {
    public int numSubarraysWithSum(int[] nums, int goal) {
        int n=nums.length;
        int i=0;
        int count=0;
        int sum=0;
        HashMap<Integer,Integer>mp=new HashMap<>();
        mp.put(0,1);

        while(i<n){
            sum+=nums[i];
            if(mp.containsKey(sum-goal)){
                count+=mp.get(sum-goal);
            }
            mp.put(sum,mp.getOrDefault(sum,0)+1);
            i++;
        }
        return count;
    }
}