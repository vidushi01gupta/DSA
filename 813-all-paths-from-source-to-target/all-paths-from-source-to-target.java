class Solution {
    public static List<List<Integer>> allPathsSourceTarget(int[][] graph) {
        List<List<Integer>> result=new ArrayList<>();
        List<Integer> path = new ArrayList<>();
        int dest=graph.length-1;
        path.add(0);
        printAllPath(graph, 0,dest, path, result);
        return result;
    }
    public static void printAllPath(int graph[][],int src,int dest,List<Integer> path,List<List<Integer>> result){
        if(src==dest){
            result.add(new ArrayList<>(path));
            return;
        }
        for(int i=0;i<graph[src].length;i++){
            int neigh=graph[src][i];
            path.add(neigh);
            printAllPath(graph, neigh, dest, path, result);
            path.remove(path.size() - 1);
            
        }
    }
}