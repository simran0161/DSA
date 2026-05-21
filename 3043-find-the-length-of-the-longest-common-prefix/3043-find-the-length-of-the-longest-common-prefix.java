class Solution {
    public int longestCommonPrefix(int[] arr1, int[] arr2) {
        HashSet<String>set=new HashSet<>();
        int res=0;

        for(int i:arr1){
            String val=String.valueOf(i);
            for(int j=0;j<val.length();j++){
                set.add(val.substring(0,j+1));
            }
        }

        for(int i:arr2){
            String val=String.valueOf(i);
            for(int j=0;j<val.length();j++){
                String prefix=val.substring(0,j+1);
                if(set.contains(prefix)){
                    res=Math.max(res,prefix.length());
                }
            }
        }
        return res;
    }
}