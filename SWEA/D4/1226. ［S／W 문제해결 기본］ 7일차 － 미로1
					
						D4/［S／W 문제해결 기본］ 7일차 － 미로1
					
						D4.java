import java.io.*;
import java.util.*;

public class Solution {
	static int[] dx = {-1, 1, 0, 0};
	static int[] dy = {0, 0, -1, 1};
	static int[][] map;
	static boolean[][] visited;
	
	static class Node{
		int x;
		int y;
		
		public Node(int x, int y) {
			this.x = x;
			this.y = y;
		}
	}
	
	static int bfs(int x, int y) {
		Queue<Node> queue = new LinkedList<>();
		
		queue.offer(new Node(x, y));
		visited[x][y] = true;
		
		while (!queue.isEmpty()){
			Node current = queue.poll();
			int cx = current.x;
			int cy = current.y;
			
			if(map[cx][cy] == 3) {
				return 1;
			}
			
			for(int i = 0; i < 4; i++) {
				int nx = dx[i] + cx;
				int ny = dy[i] + cy;
				
				if(nx < 0 || nx >= 16 || ny < 0 || ny >= 16) {
					continue;
				}
				
				if(!visited[nx][ny] && map[nx][ny] != 1) {
					visited[nx][ny] = true;
					queue.offer(new Node(nx, ny));
				}
			}
		}
		
		return 0;
	}
	
	public static void main(String[] args) throws Exception {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st;
		
		// int T = Integer.parseInt(br.readLine());
		
		for(int t = 1; t <= 10; t++) {	
			int n = Integer.parseInt(br.readLine());
			
			map = new int[16][16];
			visited = new boolean[16][16];
			
			int startX = 0;
			int startY = 0;
			
			for(int i = 0; i < 16; i++) {
				String str = br.readLine();
				
				for(int j = 0; j < 16; j++) {
					map[i][j] = str.charAt(j) - '0';
					
					if(map[i][j] == 2) {
						startX = i;
						startY = j;
					}
				}
			}
			
			int result = bfs(startX, startY);
			
			System.out.println("#" + n + " " + result);
		}
	}
}