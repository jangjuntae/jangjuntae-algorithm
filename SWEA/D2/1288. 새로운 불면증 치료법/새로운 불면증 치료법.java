import java.util.*;
import java.io.*;

class Solution
{
    public static void main(String args[]) throws Exception
    {
       BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
       
       int T = Integer.parseInt(br.readLine());
       
       for(int t = 1; t <= T; t++) {
    	   int n = Integer.parseInt(br.readLine());
    	   
    	   int mask = 0;
    	   int count = 0;
    	   int current = 0;
    	   
    	   int fullMask = (1 << 10) - 1;
    	   
    	   while(mask != fullMask) {
    		   count++;
    		   current = n * count;
    		   int tmp = current;
    		   
    		   while(tmp > 0) {
    			   int digit = tmp % 10;
    			   mask |= (1 << digit);
    			   tmp /= 10;
    		   }
    	   }
    	   
    	   System.out.println("#" + t + " " + current);
       }
    }
}
