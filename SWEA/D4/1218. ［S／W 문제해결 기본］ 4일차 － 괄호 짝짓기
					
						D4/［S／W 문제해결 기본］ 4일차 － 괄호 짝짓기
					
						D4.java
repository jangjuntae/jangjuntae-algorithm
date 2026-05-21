import java.io.*;
import java.util.*;

public class Solution {
	public static void main(String[] args) throws Exception {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st;
		
		// int T = Integer.parseInt(br.readLine());
		
		for(int t = 1; t <= 10; t++) {	
			int n = Integer.parseInt(br.readLine());
			
			String str = br.readLine();
			
			Stack<Character> stack = new Stack<>();
			
			boolean valid = true;
			for(int i = 0; i < str.length(); i++) {
				char c = str.charAt(i);
				
				if(c == '<' || c == '(' || c == '[' || c == '{') {
					stack.add(c);
				}
				else {
					if(stack.isEmpty()) {
						valid = false;
						break;
					}
					else {
						if(c == '>' && stack.peek() == '<') {
							stack.pop();
						}
						else if(c == ')' && stack.peek() == '(') {
							stack.pop();
						}
						else if(c == ']' && stack.peek() == '[') {
							stack.pop();
						}
						else if(c == '}' && stack.peek() == '{') {
							stack.pop();
						}
						else {
							valid = false;
							break;
						}
					}
				}
			}
			
			if(valid && stack.isEmpty()) {
				System.out.println("#" + t + " 1");
			}
			else {
				System.out.println("#" + t + " 0");
			}
		}
	}
}