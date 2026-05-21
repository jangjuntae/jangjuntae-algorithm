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
			int h = Integer.parseInt(st.nextToken());
			int m = Integer.parseInt(st.nextToken());
			
			int current = (11 * 24 * 60) + (11 * 60) + 11;
			int time = (d * 24 * 60) + (h * 60) + m;
			
			if(current > time) {
				System.out.println("#" + t + " -1");
			}
			else {
				System.out.println("#" + t + " " + (time - current));
			}
		}
	}
}