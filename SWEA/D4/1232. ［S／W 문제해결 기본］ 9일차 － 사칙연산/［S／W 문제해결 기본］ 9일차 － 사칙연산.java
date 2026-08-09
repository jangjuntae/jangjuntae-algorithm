import java.util.*;
import java.io.*;

class Solution
{
	static char[] cal;
	static int[] left;
	static int[] right;
	static int[] number;
	
	static int dfs(int node) {
		if(left[node] == 0 && right[node] == 0) {
			return number[node];
		}
		
		int leftNum = dfs(left[node]);
		int rightNum = dfs(right[node]);
		
		if(cal[node] == '+') {
			return leftNum + rightNum;
		}
		else if(cal[node] == '-') {
			return leftNum - rightNum;
		}
		else if(cal[node] == '*') {
			return leftNum * rightNum;
		}
		else if(cal[node] == '/') {
			return leftNum / rightNum;
		}
		
		return 0;
	}
	
    public static void main(String args[]) throws Exception
    {
       BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
       StringTokenizer st;
       
	   for(int tc = 1; tc <= 10; tc++) {
		   int n = Integer.parseInt(br.readLine());
		   cal = new char[n + 1];
		   left = new int[n + 1];
		   right = new int[n + 1];
		   number = new int[n + 1];
		   
		   for(int i = 1; i <= n; i++) {
			   st = new StringTokenizer(br.readLine());
			   int count = st.countTokens();
			   
			   if(count == 4) {
				   int node = Integer.parseInt(st.nextToken());
				   cal[node] = st.nextToken().charAt(0);
				   left[node] = Integer.parseInt(st.nextToken());
				   right[node] = Integer.parseInt(st.nextToken());
			   }
			   else {
				   int node = Integer.parseInt(st.nextToken());
				   number[node] = Integer.parseInt(st.nextToken());
			   }
		   }
		   
           int answer = dfs(1);
           
           System.out.println("#" + tc + " " + answer);
	   }
    }
}