class Solution {
    public int romanToInt(String s) {
        int n=s.length();
        HashMap<Character,Integer>mp=new HashMap<>();
        mp.put('I',1);
        mp.put('V',5);
        mp.put('X',10);
        mp.put('L',50);
        mp.put('C',100);
        mp.put('D',500);  
        mp.put('M',1000);

        int res=0;
        for(int i=0;i<n;i++){
            if(i!=n-1 && mp.get(s.charAt(i+1))>mp.get(s.charAt(i))){
                res+=mp.get(s.charAt(i+1))-mp.get(s.charAt(i));
                i++;
            }
            else{
                res+=mp.get(s.charAt(i));
            }
        }
        return res;
    }
}