class Solution {
    // Function to detect cycle in a directed graph.
    public boolean isCyclic(int V, ArrayList<ArrayList<Integer>> adj) {
        // code here
        int vis[]=new int[V];
        for(int i=0;i<V;i++){
            if(vis[i]==0){
                if(dfs(i,-1,vis,adj)==true) return true;
            }
        }
        return false;
    }
    public boolean dfs(int node,int parent,int[] vis,ArrayList<ArrayList<Integer>> adj){
        vis[node]=1;
        for(int adjNode:adj.get(node)){
            if(vis[adjNode]==0){
                if(dfs(adjNode,node,vis,adj)==true) return true;
                
            }
            else if(vis[adjNode]==1) return true;
        }
        vis[node]=2;
        return false;
    }
}
