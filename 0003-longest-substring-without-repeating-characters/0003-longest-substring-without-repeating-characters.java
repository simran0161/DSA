class Solution {
    public int lengthOfLongestSubstring(String s) {
        int n=s.length();
        int l=0;
        int r=0;
        int res=0;
        HashMap<Character,Integer>mp=new HashMap<>();

        while(r<n){
            if(mp.containsKey(s.charAt(r))){
                if(l<=mp.get(s.charAt(r))){
                    l=mp.get(s.charAt(r))+1;
                }
            }
            mp.put(s.charAt(r),r);
            res=Math.max(res,r-l+1);
            r++;
        }
        return res;
    }
}