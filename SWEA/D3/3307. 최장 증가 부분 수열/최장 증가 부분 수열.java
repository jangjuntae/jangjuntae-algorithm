import java.io.*;
import java.util.*;

public class Solution {
	public static void main(String[] args) throws Exception {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st;
		
		int T = Integer.parseInt(br.readLine());

		for(int t = 1; t <= T; t++) {
			int n = Integer.parseInt(br.readLine());
			st = new StringTokenizer(br.readLine());
			
			int[] arr = new int[n];
			int[] dp = new int[n];
			
			for(int i = 0; i < n; i++) {
				arr[i] = Integer.parseInt(st.nextToken());
			}
			
			int result = 0;
			
			for(int i = 0; i < n; i++) {
				dp[i] = 1;
				
				for(int j = 0; j < i; j++) {
					if(arr[i] > arr[j]) {
						dp[i] = Math.max(dp[i], dp[j] + 1);
					}
				}
				
				result = Math.max(result,  dp[i]);
			}
			
			System.out.println("#" + t + " " + result);
		}
	}
}
