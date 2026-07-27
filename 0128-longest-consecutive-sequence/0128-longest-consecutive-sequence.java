class Solution {
    public int longestConsecutive(int[] nums) {
        HashSet<Integer>set=new HashSet<>();
        for(int i:nums){
            set.add(i);
        }

        int res=0;
        for(int i:set){
            if(!set.contains(i-1)){
                int start=i;
                int j=0;
                while(set.contains(start+j)){
                    j++;
                }
                res=Math.max(res,j);
            }
        }
        return res;
    }
}