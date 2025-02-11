class Solution {
    public void bfs(List<List<Integer>> adj,int []vis,int node){
        Queue <Integer> q=new LinkedList<>();
        int n=adj.size();
        q.add(node);
        vis[node]=1;
        while(!q.isEmpty()){
            int p=q.poll();
            for(int it:adj.get(p)){
                if(vis[it]==0){
                    vis[it]=1;
                    q.add(it);
                }
            }
        }
    }
    // public void dfs(List<List<Integer>> adj,int []vis,int node){
    //     vis[node]=1;
    //     for (int neighbor : adj.get(node)) {
    //         if (vis[neighbor] == 0) {
    //             dfs(adj, vis, neighbor);
    //         }
    //     }
    // }
    public int findCircleNum(int[][] isConnected) {
        int n=isConnected.length;
        List<List<Integer>> adj=new ArrayList<>();
         for (int i = 0; i < n; i++) {
            adj.add(new ArrayList<>());
        }
        for(int i=0;i<n;i++){
            for(int j=0;j<n;j++){
                if(i!=j&&isConnected[i][j]==1){
                    adj.get(i).add(j);
                }
            }
        }
        int[] vis=new int[n];
        int cnt=0;
        for(int i=0;i<n;i++){
            if(vis[i]==0){
                bfs(adj,vis,i);
                cnt++;
            }
        }
        return cnt;


    }
}