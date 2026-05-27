class Solution {
    public int numberOfSpecialChars(String word) {

        HashMap<Character,Integer> firstUpper = new HashMap<>();
        HashMap<Character,Integer> lastLower = new HashMap<>();

        for(int i=0;i<word.length();i++){

            char ch = word.charAt(i);

            if(Character.isLowerCase(ch)){
                lastLower.put(ch,i);
            }
            else{
                firstUpper.putIfAbsent(ch,i);
            }
        }

        int count = 0;

        for(char ch : lastLower.keySet()){

            char upper = Character.toUpperCase(ch);

            if(firstUpper.containsKey(upper) && lastLower.get(ch) < firstUpper.get(upper)){
                count++;
            }
        }

        return count;
    }
}