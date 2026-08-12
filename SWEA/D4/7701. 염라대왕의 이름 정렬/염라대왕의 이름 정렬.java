import java.util.*;
import java.io.*;

class Solution
{
    public static void main(String args[]) throws Exception
    {
       BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
       StringTokenizer st;
       
       int T = Integer.parseInt(br.readLine());
       
	   for(int tc = 1; tc <= T; tc++) {
		   int n = Integer.parseInt(br.readLine());
		   
		   TreeSet<String> set = new TreeSet<>((a, b) -> {
			   if(a.length() == b.length()) {
				   return a.compareTo(b);
			   }
			   
			   return Integer.compare(a.length(), b.length());
		   });
		   
		   for(int i = 0; i < n; i++) {
			   set.add(br.readLine());
		   }
		   
		   System.out.println("#" + tc);
		   
		   while(!set.isEmpty()) {
			   System.out.println(set.pollFirst());
		   }
	   }
    }
}