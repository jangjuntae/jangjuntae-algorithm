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
			
			int sum = 0;
			
			for(int i = 0; i < 5; i++) {
				int k = Integer.parseInt(st.nextToken());
				
				if(k < 40) {
					sum += 40;
				}
				else {
					sum += k;
				}
			}
			
			System.out.println("#" + t + " " + (sum / 5));
		}
	}
}