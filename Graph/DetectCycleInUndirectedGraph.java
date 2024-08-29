class Pair{
    int first;
    int second;
    Pair(int f,int s){
        this.first=f;
        this.second=s;
    }
}
class Solution {
    // Function to detect cycle in an undirected graph.
    public boolean isCycle(int V, ArrayList<ArrayList<Integer>> adj) {
        // Code here
        boolean[] vis=new boolean[V];
        for(int i=0;i<V;i++) vis[i]=false;
        for(int i=0;i<V;i++){
            if(vis[i]==false){
                if(checkCycle(i,V,adj,vis)){
                    return true;
                }
            }
        }
        return false;
    }
    public boolean checkCycle(int src,int V,ArrayList<ArrayList<Integer>> adj,boolean[] vis){
        vis[src]=true;
        Queue<Pair> q=new LinkedList<>();
        q.add(new Pair(src,-1));
        while(!q.isEmpty()){
            int node=q.peek().first;
            int parent=q.peek().second;
            q.remove();
            for(Integer adjNode:adj.get(node)){
                if(vis[adjNode]==false){
                    vis[adjNode]=true;
                    q.add(new Pair(adjNode,node));
                }
                else if(parent!=adjNode){
                    return true;
                }
            }
        }
        return false;
    }
}
