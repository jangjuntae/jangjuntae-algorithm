import java.io.*;
import java.util.*;

public class Solution {
	public static void main(String[] args) throws Exception {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		for(int t = 1; t <= 10; t++) {
			int n = Integer.parseInt(br.readLine());
			
			char[][] arr = new char[100][100];
			
			for(int i = 0; i < 100; i++) {
				String str = br.readLine();
				
				for(int j = 0; j < 100; j++) {
					arr[i][j] = str.charAt(j);
				}
			}
			
			int max = 1;
			
			int start;
			int end;
			boolean valid = false;
			
			loop:
				for(int i = 100; i > 1; i--) {
					for(int j = 0; j < 100; j++) {
						for(int k = 0; k <= 100 - i; k++) {
							start = k;
							end = k + i - 1;
							valid = true;
							
							while(start < end) {
								if(arr[j][start] != arr[j][end]) {
									valid = false;
									break;
								}
								start++;
								end--;
							}
							
							if(valid) {
								max = i;
								break loop;
							}
							
							start = k;
							end = k + i - 1;
							valid = true;
							
							while(start < end) {
								if(arr[start][j] != arr[end][j]) {
									valid = false;
									break;
								}
								start++;
								end--;
							}
							
							if(valid) {
								max = i;
								break loop;
							}
						}
					}
				}
			
			System.out.println("#" + n + " " + max);
		}
	}
	
}
