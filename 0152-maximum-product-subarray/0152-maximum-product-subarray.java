class Solution {
    public int maxProduct(int[] nums) {
        int maxprefix=Integer.MIN_VALUE;
        int maxsuffix=Integer.MIN_VALUE;
        int n=nums.length;

        int prefix=1;

        for(int i:nums){
            prefix*=i;
            maxprefix=Math.max(prefix,maxprefix);
            if(prefix==0) prefix=1;
        }

        int suffix=1;
        for(int i=n-1;i>=0;i--){
            suffix*=nums[i];
            maxsuffix=Math.max(suffix,maxsuffix);
            if(suffix==0) suffix=1;
        }

        System.out.println(maxsuffix);
        System.out.println(maxprefix);

        return Math.max(maxprefix,maxsuffix);
    }
}