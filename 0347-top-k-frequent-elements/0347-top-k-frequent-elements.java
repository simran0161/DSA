class Pair{
    int key;
    int val;
    Pair(int key,int val){
        this.key=key;
        this.val=val;
    }
}
class Solution {
    public int[] topKFrequent(int[] nums, int k) {
        int[] res=new int[k];
        Map<Integer,Integer>mp=new HashMap<>();
        for(int i:nums){
            mp.put(i,mp.getOrDefault(i,0)+1);
        }

        PriorityQueue<Pair>pq=new PriorityQueue<>((a,b)->b.val-a.val);

        for(Map.Entry<Integer,Integer>entry:mp.entrySet()){
            pq.add(new Pair(entry.getKey(),entry.getValue()));
        }

        int c=0;
        while(!pq.isEmpty() && c!=k){
            Pair p=pq.poll();
            res[c]=p.key;
            c++;
        }

        return res;
    }
}