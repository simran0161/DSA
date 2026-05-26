class Solution {
    public int numberOfSpecialChars(String word) {
        HashSet<Character>set=new HashSet<>();
        HashMap<Character,Integer>mp=new HashMap<>();
        for(char c:word.toCharArray()){
            set.add(c);
        }
        for(char c:set){
            System.out.println(c);
        }

        int res=0;
        for(int i=0;i<word.length();i++){
            if(Character.isLowerCase(word.charAt(i)) && !mp.containsKey(word.charAt(i))){
                if(set.contains(Character.toUpperCase(word.charAt(i)))){
                    res++;
                    mp.put(word.charAt(i),1);
                }
            }
        }
        return res;
    }
}