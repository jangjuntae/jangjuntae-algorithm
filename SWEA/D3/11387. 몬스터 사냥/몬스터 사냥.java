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
			
			int d = Integer.parseInt(st.nextToken());
			int l = Integer.parseInt(st.nextToken());
			int n = Integer.parseInt(st.nextToken());
			
			int result = 0;
			
			int k = d / 100;
			
			for(int i = 0; i < n; i++) {
				result += d + (k * i * l);
			}
			
			System.out.println("#" + t + " " + result);
		}
	}
}