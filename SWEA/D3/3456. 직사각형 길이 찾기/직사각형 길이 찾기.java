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
			st = new StringTokenizer(br.readLine());
			
			int a = Integer.parseInt(st.nextToken());
			int b = Integer.parseInt(st.nextToken());
			int c = Integer.parseInt(st.nextToken());
			
			int[] arr = new int[101];
			
			arr[a]++;
			arr[b]++;
			arr[c]++;
			
			for(int i = 1; i <= 100; i++) {
				if(arr[i] == 1 || arr[i] == 3) {
					System.out.println("#" + t + " " + i);
					break;
				}
			}
		}
	}
}