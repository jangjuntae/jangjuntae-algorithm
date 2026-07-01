import java.util.*;
import java.io.*;
 
class Solution
{
	static int n;
	static int m;
	static int[] arr;
	static int result;
	
	static void dfs(int depth, int sum) {
		if(sum >= m) {
			result = Math.min(result, sum - m);
			return;
		}
		
		if(depth == n) {
			return;
		}
		
		dfs(depth + 1, sum + arr[depth]);
		dfs(depth + 1, sum);
	}
	
    public static void main(String args[]) throws Exception
    {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st;
        
        int T = Integer.parseInt(br.readLine());
        
        for(int t = 1; t <= T; t++) {
        	st = new StringTokenizer(br.readLine());
        	
        	n = Integer.parseInt(st.nextToken());
        	m = Integer.parseInt(st.nextToken());
        	arr = new int[n];
        	
        	st = new StringTokenizer(br.readLine());
        	
        	for(int i = 0; i < n; i++) {
        		arr[i] = Integer.parseInt(st.nextToken());
        	}
        	
        	result = Integer.MAX_VALUE;
        	
        	dfs(0, 0);
        	
        	System.out.println("#" + t + " " + result);
        }
    }
}