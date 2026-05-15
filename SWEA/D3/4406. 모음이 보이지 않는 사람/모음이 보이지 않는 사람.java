import java.io.*;
import java.util.*;

public class Solution {
	public static void main(String[] args) throws Exception {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st;
		
		int T = Integer.parseInt(br.readLine());
		char[] arr = {'a', 'e', 'i', 'o', 'u'};
		
		for(int t = 1; t <= T; t++) {
			String str = br.readLine();
			StringBuilder sb = new StringBuilder();
			
			for(int i = 0; i < str.length(); i++) {
				boolean valid = true;
				
				for(int j = 0; j < arr.length; j++) {
					if(str.charAt(i) == arr[j]) {
						valid = false;
					}
				}
				
				if(valid) {
					sb.append(str.charAt(i));
				}
			}
			
			System.out.println("#" + t + " " + sb.toString());
		}
	}
}
