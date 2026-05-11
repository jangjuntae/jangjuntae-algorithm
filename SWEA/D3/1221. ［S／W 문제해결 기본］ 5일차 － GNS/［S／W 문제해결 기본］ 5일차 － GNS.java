import java.io.*;
import java.util.*;

public class Solution {
	public static void main(String[] args) throws Exception {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st;
		
		int T= Integer.parseInt(br.readLine());
		
		for(int t = 1; t <= T; t++) {
			st = new StringTokenizer(br.readLine());
			
			String tc = st.nextToken();
			int n = Integer.parseInt(st.nextToken());
			
			int[] arr = new int[10];
			
			st = new StringTokenizer(br.readLine());
			
			String[] str = {"ZRO", "ONE", "TWO", "THR", "FOR", "FIV", "SIX", "SVN", "EGT", "NIN"};
			String tmp;
			for(int i = 0; i < n; i++) {
				tmp = st.nextToken();
				
				if(tmp.equals("ZRO")) {
					arr[0]++;
				}
				else if(tmp.equals("ONE")) {
					arr[1]++;
				}
				else if(tmp.equals("TWO")) {
					arr[2]++;
				}
				else if(tmp.equals("THR")) {
					arr[3]++;
				}
				else if(tmp.equals("FOR")) {
					arr[4]++;
				}
				else if(tmp.equals("FIV")) {
					arr[5]++;
				}
				else if(tmp.equals("SIX")) {
					arr[6]++;
				}
				else if(tmp.equals("SVN")) {
					arr[7]++;
				}
				else if(tmp.equals("EGT")) {
					arr[8]++;
				}
				else if(tmp.equals("NIN")) {
					arr[9]++;
				}
			}
		
			System.out.println(tc);
			
			for(int i = 0; i < 10; i++) {
				for(int j = 0; j < arr[i]; j++) {
					System.out.print(str[i] + " ");
				}
			}
		}
	}
}
