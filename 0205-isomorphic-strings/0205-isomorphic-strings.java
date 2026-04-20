class Solution {
    public boolean isIsomorphic(String s, String t) {
        int n=s.length();
        if(s.length()!=t.length()){
            return false;
        }

        HashMap<Character,Character>mp=new HashMap<>();

        for(int i=0;i<n;i++){
            char charOfs=s.charAt(i);
            char charOft=t.charAt(i);
            if(mp.containsKey(charOfs)){
                if(mp.get(charOfs)!=charOft){
                    return false;
                }
            }
            else if(mp.containsValue(charOft)){
                return false;
            }

            mp.put(charOfs,charOft);
        }
        return true;
    }
}