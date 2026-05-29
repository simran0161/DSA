class Solution {
    public int sumOfDigits(int n){
        int sum=0;
        while(n!=0){
            int rem=n%10;
            sum+=rem;
            n=n/10;
        }
        return sum;
    }
    public int minElement(int[] nums) {
        int[] arr=new int[nums.length];
        int res=Integer.MAX_VALUE;

        for(int i=0;i<nums.length;i++){
            arr[i]=sumOfDigits(nums[i]);
        }

        for(int i:arr){
            res=Math.min(i,res);
        }
        return res;
    }
}