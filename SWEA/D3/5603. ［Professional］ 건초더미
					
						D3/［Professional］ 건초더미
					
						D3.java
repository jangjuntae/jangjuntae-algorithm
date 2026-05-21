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
			int n = Integer.parseInt(br.readLine());
			
			int[] arr = new int[n];
			int sum = 0;
			
			for(int i = 0; i < n; i++) {
				int k = Integer.parseInt(br.readLine());
				
				arr[i] = k;
				sum += k;
			}
			
			int avg = sum / n;
			int k = 0;
			
			for(int i = 0; i < n; i++) {
				if(avg < arr[i]) {
					k += arr[i] - avg;
				}
			}
			
			System.out.println("#" + t + " " + k);
		}
	}
}