class Pair{
    char key;
    int value;
    Pair(char key, int value){
        this.key=key;
        this.value=value;
    }

}
class Solution {
    public String frequencySort(String s) {
        HashMap<Character,Integer> mp=new HashMap<>();
        for(char c:s.toCharArray()){
            mp.put(c,mp.getOrDefault(c,0)+1);
        }

        PriorityQueue<Pair>pq=new PriorityQueue<>((a, b) -> Integer.compare(b.value, a.value));
        for(Map.Entry<Character,Integer>entry:mp.entrySet()){
            pq.offer(new Pair(entry.getKey(),entry.getValue()));
        }

        StringBuilder sb=new StringBuilder();

        while (!pq.isEmpty()){
            Pair pair=pq.poll();
            for(int i=0;i<pair.value;i++){
                sb.append(pair.key);
            }
        }

        return sb.toString();

    }
}