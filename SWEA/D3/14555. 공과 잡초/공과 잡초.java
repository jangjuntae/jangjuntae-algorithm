import java.io.*;
import java.util.*;

public class Solution {
	public static void main(String[] args) throws Exception {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st;
		
		int T = Integer.parseInt(br.readLine());
		
		for(int t = 1; t <= T; t++) {
			String str = br.readLine();
			int result = 0;
			
			for(int i = 0; i < str.length() - 1; i++) {
				char c = str.charAt(i);
				char next = str.charAt(i+1);
				
				if(c == '(' && next == '|') {
					result++;
				}
				else if(c == '|' && next == ')'){
					result++;
				}
				else if(c == '(' && next == ')') {
					result++;
				}
			}
			
			System.out.println("#" + t + " " + result);
		}
	}
}
