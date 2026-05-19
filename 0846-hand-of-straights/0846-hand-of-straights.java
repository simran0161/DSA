class Solution {
    public boolean isNStraightHand(int[] hand, int groupSize) {
        int len=hand.length;
        if(len%groupSize!=0){
            return false;
        }

        Map<Integer,Integer> mp=new HashMap<>();

        for(int i:hand){
            mp.put(i,mp.getOrDefault(i,0)+1);
        }

        PriorityQueue<Integer>pq=new PriorityQueue<>();
        for(int i:mp.keySet()){
            pq.offer(i);
        }

        while(!pq.isEmpty()){
            int min=pq.peek();

            for(int i=0;i<groupSize;i++){
                if(!mp.containsKey(min+i)){
                    return false;
                }
                mp.put(min+i,mp.get(min+i)-1);

                if(mp.get(min+i)==0){
                    mp.remove(min+i);
                    pq.remove(min+i);
                }
            }
        }
        return true;
    }
}