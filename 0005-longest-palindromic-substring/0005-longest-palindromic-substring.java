class Solution {
    public boolean check(String s){
        int i=0;
        int j=s.length()-1;
        while(i<j){
            if(s.charAt(i)!=s.charAt(j)){
                return false;
            }
            i++;
            j--;
        }
        return true;
    }
    public String longestPalindrome(String s) {
        int idx=-1;
        int len=0;

        for(int i=0;i<s.length();i++){
            for(int j=i+1;j<=s.length();j++){
                if(check(s.substring(i,j))&& (j - i) > len){
                    len=j-i;
                    idx=i;
                }
            }
        }
        return s.substring(idx,idx+len);
    }
}