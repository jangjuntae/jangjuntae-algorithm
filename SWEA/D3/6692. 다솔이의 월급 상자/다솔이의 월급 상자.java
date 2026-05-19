import java.io.*;
import java.util.*;

public class Solution {
	public static void main(String[] args) throws Exception {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st;
		
		int T = Integer.parseInt(br.readLine());
		
		for(int t = 1; t <= T; t++) {	
			int n = Integer.parseInt(br.readLine());
			
			double result = 0;
			for(int i = 0; i < n; i++) {
				st = new StringTokenizer(br.readLine());
				
				double a = Double.parseDouble(st.nextToken());
				double b = Double.parseDouble(st.nextToken());
				
				result += a * b;
			}
			
			System.out.printf("#%d %.6f\n", t, result);
		}
	}
}