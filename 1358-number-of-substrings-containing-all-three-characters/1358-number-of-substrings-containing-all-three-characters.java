class Solution {
    public int numberOfSubstrings(String s) {
        int res=0;
        int l=0;
        int r=0;
        int n=s.length();
        HashMap<Character,Integer>mp=new HashMap<>();

        while(r<n){
            char ch=s.charAt(r);
            mp.put(ch,mp.getOrDefault(ch,0)+1);

            while(mp.size()>2){
                res+=n-r;
                mp.put(s.charAt(l),mp.get(s.charAt(l))-1);
                if(mp.get(s.charAt(l))==0){
                    mp.remove(s.charAt(l));
                }
                l++;
            }
            r++;
        }
        return res;
    }
}