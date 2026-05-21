import java.io.*;
import java.util.*;

public class Solution {
	static int[] dx = {-1, 1, 0, 0};
	static int[] dy = {0, 0, -1, 1};
	
	public static void main(String[] args) throws Exception {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st;
		
		int T = Integer.parseInt(br.readLine());
		
		for(int t = 1; t <= T; t++) {
			int n = Integer.parseInt(br.readLine());
			
			int[][] map = new int[n][n];
			
			for(int i = 0 ; i < n; i++) {
				st = new StringTokenizer(br.readLine());
				
				for(int j = 0; j < n; j++) {
					map[i][j] = Integer.parseInt(st.nextToken());
				}
			}
			
			boolean[] move = new boolean[n * n  + 1];
			
			for(int i = 0; i < n; i++) {
				for(int j = 0; j < n; j++) {
					int current = map[i][j];
					
					for(int d = 0; d < 4; d++) {
						int nx = i + dx[d];
						int ny = j + dy[d];
						
						if(nx >= 0 && nx < n && ny >= 0 && ny < n) {
							if(map[nx][ny] == current + 1) {
								move[current] = true;
								break;
							}
						}
					}
				}
			}
			
			int maxCnt = 0;
			int maxStart = 0;
			
			int cnt = 1;
			int start = 1;
			
			for(int i = 1; i < n * n + 1; i++) {
				if(move[i]) {
					cnt++;
				}
				else {
					if(cnt > maxCnt) {
						maxCnt = cnt;
						maxStart = start;
					}
					
					cnt = 1;
					start = i + 1;
				}
			}
			
			System.out.println("#" + t + " " + maxStart + " " + maxCnt);
		}
	}
}