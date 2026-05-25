class Solution {
    public boolean canReach(String s, int minJump, int maxJump) {
        if(s.charAt(0)=='1'){
            return false;
        }
        int farthest=0;
        Queue<Integer>queue=new LinkedList<>();
        queue.add(0);
        while(!queue.isEmpty()){
            int i=queue.poll();
            int start=Math.max(i+minJump,farthest+1);
            for(int j=start;j<=Math.min(i+maxJump,s.length()-1);j++){
                if(s.charAt(j)=='0'){
                    queue.add(j);
                    if(j==s.length()-1){
                        return true;
                    }
                }   
            }
            farthest=i+maxJump;
        }
        return false;
    }
}