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
			
			int[] rate = new int[n+1];
			int[] parking = new int[n + 1];
			
			for(int i = 1; i <= n; i++) {
				rate[i] = Integer.parseInt(br.readLine());
			}
			
			int[] w = new int[m+1];
			
			for(int i = 1; i <= m; i++) {
				w[i] = Integer.parseInt(br.readLine());
			}
			
			int tmp;
			int result = 0;
			
			Queue<Integer> q = new LinkedList<>();
			
			for(int i = 0; i < m * 2; i++) {
				tmp = Integer.parseInt(br.readLine());
				
				if(tmp > 0) {
					boolean check = false;
					
					for(int j = 1; j <= n; j++) {
						if(parking[j] == 0) {
							parking[j] = tmp;
							result += rate[j] * w[tmp];
							check = true;
							break;
						}
					}
					
					if(!check) {
						q.offer(tmp);
					}
				}
				else {
					tmp = -tmp;
					
					for(int j = 1; j <= n; j++) {
						if(parking[j] == tmp) {
							parking[j] = 0;
							
							if(!q.isEmpty()) {
								int wait = q.poll();
								parking[j] = wait;
								result += rate[j] * w[wait];
							}
							break;
						}
					}
				}
			}
			
			System.out.println("#" + t + " " + result);
		}
	}
}
