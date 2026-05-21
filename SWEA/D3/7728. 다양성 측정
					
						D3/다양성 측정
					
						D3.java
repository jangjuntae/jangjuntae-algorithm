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
			String str = br.readLine();
			
			Set<Integer> set = new HashSet<>();
			
			for(int i = 0; i < str.length(); i++) {
				set.add(str.charAt(i) - '0');
			}
			
			System.out.println("#" + t + " " + set.size());
		}
	}
}