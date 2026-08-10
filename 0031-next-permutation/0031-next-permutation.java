class Solution {
    public void swap(int i, int j, int[] nums){
        int temp=nums[i];
        nums[i]=nums[j];
        nums[j]=temp;
    }

    public void reverse(int i, int j, int [] nums){
        while(i<j){
            swap(i,j,nums);
            i++;
            j--;
        }
    }
    public void nextPermutation(int[] nums) {
        int n=nums.length;
        int i=n-1;
        while(i>0 && nums[i]<=nums[i-1]){
            i--;
        }

        if(i==0){
            reverse(0,n-1,nums);
            return;
        }

        int j=n-1;
        while(j>=i && nums[i-1]>=nums[j]){
            j--;
        }

        swap(i-1,j,nums);
        reverse(i,n-1,nums);
    }
}