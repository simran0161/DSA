class Solution {
    public String removeOuterParentheses(String s) {
        String res="";
        int bracket=0;
        for(int i=0;i<s.length();i++){
            if(s.charAt(i)=='('){
                if(bracket>0){
                    res+=s.charAt(i);
                }
                bracket++;
            }
            else{
                bracket--;
                if(bracket>0){
                    res+=s.charAt(i);
                }
            }
        }
        return res;
    }
}