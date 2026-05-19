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
			int d = Integer.parseInt(st.nextToken());
			
			int[] arr = new int[n];
			
			st = new StringTokenizer(br.readLine());
			
			for(int i = 0; i < n; i++) {
				arr[i] = Integer.parseInt(st.nextToken());
			}
			
			int cnt = 0;
			int result = 0;
			
			for(int i = 0; i < n; i++) {
				if(arr[i] == 1) {
					cnt = 0;
				}
				else {
					cnt++;
					
					if(cnt == d) {
						result++;
						cnt = 0;
					}
				}
			}
			
			System.out.println("#" + t + " " + result);
		}
	}
}