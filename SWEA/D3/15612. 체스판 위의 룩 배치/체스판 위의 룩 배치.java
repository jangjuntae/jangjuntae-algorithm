import java.io.*;
import java.util.*;

public class Solution {
	public static void main(String[] args) throws Exception {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st;
		
		int T = Integer.parseInt(br.readLine());
		
		for(int t = 1; t <= T; t++) {
			char[][] board = new char[8][8];
			
			for(int i = 0; i < 8; i++) {
				String str = br.readLine();
				for(int j = 0; j <8; j++) {
					board[i][j] = str.charAt(j);
				}
			}
			
			boolean[] row = new boolean[8];
			boolean[] col = new boolean[8];
			boolean check = true;
			
			loop:
				for(int i = 0; i < 8; i++) {
					for(int j = 0; j < 8; j++) {
						if(board[i][j] == 'O') {
							if(row[j] == false && col[i] == false) {
								row[j] = true;
								col[i] = true;
							}
							else {
								check = false;
								break loop;
							}
						}
					}
				}
			
			for(int i = 0; i < 8; i++) {
				if(!row[i] && !col[i]) {
					check = false;
				}
			}
			
			if(check) {
				System.out.println("#" + t + " yes");
			}
			else {
				System.out.println("#" + t + " no");
			}
		}
	}
}
