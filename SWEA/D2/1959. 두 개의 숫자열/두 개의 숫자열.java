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

            int[] narr = new int[n];
            int[] marr = new int[m];

            st = new StringTokenizer(br.readLine());
            for(int i = 0; i < n; i++){
                narr[i] = Integer.parseInt(st.nextToken());
            }

            st = new StringTokenizer(br.readLine());
            for(int i = 0; i < m; i++){
                marr[i] = Integer.parseInt(st.nextToken());
            }

            int sum;
            int result = 0;

            if(n <= m){
                for(int i = 0; i <= m - n; i++){
                    sum = 0;
                    for(int j = 0; j < n; j++){
                        sum += narr[j] * marr[i + j];
                    }
                    result = Math.max(result, sum);
                }
            }
            else{
                for(int i = 0; i <= n - m; i++){
                    sum = 0;
                    for(int j = 0; j < m; j++){
                        sum += marr[j] * narr[i + j];
                    }
                    result = Math.max(result, sum);
                }
            }

            System.out.println("#" + t + " " + result);
        }
    }
}
