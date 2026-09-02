class Solution {
    public List<List<Integer>> threeSum(int[] nums) {
        int n=nums.length;
        Arrays.sort(nums);
        List<List<Integer>>res=new ArrayList<>();

        Set<List<Integer>> set=new HashSet<>();

        for(int i=0;i<n;i++){
            int j=i+1;
            int k=n-1;

            while(j<k){
                if(nums[i]+nums[j]+nums[k]==0){
                    set.add(Arrays.asList(nums[i],nums[j],nums[k]));
                    j++;
                    k--;
                }
                else if(nums[i]+nums[j]+nums[k]<0){
                    j++;
                }
                else{
                    k--;
                }
            }   
        }
        res.addAll(set);
        return res;
    }
}