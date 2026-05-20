import java.io.*;
import java.util.*;

public class Solution {
	static boolean palind(int n) {
		String str =  String.valueOf(n);
		String reversed = new StringBuilder(str).reverse().toString();
		
		return str.equals(reversed);
	}
	
	public static void main(String[] args) throws Exception {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st;
		
		int T = Integer.parseInt(br.readLine());
		
		for(int t = 1; t <= T; t++) {	
			st = new StringTokenizer(br.readLine());

			int n = Integer.parseInt(st.nextToken());
			int m = Integer.parseInt(st.nextToken());
			
			int result = 0;
			
			for(int i = n; i <= m; i++) {
				if(palind(i)) {
					double num = Math.sqrt(i);
					
					if(num == (int)num) {
						if(palind((int)num)) {
							result++;
						}
					}
					
				}
			}
			
			System.out.println("#" + t + " " + result);
		}
	}
}