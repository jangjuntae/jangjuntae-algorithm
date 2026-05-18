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
			int d= Integer.parseInt(st.nextToken());
			
			int result = 0;
			
			if(n % ((2 * d) + 1) == 0) {
				result = n / ((2 * d) + 1);
			}
			else {
				result = n / ((2 * d) + 1) + 1;
			}
			
			System.out.println("#" + t + " " + result);
		}
	}
}
