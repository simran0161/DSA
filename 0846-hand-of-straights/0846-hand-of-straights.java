class Solution {
    public boolean isNStraightHand(int[] hand, int groupSize) {
        Map<Integer,Integer>mp=new HashMap<>();
        for(int i:hand){
            mp.put(i,mp.getOrDefault(i,0)+1);
        }

        PriorityQueue<Integer>pq=new PriorityQueue<>();
        for(int i:mp.keySet()){
            pq.add(i);
        }

        while(!pq.isEmpty()){
            int val=pq.peek();

            for(int i=0;i<groupSize;i++){
                if(!mp.containsKey(i+val)){
                    return false;
                }
                mp.put(i+val,mp.get(i+val)-1);
                if(mp.get(i+val)==0){
                    mp.remove(i+val);
                    pq.remove(i+val);
                }
            }
        }
        return true;
    }
}