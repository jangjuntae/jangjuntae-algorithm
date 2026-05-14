import java.io.*;
import java.util.*;

public class Solution {
	static int n;
	static int k;
	static int arr[][];
	static boolean visited[][];
	static int[] dx = {1, -1, 0, 0};
	static int[] dy = {0, 0, 1, -1};
	static int result;
	
	static void dfs(int x, int y, int length, boolean check) {
		result = Math.max(result, length);
		
		for(int i = 0; i < 4; i++) {
			int nx = dx[i] + x;
			int ny = dy[i] + y;
			
			if(nx < 0 || nx >= n || ny < 0 || ny >= n || visited[nx][ny]) {
				continue;
			}
			
			if(arr[nx][ny] < arr[x][y]) {
				visited[nx][ny] = true;
				dfs(nx, ny, length + 1, check);
				visited[nx][ny] = false;
			}
			else if(!check && arr[nx][ny] - k < arr[x][y]) {
				visited[nx][ny] = true;
				int tmp = arr[nx][ny];
				arr[nx][ny] = arr[x][y] - 1;
				dfs(nx, ny, length + 1, true);
				arr[nx][ny] = tmp;
				visited[nx][ny] = false;
			}
		}
	}
	
	public static void main(String[] args) throws Exception {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st;
		
		int T = Integer.parseInt(br.readLine());
		
		for(int t = 1; t <= T; t++) {
			st = new StringTokenizer(br.readLine());
			n = Integer.parseInt(st.nextToken());
			k = Integer.parseInt(st.nextToken());
			
			arr = new int[n][n];
			visited = new boolean[n][n];
			result = 0;
			
			int h = 0;
			
			for(int i = 0; i < n; i++) {
				st = new StringTokenizer(br.readLine());
				
				for(int j = 0; j < n; j++) {
					arr[i][j] = Integer.parseInt(st.nextToken());
					h = Math.max(h, arr[i][j]);
				}
			}
			
			for(int i = 0; i < n; i++) {
				for(int j = 0; j < n; j++) {
					if(arr[i][j] == h) {
						visited[i][j] = true;
						dfs(i, j, 1, false);
						visited[i][j] = false;
					}
				}
			}
			
			System.out.println("#" + t + " " + result);
		}
	}
}
