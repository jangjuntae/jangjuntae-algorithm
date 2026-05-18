import java.io.*;
import java.util.*;

public class Solution {
	public static void main(String[] args) throws Exception {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st;
		
		int T = Integer.parseInt(br.readLine());
		
		for(int t = 1; t <= T; t++) {
			int n = Integer.parseInt(br.readLine());
			
			int[] arr = new int[n];
			
			st = new StringTokenizer(br.readLine());
			
			int sum = 0;
			
			for(int i = 0; i < n; i++) {
				arr[i] = Integer.parseInt(st.nextToken());
				sum += arr[i];
			}
			
			int result = 0;
			
			for(int i = 0; i < n; i++) {
				if(arr[i] <= sum / n) {
					result++;
				}
			}
			
			System.out.println("#" + t + " " + result);
		}
	}
}
