class Solution {
    public int beautySum(String s) {
        int n=s.length();
        int res=0;

        for(int i=0;i<n;i++){
            HashMap<Character,Integer>mp=new HashMap<>();
            for(int j=i;j<n;j++){
                mp.put(s.charAt(j),mp.getOrDefault(s.charAt(j),0)+1);

                int min=Integer.MAX_VALUE;
                int max=Integer.MIN_VALUE;

                for(Map.Entry<Character,Integer>entry:mp.entrySet()){
                    min=Math.min(min,entry.getValue());
                    max=Math.max(max,entry.getValue());
                }

                res+=(max-min);
            }
        }
        return res;
    }
}