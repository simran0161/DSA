class Solution {
    public int romanToInt(String s) {
        HashMap<Character,Integer>mp=new HashMap<>();
        mp.put('I',1);
        mp.put('V',5);
        mp.put('X',10);
        mp.put('L',50);
        mp.put('C',100);
        mp.put('D',500);
        mp.put('M',1000);

        int res=0;
        for(int i=0;i<s.length();i++){
            char c=s.charAt(i);
            if(i+1<s.length() && mp.get(s.charAt(i+1))>mp.get(c)){
                res+=mp.get(s.charAt(i+1))-mp.get(c);
                i++;
                System.out.println(res);
            }
            else{
                res+=mp.get(c);
                System.out.println(res);
            }
        }
        return res;
    }
}