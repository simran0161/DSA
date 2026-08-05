class Solution {
    public String reverseWords(String s) {
        String st=s.strip();
        String [] arr=st.split(" ");
        StringBuilder res=new StringBuilder();
        
        for(int i=arr.length-1;i>=0;i--){
            if(arr[i]!=""){
                res.append(arr[i]);
                res.append(" ");
            }
        }
        String result=res.toString().strip();
        return result;

    }
}