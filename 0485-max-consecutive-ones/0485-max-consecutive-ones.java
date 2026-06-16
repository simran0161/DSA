class Solution {
    public int findMaxConsecutiveOnes(int[] nums) {
        int count=0;
        int i=0;
        int res=0;

        while(i<nums.length){
            if(nums[i]==1){
                count++;
            }
            else{
                count=0;
            }
            res=Math.max(res,count);
            i++;
        }
        return res;
    }
}