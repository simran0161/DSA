class Solution {
    public int myAtoi(String s) {
        int n=s.length();
        int res=0;
        int sign=1;
        int i=0;

        while (i < n && s.charAt(i) == ' ') {
            i++;
        }

        if (i == n) {
            return 0;
        }

        if(s.charAt(i)=='-'){
            sign=-1;
            i++;
        }
        else if(s.charAt(i)=='+'){
            sign=1;
            i++;
        }
        

        while(i<n && s.charAt(i)=='0'){
            i++;
        }
        
        while(i<n){
            char ch=s.charAt(i);
            if(Character.isDigit(ch)){
                int digit = ch - '0';

                if (res > Integer.MAX_VALUE / 10 ||
                    (res == Integer.MAX_VALUE / 10 && digit > 7)) {
                    return sign == 1 ? Integer.MAX_VALUE : Integer.MIN_VALUE;
                }

                res = res * 10 + digit;
                i++;
            }
            else{
                break;
            }
        }
        
        
        return res*sign;
    }
}