import java.util.*;
import java.io.*;

class Solution
{
    public static void main(String args[]) throws Exception
    {
       BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
       StringTokenizer st;
       
       for(int t = 1; t <= 10; t++) {
	       int n = Integer.parseInt(br.readLine());
	       
	       LinkedList<Integer> list = new LinkedList<>();
	       
	       st = new StringTokenizer(br.readLine());
	       
	       while(st.hasMoreTokens()) {
	    	   list.add(Integer.parseInt(st.nextToken()));
	       }
	       
	       int m = Integer.parseInt(br.readLine());
	       
	       st = new StringTokenizer(br.readLine());
	       
	       for(int i = 0; i < m; i++) {
	    	   char c = st.nextToken().charAt(0);
	    	   
	    	   if(c == 'I') {
	    		   int x = Integer.parseInt(st.nextToken());
	    		   int y = Integer.parseInt(st.nextToken());
	    		   
	    		   ListIterator<Integer> iterator = list.listIterator(x);
	    		   
	    		   for(int k = 0; k < y; k++) {
	    			   iterator.add(Integer.parseInt(st.nextToken()));
	    		   }
	    	   }
	    	   else if(c == 'D') {
	    		   int x = Integer.parseInt(st.nextToken());
	    		   int y = Integer.parseInt(st.nextToken());
	    		   
	    		   ListIterator<Integer> iterator = list.listIterator(x);
	    		   
	    		   for (int k = 0; k < y; k++) {
	    			    iterator.next();
	    			    iterator.remove();
	    			}
	    	   }
	    	   
	    	   else if(c == 'A') {
	    		   int y = Integer.parseInt(st.nextToken());
	    		   
	    		   for(int k = 0;k < y; k++) {
	    			   list.add(Integer.parseInt(st.nextToken()));
	    		   }
	    	   }
	       }
	       
	       System.out.print("#" + t);
    	   
    	   for(int i = 0; i < 10; i++) {
    		   System.out.print(" " + list.get(i));
    	   }
    	   
    	   System.out.println();
       }
    }
}
