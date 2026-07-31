class Solution {
    public int maxProduct(int[] nums) {
        int maxprefix=Integer.MIN_VALUE;
        int maxsuffix=Integer.MIN_VALUE;

        int prefix=1;
        for(int i:nums){
            prefix=i*prefix;
            maxprefix=Math.max(maxprefix,prefix);
            if(prefix==0){
                prefix=1;
            }  
        }

        int suffix=1;
        for(int i=nums.length-1;i>=0;i--){
            suffix=suffix*nums[i];
            maxsuffix=Math.max(maxsuffix,suffix);
            if(suffix==0){
                suffix=1;
            }  
        }
        return Math.max(maxsuffix,maxprefix);
    }
}