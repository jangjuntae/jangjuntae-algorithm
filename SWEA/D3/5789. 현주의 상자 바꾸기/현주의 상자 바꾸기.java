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
			
			int[] arr = new int[n+1];
			
			for(int i = 1; i <= m; i++) {
				st = new StringTokenizer(br.readLine());
				
				int l = Integer.parseInt(st.nextToken());
				int r = Integer.parseInt(st.nextToken());
				
				for(int j = l; j <= r; j++) {
					arr[j] = i;
				}
			}
			
			System.out.print("#" + t);
			
			for(int i = 1; i <= n; i++) {
				System.out.print(" " + arr[i]);
			}
			
			System.out.println();
		}
	}
}
