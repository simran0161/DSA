class Solution {
    public int longestConsecutive(int[] nums) {
        int res=0;
        HashSet<Integer> set = new HashSet<>();

        for(int num : nums){
            set.add(num);
        }

        for(int it:set){
            if(!set.contains(it-1)){
                int ele=it;
                while(set.contains(ele)){
                    ele=ele+1;
                }
                res=Math.max(res,ele-it);
            }
        }
        return res;
    }
}