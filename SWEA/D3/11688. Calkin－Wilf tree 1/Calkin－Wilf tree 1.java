import java.io.*;
import java.util.*;

public class Solution {
	public static void main(String[] args) throws Exception {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st;
		
		int T = Integer.parseInt(br.readLine());
		
		for(int t = 1; t <= T; t++) {	
			String str = br.readLine();
			
			int a = 1;
			int b = 1;
			
			for(int i = 0; i < str.length(); i++) {
				char c = str.charAt(i);
				
				if(c == 'L') {
					b = a + b;
				}
				else {
					a = a + b;
				}
			}
			
			System.out.println("#" + t + " " + a + " " + b);
		}
	}
}