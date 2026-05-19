import java.io.*;
import java.util.*;

public class Solution {
	public static void main(String[] args) throws Exception {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st;
		
		int T = Integer.parseInt(br.readLine());
		
		for(int t = 1; t <= T; t++) {	
			int n = Integer.parseInt(br.readLine());
			
			int[][] arr = new int[n][2];
			
			for(int i = 0; i < n; i++) {
				st = new StringTokenizer(br.readLine());
				for(int j = 0; j < 2; j++) {
					arr[i][j] = Integer.parseInt(st.nextToken());
				}
			}
			
			int result = 0;
			
			for(int i = 0; i <n; i++) {
				for(int j = i + 1; j < n; j++) {
					if(arr[i][0] > arr[j][0] && arr[i][1] < arr[j][1]) {
						result++;
					}
					
					if(arr[i][0] < arr[j][0] && arr[i][1] > arr[j][1]) {
						result++;
					}
				}
			}
			
			System.out.println("#" + t + " " + result);
		}
	}
}