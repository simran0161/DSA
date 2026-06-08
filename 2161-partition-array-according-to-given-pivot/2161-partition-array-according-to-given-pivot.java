class Solution {
    public int[] pivotArray(int[] nums, int pivot) {
        int n=nums.length;
        int[] res=new int[n];

        int i=0;
        for(int j=0;j<n;j++){
            if(nums[j]<pivot){
                res[i]=nums[j];
                i++;
            }
        }

        for(int j=0;j<n;j++){
            if(nums[j]==pivot){
                res[i]=nums[j];
                i++;
            }
        }

        for(int j=0;j<n;j++){
            if(nums[j]>pivot){
                res[i]=nums[j];
                i++;
            }
        }

        return res;
    }
}