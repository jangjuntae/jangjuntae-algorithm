import java.io.*;
import java.util.*;

public class Solution {
	public static void main(String[] args) throws Exception {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st;
		
		int T = Integer.parseInt(br.readLine());
		
		for(int t = 1; t <= T; t++) {
			st = new StringTokenizer(br.readLine());
			
			int n = Integer.parseInt(st.nextToken());
			int m = Integer.parseInt(st.nextToken());
			int k = Integer.parseInt(st.nextToken());
			
			int[] arr = new int[n];
			st = new StringTokenizer(br.readLine());
			
			for(int i = 0; i < n; i++) {
				arr[i] = Integer.parseInt(st.nextToken());
			}
			
			Arrays.sort(arr);
			
			int cnt = 0;
			int index = 0;
			boolean valid = true;
			
			for(int i = 0; i <= arr[n - 1]; i++) {
				if(i != 0 && i % m == 0) {
					cnt += k;
				}
				
				while(index < n && arr[index] == i) {
					if(cnt > 0) {
						cnt--;
					}
					else {
						valid = false;
						break;
					}
					
					index++;
				}
				
				if(!valid) {
					break;
				}
			}
			
			if(valid) {
				System.out.println("#" + t + " Possible");
			}
			else {
				System.out.println("#" + t + " Impossible");
			}
		}
	}
	
}
