import java.io.*;
import java.util.*;

public class Solution {
	public static void main(String[] args) throws Exception {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		int T = Integer.parseInt(br.readLine());
		
		for(int t = 1; t <= T; t++) {
			StringBuilder sb = new StringBuilder();
			String[] str = new String[5];
			int maxLen = 0;
			
			for(int i = 0; i < 5; i++) {
				str[i] = br.readLine();
				maxLen = Math.max(maxLen, str[i].length());
			}
			
			for(int i = 0; i < maxLen; i++) {
				for(int j = 0; j < 5; j++) {
					if(i < str[j].length()) {
						sb.append(str[j].charAt(i));
					}
				}
			}
			
			System.out.println("#" + t + " " + sb);
		}
	}
}
