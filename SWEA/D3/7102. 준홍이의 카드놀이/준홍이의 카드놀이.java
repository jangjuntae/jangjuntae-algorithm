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
			
			int[] card1 = new int[n];
			int[] card2 = new int[m];
			
			for(int i = 0; i < n; i++) {
				card1[i] = i + 1;
			}
			
			for(int i = 0; i < m; i++) {
				card2[i] = i + 1;
			}
			
			int[] card = new int[41];
			
			for(int i = 0; i < n; i++) {
				for(int j = 0; j < m; j++) {
					card[card1[i] + card2[j]]++;
				}
			}
			
			int max = 0;
			for(int i = 1; i <= 40; i++) {
				max = Math.max(max, card[i]);
			}
			
			System.out.print("#" + t);
			
			for(int i = 1; i <= 40; i++) {
				if(card[i] == max) {
					System.out.print(" " + i);
				}
			}
			
			System.out.println();
		}
	}
}