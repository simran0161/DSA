class Solution {
    public List<List<Integer>> fourSum(int[] nums, int target) {
        List<List<Integer>> list=new ArrayList<>();
        Arrays.sort(nums);
        for(int i=0;i<nums.length;i++){
            if(i>0 && nums[i]==nums[i-1]) continue;
            for(int j=i+1;j<nums.length;){
                int a=j+1;
                int b=nums.length-1;
                while(a<b){
                    if((long)nums[i]+(long)nums[j]+(long)nums[a]+(long)nums[b]==target){
                        list.add(Arrays.asList(nums[i],nums[j],nums[a],nums[b]));
                        a++;
                        b--;

                        while(a<b && nums[a]==nums[a-1]) a++;
                    }
                    else if((long)nums[i]+(long)nums[j]+(long)nums[a]+(long)nums[b]<target){
                        a++;
                    }
                    else {
                        b--;
                    }
                }
                j++;
                while(j<nums.length && nums[j]==nums[j-1]) j++;
            }
        }
        return list;
    }
}