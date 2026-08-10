import java.util.*;
import java.io.*;

class Solution
{
	static long[] curX;
	static long[] curY;
	
	static long distance(int cur, int next) {
		long x = curX[cur] - curX[next];
		long y = curY[cur] - curY[next];
		
		long dist = x * x + y * y;
		
		return dist;
	}
	
    public static void main(String args[]) throws Exception
    {
       BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
       StringTokenizer st;
       
       int T = Integer.parseInt(br.readLine());
       
	   for(int tc = 1; tc <= T; tc++) {
		   int n = Integer.parseInt(br.readLine());
		   
		   curX = new long[n + 1];
		   curY = new long[n + 1];
		   
		   st = new StringTokenizer(br.readLine());
		   for(int j = 1; j <= n; j++) {
			   curX[j] = Long.parseLong(st.nextToken());
		   }
		   
		   st = new StringTokenizer(br.readLine());
		   for(int j = 1; j <= n; j++) {
			   curY[j] = Long.parseLong(st.nextToken());
		   }
		   
		   double e = Double.parseDouble(br.readLine());
		   
		   long[] minDist = new long[n + 1];
		   boolean[] visited = new boolean[n + 1];
		   
		   Arrays.fill(minDist, Long.MAX_VALUE);
		   
		   minDist[1] = 0;
		   
		   long answer = 0;
		   
		   for(int i = 1; i <= n; i++) {
			   int cur = -1;
			   long min = Long.MAX_VALUE;
			   
			   for(int j = 1; j <= n; j++) {
				   if(!visited[j] && minDist[j] < min) {
					   min = minDist[j];
					   cur = j;
				   }
			   }
			   
			   visited[cur] = true;
			   answer += minDist[cur];
               
			   for(int next = 1; next <= n; next++) {
				   if(visited[next]) continue;
				   
				   long dist = distance(cur, next);
				   
				   if(dist < minDist[next]) {
					   minDist[next] = dist;
				   }
			   }
		   }
		   
		   System.out.println("#" + tc + " " + Math.round(answer * e));
	   }
    }
}