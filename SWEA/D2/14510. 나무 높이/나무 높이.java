import java.io.*;
import java.util.*;

public class Solution {
	public static void main(String[] args) throws Exception {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st;
		
		int T = Integer.parseInt(br.readLine());
		
		for(int t = 1; t <= T; t++) {
			int n = Integer.parseInt(br.readLine());
			
			int[] tree = new int[n];
			
			st = new StringTokenizer(br.readLine());
			
			for(int i = 0; i < n; i++) {
				tree[i] = Integer.parseInt(st.nextToken());
			}
			
			Arrays.sort(tree);
			
			int target = tree[n - 1];
			int odd = 0;
			int even = 0;
			
			for(int i = 0; i < n; i++) {
				int tmp = target - tree[i];
				odd += tmp % 2;
				even += tmp / 2;
			}
			
			while(even > odd + 1) {
				even--;
				odd += 2;
			}
			
			int result = 0;
			
			if(odd > even) {
				result = odd * 2 - 1;
			}
			else if(even == odd) {
				result = odd * 2;
			}
			else {
				result = even * 2;
			}
			
			System.out.println("#" + t + " " + result);
		}
	}
}
