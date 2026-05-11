import java.io.*;
import java.util.*;

public class Solution {
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int T = Integer.parseInt(br.readLine());

        for (int t = 1; t <= T; t++) {
            int n = Integer.parseInt(br.readLine());
            char[][] arr = new char[n][n];

            for (int i = 0; i < n; i++) {
                arr[i] = br.readLine().toCharArray();
            }

            boolean valid = false;

            for (int i = 0; i < n; i++) {
                for (int j = 0; j < n; j++) {
                    if (arr[i][j] == 'o') {
                        
                        // 1. 가로 체크 (오른쪽으로 5개)
                        if (j + 4 < n) {
                            if (arr[i][j+1] == 'o' && arr[i][j+2] == 'o' && 
                                arr[i][j+3] == 'o' && arr[i][j+4] == 'o') {
                                valid = true;
                            }
                        }

                        // 2. 세로 체크 (아래쪽으로 5개)
                        if (!valid && i + 4 < n) {
                            if (arr[i+1][j] == 'o' && arr[i+2][j] == 'o' && 
                                arr[i+3][j] == 'o' && arr[i+4][j] == 'o') {
                                valid = true;
                            }
                        }

                        // 3. 우하 대각선 체크 (\ 모양)
                        if (!valid && i + 4 < n && j + 4 < n) {
                            if (arr[i+1][j+1] == 'o' && arr[i+2][j+2] == 'o' && 
                                arr[i+3][j+3] == 'o' && arr[i+4][j+4] == 'o') {
                                valid = true;
                            }
                        }

                        // 4. 좌하 대각선 체크 (/ 모양)
                        if (!valid && i + 4 < n && j - 4 >= 0) {
                            if (arr[i+1][j-1] == 'o' && arr[i+2][j-2] == 'o' && 
                                arr[i+3][j-3] == 'o' && arr[i+4][j-4] == 'o') {
                                valid = true;
                            }
                        }
                    }
                    if (valid) break;
                }
                if (valid) break;
            }

            System.out.println("#" + t + " " + (valid ? "YES" : "NO"));
        }
    }
}