import java.io.*;
import java.util.*;

public class Solution {
	public static void main(String[] args) throws Exception {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st;
		
		int T = Integer.parseInt(br.readLine());
		
		for(int t = 1; t <= T; t++) {
			int n = Integer.parseInt(br.readLine());
			
			int result = 0;
			
			for(int i = 0; i <= 2*n; i++) {
				for(int j = 0; j <= 2*n; j++) {
					if(n * n >= ((i - n) * (i - n)) + ((j - n) * (j - n))) {
						result++;
					}
				}
			}
			
			System.out.println("#" + t + " " + result);
		}
	}
}
