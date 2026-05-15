import java.io.*;
import java.util.*;

public class Solution {
	static class Node{
		int x;
		int y;
		int cost;
		
		public Node(int x, int y, int cost) {
			this.x = x;
			this.y = y;
			this.cost = cost;
		}
	}
	
	public static void main(String[] args) throws Exception {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st;
		
		int T = Integer.parseInt(br.readLine());
		
		int[] dx = {1, -1, 0, 0};
		int[] dy = {0, 0, 1, -1};
		
		for(int t = 1; t <= T; t++) {
			int n = Integer.parseInt(br.readLine());
			
			int[][] arr = new int[n][n];
			
			for(int i = 0; i < n; i++) {
				String str = br.readLine();
				
				for(int j = 0; j < n; j++) {
					arr[i][j] = str.charAt(j) - '0';
				}
			}
			
			int[][] min = new int[n][n];
			
			for(int i = 0; i < n; i++) {
				Arrays.fill(min[i], Integer.MAX_VALUE);
			}
			
			Queue<Node> q = new LinkedList<>();
			q.offer(new Node(0, 0, 0));
			min[0][0] = 0;
			
			while(!q.isEmpty()) {
				Node curr = q.poll();
				
				if(curr.cost > min[curr.x][curr.y]) {
					continue;
				}
				
				for(int i = 0; i < 4; i++) {
					int nx = dx[i] + curr.x;
					int ny = dy[i] + curr.y;
					
					if(nx >= 0 && nx < n && ny >= 0 && ny < n) {
						int nextCost = curr.cost + arr[nx][ny];
						
						if(nextCost < min[nx][ny]) {
							min[nx][ny] = nextCost;
							q.offer(new Node(nx, ny, nextCost));
						}
					}
				}
			}
			
			System.out.println("#" + t + " " + min[n-1][n-1]);
		}
	}
}
