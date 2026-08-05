class Pair{
    int key;
    char value;
    Pair(int key,char value){
        this.key=key;
        this.value=value;
    }
}
class Solution {
    public String frequencySort(String s) {
        Map<Character,Integer>mp=new HashMap<>();

        for(int i=0;i<s.length();i++){
            mp.put(s.charAt(i),mp.getOrDefault(s.charAt(i),0)+1);
        }

        PriorityQueue<Pair>pq=new PriorityQueue<>((a,b)->b.key-a.key);
        for(Map.Entry<Character,Integer>entry:mp.entrySet()){
            pq.add(new Pair(entry.getValue(),entry.getKey()));
        }

        String res="";
        while(!pq.isEmpty()){
            Pair pair=pq.poll();
            for(int i=0;i<pair.key;i++){
                res+=pair.value;
            }
        }
        return res;
    }
}