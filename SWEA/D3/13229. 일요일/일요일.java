import java.io.*;
import java.util.*;

public class Solution {
	public static void main(String[] args) throws Exception {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st;
		
		int T = Integer.parseInt(br.readLine());
		
		for(int t = 1; t <= T; t++) {	
			String str = br.readLine();
			
			String[] strArr = {"MON", "TUE", "WED", "THU", "FRI", "SAT", "SUN"};
			
			for(int i = 0; i < 7; i++) {
				if(str.equals(strArr[i])) {
					if(str.equals("SUN")) {
						System.out.println("#" + t + " 7");
						break;
					}
					else {
						System.out.println("#" + t + " " + (6 - i));
						break;
					}
				}
			}
		}
	}
}