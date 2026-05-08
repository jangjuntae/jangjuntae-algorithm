import java.io.*;
import java.util.*;

public class Solution {
	public static void main(String[] args) throws Exception {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st;
		
		int T = Integer.parseInt(br.readLine());
		
		String[] patterns = {
			    "0001101", // 0
			    "0011001", // 1
			    "0010011", // 2
			    "0111101", // 3
			    "0100011", // 4
			    "0110001", // 5
			    "0101111", // 6
			    "0111011", // 7
			    "0110111", // 8
			    "0001011"  // 9
			};
		
		for(int t = 1; t <= T; t++) {
			st = new StringTokenizer(br.readLine());
			
			int n = Integer.parseInt(st.nextToken());
			int m = Integer.parseInt(st.nextToken());
			
			int[][] arr = new int[n][m];
			
			for(int i = 0; i < n; i++) {
				String str = br.readLine();
				
				for(int j = 0; j < m; j++) {
					arr[i][j] = str.charAt(j) - '0';
				}
			}
			
			int[] code = new int[56];
			
			loop:
				for(int i = n - 1; i >= 0; i--) {
					for(int j = m - 1; j >= 0; j--){
						if(arr[i][j] == 1) {
							int tmp = j - 55;
							
							for(int k = 0; k < 56; k++) {
								code[k] = arr[i][tmp + k];
							}
							
							break loop;
						}
					}
				}
			
			int[] num = new int[8];
			
			for(int i = 0; i < 8; i++) {
				String str ="";
				
				for(int j = 0; j < 7; j++) {
					str += code[7 * i + j];
				}
				
				for(int j = 0; j < 10; j++) {
					if(str.equals(patterns[j])) {
						num[i] = j;
					}
				}
			}
			
			int odd = 0; // 홀
			int even = 0; // 짝
			int last = num[7];
			
			for(int i = 0; i < 7; i++) {
				if(i % 2 == 0) {
					odd += num[i];
				}
				else {
					even += num[i];
				}
			}
			
			int total = (odd * 3) + even + last;
			
			if(total % 10 == 0) {
				System.out.println("#" + t + " " + (odd + even + last));
			}
			else {
				System.out.println("#" + t + " " + 0);
			}
		}
	}
	
}
