import java.io.*;
import java.util.*;

public class Solution {
	public static void main(String[] args) throws Exception {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st;
		
		int T = Integer.parseInt(br.readLine());
		
		for(int t = 1; t <= 10; t++) {
			String str = br.readLine();
			
			for(int i = 1; i <= 10; i++) {
				String pattern = str.substring(0, i);
				
				String next = str.substring(i, i + i);
				
				if(pattern.equals(next)) {
					System.out.println("#" + t + " " + i);
					break;
				}
			}
		}
	}
}