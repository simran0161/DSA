class Solution {
    public String largestNumber(int[] nums) {
        String res="";
        PriorityQueue<String>pq=new PriorityQueue<>((a,b)->(b+a).compareTo(a+b));

        for(int i:nums){
            pq.add(String.valueOf(i));
        }

        while(!pq.isEmpty()){
            String val=pq.poll();
            res+=val;
        }

        if (res.charAt(0) == '0') return "0";
        return res;
    }
}