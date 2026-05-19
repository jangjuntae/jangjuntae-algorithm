import java.io.*;
import java.util.*;

public class Solution {
	static int[] arr;
	static boolean[] visited;
	static Set<Integer> set;
	
	static void dfs(int depth, int sum) {
		if(depth == 3) {
			set.add(sum);
			return;
		}
		
		for(int i = 0; i < 7; i++) {
			if(!visited[i]) {
				visited[i] = true;
				dfs(depth + 1, sum + arr[i]);
				visited[i] = false;
			}
		}
	}
	
	public static void main(String[] args) throws Exception {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st;
		
		int T = Integer.parseInt(br.readLine());
		
		for(int t = 1; t <= T; t++) {	
			arr = new int[7];
			visited = new boolean[7];
			set = new HashSet<>();
			
			st = new StringTokenizer(br.readLine());
			
			for(int i = 0; i < 7; i++) {
				arr[i] = Integer.parseInt(st.nextToken());
			}
			
			ArrayList<Integer> list = new ArrayList<>();
			
			dfs(0, 0);
			
			for(int num : set) {
				list.add(num);
			}
			
			Collections.sort(list);
			
			System.out.println("#" + t + " " + list.get(list.size() - 5));
		}
	}
}