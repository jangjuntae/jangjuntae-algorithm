import java.io.*;
import java.util.*;

public class Solution {
	public static void main(String[] args) throws Exception {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st;
		
		int T = Integer.parseInt(br.readLine());
		
		for(int t = 1; t <= T; t++) {
			st = new StringTokenizer(br.readLine());
			
			int p = Integer.parseInt(st.nextToken());
			int q = Integer.parseInt(st.nextToken());
			int r = Integer.parseInt(st.nextToken());
			int s = Integer.parseInt(st.nextToken());
			int w = Integer.parseInt(st.nextToken());
			
			int a = w * p;
			int b;
			
			if(r >= w) {
				b = q;
			}
			else {
				b = q + (s * (w - r));
			}
			
			if(a > b) {
				System.out.println("#" + t + " " + b);
			}
			else {
				System.out.println("#" + t + " " + a);
			}
		}
	}
}