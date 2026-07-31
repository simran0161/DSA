class Solution {
    public int numberOfSubstrings(String s) {
        int i=0;
        int j=0;
        int n=s.length();
        int res=0;
        HashMap<Character,Integer>mp=new HashMap<>();

        while(j<n){
            mp.put(s.charAt(j),mp.getOrDefault(s.charAt(j),0)+1);
            while(mp.size()>2){
                res+=n-j;
                char c=s.charAt(i);
                mp.put(c,mp.get(c)-1);
                if(mp.get(c)==0){
                    mp.remove(c);
                }
                i++;
            }
            j++;
        }
        return res;
    }
}