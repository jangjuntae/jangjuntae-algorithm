import java.util.*;
import java.io.*;

class Solution
{
	static long power(long base, long exp, long mod) {
		if(exp == 0) {
			return 1;
		}
		
		long half = power(base, exp / 2, mod);
		
		long result = (half * half) % mod;
		
		if (exp % 2 == 1) {
		    result = (result * base) % mod;
		}
		
		return result;
	}
	
    public static void main(String args[]) throws Exception
    {
       BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
       StringTokenizer st;
       
       int T = Integer.parseInt(br.readLine());
       
	   for(int tc = 1; tc <= T; tc++) {
		   st = new StringTokenizer(br.readLine());
		   
		   int a = Integer.parseInt(st.nextToken());
		   int b = Integer.parseInt(st.nextToken());
		   int k = Integer.parseInt(st.nextToken());
		   
		   long sum = a + b;
           long min = Math.min(a, b);

           long pow = power(2, k, sum);

           long r = (min * pow) % sum;

           long answer = Math.min(r, sum - r);
		   
		   System.out.println("#" + tc + " " + answer);
	   }
    }
} 