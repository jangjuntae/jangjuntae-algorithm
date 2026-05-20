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
			st = new StringTokenizer(br.readLine());
			
			String str1 = st.nextToken();
			String str2 = st.nextToken();
			
			StringBuilder sb1 = new StringBuilder();
			StringBuilder sb2 = new StringBuilder();
			
			int n = str1.length();
			int m = str2.length();
			
			while(n != m) {
				if(n < m) {
					n += str1.length();
				}
				else if(m < n){
					m += str2.length();
				}
			}
			
			for(int i = 0; i < (n / str1.length()); i++) {
				sb1.append(str1);
			}
			
			for(int i = 0; i < (n / str2.length()); i++) {
				sb2.append(str2);
			}
			
			str1 = sb1.toString();
			str2 = sb2.toString();
			
			if(str1.equals(str2)) {
				System.out.println("#" + t + " yes");
			}
			else {
				System.out.println("#" + t + " no");
			}
		}
	}
}