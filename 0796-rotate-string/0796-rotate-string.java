class Solution {
    public boolean rotateString(String s, String goal) {
        if(s.length()!=goal.length()) return false;
        String str=s+s;
        int n=goal.length();
        for(int i=0;i<str.length()-n;i++){
            String st=str.substring(i,i+n);
            System.out.println(st);
            if(st.equals(goal)){
                return true;
            }
        }
        return false;
    }
}