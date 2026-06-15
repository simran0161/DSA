class Solution {
    public int characterReplacement(String s, int k) {
        int n=s.length();
        HashMap<Character,Integer>mp=new HashMap<>();
        int i=0;
        int j=0;
        int res=0;
        int maxFreq=0;

        while(j<n){
            mp.put(s.charAt(j),mp.getOrDefault(s.charAt(j),0)+1);
            maxFreq=Math.max(maxFreq,mp.get(s.charAt(j)));

            while((j-i+1)-maxFreq>k){
                char leftchar=s.charAt(i);
                mp.put(leftchar,mp.get(leftchar)-1);
                i++;
            }

            res=Math.max(j-i+1,res);
            j++;
        }
        return res;
    }
}