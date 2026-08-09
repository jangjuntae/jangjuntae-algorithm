import java.util.*;
import java.io.*;

class Solution
{
	static char[] word;
	static int[] left;
	static int[] right;
	
	static void dfs(int node) {
		if(node == 0) {
			return;
		}
		
		dfs(left[node]);
		System.out.print(word[node]);
		dfs(right[node]);
	}
	
    public static void main(String args[]) throws Exception
    {
       BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
       StringTokenizer st;
       
       for(int t = 1; t <= 10; t++) {
    	   int n = Integer.parseInt(br.readLine());
    	   
    	   word = new char[n + 1];
    	   left = new int[n + 1];
    	   right = new int[n + 1];
    	   
    	   for(int i = 0; i < n; i++) {
    		   st = new StringTokenizer(br.readLine());
    		   
			   int v = Integer.parseInt(st.nextToken());
			   word[v] = st.nextToken().charAt(0);
			   
			   if(st.hasMoreTokens()) {
				   left[v] = Integer.parseInt(st.nextToken());
			   }
			   
			   if(st.hasMoreTokens()) {
				   right[v] = Integer.parseInt(st.nextToken());
			   }
    	   }
    		   
    		   System.out.print("#" + t + " ");
    		   dfs(1);
    		   System.out.println();
    	   }
       }
    }