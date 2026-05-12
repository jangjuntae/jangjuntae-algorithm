import java.io.*;
import java.util.*;

public class Solution {
	public static void main(String[] args) throws Exception {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st;
		
		for(int t = 1; t <= 10; t++) {
			int n = Integer.parseInt(br.readLine());
			LinkedList<Integer> list = new LinkedList<>();
			st = new StringTokenizer(br.readLine());
			
			for(int i = 0; i < n; i++) {
				list.add(Integer.parseInt(st.nextToken()));
			}
			
			int m = Integer.parseInt(br.readLine());
			
			st = new StringTokenizer(br.readLine());
			
			while(st.hasMoreTokens()) {
				String c = st.nextToken();
				
				if(c.equals("I")) {
					int x = Integer.parseInt(st.nextToken());
					int y = Integer.parseInt(st.nextToken());
					
					for(int i = 0; i < y; i++) {
						list.add(x++, Integer.parseInt(st.nextToken()));
					}
				}
				else if(c.equals("D")) {
					int x = Integer.parseInt(st.nextToken());
					int y = Integer.parseInt(st.nextToken());
					
					for(int i = 0; i < y; i++) {
						list.remove(x);
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
