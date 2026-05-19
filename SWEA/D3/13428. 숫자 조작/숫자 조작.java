import java.io.*;
import java.util.*;

public class Solution {
	static int[] arr;
	static int maxNum;
	static int minNum;
	
	static void swap(int x, int y) {
		int tmp = arr[x];
		arr[x] = arr[y];
		arr[y] = tmp;
	}
	
	public static void main(String[] args) throws Exception {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st;
		
		int T = Integer.parseInt(br.readLine());
		
		for(int t = 1; t <= T; t++) {
			String str = br.readLine();
			
			int n = str.length();
			
			arr = new int[n];
			maxNum = Integer.parseInt(str);
			minNum = Integer.parseInt(str);
			
			for(int i = 0; i < n; i++) {
				arr[i] = str.charAt(i) - '0';
			}
			
			for(int i = 0; i < n - 1; i++) {
				for(int j = i + 1; j < n; j++) {
					swap(i, j);
					
					if(arr[0] != 0) {
						StringBuilder sb = new StringBuilder();
						for(int num : arr) {
							sb.append(num);
						}
						
						maxNum = Math.max(maxNum, Integer.parseInt(sb.toString()));
						minNum = Math.min(minNum, Integer.parseInt(sb.toString()));
					}
					
					swap(j, i);
				}
			}
			
			System.out.println("#" + t + " " + minNum + " " + maxNum);
		}
	}
}