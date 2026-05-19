import java.io.*;
import java.util.*;

public class Solution {
	public static void main(String[] args) throws Exception {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st;
		
		int T = Integer.parseInt(br.readLine());
		
		for(int t = 1; t <= T; t++) {
			int n = Integer.parseInt(br.readLine());
			
			PriorityQueue<Integer> pq = new PriorityQueue<>(Collections.reverseOrder());
			
			StringBuilder sb = new StringBuilder();
			sb.append("#").append(t);
			
			for(int i = 0; i < n; i++) {
				st = new StringTokenizer(br.readLine());
				
				int x = Integer.parseInt(st.nextToken());
				
				if(x == 1) {
					int y = Integer.parseInt(st.nextToken());
					pq.add(y);
				}
				else {
					if(pq.isEmpty()) {
						sb.append(" -1");
					}
					else {
						sb.append(" " + pq.poll()); 
					}
				}
			}
			
			System.out.println(sb.toString());
		}
	}
}