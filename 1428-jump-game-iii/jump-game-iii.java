class Solution {
    public static boolean canReach(int[] arr, int start) {
        int n = arr.length;
        Queue<Integer> q = new LinkedList<>();
        boolean[] visited = new boolean[n];
        q.add(start);
        visited[start] = true;
        while (!q.isEmpty()) {
            int idx = q.poll();
            if (arr[idx] == 0) {
                return true;
            }
            int forward = idx + arr[idx];
            if (forward < n && !visited[forward]) {
                q.add(forward);
                visited[forward] = true;
            }
            int backward = idx - arr[idx];
            if (backward >= 0 && !visited[backward]) {
                q.add(backward);
                visited[backward] = true;
            }
        }

        return false;
        
    }
}