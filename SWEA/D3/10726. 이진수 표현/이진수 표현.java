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
    	   st = new StringTokenizer(br.readLine());
    	   
    	   int n = Integer.parseInt(st.nextToken());
    	   int m = Integer.parseInt(st.nextToken());
    	   
    	   int mask = (1 << n) - 1;
    	   
    	   if((m & mask) == mask) {
    		   System.out.println("#" + t +  " ON");
    	   }else {
    		   System.out.println("#" + t +  " OFF");
    	   }
       }
    }
}
