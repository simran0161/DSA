class Solution {
    public void dfs(int i,ArrayList<ArrayList<Integer>> graph,boolean[] visited){
        visited[i] = true;
        for(int ngh : graph.get(i)){
            if(!visited[ngh]){
                dfs(ngh, graph, visited);
            }
        }
    }

    public int findCircleNum(int[][] isConnected) {
        int c = 0;
        int n = isConnected.length;

        ArrayList<ArrayList<Integer>> graph = new ArrayList<>();
        boolean[] visited = new boolean[n];

        for(int i = 0; i < n; i++){
            graph.add(new ArrayList<>());
        }

        for(int i = 0; i < n; i++){
            for(int j = 0; j < n; j++){
                if(i != j && isConnected[i][j] == 1){
                    graph.get(i).add(j);
                }
            }
        }

        for(int i = 0; i < n; i++){
            if(!visited[i]){
                c++;
                dfs(i, graph, visited);
            }
        }

        return c;
    }
}