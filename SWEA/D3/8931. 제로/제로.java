import java.io.*;
import java.util.*;

public class Solution {
	public static void main(String[] args) throws Exception {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st;
		
		int T = Integer.parseInt(br.readLine());
		
		for(int t = 1; t <= T; t++) {
			int n = Integer.parseInt(br.readLine());
			
			Stack<Integer> stack = new Stack<>();
			
			for(int i = 0; i < n; i++){
				int k = Integer.parseInt(br.readLine());
				
				if(k == 0) {
					stack.pop();
				}
				else {
					stack.push(k);
				}
			}
			
			int result = 0;
			
			for(int num : stack) {
				result += num;
			}
			
			System.out.println("#" + t + " " + result);
		}
	}
}