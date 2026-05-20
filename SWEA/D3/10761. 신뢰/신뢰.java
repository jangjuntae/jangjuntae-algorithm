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
			int result = 0;
			
			int b = 1; // b의 이동거리
			int o = 1; // o의 이동거리
			int timeb = 0;
			int timeo = 0;
			
			for(int i = 0; i < n; i++) {
				char c = st.nextToken().charAt(0);
				int k = Integer.parseInt(st.nextToken());
				
				if(c == 'O') {
					int tmp = Math.abs(o - k) + 1 + timeo;
					
					result = Math.max(tmp, result + 1);
					
					timeo = result;
					o = k;
				}
				else {
					int tmp = Math.abs(b - k) + 1 + timeb;
					
					result = Math.max(tmp, result + 1);
					
					timeb = result;
					b = k;
				}
			}
			
			System.out.println("#" + t + " " + result);
		}
	}
}