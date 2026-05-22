import java.io.*;
import java.util.*;

public class Solution {
	public static void main(String[] args) throws Exception {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st;
		
		int T = Integer.parseInt(br.readLine());
		
		for(int t = 1; t <= T; t++) {
			String str = br.readLine();
			
			StringBuilder sb = new StringBuilder(str);
			
			String next = sb.reverse().toString();
			
			if(str.equals(next)) {
				System.out.println("#" + t + " 1");
			}
			else {
				System.out.println("#" + t + " 0");
			}
		}
	}
}