import java.io.*;
import java.util.*;

public class Solution {
	public static void main(String[] args) throws Exception {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st;
		
		int T = Integer.parseInt(br.readLine());
		
		for(int t = 1; t <= T; t++) {	
			String str = br.readLine();
			int k = str.charAt(str.length() - 1) - '0';
			
			if(k % 2 == 0) {
				System.out.println("#" + t + " Even");
			}
			else {
				System.out.println("#" + t + " Odd");
			}
		}
	}
}