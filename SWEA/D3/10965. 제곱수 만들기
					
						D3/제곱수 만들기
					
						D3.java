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
			int n = Integer.parseInt(br.readLine());
			
			for(int i = 2; i * i <= n; i++) {
				int k = i * i;
				
				while(n % k == 0) {
					n /= k;
				}
			}
			
			System.out.println("#" + t + " " + n);
		}
	}
}