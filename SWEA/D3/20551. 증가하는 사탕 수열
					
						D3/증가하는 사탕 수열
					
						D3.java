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
			int k = Integer.parseInt(st.nextToken());
			
			int sum = 0;
			
			if(m >= k) {
				sum += m - (k - 1);
				m = k - 1;
			}
			
			if(n >= m) {
				sum += n - (m - 1);
				n = m -1;
			}
			
			boolean valid = true;
			
			if(m < 1 || n < 1) valid = false;
			
			if(valid) {
				System.out.println("#" + t + " " + sum);
			}
			else {
				System.out.println("#" + t + " -1");
			}
		}
	}
}