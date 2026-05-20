class Solution {
    public List<Integer> majorityElement(int[] nums) {
        HashMap<Integer,Integer>mp=new HashMap<>();
        List<Integer>res=new ArrayList<>();
        for(int i:nums){
            mp.put(i,mp.getOrDefault(i,0)+1);
        }

        int n=nums.length;
        int c=(int)Math.ceil(n/3);

        for(Map.Entry<Integer,Integer>entry:mp.entrySet()){
            if(entry.getValue()>c){
                res.add(entry.getKey());
            }
        }
        return res;
    }
}