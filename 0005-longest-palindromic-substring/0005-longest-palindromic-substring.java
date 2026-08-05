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
        int n=s.length();
        int res=0;
        String result="";
        for(int i=0;i<n;i++){
            for(int j=i+1;j<=n;j++){
                String st=s.substring(i,j);
                if(check(st)){
                    if (st.length() > res) {      
                        res = st.length();
                        result = st;
                    }
                }
            }
        }
        return result;
    }
}