class Solution {
    // Function to return Breadth First Traversal of given graph.
    public ArrayList<Integer> bfsOfGraph(int V, ArrayList<ArrayList<Integer>> adj) {
        // Code here
        ArrayList<Integer> bfs=new ArrayList<>();
        boolean[] vis=new boolean[V];
        Queue<Integer> q=new LinkedList<>();
        q.add(0);
        vis[0]=true;
        while(!q.isEmpty()){
            Integer Node=q.poll();
            bfs.add(Node);
            for(Integer it:adj.get(Node)){
                if(vis[it]==false){
                    vis[it]=true;
                    q.add(it);
                }
            }
        }
        return bfs;
    }
}
