import java.io.*;
import java.util.*;

public class Solution {
	public static void main(String[] args) throws Exception {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st;
		
		int T = Integer.parseInt(br.readLine());
		
		for(int t = 1; t <= T; t++) {
			String card = br.readLine();
			
			int[] s = new int[14];
			int[] d = new int[14];
			int[] h = new int[14];
			int[] c = new int[14];
			boolean valid = true;
			
			for(int i = 0; i < card.length(); i += 3) {
				char tmp = card.charAt(i);
				String str = card.substring(i+1, i+3);
				int k = Integer.parseInt(str);
				
				if(tmp == 'S') {
					s[k]++;
					if(s[k] > 1) {
						valid = false;
					}
				}
				else if(tmp == 'D'){
					d[k]++;
					if(d[k] > 1) {
						valid = false;
					}
				}
				else if(tmp == 'H') {
					h[k]++;
					if(h[k] > 1) {
						valid = false;
					}
				}
				else if(tmp == 'C') {
					c[k]++;
					if(c[k] > 1) {
						valid = false;
					}
				}
			}
			
			if(!valid) {
				System.out.println("#" + t + " ERROR");
			}
			else {
				System.out.print("#" + t);
				
				int q = 0;
				int w = 0;
				int e = 0;
				int r = 0;
				
				for(int i = 1; i <= 13; i++) {
					if(s[i] == 0) {
						q++;
					}
					if(d[i] == 0) {
						w++;
					}
					if(h[i] == 0) {
						e++;
					}
					if(c[i] == 0) {
						r++;
					}
				}
				
				System.out.print(" " + q + " " + w + " " + e + " " + r);
				System.out.println();
			}
		}
	}
}
