import java.io.*;
import java.util.*;

public class Solution {
	static boolean[][] graph;
	static boolean[] visited;
	
	static boolean bfs(int start) {
			Queue<Integer> queue = new LinkedList<>();
			queue.offer(start);
			visited[start] = true;
			
			while(!queue.isEmpty()) {
				int current = queue.poll();
				
				if(current == 99) {
					return true;
				}
				
				for(int i = 0; i < 100; i++) {
					if(graph[current][i] && !visited[i]) {
						visited[i] = true;
						queue.offer(i);
					}
				}
			}
			
			return false;
	}
	
	public static void main(String[] args) throws Exception {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st;
		
		// int T = Integer.parseInt(br.readLine());
		
		for(int t = 1; t <= 10; t++) {
			st = new StringTokenizer(br.readLine());
			
			int num = Integer.parseInt(st.nextToken());
			int length = Integer.parseInt(st.nextToken());
			
			st = new StringTokenizer(br.readLine());
			
			graph = new boolean[100][100];
			visited = new boolean[100];
			
			for(int i = 0; i < length; i++) {
				int x = Integer.parseInt(st.nextToken());
				int y = Integer.parseInt(st.nextToken());
				
				graph[x][y] = true;
			}
			
			boolean valid = bfs(0);
			
			if(valid) {
				System.out.println("#" + num + " 1");
			}
			else {
				System.out.println("#" + num + " 0");
			}
		}
	}
}