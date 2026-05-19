import java.io.*;
import java.util.*;

public class Solution {
	static int n;
	static int k;
	static int[] arr;
	static boolean[] visited;
	static boolean valid;
	
	static void dfs() {
		if(valid) return;
		
		if(makeNum(arr) % n == 0 && makeNum(arr) / n >= 2) {
			valid = true;
			return;
		}
		
		for(int i = 0; i < k - 1; i++) {
			for(int j = i + 1; j < k; j++) {
				if(!visited[i]) {
					visited[i] = true;
					swap(i, j);
					dfs();
					swap(j, i);
					visited[i] = false;
				}
			}
		}
	}
	
	static void swap(int x, int y) {
		int tmp = arr[x];
		arr[x] = arr[y];
		arr[y] = tmp;
	}
	
	static int makeNum(int[] arr) {
		StringBuilder sb = new StringBuilder();
		
		for(int num : arr) {
			sb.append(num);
		}
		return Integer.parseInt(sb.toString());
	}
	
	public static void main(String[] args) throws Exception {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st;
		
		int T = Integer.parseInt(br.readLine());
		
		for(int t = 1; t <= T; t++) {	
			String str = br.readLine();
			n = Integer.parseInt(str);
			k = str.length();
			arr = new int[k];
			visited = new boolean[k];
			valid = false;
			
			for(int i = 0; i < k; i++){
				arr[i] = str.charAt(i) - '0';
			}
			
			dfs();
			
			if(valid) {
				System.out.println("#" + t + " possible");
			}
			else {
				System.out.println("#" + t + " impossible");
			}
		}
	}
}