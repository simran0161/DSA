class Solution {
    public int maxDepth(String s) {
        int bal=0;
        int max=0;

        for(int i=0;i<s.length();i++){
            char ch=s.charAt(i);
            if(ch=='('){
                bal++;
                max=Math.max(max,bal);
            }
            else if(ch==')'){
                bal--;
            }
        }
        return max;
    }
}