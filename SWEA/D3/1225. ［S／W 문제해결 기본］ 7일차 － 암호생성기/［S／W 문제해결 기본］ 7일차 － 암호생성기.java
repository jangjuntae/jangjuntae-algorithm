import java.io.*;
import java.util.*;

public class Solution {

	public static void main(String[] args) throws Exception {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st;
		
		for(int t = 1; t <= 10; t++) {
			int n = Integer.parseInt(br.readLine());
			
			Queue<Integer> q = new LinkedList<>();
			
			st = new StringTokenizer(br.readLine());
			
			for(int i = 0; i < 8; i++) {
				q.add(Integer.parseInt(st.nextToken()));
			}
			
			int k = 1;
			int cnt = 1;
			
			while(k > 0) {
				k = q.poll();
				k -= cnt;
				cnt++;
				
				if(cnt == 6) {
					cnt = 1;
				}
				
				if(k <= 0) {
					q.add(0);
					break;
				}
				
				q.add(k);
			}
			
			System.out.print("#" + n + " ");
			for(int i = 0; i < 8; i++) {
				System.out.print(q.poll() + " ");
			}
			System.out.println();
		}
	}
	
}
