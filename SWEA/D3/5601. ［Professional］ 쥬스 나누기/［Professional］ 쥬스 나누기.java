import java.io.*;
import java.util.*;

public class Solution {
	public static void main(String[] args) throws Exception {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st;
		
		int T = Integer.parseInt(br.readLine());
		
		for(int t = 1; t <= T; t++) {
			int n = Integer.parseInt(br.readLine());
			
			StringBuilder sb = new StringBuilder();
			
			for(int i = 0; i < n; i++) {
				sb.append("1/").append(n).append(" ");
			}
			
			System.out.println("#" + t + " " + sb.toString());
		}
	}
}
