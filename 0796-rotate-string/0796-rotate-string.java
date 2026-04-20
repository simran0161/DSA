class Solution {
    public boolean rotateString(String s, String goal) {
        String newStr=s+s;
        if(s.length()!=goal.length()){
            return false;
        }
        
        for(int i=0;i<newStr.length();i++){
            for(int j=i+1;j<=newStr.length();j++){
                String substr=newStr.substring(i,j);
                if(substr.length()<=goal.length()){
                    if(substr.equals(goal)){
                        return true;
                    }
                }
                else{
                    break;
                }
            }
        }
        return false;
    }
}