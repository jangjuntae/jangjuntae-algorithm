import java.io.*;
import java.util.*;

public class Solution {
	static int n;
	static int[][] map;
	static boolean[] check;
	static int result;
	static int startX, startY;
	// 우하, 좌하, 좌상, 우상
	static int[] dx = {1, 1, -1, -1};
	static int[] dy = {1, -1, -1, 1};
	
	static void dfs(int x, int y, int dir, int count) {
		for(int d = dir; d < 4; d++) {
			int nx = x + dx[d];
			int ny = y + dy[d];
			
			if(nx < 0 || nx >= n || ny < 0 || ny >= n) {
				continue;
			}
			
			if(nx == startX && ny == startY) {
				if(count >= 4) {
	                result = Math.max(result, count);
	            }
				return;
			}
			
			if(!check[map[nx][ny]]) {
				check[map[nx][ny]] = true;
				dfs(nx, ny, d, count + 1);
				check[map[nx][ny]] = false;
			}
		}
	}
	
	public static void main(String[] args) throws Exception {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st;
		
		int T = Integer.parseInt(br.readLine());
		
		for(int t = 1; t <= T; t++) {
			n = Integer.parseInt(br.readLine());
			
			map = new int[n][n];
			
			for(int i = 0; i < n; i++) {
				st = new StringTokenizer(br.readLine());
				for(int j = 0; j < n; j++) {
					map[i][j] = Integer.parseInt(st.nextToken());
				}
			}
			
			result = -1;
			
			for(int i = 0; i < n; i++) {
				for(int j = 0; j < n; j++) {
					check = new boolean[101];
					startX = i;
					startY = j;
					
					check[map[i][j]] = true;
					dfs(i, j, 0, 1);
					check[map[i][j]] = false;
				}
			}
			
			System.out.println("#" + t + " " + result);
		}
	}
}
