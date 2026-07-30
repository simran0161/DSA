class Solution {
    public int characterReplacement(String s, int k) {
        int n=s.length();
        int l=0;
        int r=0;
        int max=0;
        int res=0;
        HashMap<Character,Integer>mp=new HashMap<>();

        while(r<n){
            mp.put(s.charAt(r),mp.getOrDefault(s.charAt(r),0)+1);
            max=Math.max(max,mp.get(s.charAt(r)));

            while((r-l+1)-max>k){
                mp.put(s.charAt(l),mp.get(s.charAt(l))-1);
                if(mp.get(s.charAt(l))==0){
                    mp.remove(s.charAt(l));
                }
                l++;
            }

            res=Math.max(res,r-l+1);
            r++;
        }
        return res;
    }
}