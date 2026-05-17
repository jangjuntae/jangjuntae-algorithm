import java.io.*;
import java.util.*;

public class Solution {
	static int n;
	static int[][] board;
	static ArrayList<Node> core;
	static int maxCore;
	static int minWire;
	
	static int[] dx = {-1, 1, 0, 0};
	static int[] dy = {0, 0, -1, 1};
	
	static class Node {
		int x;
		int y;
		
		public Node(int x, int y) {
			this.x = x;
			this.y = y;
		}
	}
	
	static void dfs(int index, int coreCount, int wireLen) {
		if(index == core.size()) {
			if(coreCount > maxCore) {
				maxCore = coreCount;
				minWire = wireLen;
			}
			else if(coreCount == maxCore) {
				minWire = Math.min(minWire, wireLen);
			}
			return;
		}
		
		if(coreCount + core.size() - index < maxCore) {
			return;
		}
		
		int x = core.get(index).x;
		int y = core.get(index).y;
		
		for(int d = 0; d < 4; d++) {
			int nx = x;
			int ny = y;
			int count = 0;
			
			while(true) {
				nx += dx[d];
				ny += dy[d];
				
				if(nx < 0 || nx >= n || ny < 0 || ny >= n) {
					break;
				}
				
				if(board[nx][ny] != 0) {
					count = 0;
					break;
				}
				count++;
			}
			
			if(count > 0) {
				fillWire(x, y, d, count, 2);
				dfs(index + 1, coreCount + 1, wireLen + count);
				fillWire(x, y, d, count, 0);
			}
		}
		
		dfs(index + 1, coreCount, wireLen);
	}
	
	static void fillWire(int x, int y, int dir, int count, int value) {
		int nx = x;
		int ny = y;
		for(int i = 0; i < count; i++){
			nx += dx[dir];
			ny += dy[dir];
			board[nx][ny] = value;
		}
	}
	
	public static void main(String[] args) throws Exception {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st;
		
		int T = Integer.parseInt(br.readLine());
		
		for(int t = 1; t <= T; t++) {
			n = Integer.parseInt(br.readLine());
			
			board = new int[n][n];
			core = new ArrayList<>();
			
			for(int i = 0; i < n; i++) {
				st = new StringTokenizer(br.readLine());
				
				for(int j = 0; j < n; j++) {
					board[i][j] = Integer.parseInt(st.nextToken());
					if(board[i][j] == 1) {
						if(i == 0 || i == n - 1 || j == 0 || j == n - 1) {
					        continue;
					    }
						
						core.add(new Node(i, j));
					}
				}
			}
			
			maxCore = 0;
			minWire = 0;
			
			dfs(0, 0, 0);
			
			System.out.println("#" + t + " " + minWire);
		}
	}
}
