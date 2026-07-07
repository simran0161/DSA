/**
 * Definition for a binary tree node.
 * public class TreeNode {
 *     int val;
 *     TreeNode left;
 *     TreeNode right;
 *     TreeNode() {}
 *     TreeNode(int val) { this.val = val; }
 *     TreeNode(int val, TreeNode left, TreeNode right) {
 *         this.val = val;
 *         this.left = left;
 *         this.right = right;
 *     }
 * }
 */
class Pair{
    TreeNode node;
    int idx;
    Pair(TreeNode node,int idx){
        this.node=node;
        this.idx=idx;
    }
}
class Solution {
    public int widthOfBinaryTree(TreeNode root) {
        if(root==null){
            return 0;
        }

        int res=0;
        Queue<Pair>queue=new LinkedList<>();
        queue.add(new Pair(root,1));

        while(!queue.isEmpty()){
            int n=queue.size();
            int start=0;
            int end=0;
            for(int i=0;i<n;i++){
                Pair pair=queue.poll();
                if(i==0){
                    start=pair.idx;
                }
                if(i==n-1){
                    end=pair.idx;
                }

                if(pair.node.left!=null){
                    queue.add(new Pair(pair.node.left,pair.idx*2));
                }
                if(pair.node.right!=null){
                    queue.add(new Pair(pair.node.right,pair.idx*2+1));
                }
            }
            res=Math.max(res,end-start+1);
        }
        return res;
    }
}