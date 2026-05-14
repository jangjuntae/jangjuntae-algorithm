import java.io.*;
import java.util.*;

public class Solution {
	static int n;
	static int m;
	static LinkedList<Integer>[] list;
	static int[] tall;
	static int[] small;
	static boolean[] visited;
	
	static void dfs(int start, int current, boolean[] visit) {
		visit[current] = true;
		
		for(int next : list[current]) {
			if(!visit[next]) {
				tall[start]++;
				small[next]++;
				dfs(start, next, visit);
			}
		}
	}
	
	public static void main(String[] args) throws Exception {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st;
		
		int T = Integer.parseInt(br.readLine());
		
		for(int t = 1; t <= T; t++) {
			n = Integer.parseInt(br.readLine());
			m = Integer.parseInt(br.readLine());
			
			list = new LinkedList[n+1];
			for(int i = 1; i <= n; i++) {
				list[i] = new LinkedList<>();
			}
			
			int a, b;
			
			for(int i = 0; i < m; i++) {
				st = new StringTokenizer(br.readLine());
				a = Integer.parseInt(st.nextToken());
				b = Integer.parseInt(st.nextToken());
				list[a].add(b);
			}
			
			tall = new int[ n + 1];
			small = new int[n + 1];
			
			for(int i = 1; i <= n; i++) {
				visited = new boolean[n + 1];
				dfs(i, i, visited);
			}
			
			int result = 0;
			
			for(int i = 1; i <= n; i++) {
				if(tall[i] + small[i] == n - 1) {
					result++;
				}
			}
			
			System.out.println("#" + t + " " + result);
		}
	}
}
