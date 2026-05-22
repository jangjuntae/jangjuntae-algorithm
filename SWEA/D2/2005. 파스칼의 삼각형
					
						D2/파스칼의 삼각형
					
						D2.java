import java.io.*;
import java.util.*;

public class Solution {
	public static void main(String[] args) throws Exception {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st;
		
		int T = Integer.parseInt(br.readLine());
		
		for(int t = 1; t <= 10; t++) {
			int n = Integer.parseInt(br.readLine());
			
			int[][] arr = new int[n][n];
			
			System.out.println("#" + t);
			
			for(int i = 0; i < n; i++) {
				for(int j = 0; j <= i; j++) {
					if(j == 0 || j == i) {
						arr[i][j] = 1;
					}
					else {
						arr[i][j] = arr[i - 1][j - 1] + arr[i - 1][j];
					}
					
					System.out.print(arr[i][j] + " ");
				}
				System.out.println();
			}
		}
	}
}