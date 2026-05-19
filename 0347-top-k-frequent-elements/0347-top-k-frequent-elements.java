class Pair{
    int key, value;
    public Pair(int key, int value){
        this.key=key;
        this.value=value;
    }
}
class Solution {
    public int[] topKFrequent(int[] nums, int k) {
        HashMap<Integer,Integer>mp=new HashMap<>();

        for(int i:nums){
            mp.put(i,mp.getOrDefault(i,0)+1);
        }

        PriorityQueue<Pair>pq=new PriorityQueue<>((a,b)->b.key-a.key);
        for(Map.Entry<Integer,Integer>entry:mp.entrySet()){
            pq.offer(new Pair(entry.getValue(),entry.getKey()));
        }

        int[] res=new int[k];
        for(int i=0;i<k;i++){
            Pair pair=pq.poll();
            res[i]=pair.value;
        }
        return res;
    }
}