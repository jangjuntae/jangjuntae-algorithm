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
			
			int max = Integer.MIN_VALUE;
			int min = Integer.MAX_VALUE;

			for(int i = 0; i < 10; i++) {
				String str = st.nextToken();
				
				int tmp = 0;
				
				for(int j = 0; j < str.length(); j++) {
					tmp += str.charAt(j) - '0';
				}
				
				max = Math.max(max, tmp);
				min = Math.min(min, tmp);
			}
			
			System.out.println("#" + t + " " + max + " " + min);
		}
	}
}