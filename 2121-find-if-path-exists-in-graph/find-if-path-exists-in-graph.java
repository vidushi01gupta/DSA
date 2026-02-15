class Solution {
    public static boolean validPath(int n, int[][] edges, int source, int destination) {
        ArrayList<ArrayList<Integer>> graph=new ArrayList<>();
        for(int i = 0; i < n; i++) {
            graph.add(new ArrayList<>());
        }
        for(int[] e : edges) {
            graph.get(e[0]).add(e[1]);
            graph.get(e[1]).add(e[0]);
        }
        boolean[] vis = new boolean[n];
        return dfs(graph, source, destination, vis);
    }

    public static boolean dfs(ArrayList<ArrayList<Integer>> graph, int src, int dest, boolean[] vis) {
        if(src == dest) return true;
        vis[src] = true;
        for(int nei : graph.get(src)) {
            if(!vis[nei]) {
                if(dfs(graph, nei, dest, vis)) return true;
            }
        }

        return false;
        
    }
}