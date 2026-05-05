import java.io.*;
import java.util.*;

public class Solution {
	static int[] fix;
	static int[] arr;
	static int[] tmp;
	static boolean[] visited;
	static int win;
	static int lose;
	
	static void dfs(int depth) {
		if(depth == 9) {
			int score1 = 0;
			int score2 = 0;
			
			for(int i = 0; i < 9; i++) {
				if(tmp[i] > fix[i]) {
					score1 += tmp[i] + fix[i];
				}
				else {
					score2 += tmp[i] + fix[i];
				}
			}
			
			if(score1 > score2) {
				lose++;
			}
			else {
				win++;
			}
			
			return;
		}
		
		for(int i = 0; i < 9; i++) {
			if(!visited[i]) {
				visited[i] = true;
				tmp[depth] = arr[i];
				dfs(depth + 1);
				visited[i] = false;
			}
		}
	}

	public static void main(String[] args) throws Exception {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st;
		
		int T = Integer.parseInt(br.readLine());
		
		for(int t = 1; t <= T; t++) {
			st = new StringTokenizer(br.readLine());
			fix = new int[9];
			arr = new int[9];
			tmp = new int[9];
			visited = new boolean[9];
			win = 0;
			lose = 0;
			
			int[] tmp = new int[19];
			
			for(int i = 0; i < 9; i++) {
				fix[i] = Integer.parseInt(st.nextToken());
				tmp[fix[i]]++;
			}
			
			int cnt = 0;
			
			for(int i = 1; i < 19; i++) {
				if(tmp[i] == 0) {
					arr[cnt] = i;
					cnt++;
				}
			}
						
			dfs(0);
			
			System.out.println("#" + t + " " + win + " " + lose);
		}
	}
	
}
