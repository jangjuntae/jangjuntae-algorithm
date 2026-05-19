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
			
			int[] arr = new int[7];
			
			for(int i = 0; i < 7; i++) {
				arr[i] = Integer.parseInt(st.nextToken());
			}
			
			int min = Integer.MAX_VALUE;
			
			for(int i = 0; i < 7; i++) {
				int cnt = 0;
				int result = 0;
				
				while(result < n) {
					if(arr[(cnt + i) % 7] == 1) {
						result++;
					}
					cnt++;
				}
				
				min = Math.min(cnt,  min);
			}
			
			System.out.println("#" + t + " " + min);
		}
	}
}