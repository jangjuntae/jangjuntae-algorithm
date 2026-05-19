import java.io.*;
import java.util.*;

public class Solution {
	public static void main(String[] args) throws Exception {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st;
		
		int T = Integer.parseInt(br.readLine());
		
		for(int t = 1; t <= T; t++) {
			String str = br.readLine();
			
			int win = 0;
			
			for(int i = 0; i < str.length(); i++) {
				if(str.charAt(i) == 'o') {
					win++;
				}
			}
			
			int k = 15 - str.length();
			
			if(win + k >= 8) {
				System.out.println("#" + t + " YES");
			}
			else {
				System.out.println("#" + t + " NO");
			}
		}
	}
}