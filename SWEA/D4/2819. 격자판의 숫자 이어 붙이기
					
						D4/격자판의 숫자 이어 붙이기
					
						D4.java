import java.io.*;
import java.util.*;

public class Solution {
	static int[][] map;
	static Set<String> set;
	static int[] dx = {-1, 1, 0, 0};
	static int[] dy =  {0, 0, -1, 1};
	
	static void dfs(int x, int y, int depth, String str) {
		if(depth == 7) {
			set.add(str);
			return;
		}
		
		for(int i = 0; i < 4; i++) {
			int nx = dx[i] + x;
			int ny = dy[i] + y;
			
			if(nx >= 0 && nx < 4 && ny >= 0 && ny < 4) {
				dfs(nx, ny, depth + 1, str + String.valueOf(map[nx][ny]));
			}
		}
	}
	
	public static void main(String[] args) throws Exception {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st;
		
		int T = Integer.parseInt(br.readLine());
		
		for(int t = 1; t <= T; t++) {
			map = new int[4][4];
			set = new HashSet<>();
			
			for(int i = 0; i < 4; i++) {
				st = new StringTokenizer(br.readLine());
				
				for(int j = 0; j < 4; j++) {
					map[i][j] = Integer.parseInt(st.nextToken());
				}
			}
			
			for(int i = 0; i < 4; i++) {
				for(int j = 0; j < 4; j++) {
					dfs(i, j, 1, String.valueOf(map[i][j]));
				}
			}
			
			System.out.println("#" + t + " " + set.size());
		}
	}
}