import java.io.*;
import java.util.*;

public class Solution {
	public static void main(String[] args) throws Exception {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st;
		
		int T = Integer.parseInt(br.readLine());
		
		for(int t = 1; t <= T; t++) {	
			int n = Integer.parseInt(br.readLine());
			
			boolean valid = false;
			
			loop:
				for(int i = 1; i <= 9; i++) {
					for(int j = 1; j <= 9; j++) {
						if(i * j == n) {
							valid = true;
							if(valid) {
								break loop;
							}
						}
					}
				}
			
			if(valid) {
				System.out.println("#" + t + " Yes");
			}
			else {
				System.out.println("#" + t + " No");
			}
		}
	}
}