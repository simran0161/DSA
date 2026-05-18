class Solution {
    public int leastInterval(char[] tasks, int n) {
        PriorityQueue<Integer>pq=new PriorityQueue<>(Collections.reverseOrder());
        HashMap<Character,Integer>mp=new HashMap<>();

        for(int i=0;i<tasks.length;i++){
            mp.put(tasks[i],mp.getOrDefault(tasks[i],0)+1);
        }

        for(int i:mp.values()){
            pq.offer(i);
        }

        int res=0;

        while(!pq.isEmpty()){
            ArrayList<Integer>arr=new ArrayList<>();

            for(int i=1;i<=n+1;i++){
                if(!pq.isEmpty()){
                    int ele=pq.poll();
                    ele--;
                    arr.add(ele);
                }
            }

            for(int i=0;i<arr.size();i++){
                if(arr.get(i)>0){
                    pq.offer(arr.get(i));
                }
            }

            if(pq.isEmpty()){
                res+=arr.size();
            }
            else{
                res+=n+1;
            }
        }

        return res;
    }
}