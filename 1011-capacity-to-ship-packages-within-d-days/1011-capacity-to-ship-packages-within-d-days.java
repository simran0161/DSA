class Solution {
    public int shipWithinDays(int[] weights, int days) {
        int low=0;
        int high=0;
        int res=0;

        for(int i:weights){
            low=Math.max(low,i);
            high+=i;
        }

        while(low<=high){
            int mid=low+(high-low)/2;

            int neededDays=1;
            int sum=0;
            for(int i:weights){
                if(sum+i>mid){
                    neededDays++;
                    sum=0;
                }
                sum+=i;
            }

            if(neededDays>days){
                low=mid+1;
            }
            else{
                res=mid;
                high=mid-1;
            }
        }
        return res;
    }
}