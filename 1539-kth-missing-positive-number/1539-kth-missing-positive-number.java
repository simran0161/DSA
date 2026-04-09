class Solution {
    public int findKthPositive(int[] arr, int k) {
        int n=arr.length;
        int ele=arr[n-1]-n;
        int res=0;

        if(ele>=k){
            HashMap<Integer,Integer>mp=new HashMap<>();
            for(int i:arr){
                mp.put(i,1);
            }

            int count=0;
            int val=0;
            for(int i=1;i<arr[n-1];i++){
                if(!mp.containsKey(i)){
                    val=i;
                    count++;
                }
                if(count==k){
                    return val;
                }
            }
        }
        else{
            res= arr[n-1]+(k-ele);
        }
        return res;
    }
}