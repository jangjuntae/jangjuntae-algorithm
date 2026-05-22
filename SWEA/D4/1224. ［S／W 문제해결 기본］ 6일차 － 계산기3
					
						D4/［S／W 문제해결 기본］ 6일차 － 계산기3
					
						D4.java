import java.io.*;
import java.util.*;

public class Solution {
	public static void main(String[] args) throws Exception {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st;
		
		// int T = Integer.parseInt(br.readLine());
		
		for(int t = 1; t <= 10; t++) {
			int len = Integer.parseInt(br.readLine());
			String str = br.readLine();
			
			StringBuilder post = new StringBuilder();
            Stack<Character> stack = new Stack<>();
            
            for(int i = 0 ; i < len; i++) {
            	char c = str.charAt(i);
            	
            	if(c >= '0' && c <= '9') {
            		post.append(c);
            	}
            	else if(c == '(') {
            		stack.push(c);
            	}
            	else if(c == ')') {
            		while(!stack.isEmpty() && stack.peek() != '(') {
            			post.append(stack.pop());
            		}
            		stack.pop();
            	}
            	else if(c == '*') {
            		while(!stack.isEmpty() && stack.peek() == '*') {
            			post.append(stack.pop());
            		}
            		stack.push(c);
            	}
            	else if(c == '+') {
            		while(!stack.isEmpty() && stack.peek() != '(') {
            			post.append(stack.pop());
            		}
            		stack.push(c);
            	}
            }
            
            while(!stack.isEmpty()) {
            	post.append(stack.pop());
            }
            
            Stack<Integer> s = new Stack<>();
            
            for(int i = 0; i < post.length(); i++) {
            	char c = post.charAt(i);
            	
            	if(c >= '0' && c <= '9') {
            		s.push(c - '0');
            	}
            	else {
            		int num2 = s.pop();
            		int num1 = s.pop();
            		
            		if(c == '+') {
            			s.push(num1 + num2);
            		}
            		else if(c == '*') {
            			s.push(num1 * num2);
            		}
            	}
            }
            
            System.out.println("#" + t + " " + s.pop());
		}
	}
}