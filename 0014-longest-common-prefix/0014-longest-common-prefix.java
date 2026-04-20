class Solution {
    public String longestCommonPrefix(String[] strs) {
        Arrays.sort(strs);
        if(strs.length==1){
            return strs[0];
        }

        int i=0;
        String first=strs[0];
        String last=strs[strs.length-1];
        while(i<first.length()){
            if(first.charAt(i)!=last.charAt(i)){
                return last.substring(0,i);
            }
            i++;
        }

        if(i==first.length()){
            return first;
        }
        return "";
    }
}