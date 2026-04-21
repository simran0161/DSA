class Solution {
    public int maxDepth(String s) {
        int bal=0;
        int res=0;

        for(int i=0;i<s.length();i++){
            char c=s.charAt(i);
            if(c=='('){
                bal++;
                res=Math.max(bal,res);
            }
            else if(c==')'){
                bal--;
            }
        }
        return res;
    }
}