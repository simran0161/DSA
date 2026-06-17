class Solution {
    public int[] rearrangeArray(int[] nums) {
        int n=nums.length;
        int[] positive=new int[(n/2)+1];
        int[] negative=new int[(n/2)+1];

        int j=0;
        int k=0;
        for(int i:nums){
            if(i>0){
                positive[j]=i;
                j++;
            }
            else{
                negative[k]=i;
                k++;
            }
        }

        int[] res=new int[n];
        j=0;
        k=0;
        int flag=0;
        for(int i=0;i<n;i++){
            if(flag==0){
                res[i]=positive[j];
                j++;
                flag=1;
            }
            else{
                res[i]=negative[k];
                k++;
                flag=0;
            }
        }
        return res;

    }
}