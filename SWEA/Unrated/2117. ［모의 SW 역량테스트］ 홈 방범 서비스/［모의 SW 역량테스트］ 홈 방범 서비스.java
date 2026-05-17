import java.io.*;
import java.util.*;

public class Solution {
	static class Node{
		int x;
		int y;
		
		public Node(int x, int y) {
			this.x = x;
			this.y = y;
		}
	}
	
	public static void main(String[] args) throws Exception {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st;
		
		int T = Integer.parseInt(br.readLine());
		
		for(int t = 1; t <= T; t++) {
			st = new StringTokenizer(br.readLine());
			
			int n = Integer.parseInt(st.nextToken());
			int m = Integer.parseInt(st.nextToken());
			
			int[][] map = new int[n][n];
			ArrayList<Node> list = new ArrayList<>();
			
			for(int i = 0; i < n; i++) {
				st = new StringTokenizer(br.readLine());
				
				for(int j = 0; j < n; j++) {
					map[i][j] = Integer.parseInt(st.nextToken());
					if(map[i][j] == 1) {
						list.add(new Node(i, j));
					}
				}
			}
			
			int result = 0;
			
			for(int i = 0; i < n; i++) {
				for(int j = 0; j < n; j++) {
					for(int k = 1; k <= n + 1; k++) {
						int count = 0;
						
						for(Node house : list) {
							int dist = Math.abs(i - house.x) + Math.abs(j - house.y);
							
							if(dist < k) {
								count++;
							}
						}
						
						int cost = (k * k) + ((k - 1) * (k - 1));
						int profit = (count * m) - cost;
						
						if(profit >= 0) {
							result = Math.max(result, count);
						}
					}
				}
			}
			
			System.out.println("#" + t + " " + result);
		}
	}
}
