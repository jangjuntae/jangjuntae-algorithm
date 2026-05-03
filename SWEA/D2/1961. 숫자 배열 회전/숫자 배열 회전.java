import java.util.*;
import java.io.*;

class Solution
{
    public static int[][] rotate(int[][] arr, int n){
        int[][] tmp = new int[n][n];

        for(int i = 0; i < n; i++){
            for(int j = 0; j < n; j++){
                tmp[j][n - 1 - i] = arr[i][j];
            }
        }

        return tmp;
    }

    public static void main(String args[]) throws Exception
    {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st;
        int T = Integer.parseInt(br.readLine());

        for(int t = 1; t <= T; t++){
            int n = Integer.parseInt(br.readLine());
            int[][] arr = new int[n][n];

            for(int i = 0; i < n; i++){
                st = new StringTokenizer(br.readLine());
                for(int j = 0; j < n; j++){
                    arr[i][j] = Integer.parseInt(st.nextToken());
                }
            }

            int[][] arr90 = rotate(arr, n);
            int[][] arr180 = rotate(arr90, n);
            int[][] arr270 = rotate(arr180, n);

            System.out.println("#" + t);

            for(int i = 0; i < n; i++){
                for(int j = 0; j < n; j++){
                    System.out.print(arr90[i][j]);
                }
                System.out.print(" ");

                for(int j = 0; j < n; j++){
                    System.out.print(arr180[i][j]);
                }
                System.out.print(" ");

                for(int j = 0; j < n; j++){
                    System.out.print(arr270[i][j]);
                }
                System.out.print(" ");

                System.out.println();
            }
        }
    }
}
