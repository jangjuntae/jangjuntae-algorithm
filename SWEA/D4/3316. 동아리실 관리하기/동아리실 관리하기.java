import java.util.*;
import java.io.*;

class Solution
{
    public static void main(String args[]) throws Exception
    {
       BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
       StringTokenizer st;
       
       int T = Integer.parseInt(br.readLine());
       
       for(int t = 1; t <= T; t++) {
    	   String str = br.readLine();
    	   
    	   int[][] dp = new int[str.length()][1 << 4];
    	   
    	   for(int i = 0; i < str.length(); i++) {
    		   int manager = 1 << (str.charAt(i) - 'A');
    		   
    		   if(i == 0) {
    			   manager |= (1 << 1) - 1;
    			   for(int mask = 1; mask < (1 << 4); mask++) {
    				   if((mask & manager) == manager) {
    					   dp[i][mask] = 1;
    				   }
    			   }
    		   }
    		   else {
    			   for(int mask = 1; mask < (1 << 4); mask++) {
    				   if((mask & manager) != 0) {
    					   for(int pre = 1; pre < (1 << 4); pre++) {
    						   if((mask & pre) != 0) {
    							   dp[i][mask] = (dp[i][mask] + dp[i-1][pre]) % 1000000007;
    						   }
    					   }
    				   }
    			   }
    		   }
    	   }
    	   
    	   int answer = 0;
    	   for(int mask = 1; mask < (1 << 4); mask++) {
			   answer = (answer + dp[str.length() - 1][mask]) % 1000000007;
		   }
    	   System.out.println("#" + t + " " + answer);
       }
    }
}
