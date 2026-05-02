import java.util.*;
import java.io.*;

class Solution
{
    public static void main(String args[]) throws Exception
    {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st;
        int T = Integer.parseInt(br.readLine());

        for(int t = 1; t <= T; t++){
            st = new StringTokenizer(br.readLine());
            int n = Integer.parseInt(st.nextToken());
            int m = Integer.parseInt(st.nextToken());

            int[][] arr = new int[n][n];

            for(int i = 0; i < n; i++){
                st = new StringTokenizer(br.readLine());

                for(int j = 0; j < n; j++){
                    arr[i][j] = Integer.parseInt(st.nextToken());
                }
            }

            int max = 0;

            for(int i = 0; i <= n - m; i++){
                for(int j = 0; j <= n - m; j++){
                    int sum =0;

                    for (int x = 0; x < m; x++) {
                        for (int y = 0; y < m; y++) {
                            sum += arr[i + x][j + y];
                        }
                    }

                    if(max < sum){
                        max = sum;
                    }
                }
            }

            System.out.println("#" + t + " " + max);
        }
    }
}
