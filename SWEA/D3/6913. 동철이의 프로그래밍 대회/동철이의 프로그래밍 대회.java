import java.io.*;
import java.util.*;

public class Solution {
	public static void main(String[] args) throws Exception {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st;
		
		int T = Integer.parseInt(br.readLine());
		
		for(int t = 1; t <= T; t++) {	
			st = new StringTokenizer(br.readLine());
			
			int n = Integer.parseInt(st.nextToken());
			int m = Integer.parseInt(st.nextToken());
			
			int[] arr = new int[n];
			
			for(int i = 0; i < n; i++) {
				st = new StringTokenizer(br.readLine());
				
				for(int j = 0; j < m; j++) {
					int k = Integer.parseInt(st.nextToken());
					
					if(k == 1) {
						arr[i]++;
					}
				}
			}
			
			int max = 0;
			
			for(int i = 0; i < n; i++) {
				max = Math.max(max, arr[i]);
			}
			
			int cnt = 0;
			
			for(int i = 0; i < n; i++) {
				if(max == arr[i]) {
					cnt++;
				}
			}
			
			System.out.println("#" + t + " " + cnt + " " + max);
		}
	}
}