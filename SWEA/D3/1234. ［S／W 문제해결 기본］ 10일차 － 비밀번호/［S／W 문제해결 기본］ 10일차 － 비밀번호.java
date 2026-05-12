import java.io.*;
import java.util.*;

public class Solution {
	public static void main(String[] args) throws Exception {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st;

		for(int t = 1; t <= 10; t++) {
			st = new StringTokenizer(br.readLine());
			
			int n = Integer.parseInt(st.nextToken());
			String str = st.nextToken();
			
			Stack<Character> stack = new Stack<>();
			
			for(int i = 0; i < n; i++) {
				if(!stack.isEmpty() && stack.peek() == str.charAt(i)) {
					stack.pop();
				}
				else {
					stack.push(str.charAt(i));
				}
			}
			
			System.out.print("#" + t +" ");
			for(char c : stack) {
				System.out.print(c);
			}
			System.out.println();
		}
	}
}
