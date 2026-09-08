import java.io.*;
import java.util.*;

class Solution{
    static int n;
    static int m;
    static boolean[] selected;
    static boolean[][] impossible;
    static long answer = 0;

    static void dfs(int depth){
        if(depth > n){
            answer++;
            return;
        }

        dfs(depth + 1);

        boolean possible = true;

        for(int i = 1; i <= n; i++){
            if(selected[i] && impossible[depth][i]){
                possible = false;
                break;
            }
        }

        if(possible){
            selected[depth] = true;
            dfs(depth + 1);
            selected[depth] = false;
        }
    }

    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st;

        int T = Integer.parseInt(br.readLine());

        for(int tc = 1; tc <= T; tc++){
            answer = 0;

            st = new StringTokenizer(br.readLine());

            n = Integer.parseInt(st.nextToken());
            m = Integer.parseInt(st.nextToken());

            selected = new boolean[n + 1];
            impossible = new boolean[n + 1][n + 1];

            for(int i = 0; i < m; i++){
                st = new StringTokenizer(br.readLine());

                int a = Integer.parseInt(st.nextToken());
                int b = Integer.parseInt(st.nextToken());

                impossible[a][b] = true;
                impossible[b][a] = true;
            }

            dfs(1);

            System.out.println("#" + tc + " " + answer);
        }
    }
}
