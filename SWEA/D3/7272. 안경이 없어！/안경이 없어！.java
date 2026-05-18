import java.io.*;
import java.util.*;

public class Solution {
	public static void main(String[] args) throws Exception {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st;
		
		int T = Integer.parseInt(br.readLine());
		
		for(int t = 1; t <= T; t++) {
			st = new StringTokenizer(br.readLine());
			
			String str1 = st.nextToken();
			String str2 = st.nextToken();
			
			char[] alpha = {'A', 'D', 'O', 'P', 'Q', 'R'};
			
			boolean result = true;
			
			if(str1.length() != str2.length()) {
				result = false;
			}
			
			if(result) {
				loop:
					for(int i = 0; i < str1.length(); i++) {
						boolean tmp1 = false;
						boolean tmp2 = false;
						
						for(int j = 0; j < 6; j++) {
							if(str1.charAt(i) == alpha[j]) {
								tmp1 = true;
							}
							
							if(str2.charAt(i) == alpha[j]) {
								tmp2 = true;
							}
							
							if((str1.charAt(i) == 'B' && str2.charAt(i) != 'B') || (str2.charAt(i) == 'B' && str1.charAt(i) != 'B')) {
								result = false;
								break loop;
							}
						}
						
						if(tmp1 != tmp2) {
							result = false;
							break loop;
						}
					}
			}
			
			if(result) {
				System.out.println("#" + t + " SAME");
			}
			else {
				System.out.println("#" + t + " DIFF");
			}
		}
	}
}
