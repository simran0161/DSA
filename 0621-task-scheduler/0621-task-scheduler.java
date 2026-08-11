class Solution {
    public int leastInterval(char[] tasks, int n) {
        Map<Character,Integer>mp=new HashMap<>();
        for(char ch:tasks){
            mp.put(ch,mp.getOrDefault(ch,0)+1);
        }

        PriorityQueue<Integer>pq=new PriorityQueue<>(Collections.reverseOrder());

        for(int i:mp.values()){
            pq.add(i);
        }

        int res=0;
        while(!pq.isEmpty()){
            int k=n+1;
            ArrayList<Integer>arr=new ArrayList<>();
            while(!pq.isEmpty() && k!=0){
                int freq=pq.poll();
                arr.add(freq-1);
                k--;
            }
            
            
            for(int i=0;i<arr.size();i++){
                if(arr.get(i)>0)pq.add(arr.get(i));
            }

            if(pq.isEmpty()){
                res+=arr.size();
            }else{
                res+=n+1;
            }
        }
        return res;
    }
}