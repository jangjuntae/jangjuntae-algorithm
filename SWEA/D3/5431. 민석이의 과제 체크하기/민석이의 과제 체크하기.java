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
			int k = Integer.parseInt(st.nextToken());
			
			int[] arr = new int[n+1];
			
			st = new StringTokenizer(br.readLine());
			
			for(int i = 0; i < k; i++) {
				arr[Integer.parseInt(st.nextToken())]++;
			}
			
			System.out.print("#" + t);
			
			for(int i = 1; i <= n; i++) {
				if(arr[i] == 0) {
					System.out.print(" " + i);
				}
			}
			
			System.out.println();
		}
	}
}
