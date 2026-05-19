import java.io.*;
import java.util.*;

public class Solution {
	public static void main(String[] args) throws Exception {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st;
		
		int T = Integer.parseInt(br.readLine());
		
		for(int t = 1; t <= T; t++) {
			long n = Long.parseLong(br.readLine());
			
			long min = Long.MAX_VALUE;
			
			for(long i = 1; i * i <= n; i++) {
				long x;
				long y;
				
				if(n % i == 0) {
					x = i;
					y = n / i;
					
					min = Math.min((x - 1) + (y - 1), min);
				}
			}
			
			System.out.println("#" + t + " " + min);
		}
	}
}