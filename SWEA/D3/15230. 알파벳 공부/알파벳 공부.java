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
			
			for(int i = 0; i < str.length(); i++) {
				if(str.charAt(i) - 'a' == i) {
					result++;
				}
				else {
					break;
				}
			}
			
			System.out.println("#" + t + " " + result);
		}
	}
}
