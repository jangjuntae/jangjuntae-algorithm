import java.io.*;
import java.util.*;

public class Solution {
	static boolean[][] graph;
	static int[] visited;
	
	static int bfs(int start) {
		Queue<Integer> queue = new LinkedList<>();
		queue.offer(start);
		visited[start] = 1;
		
		int depth = 1;
		
		while(!queue.isEmpty()) {
			int current = queue.poll();
			
			for(int i = 1; i <= 100; i++) {
				if(graph[current][i] && visited[i] == 0) {
					visited[i] = visited[current] + 1;
					queue.offer(i);
					depth = Math.max(depth,  visited[i]);
				}
			}
		}
		
		int node = 0;
		
		for(int i = 0; i < 101; i++) {
			if(visited[i] == depth) {
				node = Math.max(node,  i);
			}
		}
		
		return node;
	}
	
	public static void main(String[] args) throws Exception {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st;
		
		for(int t = 1; t <= 10; t++) {
			st = new StringTokenizer(br.readLine());
			int length = Integer.parseInt(st.nextToken());
			int start = Integer.parseInt(st.nextToken());
			
			graph = new boolean[101][101];
			visited = new int[101];
			
			st = new StringTokenizer(br.readLine());
			
			for(int i = 0; i < length / 2; i++) {
				int from = Integer.parseInt(st.nextToken());
				int to = Integer.parseInt(st.nextToken());
				
				graph[from][to] = true;
			}
			
			int result = bfs(start);
			
			System.out.println("#" + t + " " + result);
		}
	}
}