import java.util.*;

class Solution {
    public int solution(int n, int[][] edge) {
        ArrayList<Integer>[] adj = new ArrayList[n + 1];
        for (int i = 1; i <= n; i++) adj[i] = new ArrayList<>();
        
        for (int[] e : edge) {
            adj[e[0]].add(e[1]);
            adj[e[1]].add(e[0]);
        }

        int[] dist = new int[n + 1];
        Queue<Integer> q = new LinkedList<>();

        q.add(1);
        dist[1] = 1;

        int maxDist = 0;
        while (!q.isEmpty()) {
            int curr = q.poll();
            
            for (int next : adj[curr]) {
                if (dist[next] == 0) {
                    dist[next] = dist[curr] + 1;
                    maxDist = Math.max(maxDist, dist[next]);
                    q.add(next);
                }
            }
        }

        int answer = 0;
        for (int d : dist) {
            if (d == maxDist) answer++;
        }

        return answer;
    }
}