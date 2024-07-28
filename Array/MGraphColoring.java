class solve {
    // Function to determine if graph can be coloured with at most M colours
    // such
    // that no two adjacent vertices of graph are coloured with same colour.
    public boolean graphColoring(boolean graph[][], int m, int n) {
        // Your code here
        int color[]=new int[n];
        Arrays.fill(color,0);
        return solve(graph,color,m,n,0);
    }
    public static boolean solve(boolean graph[][],int[] color,int m,int n,int node){
        if(node==n) return true;
        
        for(int i=1;i<=m;i++){
            if(isSafe(graph,n,color,node,i)){
                color[node]=i;
                if(solve(graph,color,m,n,node+1)) return true;
                color[node]=0;
            }
        }
        return false;
    }
    public static boolean isSafe(boolean graph[][],int n,int[] color,int node,int i){
        for(int j=0;j<n;j++){
            if(graph[node][j]==true && color[j]==i){
                return false;
            }
        }
        return true;
    }
}
